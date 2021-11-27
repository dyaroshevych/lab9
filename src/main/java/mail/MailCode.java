package mail;
import lombok.Getter;
import lombok.SneakyThrows;
import java.io.File;
import java.util.Scanner;


@Getter
public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"),
    GREETINGS("greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    @SneakyThrows
    public String generateText() {
        Scanner sc = new Scanner(filename);
        File file = new File(sc.nextLine());
        sc = new Scanner(file);
        String text = "";

        while (sc.hasNextLine()) {
            text += sc.nextLine() + '\n';
            System.out.println(text);
        }
        sc.close();
        return text;
    }
}