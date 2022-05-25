
// Class ini dibuat untuk menampilkan materi Polymorphism 

// super class
public class Vegetables {
	
	String name;
	
	Vegetables(String name){
		this.name = name;
	}
	
	public void display() {
		System.out.println("Name super : " + this.name);
	}
	
	public void taste() {
		System.out.println("This "+ this.name +"is delicious");
	}

}

// Class ini adalah inheritance dari class vegetables
class Tomato extends Vegetables{
	
	String type = "Tomato";
	
	// constructor child class dapat dibuat dengan menggunakan kata super
	// dimana super merujuk pada class parent
	Tomato(String name){
		super(name);
	}
	
	// overriding method di bawah digunakan untuk menampilkan display yg berasal dari class child
	public void display() {
		
		// code dibawah merujuk pada display di super class
		super.display();
		System.out.println("Type : " + this.type);
	}
	
	public void color() {
		System.out.println("The color of this vege is red!");
	}
	
}


class Spinach extends Vegetables{
	
	String type = "Spinach";
	
	Spinach(String name){
		super(name);
	}
	
	public void display() {
		super.display();
		System.out.println("Type : " + this.type);
	}
	
	public void color() {
		System.out.println("The color of this vege is green!");
	}
	
}

class Carrot extends Vegetables{
	
	String type = "Carrot";
	
	Carrot(String name){
		super(name);
	}
	
	public void display() {
		super.display();
		System.out.println("Type : " + this.type);
	}
	
}