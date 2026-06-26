package com.wf.publicissapient.rule;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.wf.publicissapient.dto.WeatherAlertDto;
import com.wf.publicissapient.model.OpenWeatherPayload.ForecastData;

@Component
public class TemperatureRule implements WeatherRule {
	@Override
	public Optional<WeatherAlertDto> evaluate(ForecastData data) {
		// Converting Kelvin to Celsius
		double tempCelsius = data.getMain().getTempMax() - 273.15;
		return tempCelsius > 40.0 ? Optional.of(new WeatherAlertDto("Use sunscreen lotion")) : Optional.empty();
	}
}
