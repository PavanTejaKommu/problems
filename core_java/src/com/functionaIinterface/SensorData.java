package com.functionaIinterface;

import java.util.function.Function;

public class SensorData {
	
	private double temperature ;
	 private double humidity;
	 
	 
	 
	
	public SensorData(double temperature, double humidity) {
		super();
		this.temperature = temperature;
		this.humidity = humidity;
	}




	public double getTemperature() {
		return temperature;
	}




	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}




	public double getHumidity() {
		return humidity;
	}




	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}




	public static void main(String[] args) {
		
		SensorData sensordata = new SensorData(25, 35);
		
		Function<SensorData, Double> function = new Function<SensorData, Double>() {

			@Override
			public Double apply(SensorData t) {
			
				  return sensordata.getTemperature();
			}
		};
		
		
		
		Function<SensorData, Boolean> fun = new Function<SensorData, Boolean>() {
			
			@Override
			public Boolean apply(SensorData t) {
				 double t1 = sensordata.getTemperature();
				boolean flag = false;
				
				if(t1  >= 25) {
					flag = true;
				}
			
				return flag;
			}
		};
		System.out.println("Temparature : "+function.apply(sensordata));
		System.out.println("Is Reached Throshaled value :"+fun.apply(sensordata));
		
	}

}
