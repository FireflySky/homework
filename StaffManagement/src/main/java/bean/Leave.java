package bean;

/**
 * 请假类
 */
public class Leave {
    private int leaId;
    private String type;
    private String reason;

    public Leave(int leaId, String type, String reason) {
        this.leaId = leaId;
        this.type = type;
        this.reason = reason;
    }

    public Leave() {
        super();
    }

    public int getLeaId() {
        return leaId;
    }

    public void setLeaId(int leaId) {
        this.leaId = leaId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
