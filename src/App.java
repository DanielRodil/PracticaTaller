import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Pieza piezaRueda = new Pieza("Rueda", 200);
		Pieza piezaLuna = new Pieza("Luna", 1000);
		Pieza piezaChapa = new Pieza("Chapa", 500);
		
		Averia averiaRevision = new Averia("Revision", 4);
		averiaRevision.addPiezas(piezaRueda);
		averiaRevision.addPiezas(piezaLuna);
		System.out.println(Taller.imprimirPresupuestoAveria(averiaRevision));
			
		Averia averiaLunaRota = new Averia("Luna Rota", 8);
		averiaLunaRota.addPiezas(piezaLuna);
		averiaLunaRota.addPiezas(piezaChapa);
		System.out.println(Taller.imprimirPresupuestoAveria(averiaLunaRota));
		
		Averia averiaGolpeChapa = new Averia("Golpe Chapa", 11);
		averiaGolpeChapa.addPiezas(piezaChapa);
		averiaRevision.addPiezas(piezaRueda);
		System.out.println(Taller.imprimirPresupuestoAveria(averiaGolpeChapa));
		
		System.out.println("");
		
		Coche cocheCitroen = new Coche("Citroen", "rojo");	
		cocheCitroen.getAverias().add(averiaRevision);
		cocheCitroen.getAverias().add(averiaLunaRota);
		System.out.println(Taller.imprimirPresupuestoVehiculo(cocheCitroen));
		
		Coche cocheAudi = new Coche("Audi", "gris");
		cocheAudi.getAverias().add(averiaGolpeChapa);
		cocheAudi.getAverias().add(averiaLunaRota);
		System.out.println(Taller.imprimirPresupuestoVehiculo(cocheAudi));
		
		Moto motoHonda = new Moto("Honda", "blanco");	
		motoHonda.getAverias().add(averiaRevision);
		motoHonda.getAverias().add(averiaGolpeChapa);
		System.out.println(Taller.imprimirPresupuestoVehiculo(motoHonda));

		List<Vehiculo> listaCoches = Arrays.asList(cocheCitroen, cocheAudi, motoHonda);
		System.out.println(listaCoches);
		listaCoches.sort(null);
		
//		listaCoches.sort(new Comparator<Vehiculo>() {
//			
//			@Override
//		    public int compare(Vehiculo o1, Vehiculo o2) {
//				return o1.getColor().compareTo(o2.getColor());
//				}
//		});
//		
		listaCoches.forEach(System.out::print);

	}
}
