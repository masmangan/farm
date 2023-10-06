package farm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CatTest {
    @Test 
    void testFelixSaysMeow() {
       Cat felix = new Cat("Felix");
       String actual = felix.talk();
       String expected = "Felix diz miau.";
       assertEquals(expected, actual);
    }  
}
