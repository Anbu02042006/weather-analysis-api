package com.weatheranalysis.api.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.weatheranalysis.api.dto.TemperatureStatsDTO;
import com.weatheranalysis.api.entity.WeatherData;
import com.weatheranalysis.api.repository.WeatherRepository;
import com.weatheranalysis.api.service.WeatherService;
import com.weatheranalysis.api.util.CsvReaderUtil;

@Service
public class WeatherServiceImpl implements WeatherService{
	
	 @Autowired
	 private WeatherRepository weatherRepository;

	 @Autowired
	 private CsvReaderUtil csvReader;
	 
	 @Override
	 public String loadData() { 
	     List<WeatherData> data=csvReader.readWeatherData("testset.csv");
	     weatherRepository.saveAll(data);
	     return "Weather Data Loaded Successfully";
	    }

	@Override
	public List<WeatherData> getAll() {
		return weatherRepository.findAll();
	}

	@Override
	public List<WeatherData> getByDate(LocalDate date) {
		return weatherRepository.findByDate(date);
	}

	@Override
	public List<WeatherData> getByMonth(int year, int month) {
		LocalDate start=LocalDate.of(year, month, 1);
        LocalDate end=start.withDayOfMonth(start.lengthOfMonth());
		return weatherRepository.findByDateBetween(start,end);
	}
	
	@Override
	public TemperatureStatsDTO getMonthlyStats(int year, int month) {
		List<WeatherData> records=getByMonth(year, month);
		List<Double> temp=new ArrayList<>();
		for (WeatherData record : records) {
		    temp.add(record.getTemperature());
		}
		Collections.sort(temp);
        double high=temp.get(temp.size()-1);
        double minimum=temp.get(0);
        double median;
        int n=temp.size();
        if (n%2==0)
            median=(temp.get(n/2-1)+temp.get(n/2))/2;
        else
            median=temp.get(n/2);
        return new TemperatureStatsDTO(high, median, minimum);
	}
	@Override
	public List<WeatherData> getBySorted(String field) {
	    if (field == null || field.isBlank()) {
	        throw new RuntimeException("Sort field cannot be null");
	    }
	    List<String> allowed = List.of(
	            "date",
	            "temperature",
	            "humidity",
	            "pressure",
	            "heatIndex",
	            "weatherCondition"
	    );
	    if (!allowed.contains(field)) {
	        throw new RuntimeException("Invalid sort field: " + field);
	    }
	    return weatherRepository.findAll(
	            Sort.by(Sort.Direction.ASC, field)
	    );
	}
	
}
