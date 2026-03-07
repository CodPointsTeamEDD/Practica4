/**
 * Clase concreta {@code AdviniadorResultados}
 * 
 * @author Luis Fernando Quintana López
 * @author Erick Xavier Martinez Briones
 * @version 1.0.0
 * @since 2026
 * 
 */

public class AdivinadorResultados {

	/**
	 * documenta
	 * @param a
	 * @param g
	 * @return
	 */
	public static ListaLigadaSimple<Participante> alumnoALesGana(Participante a, ListaLigadaSimple<Participante> g) {
		ListaLigadaSimple<Participante> perdedores = new ListaLigadaSimple<>();
		double indiceA = a.indiceDeVictorias();
		int nvlNumericoCinta = a.cinta.getNivelNumerico();

		for (Participante aux : g) {
			if ((indiceA > aux.indiceDeVictorias()) || (nvlNumericoCinta > aux.cinta.getNivelNumerico())) {
				perdedores.agregar(aux);
			}
		}

		return perdedores;
	}

	/**
	 * documenta
	 * @param a
	 * @param g
	 * @return
	 */
	public static ListaLigadaSimple<Participante> alumnoAPierde(Participante a, ListaLigadaSimple<Participante> g) {
		ListaLigadaSimple<Participante> ganadores = new ListaLigadaSimple<>();
		double indiceA = a.indiceDeVictorias();
		int nvlNumericoCinta = a.cinta.getNivelNumerico();

		for (Participante aux : g) {
			if ((indiceA < aux.indiceDeVictorias()) || (nvlNumericoCinta < aux.cinta.getNivelNumerico())) {
				ganadores.agregar(aux);
			}
		}

		return ganadores;
	}

	/**
	 * documenta
	 * @param g
	 * @return
	 */
	public static ListaLigadaSimple<Double> indicesVictoria(ListaLigadaSimple<Participante> g) {
		ListaLigadaSimple<Double> indicesVic = new ListaLigadaSimple<>();

		for (Participante aux : g) {
			indicesVic.agregar(aux.indiceDeVictorias());
		}

		return indicesVic;
	}

	public static double indiceVictoriaPromedio(ListaLigadaSimple<Participante> g) {
		int longitudLista = g.devolverLongitud();
		double sumaVictorias = 0;

		for (Participante aux : g) {
			sumaVictorias += aux.indiceDeVictorias();
		}

		return sumaVictorias / longitudLista;
	}

	/**
	 * documenta
	 * @param a
	 * @param g
	 * @return
	 */
	public static ListaLigadaSimple<Participante> mismaCinta(Participante a, ListaLigadaSimple<Participante> g) {
		ListaLigadaSimple<Participante> misma = new ListaLigadaSimple<>();
		String nombreA = a.cinta.getNombre();

		for (Participante aux : g) {
			if (nombreA.equals(aux.cinta.getNombre())) {
				misma.agregar(aux);
			}
		}

		return misma;
	}

	/**
	 * documenta
	 * @param a
	 * @param g
	 * @return
	 */
	public static ListaLigadaSimple<Participante> indicesimilarAlAlumnoA(Participante a,
			ListaLigadaSimple<Participante> g) {
		ListaLigadaSimple<Participante> indiceSimilar = new ListaLigadaSimple<>();
		double indiceA = a.indiceDeVictorias();

		for (Participante aux : g) {
			if (aux.indiceDeVictorias() >= indiceA - 0.10 && aux.indiceDeVictorias() <= indiceA + 0.10) {
				indiceSimilar.agregar(aux);
			}
		}

		return indiceSimilar;
	}

	public static void main(String[] args) {
		/* Aquí va tu código */
	}

}
