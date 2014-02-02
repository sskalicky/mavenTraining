package cz.ss.training.weather;

import java.io.InputStream;

import cz.ss.training.weather.model.Weather;

public class WeatherService {

  private YahooRetriever yahooRetriever;
  private YahooParser yahooParser;

  public Weather retrieveForecast(String zip) throws Exception {
    InputStream dataIn = yahooRetriever.retrieve(zip);
    Weather weather = yahooParser.parse(zip, dataIn);
    return weather;
  }

  public YahooParser getYahooParser() {
    return yahooParser;
  }

  public void setYahooParser(YahooParser yahooParser) {
    this.yahooParser = yahooParser;
  }

  public YahooRetriever getYahooRetriever() {
    return yahooRetriever;
  }

  public void setYahooRetriever(YahooRetriever yahooRetriever) {
    this.yahooRetriever = yahooRetriever;
  }

}
