package mail;
import lombok.*;

@Setter @Getter
public class Client {
    private int id;
    private String name;
    private int age;
    private Gender sex;
    private String email;

    public Client(String name, Gender sex, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.sex = sex;
        this.id = ClientIDGenerator.generateId();
    }

    private static class ClientIDGenerator {
        private static int id = 0;
        public static int generateId() {
            id ++;
            return id;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getEmail() {
        return this.email;
    }
}
