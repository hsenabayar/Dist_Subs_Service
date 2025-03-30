import java.io.Serializable;

public class Capacity implements Serializable {
    private static final long serialVersionUID = 1L;
    private String serverId;
    private int serverStatus;
    private long timestamp;

    public Capacity(String serverId, int serverStatus, long timestamp) {
        this.serverId = serverId;
        this.serverStatus = serverStatus;
        this.timestamp = timestamp;
    }

    public String getServerId() {
        return serverId;
    }

    public int getServerStatus() {
        return serverStatus;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
