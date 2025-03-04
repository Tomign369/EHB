package BoardMessage;


import java.time.LocalDateTime;


public abstract class Message {
    private String content;
    private final LocalDateTime postDatum;
    private LocalDateTime endDatum;

    public Message(String content, LocalDateTime postDatum, LocalDateTime endDatum) {
        this.content = content;
        this.postDatum = postDatum;
        this.endDatum = endDatum;
    };


    //getters
    public String getContent() {
        return content;
    }
    public LocalDateTime getPostDatum() {
        return postDatum;
    }
    public LocalDateTime getEndDatum() {
        return endDatum;
    }
    //setters
    public void setContent(String content) {
        this.content = content;
    }

    public void setEndDatum(LocalDateTime endDatum) {
        this.endDatum = endDatum;
    }
}
