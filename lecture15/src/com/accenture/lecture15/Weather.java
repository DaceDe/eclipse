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
		return "Weather forecast in country " + country + ", daysWeather="
				+ Arrays.toString(daysWeather) + "]";
	}

	private double getSum() {
		double sum = 0;
		for (int i = 0; i < daysWeather.length; i++) {
			sum += daysWeather[i];
		}
		return sum;
	}

	public double getWeekAverage() {
		// double sum = 0;
		// for (int i = 0; i < daysWeather.length; i++) {
		// sum += daysWeather[i];
		// }
		double average = getSum() / daysWeather.length;
		return average;
	}

	public double getHottestTemperature() {
		double max = daysWeather[0];
		for (int i = 0; i < daysWeather.length; i++) {
			if (daysWeather[i] > max) {
				max = daysWeather[i];
			}
		}
		return max;
	}


	public String getHottestDayName (){
		int max = daysWeather[0];
		int hottestDayIndex =0;
		for( int i=0; i < daysWeather.length; i++){
			if (max<daysWeather[i]){
				max=daysWeather[i];
				hottestDayIndex=i;
			}
		}
		String weekDay = "";

		switch (hottestDayIndex) {

		case 0:
			weekDay = "Monday";
			break;
		case 1:
			weekDay = "Tuesday";
			break;
		case 2:
			weekDay = "Wednesdays";
			break;
		case 3:
			weekDay = "Thursday";
			break;
		case 4:
			weekDay = "Friday";
			break;
		case 5:
			weekDay = "Saturday";
			break;
		case 6:
			weekDay = "Sunday";
			break;
		}
		
		return weekDay;

	}
	
	public double getColdestTemperature() {
		double min = daysWeather[0];
		for (int i = 0; i < daysWeather.length; i++) {
			if (daysWeather[i] < min) {
				min = daysWeather[i];
			}
		}
		return min;
	}
	
	public String getColdestDayName (){
		int min = daysWeather[0];
		int coldestDayIndex =0;
		for( int i=0; i < daysWeather.length; i++){
			if (min>daysWeather[i]){
				min=daysWeather[i];
				coldestDayIndex=i;
			}
		}
		String weekDay = "";

		switch (coldestDayIndex) {

		case 0:
			weekDay = "Monday";
			break;
		case 1:
			weekDay = "Tuesday";
			break;
		case 2:
			weekDay = "Wednesdays";
			break;
		case 3:
			weekDay = "Thursday";
			break;
		case 4:
			weekDay = "Friday";
			break;
		case 5:
			weekDay = "Saturday";
			break;
		case 6:
			weekDay = "Sunday";
			break;
		}
		
		return weekDay;

	}
}

 