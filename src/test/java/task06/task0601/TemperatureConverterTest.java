package task06.task0601;

import org.junit.Test;
import static org.junit.Assert.*;

public class TemperatureConverterTest {

    @Test
    public void testConvertFtoC() throws Exception {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(0, converter.convertFtoC(32), 0.001);
    }

    @Test
    public void testConvertCtoF() throws Exception {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(50, converter.convertCtoF(10), 0.001);
    }

    @Test
    public void testConvertCtoK() throws Exception {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(273.2, converter.convertCtoK(0), 0.001);
    }

    @Test
    public void testConvertKtoC() throws Exception {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(0, converter.convertKtoC(273.2), 0.001);
    }

    @Test
    public void testConvertFtoK() throws Exception {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(250, converter.convertFtoK(-9.7), 0.001);
    }

    @Test
    public void testConvertKtoF() throws Exception {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(-459.7, converter.convertKtoF(0), 0.001);
    }

}