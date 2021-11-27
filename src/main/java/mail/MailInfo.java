package mail;
import java.util.HashMap;

public class MailInfo {
    public Client client;
    public MailCode mailCode;

    public MailInfo(Client client1, MailCode greetings) {
    }

    public String getText() {
        HashMap<String, String > templates = new HashMap<String, String>();
        templates.put("%NAME%", client.getName());
        templates.put("%AGE%", Integer.toString(client.getAge()));
        String text = mailCode.generateText();
        for (String key: templates.keySet()) {
            text = text.replace(key, templates.get(key));
        }
        return text;
    }

    public String getEmail(){
        return client.getEmail();
    }
}
