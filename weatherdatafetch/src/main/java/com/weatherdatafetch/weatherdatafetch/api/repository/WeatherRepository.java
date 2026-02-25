package com.weather_analysis.api.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weather_analysis.api.entity.WeatherData;

public interface WeatherRepository extends JpaRepository<WeatherData,Long> {
	List<WeatherData> findByDate(LocalDate date);
    List<WeatherData> findByDateBetween(LocalDate startDate,LocalDate endDate);
}
