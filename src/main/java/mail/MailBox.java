package mail;
import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> information = new ArrayList<>();

    public void addMailInfo(MailInfo info) {
        information.add(info);
        System.out.println("New info added.");
    }

    public void sendAll() {
        MailSender sender = new MailSender();
        for (int i = 0; i < information.size(); i++) {
            sender.sendMail(information.get(i));
        }
    }
}