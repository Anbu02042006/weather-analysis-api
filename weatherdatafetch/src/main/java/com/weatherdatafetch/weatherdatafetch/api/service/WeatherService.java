package com.weather_analysis.api.service;

import java.time.LocalDate;
import java.util.List;
import com.weather_analysis.api.dto.TemperatureStatsDTO;
import com.weather_analysis.api.entity.WeatherData;

public interface WeatherService {
	String loadData();
	List<WeatherData> getAll();
	List<WeatherData> getByDate(LocalDate date);
    List<WeatherData> getByMonth(int year, int month);
    TemperatureStatsDTO getMonthlyStats(int year, int month);
    List<WeatherData> getBySorted(String field);
}
