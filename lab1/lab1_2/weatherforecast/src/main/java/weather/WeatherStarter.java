package weather;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import weather.ipma_client.*;

import java.util.logging.Logger;

/**
 * demonstrates the use of the IPMA API for weather forecast
 */
public class WeatherStarter {

    //private static final int CITY_ID_AVEIRO = 1010500;
    /*
    loggers provide a better alternative to System.out.println
    https://rules.sonarsource.com/java/tag/bad-practice/RSPEC-106
     */
    private static final Logger logger = Logger.getLogger(WeatherStarter.class.getName());

    public static void  main(String[] args ) {

        /*
        get a retrofit instance, loaded with the GSon lib to convert JSON into objects
         */
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.ipma.pt/open-data/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        IpmaService service = retrofit.create(IpmaService.class);

        Call<IpmaCityForecast> callSync = null;
        try {
            if(args.length == 0) throw new Exception();

            callSync = service.getForecastForACity(Integer.parseInt(args[0]));

        }catch  (Exception ex) {
            logger.info("The chosen city doesn't exist, check: http://api.ipma.pt/");
            ex.printStackTrace();
        }

        try {
            Response<IpmaCityForecast> apiResponse = callSync.execute();
            IpmaCityForecast forecast = apiResponse.body();

            if (forecast != null) {
                logger.info("Data retrieved from " + forecast.getOwner()
                + "\n" + "Country: " + forecast.getCountry()
                + "\n" + "City code: " + forecast.getGlobalIdLocal()
                + "\n" + "Max temp for today: " + forecast.getData().listIterator().next().getTMax() + "ºC");

            } else {
                logger.info( "No results!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
