package consignaOnready;

public class ImprimirListaDeAutosOrdenadosDeMayorAMenorPrecio implements
		Imprimir {

	@Override
	public String imprimir(Auto auto) {
		return (auto.getMarca() + " " + auto.getModelo());
	}
}
