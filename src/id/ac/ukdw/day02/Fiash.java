package id.ac.ukdw.day02;

public class Fiash extends Animal implements Pet {
	private String name;
	protected Fiash() {
		super(0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setName(String n) {
		// TODO Auto-generated method stub
		this.name = n;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Ikan bermain di air");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Ikan makan plakton");
	}
	
	@Override
	public void walk(){
		System.out.println("Ikan berenang");
	}

}
