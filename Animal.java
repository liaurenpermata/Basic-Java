
// class ini dibuat untuk menampilkan materi Abstract class
// dimana abstract berarti class tidak dapat dibuat secara mandiri sebagai object
// dan semua method yang ditulis abstract harus terdapat pada semua child class

public abstract class Animal {

	String name;
	
	public Animal(String name) {
		// TODO Auto-generated constructor stub
		
		this.name = name;
	}
	
	// pada method dibawah tidak perlu ada pada semua child class karena bukan absract method
	public void display() {
		System.out.println("This is display animal from super class");
	}
	
	// method dibawah adalah abstract method
	// dimana semua class turunan/child harus menerapkan method ini karena abstract
	public abstract void suara();

}
