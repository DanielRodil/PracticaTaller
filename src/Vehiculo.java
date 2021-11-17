import java.util.List;

public abstract class Vehiculo {
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
		
}