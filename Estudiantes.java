package SistemaEscolar;

public class Estudiantes 
{
	public int IDestudiante;
	public int Semestre;
	public String Nombre;
	public String Carrera;
	
	public Estudiantes(int clave, int iDestudiante, int semestre, String nombre, String carrera) {
		
		this.IDestudiante = iDestudiante;
		this.Semestre = semestre;
		this.Nombre = nombre;
		this.Carrera = carrera;
	}

	public int getIDestudiante() {
		return IDestudiante;
	}

	public void setIDestudiante(int iDestudiante) {
		IDestudiante = iDestudiante;
	}

	public int getSemestre() {
		return Semestre;
	}

	public void setSemestre(int semestre) {
		Semestre = semestre;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCarrera() {
		return Carrera;
	}

	public void setCarrera(String carrera) {
		Carrera = carrera;
	}
	
	
	

	
}
