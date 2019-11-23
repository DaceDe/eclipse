package com.accenture.lecture15;

import java.util.Arrays;

public class Weather {

	// Task 1 - Lets make our Weather class to store following information:
	// String country - for which forecast is prepared.
	// int[] daysWeather- temperature information for next week (7 days).

	private final String country;
	private int[] daysWeather;

	public String getCountry() {
		return country;
	}

	public int[] getDaysWeather() {
		return daysWeather;
	}

	public void setDaysWeather(int[] daysWeather) {
		this.daysWeather = daysWeather;
	}

	public Weather(String country, int[] daysWeather) {
		this.country = country;
		this.daysWeather = daysWeather;
	}

	void display() {
		System.out.println(country + " " + daysWeather);

	}

	public String toString() {
		return "Weather forecast in country=" + country + ", daysWeather="
				+ Arrays.toString(daysWeather) + "]";
	}

}
