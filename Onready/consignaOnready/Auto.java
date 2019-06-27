package consignaOnready;

public class Auto extends CaracteristicasAuto{

	private boolean tieneCilindrada = true;
	
	public Auto(String marca, String modelo, String cilindradas,
			double precio) {
		super(marca, modelo, cilindradas, precio);
	
	}
	public Auto(String marca, String modelo, int cantidadDePuertas,
			double precio) {
		super(marca, modelo, cantidadDePuertas, precio);
	}
	

	public boolean tieneCilindrada() {
		if ( getCilindradas() == null ){
			this.tieneCilindrada = false;
		}else{
			this.tieneCilindrada = true;
		}
		return tieneCilindrada;
	}
	
}
