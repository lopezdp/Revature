/**
 *
 */
package monitoring;
import java.beans.ConstructorProperties;

/**
 * @author LopezDP
 *
 */
public class Animal {
	private String title;
	private String species;
	private String name;
	private int age;
	private String health;
	private String feedSchedule;
	private String alert;

	@ConstructorProperties({"title", "species", "name", "age", "health", "feedSchedule", "alert"})
	public Animal(String title, String species, String name, int age, String health, String feedSched, String alert) {
		this.title = title;
		this.species = species;
		this.name = name;
		this.age = age;
		this.health = health;
		this.feedSchedule = feedSched;
		this.alert = alert;
	}

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	// Accessor Methods
	public String getTitle() {
        return this.title;
    }
	
	public String getSpecies() {
        return this.species;
    }

	public String getName() {
        return this.name;
    }

	public int getAge() {
        return this.age;
    }

	public String getHealth() {
        return this.health;
    }

	public String getFeedSched() {
        return this.feedSchedule;
    }

	public String getAlert() {
        return this.alert;
    }

	// Mutator Methods
	public void setTitle(String title) {
        this.title = title;
    }
	
	public void setSpecies(String species) {
        this.species = species;
    }

	public void setName(String name) {
        this.name = name;
    }

	public void setAge(int age) {
        this.age = age;
    }

	public void setHealth(String health) {
        this.health = health;
    }

	public void setFeedSched(String feedSched) {
        this.feedSchedule = feedSched;
    }

	public void setAlert(String alert) {
        this.alert = alert;
    }
}
