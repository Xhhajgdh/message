import java.util.Arrays;
import java.util.List;

public class MessageSender {

    private static void main(String[] args) {
        MessageService service = new MessageService();
        service.initializeService();

        List<String> phoneNumbers = Arrays.asList(
            "+1234567890",
            "+1987654321",
            "+1123456789"
        );

        MessageContent messageContent = new MessageContent("Hello, this is a test message!");

        for (String phoneNumber : phoneNumbers) {
            service.sendMessage(phoneNumber, messageContent.getMessage());
        }
    }
}
