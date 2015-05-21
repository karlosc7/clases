package clases;

public class Dias {
	static java.util.Scanner in;
	static int[] meses = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void casoDePrueba() {
		int dia, mes, falta;
		dia = in.nextInt();
		mes = in.nextInt();
		falta = meses[mes - 1] - dia;
		for (int i = mes; i < meses.length; i++) {
			falta += meses[i];
		}
		System.out.println(falta);
	}

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		int numCasos;
		numCasos = in.nextInt();
		for (int i = 0; i < numCasos; i++)
			casoDePrueba();
	}

}
