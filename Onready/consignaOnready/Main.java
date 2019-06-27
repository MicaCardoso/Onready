package consignaOnready;

public class Main {

	private static ListaDeAutos lista = new ListaDeAutos();

	public static void main(String[] args) {
		imprimirListaDeAutos();
		imprimirSeparador();
		imprimirEjercicioExtra();
		imprimirSeparador();
		imprimirListaDeAutosOrdenadaDeMayorAMenorPrecio();
	}

	private static void imprimirListaDeAutos() {
		lista.crearListaDeAutos();
		lista.imprimirLista();
	}

	private static void imprimirListaDeAutosOrdenadaDeMayorAMenorPrecio() {
		System.out
				.println("Vehículos ordenados por precio de mayor a menor precio:");
		lista.imprimirAutosDeMayorAMenor();
	}

	private static void imprimirSeparador() {
		System.out.println("=============================");
	}

	private static void imprimirEjercicioExtra() {
		System.out.println("Vehículo más caro: "
				+ lista.autoMasCaro().getMarca() + " "
				+ lista.autoMasCaro().getModelo());
		System.out.println("Vehículo más barato: "
				+ lista.autoMasBarato().getMarca() + " "
				+ lista.autoMasBarato().getModelo());
		System.out.println(lista.autoConLetraY());
	}

}
