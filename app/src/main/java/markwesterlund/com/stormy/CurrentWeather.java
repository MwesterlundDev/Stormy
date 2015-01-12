package markwesterlund.com.stormy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Mark Westerlund on 1/10/15.
 */
public class CurrentWeather {
    private String mIcon;
    private long mTime;
    private double mTemperature;
    private double mHumidity;
    private double mPrecipChance;
    private String mSummary;
    private String mTimezone;


    public int getTempColor(){

        int color = 0xff000000;

        if(mTemperature >= 100) {
            color = 0xffff0000;
        } else if(mTemperature > 95 && mTemperature < 100) {
            color = 0xffff2400;
        }
        else if(mTemperature > 90 && mTemperature < 95) {
            color = 0xffff3500;
        }
        else if(mTemperature > 85 && mTemperature < 90) {
            color = 0xffff5a00;
        }
        else if(mTemperature > 80 && mTemperature < 85) {
            color = 0xffff7000;
        }
        else if(mTemperature > 75 && mTemperature < 80) {
            color = 0xffff8d00;
        }
        else if(mTemperature > 70 && mTemperature < 75) {
            color = 0xffffa300;
        }
        else if(mTemperature > 65 && mTemperature < 70) {
            color = 0xffffc200;
        }
        else if(mTemperature > 60 && mTemperature < 65) {
            color = 0xff77dd00;
        }
        else if(mTemperature > 55 && mTemperature < 60) {
            color = 0xff00a300;
        }
        else if(mTemperature > 50 && mTemperature < 55) {
            color = 0xff007900;
        }
        else if(mTemperature > 45 && mTemperature < 50) {
            color = 0xff00793a;
        }
        else if(mTemperature > 40 && mTemperature < 45) {
            color = 0xff005350;
        }
        else if(mTemperature > 35 && mTemperature < 40) {
            color = 0xff003161;
        }
        else if(mTemperature > 30 && mTemperature < 35) {
            color = 0xff000083;
        }
        else if(mTemperature > 25 && mTemperature < 30) {
            color = 0xff0024b9;
        }
        else if(mTemperature > 20 && mTemperature < 25) {
            color = 0xff008aff;
        }
        else if(mTemperature > 15 && mTemperature < 20) {
            color = 0xff00c0ff;
        }
        else if(mTemperature > 10 && mTemperature < 15) {
            color = 0xff86c0ff;
        }
        else if(mTemperature > 5 && mTemperature < 10) {
            color = 0xffc0c0ff;
        }
        else if(mTemperature < 5) {
            color = 0xffffc0ff;
        }


        return color;

    }


    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        mTimezone = timezone;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public int getIconId() {
        //values: clear-day, clear-night, rain, snow, sleet, wind, fog, cloudy, partly-cloudy-day, or partly-cloudy-night
        int iconId = R.drawable.clear_day;

        if (mIcon.equals("clear-day")) {
            iconId = R.drawable.clear_day;
        }
        else if (mIcon.equals("clear-night")) {
            iconId = R.drawable.clear_night;
        }
        else if (mIcon.equals("rain")) {
            iconId = R.drawable.rain;
        }
        else if (mIcon.equals("snow")) {
            iconId = R.drawable.snow;
        }
        else if (mIcon.equals("sleet")) {
            iconId = R.drawable.sleet;
        }
        else if (mIcon.equals("wind")) {
            iconId = R.drawable.wind;
        }
        else if (mIcon.equals("fog")) {
            iconId = R.drawable.fog;
        }
        else if (mIcon.equals("cloudy")) {
            iconId = R.drawable.cloudy;
        }
        else if (mIcon.equals("partly-cloudy-day")) {
            iconId = R.drawable.partly_cloudy;
        }
        else if (mIcon.equals("partly-cloudy-night")) {
            iconId = R.drawable.cloudy_night;
        }

        return iconId;

    }

    public long getTime() {
        return mTime;
    }

    public String getFormattedTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(getTimezone()));
        Date dateTime = new Date(getTime() * 1000);
        String timeString = formatter.format(dateTime);

        return timeString;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public int getTemperature() {
        return (int)Math.round(mTemperature);
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public double getPrecipChance() {
        return (int)Math.round(mPrecipChance * 100);
    }

    public void setPrecipChance(double precipChance) {
        mPrecipChance = precipChance;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }
}
