package com.weatheranalysis.api.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Weather_Data")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class WeatherData {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private LocalDate date;
    private String weatherCondition;
    private Double temperature;
    private Double humidity;
    private Double pressure;
    private Double heatIndex;;
}
