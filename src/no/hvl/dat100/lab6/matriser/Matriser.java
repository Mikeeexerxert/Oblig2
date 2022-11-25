package no.hvl.dat100.lab6.matriser;
public class Matriser {
	public static void skrivUt(int[][] matrise) {
		for (int[] a : matrise) {
			int s = 0;
			while (s < matrise.length) {
				System.out.print(a[s] + " ");
				s ++;
			}
			System.out.println();
		}
	}
	public static String tilStreng(int[][] matrise) {
		StringBuilder result = new StringBuilder();
		for (int[] s : matrise) {
			for (int a : s) {
				result.append(a).append(" ");
			}
			result.append("\n");
		}
		return result.toString();
	}
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nymatrise = new int[matrise.length][matrise.length];
		int a = 0;
		while (a < matrise.length) {
			int s = 0;
			while (s < matrise[a].length) {
				nymatrise[a][s] = matrise[a][s];
				nymatrise[a][s] = nymatrise[a][s] * tall;
				s ++;
			}
			a ++;
		}
		return nymatrise;
	}
	public static boolean erLik(int[][] a, int[][] b) {
		boolean lik = false;
		int s = 0;
		while (s < a.length) {
			int d = 0;
			while (d < b.length) {
				if (a[s][d] == b[s][d]) {
					lik = true;
					break;
				}
				d ++;
			}
			s ++;
		}
		return lik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
