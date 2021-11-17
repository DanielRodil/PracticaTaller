import java.util.List;

public class Utils {
	
	public static int presupuestoReparacion(Averia averia, List<Pieza> listaPiezas) {
		int presupuesto = (averia.getNumeroHoras()*averia.getPrecioHora());
		for (int i = 0; i < listaPiezas.size(); i++) {
			presupuesto += listaPiezas.get(i).getPrecioPieza();
		}
		
		return presupuesto;
	}
	
	

}
