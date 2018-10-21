package comv.example.sunshine.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sunshine on 2018/10/21.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
