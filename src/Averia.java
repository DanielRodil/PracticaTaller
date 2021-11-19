import java.util.ArrayList;
import java.util.List;

public class Averia {
	private String nombreAveria;
	private int numeroHoras;
	private List<Pieza> piezas;
	
	public String getNombreAveria() {
		return nombreAveria;
	}	
	
	public int getNumeroHoras() {
		return numeroHoras;
	}
	
	public List<Pieza> getPiezas() {
		return piezas;
	}	
	
	public void addPiezas(Pieza pieza) {
		this.piezas.add(pieza);
	}

	public Averia(String nombreAveria, int numeroHoras) {
		this.piezas = new ArrayList<Pieza>();
		this.nombreAveria = nombreAveria;
		this.numeroHoras = numeroHoras;
	}

	@Override
	public String toString() {
		return "Averia [nombreAveria=" + nombreAveria + ", numeroHoras=" + numeroHoras
				+ ", piezas=" + piezas;
	}	
	
	
	
}
