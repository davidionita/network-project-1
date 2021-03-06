package packets.client;

import packets.Packet;

import java.util.List;
import java.util.Set;

public class ClientMessagePacket implements Packet {

    public final String message;

    public final boolean isPrivate;
    private Set<String> recipients;

    public ClientMessagePacket(String message) {
        this.message = message;
        this.isPrivate = false;
    }

    public ClientMessagePacket(String message, Set<String> recipients) {
        this.message = message;
        this.isPrivate = true;
        this.recipients = recipients;
    }

    public Set<String> getRecipients() {
        return recipients;
    }

    @Override
    public String toString() {
        String recipients = getRecipients() != null ? String.join(", ", getRecipients()) : "No recipients";
        return String.format("Client Message Packet (%s, %b, %s)", this.message, this.isPrivate, recipients);
    }
}
