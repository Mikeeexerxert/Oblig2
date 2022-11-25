package no.hvl.dat100.lab5.tabeller;
public class Tabeller {
	public static void skrivUt(int[] tabell) {
		for (int a : tabell) {
			System.out.println(a + " ");
		}
	}
	public static String tilStreng(int[] tabell) {
		StringBuilder result = new StringBuilder("[");
		int a = 0;
		while (a < tabell.length) {
			result.append(tabell[a]);
			if (a < tabell.length - 1) result.append(",");
			a ++;
		}
		return result + "]";
	}
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int tall : tabell) {
			sum += tall;
		}
		return sum;
	}
	public static int summer1(int[] tabell) {
		int a = 0;
		int sum = 0;
		while (a < tabell.length) {
			sum += tabell[a];
			a ++;
		}
		return sum;
	}
	public static int summer2(int[] tabell) {
		int sum = 0;
		for (int a : tabell) {
			sum += a;
		}
		return sum;
	}
	public static boolean finnesTall(int[] tabell, int tall) {
		int a = 0;
		while (a < tabell[a]) {
			if (tabell[a] == tall) {
				return true;
			}
			a++;
		}
		return false;
	}
	public static int posisjonTall(int[] tabell, int tall) {
		int a = 0;
		while (a < tabell.length) {
			if (tall == tabell[a]) {
				return a;
			}
			a ++;
		}
		return -1;
	}
	public static int[] reverser(int[] tabell) {
		int[] nytabell = new int[tabell.length];
		int a = 0;
		while (a < tabell.length) {
			nytabell[tabell.length - a - 1] = tabell[a];
			a ++;
		}
		return nytabell;
	}
	public static boolean erSortert(int[] tabell) {
		int a = 1;
		while (a < tabell.length) {
			if (tabell[a] < tabell[a - 1]) {
				return false;
			}
			a ++;
		}
		return true;
	}
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] nytabell = new int[tabell1.length + tabell2.length];
		System.arraycopy(tabell1, 0, nytabell, 0, tabell1.length);
		System.arraycopy(tabell2, 0, nytabell, tabell1.length, tabell2.length);
		return nytabell;
	}
}
