
// Class ini dibuat untuk menampilkan hasil encapsulation
// Encapsulation adalah konsep OOP dimana atribut bersifat private dan 
// aksesnya diambil dari field melalui public methods

public class Company {
	
	

	//atribut dibawah tidak dapat diakses secara langsung oleh class lain
	private int id;
	private String name;
	private int age;
	
	// namun dengan method public berikut atribut private di atas dapat 
	// diakses secara umum oleh class lain
	
	// SETTER
	public void setId(int newId) {
		this.id = newId;
	}
	
	public void setNama(String newName) {
		this.name = newName;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	
	// GETTER
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

}
