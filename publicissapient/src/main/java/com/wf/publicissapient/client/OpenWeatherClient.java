package com.wf.publicissapient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wf.publicissapient.model.OpenWeatherPayload;

@FeignClient(name = "openWeatherClient", url = "https://api.openweathermap.org")
public interface OpenWeatherClient {

	@GetMapping("/data/2.5/forecast")
	OpenWeatherPayload fetch3DayForecast(@RequestParam("q") String city, @RequestParam("appid") String apiKey,
			@RequestParam("cnt") int count);
}
