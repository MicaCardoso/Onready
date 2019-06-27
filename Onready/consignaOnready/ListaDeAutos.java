package consignaOnready;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListaDeAutos {

	private ArrayList<Auto> lista = new ArrayList<Auto>();

	public void crearListaDeAutos() {

		lista.add(new Auto("Peugeot", "206", 4, 200000.00));
		lista.add(new Auto("Honda", "Titan", "125c", 60000.00));
		lista.add(new Auto("Peugeot", "208", 5, 250000.00));
		lista.add(new Auto("Yamaha", "YBR", "160c", 80500.00));
	}

	public void crearNuevoAutoYAñadirALista(Auto auto) {
		lista.add(auto);
	}

	public void imprimirLista() {
		ImprimirListaDeAutos imprimir = new ImprimirListaDeAutos();
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(imprimir.imprimir(lista.get(i)));
		}

	}

	public void ordenarAutosDeMayorAMenorPrecio() {
		Comparator<Auto> comparador = Collections.reverseOrder();
		Collections.sort(lista, comparador);
	}

	public void imprimirAutosDeMayorAMenor() {
		ordenarAutosDeMayorAMenorPrecio();
		ImprimirListaDeAutosOrdenadosDeMayorAMenorPrecio imprimir = new ImprimirListaDeAutosOrdenadosDeMayorAMenorPrecio();
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(imprimir.imprimir(lista.get(i)));
		}
	}

	public Auto autoMasCaro() {
		ordenarAutosDeMayorAMenorPrecio();
		return lista.get(0);
	}

	public Auto autoMasBarato() {
		ordenarAutosDeMayorAMenorPrecio();
		return lista.get(lista.size() - 1);
	}

	public String autoConLetraY() {
		boolean tieneLetraY = false;
		int posicionDeAutoConLetraY = 0;
		for (int j = 0; j < this.lista.size(); j++) {
			char[] modelo = lista.get(j).getModelo().toCharArray();
			for (int i = 0; i < modelo.length; i++) {
				if (modelo[i] == 'Y') {
					tieneLetraY = true;
					posicionDeAutoConLetraY = j;
				}
			}
		}
		if (tieneLetraY) {
			return "Vehículo que contiene en el modelo la letra 'Y': "
					+ lista.get(posicionDeAutoConLetraY).getMarca() + " "
					+ lista.get(posicionDeAutoConLetraY).getModelo() + " "
					+ lista.get(posicionDeAutoConLetraY).getPrecio();
		} else {
			return "Vehículo que contiene en el modelo la letra 'Y': No hay Vehículo con letra 'Y' en el modelo";
		}
	}

}
