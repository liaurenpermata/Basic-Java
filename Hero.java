
// File class ini berisi materi Inheritance

public class Hero {

	String name;
	
	public void display() {
		System.out.println("This is " + this.name);
	}

}

class HeroStrength extends Hero{
	
}

class HeroIntelligent extends Hero{
	
	// atribut dapat dipanggil dengan this
	public void display(){
		System.out.println("This is " + this.name + " from inheritance");
	}
	
}

class HeroTank extends Hero{
	 
	String name;
	
	// setter ini digunakan untuk inisialisasi nilai name pada class child
	// dengan menggunakan kata this maka yang terpanggil adalah variabel name pada child class
	public void setNameChild(String name) {
		this.name = name;
	}
	
	// display ini akan memanggil variabel pada class super
	// dengan menggunakan kata super merujuk pada class parent
	public void displayNameSuper() {
		super.name = "This is super name";
		System.out.println("This is "+ super.name);
	}
	
	// display akan memanggil variabel local pada child class
	public void displayNameChild() {
		System.out.println("This is "+ this.name);
	}
}
