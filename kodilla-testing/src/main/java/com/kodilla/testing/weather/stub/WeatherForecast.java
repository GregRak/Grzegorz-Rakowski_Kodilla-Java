package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemperature() {
        double sum = 0;
        int loopNumber = 0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            loopNumber++;
            double currentTemperature = temperature.getValue();
            sum += currentTemperature;
        }
        return sum / loopNumber;
    }

    public double medianTemperature() {
        List<Double> temperatureList = new ArrayList<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            double currentTemperature = temperature.getValue();
            temperatureList.add(currentTemperature);
        }
        Collections.sort(temperatureList);
        int quantityOfNumbers = temperatureList.size();
        if (temperatureList.size() % 2 == 0) {
            int n = quantityOfNumbers/2;
            int k = n - 1;
            double result = (temperatureList.get(n) + temperatureList.get(k))/2;
            return result;
        } else {
            double temporaryQuantityOfNumbers = (double) quantityOfNumbers;
            double n = temporaryQuantityOfNumbers/2;
            double k = n - 0.5;
            int newK = (int) k;
            double result = temperatureList.get(newK);
            return result;
        }
    }
}
