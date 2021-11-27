package proxyTest;
import proxy.ProxyImage;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


class ImageTest {
    ProxyImage proxyImage = new ProxyImage("someone.png");
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void display() {
        proxyImage.display();
        assertEquals(outputStreamCaptor.toString().trim(), "someone.png was loaded from disk\nsomeone.png was turned into RealImage");
    }
}
