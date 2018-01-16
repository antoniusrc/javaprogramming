package id.ac.ukdw.day02;

import java.util.Comparator;

public class DVDYearComparator implements Comparator<DVDItem> {

	@Override
	public int compare(DVDItem arg0, DVDItem arg1) {
		// TODO Auto-generated method stub
		int selisih = arg1.year - arg0.year;
		if(selisih < 0){
			return -1;
		} else if(selisih == 0){
			return arg1.judul.compareTo(arg0.judul);
		} else
			return 1;
	}

}
