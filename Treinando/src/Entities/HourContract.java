package Entities;

import java.util.Date;

public class HourContract {
	
	private Date date;
	private Double Valueperhour;
	private Integer hours;
	
	public HourContract() {}

	public HourContract(Date date, Double valueperhour, Integer hours) {
		this.date = date;
		Valueperhour = valueperhour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValueperhour() {
		return Valueperhour;
	}

	public void setValueperhour(Double valueperhour) {
		Valueperhour = valueperhour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	

}
