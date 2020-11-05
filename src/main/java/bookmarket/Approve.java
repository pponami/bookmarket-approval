package bookmarket;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Approve_table")
public class Approve {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long reqReqId;
    private String appYn;
    private Long publId;

    @PostPersist
    public void onPostPersist() throws InterruptedException {
        Approved approved = new Approved();
        BeanUtils.copyProperties(this, approved);
        approved.publishAfterCommit();
        Thread.sleep(3000);
    }

    @PreUpdate
    public void onPreUpdate(){

        AppCanceled appCanceled = new AppCanceled();
        BeanUtils.copyProperties(this, appCanceled);
        appCanceled.publishAfterCommit();

    }


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
        return appYn;
    }

    public void setAppYn(String appYn) {
        this.appYn = appYn;
    }
    public Long getPublId() {
        return publId;
    }

    public void setPublId(Long publId) {
        this.publId = publId;
    }




}
