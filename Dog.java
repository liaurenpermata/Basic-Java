// class ini adalah child dari abstract class animal
public class Dog extends Animal {
	
	public Dog(String name) {
		super(name);
	}

	@Override
	public void suara() {
		// TODO Auto-generated method stub
		System.out.println("Ini suara dog woofff");
	}
}