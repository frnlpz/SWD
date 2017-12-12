package Lab8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiscTestTesting {

    @Test
    public void temperatureOver30ShouldReturnHot() {
        MiscTest test = new MiscTest();
        assertEquals("hot", test.temperature(35), "Temperature = 35 should return 'hot'");
    }

    @Test
    public void temperatureBetween20And30ShouldReturnHot() {
        MiscTest test = new MiscTest();
        assertEquals("warm", test.temperature(25), "Temperature = 25 should return 'warm'");
    }

    @Test
    public void temperatureBetween10And20ShouldReturnHot() {
        MiscTest test = new MiscTest();
        assertEquals("fine", test.temperature(15), "Temperature = 15 should return 'fine'");
    }

    @Test
    public void temperatureUnder10ShouldReturnHot(){
        MiscTest test = new MiscTest();
        assertEquals("cold", test.temperature(5), "Temperature = 5 should return 'cold'");
    }
}
