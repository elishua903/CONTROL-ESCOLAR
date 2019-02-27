package Clases;

public class Calificacion 
{
	    private int Clave_Alumno;
	    private int Clave_Materia;
	    private int Calificacion;
	    
	public Calificacion(int Clave_Alumno, int Clave_Materia,int Calificacion) 
	{
		this.Clave_Alumno = Clave_Alumno;
        this.Clave_Materia = Clave_Materia;
        this.Calificacion = Calificacion;
	}

	public int getClave_Alumno() {
		return Clave_Alumno;
	}

	public void setClave_Alumno(int clave_Alumno) {
		Clave_Alumno = clave_Alumno;
	}

	public int getClave_Materia() {
		return Clave_Materia;
	}

	public void setClave_Materia(int clave_Materia) {
		Clave_Materia = clave_Materia;
	}

	public int getCalificacion() {
		return Calificacion;
	}

	public void setCalificacion(int calificacion) {
		Calificacion = calificacion;
	}

}
