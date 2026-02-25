package com.weather_analysis.api.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.weather_analysis.api.entity.WeatherData;

@Component
public class CsvReaderUtil {

    public List<WeatherData> readWeatherData(String filePath) {

        List<WeatherData> weatherData = new ArrayList<>();

        try {

            // Load CSV from resources folder
            ClassPathResource resource = new ClassPathResource(filePath);

            BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(resource.getInputStream()));

            String line;

            // Skip header row
            br.readLine();

            // CSV date format
            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("yyyyMMdd-HH:mm");

            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] data = line.split(",");
                if (data.length < 6) continue;
                WeatherData wd = new WeatherData();
                LocalDateTime dateTime =LocalDateTime.parse(data[0].trim(), formatter);
                wd.setDate(dateTime.toLocalDate());
                wd.setWeatherCondition(data[1].trim());
                wd.setTemperature(parseDoubleSafe(data[2]));
                wd.setHumidity(parseDoubleSafe(data[3]));
                wd.setPressure(parseDoubleSafe(data[4]));
                wd.setHeatIndex(parseDoubleSafe(data[5]));
                weatherData.add(wd);
            }
            br.close();
            System.out.println("✅ CSV Rows Loaded: " + weatherData.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return weatherData;
    }
    private Double parseDoubleSafe(String value) {

        if (value == null || value.trim().isEmpty()) {
            return 0.0;  
        }
        try {
            return Double.parseDouble(value.trim());
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }
}