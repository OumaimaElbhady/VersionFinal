package project_tp;

import java.util.Objects;

public class Fproject implements Comparable< Fproject> {
	
	protected String brand;
	protected String model;
	protected int year;
	
	public Fproject(String brand, String model, int year) {
	        this.brand = brand;
	        this.model = model;
	        this.year = year;
	}    
	
	
	public String toString() {
	      return "Device [brand=" + brand + ", model=" + model + ", year=" + year + "]";
	        }
	
	 public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Fproject Fproject = (Fproject) obj;
	        return Double.compare(Fproject.year, year) == 0 &&
	                Objects.equals(brand, Fproject.brand) &&
	                Objects.equals(model, Fproject.model);
	    }
	 
	 public int compareTo(Fproject otherFproject) {
	        // Comparing based on price
	        return Double.compare(this.year, otherFproject.year);
	    }

	
}