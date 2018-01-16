package id.ac.ukdw.day02;

public class DVDItem implements Comparable<DVDItem> {
	
	String judul;
	String genre;
	int year;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((judul == null) ? 0 : judul.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DVDItem other = (DVDItem) obj;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (judul == null) {
			if (other.judul != null)
				return false;
		} else if (!judul.equals(other.judul))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	public DVDItem(String j,String g,int y){
		this.judul = j;
		this.genre = g;
		this.year = y;
	}
	
	@Override
	public int compareTo(DVDItem arg0) {
		// TODO Auto-generated method stub
		return arg0.judul.compareTo(judul);
	}

	@Override
	public String toString() {
		return "DVDItem [judul=" + judul + ", genre=" + genre + ", year=" + year + "]";
	}
	
}
