abstract class bird {
	public abstract void fly();
  	public abstract void makeSound();
}

class eagle extends bird {
	@Override 
	public void fly() {
		System.out.println("Eagle: Flying high in the sky.");
	}
	
	@Override 
	public void makeSound() {	
		System.out.println("Eagle: Screech! Screech!");	
	} 
} 

class hawk extends bird {
	@Override 
	public void fly() {
		System.out.println("Hawk: Soaring through the air.");
	}
	
	@Override 
	public void makeSound() {
		System.out.println("Hawk: Caw! Caw!"); 
	} 
} 

public class mainBird {
	public static void main(String[] args) {
		bird Eagle = new eagle(); 
		bird Hawk = new hawk(); 
		Eagle.fly(); 
		Eagle.makeSound();
		Hawk.fly(); 
		Hawk.makeSound(); 
	}
} 