package BoardMessage;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Maak een bericht met huidige tijd als postDatum en een einddatum 7 dagen later
        TextMessage msg1 = new TextMessage("Hallo, hoe gaat het?",
                LocalDateTime.now(),
                LocalDateTime.now().plusDays(7)
        );

        System.out.println(msg1);

    }
}
