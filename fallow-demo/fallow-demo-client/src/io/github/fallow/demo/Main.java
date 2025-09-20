package io.github.fallow.demo;

import io.github.fallow.PacketBroker;
import io.github.fallow.RedisPacketBrokerProducer;
import io.github.fallow.codec.JacksonPacketCodecProducer;
import io.github.wisp.Wisp;
import io.lettuce.core.RedisClient;
import java.time.Duration;

public final class Main {

    private Main() {}

    public static void main(final String[] args) {
        final PacketBroker packetBroker = RedisPacketBrokerProducer.produceBroker(
                Wisp.create(),
                RedisClient.create("redis://localhost:6379"),
                JacksonPacketCodecProducer.produceCodec(),
                Duration.ofSeconds(30L));

        packetBroker.<MasterSlaveResponsePacket>request("server", new MasterSlaveRequestPacket("Ping!"))
                .thenAccept(packet -> System.out.printf("Received: %s", packet))
                .join();
        packetBroker.subscribe(new BroadcastSubscriber());
        packetBroker.publish("broadcast", new BroadcastPacket("Hello from client!"));
    }
}
