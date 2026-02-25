package com.weatheranalysis.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter
public class TemperatureStatsDTO {
	private Double high;
    private Double median;
    private Double minimum;
}
