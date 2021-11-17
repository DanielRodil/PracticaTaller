import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Pieza piezaAceite = new Pieza("Aceite", 50, 0);
		Pieza piezaRueda = new Pieza("Rueda", 200, 2);
		Pieza piezaLuna = new Pieza("Luna", 1000, 1);
		Pieza piezaChapa = new Pieza("Chapa", 500, 4);
		
		Averia averiaRevision = new Averia("Revision", 4);
		List<Pieza> listaPiezasRevision = new ArrayList<Pieza>();
		listaPiezasRevision.add(piezaAceite);
		listaPiezasRevision.add(piezaRueda);
		listaPiezasRevision.add(piezaChapa);
		averiaRevision.setPiezas(listaPiezasRevision);
		averiaRevision.setPresupuestoReparacion(Utils.presupuestoReparacion(averiaRevision, listaPiezasRevision));
		//System.out.println(listaPiezasRevision);
		System.out.println("El presupuesto de una revisión es de " + averiaRevision.getPresupuestoReparacion() + " euros");
		//System.out.println("");
		
		Averia averiaLunaRota = new Averia("Luna rota", 8);
		List<Pieza> listaPiezasLunaRota = new ArrayList<Pieza>();
		listaPiezasLunaRota.add(piezaLuna);
		listaPiezasLunaRota.add(piezaChapa);
		averiaLunaRota.setPiezas(listaPiezasLunaRota);
		averiaLunaRota.setPresupuestoReparacion(Utils.presupuestoReparacion(averiaLunaRota, listaPiezasLunaRota));
		//System.out.println(listaPiezasLunaRota);
		System.out.println("El presupuesto de reparacion de la luna rota es de " + averiaLunaRota.getPresupuestoReparacion() + " euros");
		//System.out.println("");
		
		Averia averiaRuedaPinchada = new Averia("Rueda Pinchada", 2);
		List<Pieza> listaPiezasRuedaPinchada = new ArrayList<Pieza>();
		listaPiezasRuedaPinchada.add(piezaRueda);
		listaPiezasRuedaPinchada.add(piezaLuna);
		averiaRuedaPinchada.setPiezas(listaPiezasRuedaPinchada);
		averiaRuedaPinchada.setPresupuestoReparacion(Utils.presupuestoReparacion(averiaRuedaPinchada, listaPiezasRuedaPinchada));
		//System.out.println(listaPiezasRuedaPinchada);
		System.out.println("El presupuesto de reparación de una rueda pinchada es de " + averiaRuedaPinchada.getPresupuestoReparacion() + " euros");
		//System.out.println("");
		
		Averia averiaGolpeChapa = new Averia("Golpe Chapa", 11);
		List<Pieza> listaPiezasGolpeChapa = new ArrayList<Pieza>();
		listaPiezasGolpeChapa.add(piezaChapa);
		listaPiezasGolpeChapa.add(piezaRueda);
		averiaGolpeChapa.setPiezas(listaPiezasGolpeChapa);
		averiaGolpeChapa.setPresupuestoReparacion(Utils.presupuestoReparacion(averiaGolpeChapa, listaPiezasGolpeChapa));
		//System.out.println(listaPiezasGolpeChapa);
		System.out.println("El presupuesto de reparación de golpe en la chapa es de " + averiaGolpeChapa.getPresupuestoReparacion() + " euros");
		System.out.println("");
		
		Coche coche1 = new Coche("Citroen", "rojo");	
		List<Averia> listaAveriasCoche1 = new ArrayList<Averia>();
		listaAveriasCoche1.add(averiaRevision);
		listaAveriasCoche1.add(averiaGolpeChapa);
		listaAveriasCoche1.add(averiaRuedaPinchada);
		int horasReparacionCoche1 = averiaRevision.getNumeroHoras() + averiaGolpeChapa.getNumeroHoras() + averiaRuedaPinchada.getNumeroHoras();
		int presupuestoReparacionCoche1 = averiaRevision.getPresupuestoReparacion() + 
				averiaGolpeChapa.getPresupuestoReparacion() + averiaRuedaPinchada.getPresupuestoReparacion();
		System.out.println("El presupuesto de reparación del " + coche1.getMarca() + " " + coche1.getColor() + " es de " +
				presupuestoReparacionCoche1 + " euros. Se tardará en llevar a cabo unas " + horasReparacionCoche1 + " horas.");
		//System.out.println("");
		
		Coche coche2 = new Coche("Audi", "gris");
		List<Averia> listaAveriasCoche2 = new ArrayList<Averia>();
		listaAveriasCoche2.add(averiaLunaRota);
		listaAveriasCoche2.add(averiaGolpeChapa);
		int horasReparacionCoche2 = averiaLunaRota.getNumeroHoras() + averiaGolpeChapa.getNumeroHoras();
		int presupuestoReparacionCoche2 = averiaLunaRota.getPresupuestoReparacion() + 
				averiaGolpeChapa.getPresupuestoReparacion();
		System.out.println("El presupuesto de reparación del " + coche2.getMarca() + " " + coche2.getColor() + " es de " +
				presupuestoReparacionCoche2 + " euros. Se tardará en llevar a cabo unas " + horasReparacionCoche2 + " horas.");
		//System.out.println("");
		
		Coche coche3 = new Coche("Ford", "blanco");	
		List<Averia> listaAveriasCoche3 = new ArrayList<Averia>();
		listaAveriasCoche1.add(averiaRevision);
		listaAveriasCoche1.add(averiaRuedaPinchada);
		int horasReparacionCoche3 = averiaRevision.getNumeroHoras() + averiaRuedaPinchada.getNumeroHoras();
		int presupuestoReparacionCoche3 = averiaRevision.getPresupuestoReparacion() + 
				averiaRuedaPinchada.getPresupuestoReparacion();
		System.out.println("El presupuesto de reparación del " + coche3.getMarca() + " " + coche3.getColor() + " es de " +
				presupuestoReparacionCoche3 + " euros. Se tardará en llevar a cabo unas " + horasReparacionCoche3 + " horas.");
		System.out.println("");
		
//		List<Coche> listaCoches = Arrays.asList(coche1, coche2, coche3);
//		System.out.println(listaCoches);
//		listaCoches.sort(null);
//		listaCoches.forEach(System.out::print);
	}

}
