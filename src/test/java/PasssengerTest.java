import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PasssengerTest
{
    Passenger MyPass;

    @BeforeEach
    void setup()
    {
        MyPass = new Passenger("Mr", "Alvin" ,"Olayemi");
    }
@Test
    void ConstructorSuccess()
    {
        assertEquals("Mr",MyPass.getTitle());
        assertEquals("Alvin" , MyPass.getFirstName());
        assertEquals("Olayemi" , MyPass.getLastName());
    }
    @Test
    void TestTitleSuccess()
    {
        assertEquals("Mr", MyPass.getTitle());
        Passenger MyPass2 = new Passenger("Ms", "Alvin" ,"Olayemi");
        assertEquals("Ms", MyPass2.getTitle());
        Passenger MyPass3 = new Passenger("Mrs", "Alvin" ,"Olayemi");
        assertEquals("Mrs", MyPass3.getTitle());
    }
    @Test
    void TestTitleFail()
    {

        assertThrows(IllegalArgumentException.class, () -> {new Passenger("Dr", "Alvin" , "Olayemi");});
        assertThrows(IllegalArgumentException.class, () -> {new Passenger("", "Alvin" , "Olayemi");});

    }
}
