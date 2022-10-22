package com.ProjectAssignment.Movies1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ActionMovies implements Movies
{
	@Id
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
		return "ActionMovies [srno=" + srno + ", year=" + year + ", name=" + name + ", type=" + type + ", rating="
				+ rating + "]";
	}
	public void Genre() 
	{
		System.out.println("Action Movies:\n Action film is a film genre in which the protagonist is thrust "
				+ "into a series of events that typically involve violence and physical feats. The genre tends "
				+ "to feature a mostly resourceful hero struggling against incredible odds, "
				+ "which include life-threatening situations, a dangerous villain, or a pursuit "
				+ "which usually concludes in victory for the hero.");
		
	}
	public void Top5() 
	{
		System.out.println("Top 5 Action Movies:");
		System.out.println("1.Kantara(Year:2022,IMDB:9.3/10)");
		System.out.println("2.John Wick(Year:2014,IMDB:7.4/10)");
		System.out.println("3.The Grey Man(Year:2022,IMDB:6.5/10)");
		System.out.println("4.ponniyin Selvan:Part I(Year:2022,IMDB:8.3/10)");
		System.out.println("5.The Dark Knight(Year:2008,IMDB:9.0/10)");
		
		
		
	}
	
}
