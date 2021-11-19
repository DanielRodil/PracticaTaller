import java.util.Arrays;
import java.util.List;

public class Pieza {
	private String nombrePieza;
	private int precioPieza;
	
	public int getPrecioPieza() {
		return precioPieza;
	}

	public Pieza(String nombrePieza, int precioPieza) {
		super();
		this.nombrePieza = nombrePieza;
		this.precioPieza = precioPieza;
	}

	@Override
	public String toString() {
		return nombrePieza + " " + precioPieza + " euros";
	}
	
		
}
