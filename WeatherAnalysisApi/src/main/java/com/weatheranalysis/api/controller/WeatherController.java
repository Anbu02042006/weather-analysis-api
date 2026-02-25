package com.weatheranalysis.api.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weatheranalysis.api.dto.TemperatureStatsDTO;
import com.weatheranalysis.api.entity.WeatherData;
import com.weatheranalysis.api.service.WeatherService;

@RestController
@RequestMapping("/weather")
public class WeatherController {
	@Autowired
    private WeatherService weatherService;
	
	@PostMapping("/load")
	public String loadWeatherData() {
		return weatherService.loadData();
		}
	
	@GetMapping("/all")
	public List<WeatherData> getAll() {
	    return weatherService.getAll();
	}
	
	@GetMapping("/date")
    public List<WeatherData> getWeatherByDate(@RequestParam String date){
        LocalDate localDate = LocalDate.parse(date);
        return weatherService.getByDate(localDate);
    }
	
	@GetMapping("/month")
	 public List<WeatherData> getWeatherByMonth(@RequestParam int year,@RequestParam int month){
        return weatherService.getByMonth(year,month);
    }
	
	@GetMapping("/stats")
	public TemperatureStatsDTO getTemperatureStats(@RequestParam int year,@RequestParam int month){
        return weatherService.getMonthlyStats(year, month);
    }
	
	@GetMapping("/sort")
	public List<WeatherData> sortByField(
	        @RequestParam String field) {

	    return weatherService.getBySorted(field);
	}
}