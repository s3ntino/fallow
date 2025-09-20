package io.github.fallow.demo;

import io.github.wisp.subscription.Subscribe;
import io.github.wisp.subscription.Subscriber;

public final class BroadcastSubscriber implements Subscriber {

    @Override
    public String topic() {
        return "broadcast";
    }

    @Subscribe
    public void receive(final BroadcastPacket packet) {
        System.out.printf("Received p2p packet: %s%n", packet.getContent());
    }
}