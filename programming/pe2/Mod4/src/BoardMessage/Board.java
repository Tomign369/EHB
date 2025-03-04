package BoardMessage;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Board {
    private ArrayList<TextMessage> textMessages;

    public Board(){
        this.textMessages = new ArrayList<>();
    }

    public void addTextmessage(TextMessage textMessage){
        textMessages.add(textMessage);
    }

    public void removeTextmessage(TextMessage textMessage){
        textMessages.remove(textMessage);
    }

    public void showMesages(){
        if (textMessages.isEmpty()){
            System.out.println("Geen bericht om te tonen");
        }else{
            for (TextMessage textMessage : textMessages) {
                System.out.println(textMessage);
            }
        }
    }


    public void deleteTextMessage(LocalDateTime endDatum){
        textMessages.removeIf(msg -> msg.getEndDatum().equals(endDatum));
    }
}
