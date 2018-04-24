package top.wulink.web.vo;

public class GreetingVo {
    private  long id;
    private  String content;

    public GreetingVo(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public GreetingVo() {
        super();
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
