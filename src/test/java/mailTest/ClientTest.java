package mailTest;
import static org.junit.jupiter.api.Assertions.*;
import mail.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ClientTest {
    Client client;

    @BeforeEach
    void setUp() {
        client = new Client("Dima", Gender.MALE, 18, "dimakchay@gmail.com");
    }

    @Test
    void getName() {
        assertEquals(client.getName(), "Dima");
    }

    @Test
    void getSex() {
        assertEquals(client.getSex(), Gender.MALE);
    }

    @Test
    void getAge() {
        assertEquals(client.getAge(), 18);
    }

    @Test
    void getEmail() {
        assertEquals(client.getEmail(), "dimakchay@gmail.com");
    }
}
