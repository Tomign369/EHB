package BoardMessage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class TextMessage extends Message {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    public TextMessage(String content,LocalDateTime postDatum, LocalDateTime endDatum) {
      super(content, postDatum, endDatum);
    }

    public String getFormattedEndDatum(){
        return getEndDatum().format(formatter);
    }

    public String getFormattedPostDatum(){
        return getPostDatum().format(formatter);
    }

    @Override
    public String toString() {
        return  " TextMessage\n" +
                "--------------------------------\n" +
                " PostDatum: " + getFormattedPostDatum() + "\n" +
                " " + getContent() + "\n" +
                " Te zien tot: " + getFormattedEndDatum() + "\n" +
                "--------------------------------";
    }
}
