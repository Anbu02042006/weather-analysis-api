package com.weatheranalysis.api.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weatheranalysis.api.entity.WeatherData;

public interface WeatherRepository extends JpaRepository<WeatherData,Long> {
	List<WeatherData> findByDate(LocalDate date);
    List<WeatherData> findByDateBetween(LocalDate startDate,LocalDate endDate);
}
