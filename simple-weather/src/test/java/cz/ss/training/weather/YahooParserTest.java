package cz.ss.training.weather;

import static org.junit.Assert.assertEquals;

import java.io.InputStream;

import org.junit.Test;

import cz.ss.training.weather.model.Weather;

public class YahooParserTest {

  @Test
  public void testParser() throws Exception {
    InputStream nyData = getClass().getClassLoader().getResourceAsStream("ny-weather.xml");
    Weather weather = new YahooParser().parse("10002", nyData);
    assertEquals("New York", weather.getLocation().getCity());
    assertEquals("NY", weather.getLocation().getRegion());
    assertEquals("US", weather.getLocation().getCountry());
    assertEquals("39", weather.getCondition().getTemp());
    assertEquals("Fair", weather.getCondition().getText());
    assertEquals("39", weather.getWind().getChill());
    assertEquals("67", weather.getAtmosphere().getHumidity());
  }
}
