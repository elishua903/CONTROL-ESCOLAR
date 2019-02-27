package Clases;

public class Carrera 
{
	    private int Clave;
	    private String Nombre;

	public Carrera(int Clave, String Nombre) 
	{
		this.Clave = Clave;
        this.Nombre = Nombre;
	}

	public int getClave() {
		return Clave;
	}

	public void setClave(int clave) {
		Clave = clave;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

}
