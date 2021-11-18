import java.util.Arrays;
import java.util.List;

public class Pieza {
	private String nombrePieza;
	private int precioPieza;
	private int cantidadPiezas;
	
	public int getPrecioPieza() {
		return precioPieza;
	}

	public int getCantidadPiezas() {
		return cantidadPiezas;
	}

	public Pieza(String nombrePieza, int precioPieza, int cantidadPiezas) {
		super();
		this.nombrePieza = nombrePieza;
		this.precioPieza = precioPieza;
		this.cantidadPiezas = cantidadPiezas;
	}

	@Override
	public String toString() {
		return nombrePieza + " " + precioPieza + " euros";
	}
	
		
}
