package bean;

/**
 * 员工信息表
 */
public class Staff {
    private int staId;
    private String staName;
    private String staSex;
    private int staAge;
    private String atsAddress;
    private String am_startWork;
    private String am_endWork;
    private String pm_startWork;
    private String pm_endWork;
    private int leaId;

    public Staff(int staId, String staName, String staSex, int staAge, String atsAddress, String am_startWork, String am_endWork, String pm_startWork, String pm_endWork, int leaId) {
        this.staId = staId;
        this.staName = staName;
        this.staSex = staSex;
        this.staAge = staAge;
        this.atsAddress = atsAddress;
        this.am_startWork = am_startWork;
        this.am_endWork = am_endWork;
        this.pm_startWork = pm_startWork;
        this.pm_endWork = pm_endWork;
        this.leaId = leaId;
    }

    public Staff() {
        super();
    }

    public int getStaId() {
        return staId;
    }

    public void setStaId(int staId) {
        this.staId = staId;
    }

    public String getStaName() {
        return staName;
    }

    public void setStaName(String staName) {
        this.staName = staName;
    }

    public String getStaSex() {
        return staSex;
    }

    public void setStaSex(String staSex) {
        this.staSex = staSex;
    }

    public int getStaAge() {
        return staAge;
    }

    public void setStaAge(int staAge) {
        this.staAge = staAge;
    }

    public String getAtsAddress() {
        return atsAddress;
    }

    public void setAtsAddress(String atsAddress) {
        this.atsAddress = atsAddress;
    }

    public String getAm_startWork() {
        return am_startWork;
    }

    public void setAm_startWork(String am_startWork) {
        this.am_startWork = am_startWork;
    }

    public String getAm_endWork() {
        return am_endWork;
    }

    public void setAm_endWork(String am_endWork) {
        this.am_endWork = am_endWork;
    }

    public String getPm_startWork() {
        return pm_startWork;
    }

    public void setPm_startWork(String pm_startWork) {
        this.pm_startWork = pm_startWork;
    }

    public String getPm_endWork() {
        return pm_endWork;
    }

    public void setPm_endWork(String pm_endWork) {
        this.pm_endWork = pm_endWork;
    }

    public int getLeaId() {
        return leaId;
    }

    public void setLeaId(int leaId) {
        this.leaId = leaId;
    }
}
