package bookmarket;

public class ReqCanceled extends AbstractEvent {

    private Long id;
    private Long bookId;
    private String book_nm;
    private String reg_yn;
    private Long publId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }
    public String getBookNm() {
        return book_nm;
    }

    public void setBookNm(String book_nm) {
        this.book_nm = book_nm;
    }
    public String getRegYn() {
        return reg_yn;
    }

    public void setRegYn(String reg_yn) {
        this.reg_yn = reg_yn;
    }
    public Long getPublId() {
        return publId;
    }

    public void setPublId(Long publId) {
        this.publId = publId;
    }
}