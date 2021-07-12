
class Animal {
	//  public static final String str = null;

	public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	String str="Parent Class Variable";
	}

	class Dog extends Animal {
		 String str="Dog Class Variable";
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
	
	}

	class Test {
	  public static void main(String[] args) {
	  
	    Animal myDog = new Dog();
	        
	    myDog.animalSound();
	    
   System.out.println("Dog Class Calling " + myDog.str);
	  }
	}

