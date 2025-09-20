package io.github.fallow.demo;

import io.github.fallow.codec.JacksonPacket;

public class MasterSlaveResponsePacket extends JacksonPacket {

    private String content;

    public MasterSlaveResponsePacket() {}

    public MasterSlaveResponsePacket(final String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "MasterSlaveResponsePacket{" + "content='" + content + '\'' + "} " + super.toString();
    }
}



