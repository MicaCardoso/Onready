package consignaOnready;

public class ImprimirListaDeAutos implements Imprimir {

	private static ListaDeAutos claseLista = new ListaDeAutos();

	@Override
	public String imprimir(Auto auto) {

		claseLista.crearListaDeAutos();

		if (auto.tieneCilindrada()) {
			return ("Marca: " + auto.getMarca() + "  // Modelo: "
					+ auto.getModelo() + "  // Cilindradas: "
					+ auto.getCilindradas() + "  // Precio: $" + auto
						.getPrecio());
		} else {
			return ("Marca: " + auto.getMarca() + "  // Modelo: "
					+ auto.getModelo() + "  // Puertas: "
					+ auto.getCantidadDePuertas() + "  // Precio: $" + auto
						.getPrecio());
		}
	}

}
