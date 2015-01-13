package markwesterlund.com.stormy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by mark on 1/13/15.
 */
public class DailyWeather extends CurrentWeather {

    double mHighTemp;
    double mHighApparentTemp;
    double mLowTemp;
    double mLowApparentTemp;

    public double getHighApparentTemp() {
        return mHighApparentTemp;
    }

    public void setHighApparentTemp(double highApparentTemp) {
        mHighApparentTemp = highApparentTemp;
    }

    public double getLowApparentTemp() {
        return mLowApparentTemp;
    }

    public void setLowApparentTemp(double lowApparentTemp) {
        mLowApparentTemp = lowApparentTemp;
    }

    public double getHighTemp() {
        return mHighTemp;
    }

    public void setHighTemp(double highTemp) {
        mHighTemp = highTemp;
    }

    public double getLowTemp() {
        return mLowTemp;
    }

    public void setLowTemp(double lowTemp) {
        mLowTemp = lowTemp;
    }

    public String getFormattedTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(getTimezone()));
        Date dateTime = new Date(getTime() * 1000);
        String timeString = formatter.format(dateTime);

        return timeString;
    }
}
