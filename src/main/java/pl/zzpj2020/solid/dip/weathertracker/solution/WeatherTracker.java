package pl.zzpj2020.solid.dip.weathertracker.solution;

public class WeatherTracker {
    String currentConditions;
    AlertDevice alertDevice;

    public WeatherTracker(AlertDevice alertDevice) {
        this.alertDevice = alertDevice;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
    }

    public void displayAlert() {
        String alert = alertDevice.generateWeatherAlert(currentConditions);
        System.out.print(alert);
    }
}
