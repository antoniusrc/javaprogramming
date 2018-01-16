package id.ac.ukdw.day02;

public class Cat extends Animal implements Pet {

	private String name;

	protected Cat(String name) {
		super(4);
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public Cat(){
		this("Kitty");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String n) {
		// TODO Auto-generated method stub
		this.name = n;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Kucing main bola");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Kucing makan ikan");
	}

}
