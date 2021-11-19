import java.util.List;

public abstract class Taller {
	private static final int PRECIO_HORA = 50;

	public static int presupuestoAveria(Averia averia) {
		int presupuesto = averia.getNumeroHoras()*PRECIO_HORA;
		for (int i = 0; i < averia.getPiezas().size(); i++) {
			presupuesto += averia.getPiezas().get(i).getPrecioPieza();
		}
		
		return presupuesto;
	}
	
	public static String imprimirPresupuestoAveria(Averia averia) {
		return "El presupuesto de reparacion de " + averia.getNombreAveria() 
		+ " es de " + presupuestoAveria(averia) + " euros.";
	}

	public static int estimacionHorasReparacion (Vehiculo vehiculo) {
		int horas = 0;
		for (int i = 0; i < vehiculo.getAverias().size(); i++) {
			horas += vehiculo.getAverias().get(i).getNumeroHoras();
		}
		
		return horas;
	}
	
	public static String imprimirPresupuestoVehiculo(Vehiculo vehiculo) {
		return "El presupuesto de reparacion del " + vehiculo.getMarca() + " " 
				+ vehiculo.getColor() + " es de " + estimacionHorasReparacion(vehiculo)*PRECIO_HORA 
				+ " euros. El tiempo estimado es de " + estimacionHorasReparacion(vehiculo) + " horas.";
	}
}
