package id.ac.ukdw.day02;

public enum Hari {
	SENIN(1,"Monday"), SELASA, RABU, KAMIS, JUMAT, SABTU, MINGGU;
	private int value;
	private String alias;
	private Hari() {};
	private Hari(int value, String alias){
		this.alias = alias;
		this.value = value;
	}
	public String getAlias(){
		return this.alias;
	}
	public int getValue(){
		return this.value;
	}
}
