package clases;

public class Satelite {// class se escribe con doble s
	private double meridiano;
	private double paralelo; // falta el ; de final de instrucción
	private double distancia_tierra;

	Satelite(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}

	Satelite() { // cuidado con los acentos
		meridiano = paralelo = distancia_tierra = 0;
	}

	public void setPosicion(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d; // variable mal escrita
	}

	public void printPosicion() {
		System.out.println("El satélite se encuentra en el paralelo "
				+ paralelo + "Meridiano " + meridiano
				+ " a una distancia de la tierra de " + distancia_tierra
				+ "Kilómetros");
		// El texto se delimita con “ y no con ‘
		// Mal colocadas las “ y los +
	}
}
