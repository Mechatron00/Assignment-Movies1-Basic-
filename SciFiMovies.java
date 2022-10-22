package com.ProjectAssignment.Movies1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class SciFiMovies implements Movies
{@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int srno;
	int year;
	String name;
	String type;
	double rating;
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "SciFiMovies [srno=" + srno + ", year=" + year + ", name=" + name + ", type=" + type + ", rating="
				+ rating + "]";
	}
	public void Genre()
	{
		System.out.println("Sci-fi Movies:\n"
				+ "Science fiction (or sci-fi) is a film genre that uses speculative, "
				+ "fictional science-based depictions of phenomena that are not fully "
				+ "accepted by mainstream science, such as extraterrestrial lifeforms, "
				+ "spacecraft, robots, cyborgs, interstellar travel or other technologies. "
				+ "Science fiction films have often been used to focus on political or social issues, "
				+ "and to explore philosophical issues like the human condition.");
		
	}
	public void Top5() 
	{
		System.out.println("Top 5 Sci-fi Movies:");
		System.out.println("1.The Matrix(Year:1999,IMDB:8.7/10)");
		System.out.println("2.Alien(Year:1979,IMDB:8.5/10)");
		System.out.println("3.Prey(Year:2022,IMDB:7.2/10)");
		System.out.println("4.Inception(Year:2010,IMDB:8.8/10)");
		System.out.println("5.Avatar(Year:2009,IMDB:7.8/10)");
		
	}
	
	
	

}
