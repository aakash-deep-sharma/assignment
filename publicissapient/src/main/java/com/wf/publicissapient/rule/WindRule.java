package com.wf.publicissapient.rule;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.wf.publicissapient.dto.WeatherAlertDto;
import com.wf.publicissapient.model.OpenWeatherPayload.ForecastData;

@Component
public class WindRule implements WeatherRule {
	@Override
	public Optional<WeatherAlertDto> evaluate(ForecastData data) {
		return (data.getWind() != null && data.getWind().getSpeed() > 10.0)
				? Optional.of(new WeatherAlertDto("It’s too windy, watch out!"))
				: Optional.empty();
	}
}
