import java.util.Comparator;
import java.util.List;

public abstract class Vehiculo implements Comparable<Vehiculo> {
	private String marca;
	private String color;
	private String fechaEntrada;
	private List<Averia> averias;
	
	public String getMarca() {
		return marca;
	}

	public String getColor() {
		return color;
	}

	public List<Averia> getAverias() {
		return averias;
	}

	public void setAverias(List<Averia> averias) {
		this.averias = averias;
	}

	public Vehiculo(String marca, String color) {
		super();
		this.marca = marca;
		this.color = color;
	}

	@Override
	public String toString() {
		return marca + " " + color + " ";
	}
	
	@Override
	public int compareTo(Vehiculo vehiculo) {
		int comparacion = getMarca().compareTo(vehiculo.getMarca());
		if (comparacion == 0) {
			comparacion = getColor().compareTo(vehiculo.getColor());
		}
		return comparacion;
	}
		
}