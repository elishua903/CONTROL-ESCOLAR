package SistemaEscolar;

public class Maestro 
{ 
 public int IDmaestro;
 public String Nombre;


 public Maestro(int clave, int iDmaestro,String nombre) {
	 
	this.IDmaestro = iDmaestro;
	this.Nombre = nombre;
	
}

 public int getIDmaestro() {
		return IDmaestro;
	}

public void setIDmaestro(int iDmaestro) {
		IDmaestro = iDmaestro;
	}
public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
} 
 
 
}
