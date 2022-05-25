public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Contoh call untuk setter & getter company
		Company company1 = new Company();
		company1.setNama("Company1 Name");
		System.out.println(company1.getName());
		System.out.println("\n");
		
		
		//Code dibawah ini akan menampilkan Materi Encapsulation
		// superclass
		Hero hero1 = new Hero();
		hero1.name = "Hero1";
		System.out.println("This is " + hero1.name);
	
		
		//Code dibawah ini akan menampilkan materi Inheritance
		// HeroStrength adalah inheritance
		// maka dapat memanggil atribut dari super class meskipun
		// tidak memiliki atribut tersebut
		HeroStrength hero2 = new HeroStrength();
		hero2.name = "Hero2";
		hero2.display();
		
		HeroIntelligent hero3 = new HeroIntelligent();
		hero3.name="Hero3";
		hero3.display();
		
		HeroTank hero4 = new HeroTank();
		hero4.name = "Hero4";
		hero4.displayNameSuper();
		
		// dengan merubah setname pada herochild4 maka akan terpanggil pada variabel local
		hero4.setNameChild("HeroChild4");
		hero4.displayNameChild();
		System.out.println("\n");
		
		
		
		// Selanjutnya akan ditampilkan code untuk bentuk polymorphism
		// polymorphism diartikan dengan "banyak bentuk"
		
		Vegetables vege1 = new Vegetables("vege1");
		vege1.display();
		
		Tomato vege2 = new Tomato("vege2");
		vege2.display();
		// mengacu pada deklarasi class vegetables, dinyatakan bahwa code di bawah tidak bisa dijalankan
		// apabila dimasukkan kedalam deklarasi awal dari class induk
		vege2.color();
		
		// code ini menghasilkan display dari class child meskipun awalan di definisikan dengan super class
		Vegetables vege3 = new Spinach("vege3");
		vege3.display();
		// code dibawah tidak bisa dijalankan
//		vege3.color();
		

		System.out.println("\n");
		
		
		// code dibawah tidak bisa dilakukan karena mengarah dari child ke induk
//		Tomato vege4 = new Vegetables("vege4");
//		vege4.display();
		
		
		// polymorphism dapat dimasukkan dalam sebuah array dengan deklarasi array menggunakan class induk
		
		Vegetables[] kumpulanVege = new Vegetables[4];
		kumpulanVege[1] = vege1;
		kumpulanVege[2] = vege2;
		kumpulanVege[3] = vege3;
		
		kumpulanVege[1].display();
		kumpulanVege[2].display();
		kumpulanVege[3].display();
		
		// mengacu pada pendeklarasian code yang terdapat pada contoh class tomato di atas, maka fungsi dibawah tidak dapat berjalan
//		kumpulanVege[2].color();
		
		// Namun, apabila method yg dipanggil terdapat pada class induk maka method dapat dipanggil oleh array dari child class
		kumpulanVege[1].taste();
		kumpulanVege[2].taste();
		kumpulanVege[3].taste();

		System.out.println("\n");
		
		// code dibawah digunakan untuk materi abstract
		
		Dog animal1 = new Dog("animal1");
		animal1.display();
		
		// code dibawah tidak bisa dijalankan karena abstract class bukan objek sehingga tidak dapat didefinisikan
//		Animal animal2 = new Animal();
//		animal2.display();
		
		Cat animal2 = new Cat("animal2");
		animal1.suara();
		animal2.suara();
	}

}
