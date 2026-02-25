package com.weatheranalysis.api.service;

import java.time.LocalDate;
import java.util.List;
import com.weatheranalysis.api.dto.TemperatureStatsDTO;
import com.weatheranalysis.api.entity.WeatherData;

public interface WeatherService {
	String loadData();
	List<WeatherData> getAll();
	List<WeatherData> getByDate(LocalDate date);
    List<WeatherData> getByMonth(int year, int month);
    TemperatureStatsDTO getMonthlyStats(int year, int month);
    List<WeatherData> getBySorted(String field);
}
