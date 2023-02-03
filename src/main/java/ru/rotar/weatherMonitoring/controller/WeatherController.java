package ru.rotar.weatherMonitoring.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.rotar.weatherMonitoring.model.City;
import ru.rotar.weatherMonitoring.model.WeatherData;
import ru.rotar.weatherMonitoring.service.WeatherDataService;


@Log
@RestController
@RequiredArgsConstructor
public class WeatherController {
    private final WeatherDataService weatherDataService;

    @GetMapping("/{city}")
    public WeatherData getWeather(@PathVariable City city) {
        return weatherDataService.weatherInTheCity(city);
    }
}
