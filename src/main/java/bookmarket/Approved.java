package bookmarket;

public class Approved extends AbstractEvent {

    private Long id;
    private Long reqReqId;
    private String app_yn;
    private Long publId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getReqReqId() {
        return reqReqId;
    }

    public void setReqReqId(Long reqReqId) {
        this.reqReqId = reqReqId;
    }
    public String getAppYn() {
        return app_yn;
    }

    public void setAppYn(String app_yn) {
        this.app_yn = app_yn;
    }
    public Long getPublId() {
        return publId;
    }

    public void setPublId(Long publId) {
        this.publId = publId;
    }
}