import java.util.List;

public class Averia {
	private String nombreAveria;
	private int numeroHoras;
	private int precioHora = 50;
	private List<Pieza> piezas;
	private int presupuestoReparacion;
		
	public int getNumeroHoras() {
		return numeroHoras;
	}
	
	public int getPrecioHora() {
		return precioHora;
	}

	public int getPresupuestoReparacion() {
		return presupuestoReparacion;
	}

	public void setPresupuestoReparacion(int presupuestoReparacion) {
		this.presupuestoReparacion = presupuestoReparacion;
	}

	public List<Pieza> getPiezas() {
		return piezas;
	}
	
	public void setPiezas(List<Pieza> piezas) {
		this.piezas = piezas;
	}
	
	public Averia(String nombreAveria, int numeroHoras) {
		super();
		this.nombreAveria = nombreAveria;
		this.numeroHoras = numeroHoras;
	}	
	
}
