package consignaOnready;

public class CaracteristicasAuto implements Comparable<CaracteristicasAuto>{

	private String modelo;
	private String marca;
	private int cantidadDePuertas;
	private String cilindradas;
	private double precio;

	public CaracteristicasAuto(String marca, String modelo, String cilindradas,
			double precio) {
		this.modelo = modelo;
		this.marca = marca;
		this.cilindradas = cilindradas;
		this.precio = precio;
	}

	public CaracteristicasAuto(String marca, String modelo,
			int cantidadDePuertas, double precio) {
		this.modelo = modelo;
		this.marca = marca;
		this.cantidadDePuertas = cantidadDePuertas;
		this.precio = precio;
	}

	public String getModelo() {
		return this.modelo;
	}

	public String getMarca() {
		return this.marca;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(int nuevoPrecio) {
		this.precio = nuevoPrecio;
	}

	public String getCilindradas() {
		return this.cilindradas;
	}

	public int getCantidadDePuertas() {
		return this.cantidadDePuertas;
	}

	@Override
	public int compareTo(CaracteristicasAuto autoAComparar) {

		int orden = -1;
		boolean esMayor = (this.getPrecio() > autoAComparar.getPrecio());

		if (esMayor) {
			orden = 1;
		} else if (this.getPrecio() == autoAComparar.getPrecio()) {
			orden = 0;
		}

		return orden;

	}

}
