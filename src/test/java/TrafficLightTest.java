import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TrafficLightTest {

    private TrafficLight light;

    @BeforeEach
    void setUp() {
        light = new TrafficLight(LightColor.RED);
    }

    @Test
    void next_fromRed_goesToGreen() {
        light.next();
        assertEquals(LightColor.GREEN, light.getColor());
    }

    @Test
    void next_cyclesGreenToYellow() {
        light = new TrafficLight(LightColor.GREEN);
        light.next();
        assertEquals(LightColor.YELLOW, light.getColor());
    }
}