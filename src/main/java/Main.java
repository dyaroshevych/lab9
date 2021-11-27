import mail.*;


public class Main {
    public static void main(String[] args) {
        MailBox mailBox = new MailBox();
        Client client1 = new Client("Igor", Gender.FEMALE, 19, "lalalerw3@gmail.com");
        Client client2 = new Client("shrek", Gender.MALE, 20, "omagadmonkey@gmail.com");
        Client client3 = new Client("Makar", Gender.MALE, 21, "yesno@gmail.com");
        MailInfo Info1 = new MailInfo(client1, MailCode.GREETINGS);
        MailInfo Info2 = new MailInfo(client2, MailCode.HAPPY_BIRTHDAY);
        MailInfo Info3 = new MailInfo(client3, MailCode.GREETINGS);
        mailBox.addMailInfo(Info1);
        mailBox.addMailInfo(Info2);
        mailBox.addMailInfo(Info3);
        mailBox.sendAll();
    }
}
