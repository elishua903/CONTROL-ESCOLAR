package SistemaEscolar;

public class Materias 
{
public int IDmateria;
 public String NomMateria;
 public int NomMaestro;
 public int Carrera;
 public int Creditos;
 public int Hora;
 public int NumAlum;
public Materias(int clave,int iDmateria, String nomMateria, int nomMaestro, int carrera, int creditos, int hora, int numAlum) 
{
	
	this.IDmateria = iDmateria;
	this.NomMateria = nomMateria;
	this.NomMaestro = nomMaestro;
	this.Carrera = carrera;
	this.Creditos = creditos;
	this.Hora = hora;
	this.NumAlum = numAlum;
}
public int getIDmateria() {
	return IDmateria;
}
public void setIDmateria(int iDmateria) {
	IDmateria = iDmateria;
}
public String getNomMateria() {
	return NomMateria;
}
public void setNomMateria(String nomMateria) {
	NomMateria = nomMateria;
}
public int getNomMaestro() {
	return NomMaestro;
}
public void setNomMaestro(int nomMaestro) {
	NomMaestro = nomMaestro;
}
public int getCarrera() {
	return Carrera;
}
public void setCarrera(int carrera) {
	Carrera = carrera;
}
public int getCreditos() {
	return Creditos;
}
public void setCreditos(int creditos) {
	Creditos = creditos;
}
public int getHora() {
	return Hora;
}
public void setHora(int hora) {
	Hora = hora;
}
public int getNumAlum() {
	return NumAlum;
}
public void setNumAlum(int numAlum) {
	NumAlum = numAlum;
}


 
}
