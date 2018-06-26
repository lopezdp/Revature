package monitoring;

import java.beans.ConstructorProperties;
import java.beans.ConstructorProperties;
import java.io.*;

public class Habitat {
	private String title;
	private String habitat;
	private String temp;
	private String cleanliness;
	private String alert;
	
	@ConstructorProperties({"habitat", "temp", "cleanliness", "alert"})
	public Habitat (String habitat, String temp, String cleanliness, String alert) {
		this.habitat = habitat;
		this.temp = temp;
		this.cleanliness = cleanliness;
		this.alert = alert;
	}
	
	// Accessor Methods
	public String getTitle() {
        return this.title;
    }
	
	public String getHabitat() {
        return this.habitat;
    }
	
	public String getTemp() {
        return this.temp;
    }
	
	public String getCleanliness() {
        return this.cleanliness;
    }
	
	public String getAlert() {
        return this.alert;
    }
	
	// Mutators
	public void setTitle(String title) {
        this.title = title;
    }
	
	public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
	
	public void setTemp(String temp) {
        this.temp = temp;
    }
	
	public void setCleanliness(String cleanliness) {
        this.cleanliness = cleanliness;
    }
	
	public void setAlert(String alert) {
        this.alert = alert;
    }
}
