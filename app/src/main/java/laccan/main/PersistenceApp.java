package laccan.main;

import laccan.cloud.parse.ParseMessage;

import java.time.LocalDateTime;

public class PersistenceApp {
    public static void main(String[] args) {
        String str = LocalDateTime.now().toString();
        System.out.println(str);
        System.out.println(ParseMessage.stringToNumeric(str));
    }
}
