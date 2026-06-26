package com.wf.publicissapient.rule;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.wf.publicissapient.dto.WeatherAlertDto;
import com.wf.publicissapient.model.OpenWeatherPayload.ForecastData;

@Component
public class ThunderstormRule implements WeatherRule {
	@Override
	public Optional<WeatherAlertDto> evaluate(ForecastData data) {
		boolean isStorm = data.getWeather().stream().anyMatch(w -> w.getMain().equalsIgnoreCase("Thunderstorm"));
		return isStorm ? Optional.of(new WeatherAlertDto("Don’t step out! A Storm is brewing!")) : Optional.empty();
	}
}
