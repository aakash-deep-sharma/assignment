package com.wf.publicissapient.rule;

import java.util.Optional;

import com.wf.publicissapient.dto.WeatherAlertDto;
import com.wf.publicissapient.model.OpenWeatherPayload.ForecastData;

public interface WeatherRule {
	Optional<WeatherAlertDto> evaluate(ForecastData data);
}
