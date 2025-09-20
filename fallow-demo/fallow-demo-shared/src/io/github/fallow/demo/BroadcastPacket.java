package io.github.fallow.demo;

import io.github.fallow.codec.JacksonPacket;

public class BroadcastPacket extends JacksonPacket {

    private String content;

    public BroadcastPacket() {}

    public BroadcastPacket(final String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "BroadcastPacket{" +
                "content='" + content + '\'' +
                "} " + super.toString();
    }
}