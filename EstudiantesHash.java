package SistemaEscolar;
import java.util.Enumeration;
import java.util.Hashtable;

import ProyectoArticulo.Articulo;

public class EstudiantesHash 
{
	    Hashtable<Integer,Estudiantes> tabla = new Hashtable <Integer, Estudiantes>();
		 
		    public void AgregaEstudiantes(int clave,int iDestudiante, int semestre, String nombre, String carrera)
		    {
		        Estudiantes estu = new Estudiantes(clave,iDestudiante,semestre, nombre,carrera);
		        tabla.put(clave, estu);
		    }
		  Hashtable<Integer,Materias> tabla1 = new Hashtable<Integer, Materias>();
		    
		    public void AgregaMaterias(int clave,int iDmateria, String nomMateria, int nomMaestro, int carrera, int creditos, int hora, int numAlum)
		    {
		    	Materias mat= new Materias(clave,iDmateria,nomMateria, nomMaestro,carrera, creditos, hora, numAlum);
		    	tabla1.put(clave, mat);
		    }
		    
		   Hashtable<Integer,Maestro> tabla2 = new Hashtable<Integer, Maestro>();
		    
		    public void AgregaMaestro(int clave,int iDmaestro,String nombre, String materia)
		    {
		    	Maestro maes= new Maestro(clave,iDmaestro,nombre);
		    	tabla2.put(clave, maes);
		    }
		    
		    public String[][] ObtenEstudiantes()
		    {
		    	String [][] datos = new String [tabla.size()][3];
		    	Enumeration <Estudiantes> e = tabla.elements();
		    	
		    	int cont=0;
		    	while (e.hasMoreElements())
		    	{
		    	  Estudiantes a= e.nextElement();
		    	  datos[cont][0]=Integer.toString(a.getSemestre());
		    	  datos[cont][1]=a.getNombre();
		    	  datos[cont][2]=a.getCarrera();
		    	 
		    	  
		    	  
		    	  cont++;
		    	  				  
		    			  
		    	}
		    	return datos;
		    }
		  
		    
}
