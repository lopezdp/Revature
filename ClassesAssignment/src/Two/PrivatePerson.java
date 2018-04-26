/**
 * 
 */
package Two;

/**
 * @author LopezDP
 * 
 * Write a class named PrivatePerson. 
 * Declare instance variables name (String) 
 * and age (int) and mark them private. 
 * 
 * Write getter and setter methods to access 
 * these properties. 
 * 
 * In a Main class, create a new instance of 
 * Person and print its properties name and age. 
 * Place these files in a package named, “two”. 
 *
 */
public class PrivatePerson {
	
	private String name;
	private int age;
	
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int a) {
		this.age = a;
	}
	
	public int getAge() {
		return this.age;
	}

}
