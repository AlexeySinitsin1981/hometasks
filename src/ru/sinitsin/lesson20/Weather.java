package ru.sinitsin.lesson20;

public class Weather {
    private String weatherStateName;
    private String windDirectionCompass;
    private int humidity;
    private float minTemp;
    private float windSpeed;
    private String locationType;

    public Weather() {
    }

    public Weather(String weatherStateName, String windDirectionCompass, int humidity, float minTemp, float windSpeed, String locationType) {
        this.weatherStateName = weatherStateName;
        this.windDirectionCompass = windDirectionCompass;
        this.humidity = humidity;
        this.minTemp = minTemp;
        this.windSpeed = windSpeed;
        this.locationType = locationType;
    }

    public String getWeatherStateName() {
        return weatherStateName;
    }

    public void setWeatherStateName(String weatherStateName) {
        this.weatherStateName = weatherStateName;
    }

    public String getWindDirectionCompass() {
        return windDirectionCompass;
    }

    public void setWindDirectionCompass(String windDirectionCompass) {
        this.windDirectionCompass = windDirectionCompass;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public float getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(float minTemp) {
        this.minTemp = minTemp;
    }

    public float getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "weatherStateName='" + weatherStateName + '\'' +
                ", windDirectionCompass='" + windDirectionCompass + '\'' +
                ", humidity=" + humidity +
                ", minTemp=" + minTemp +
                ", windSpeed=" + windSpeed +
                ", locationType='" + locationType + '\'' +
                '}';
    }
}
