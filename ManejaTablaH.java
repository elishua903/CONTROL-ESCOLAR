package Almacenamiento;

import java.util.Enumeration;
import java.util.Hashtable;

import Clases.Calificacion;
import Clases.Carga_Alumno;
import Clases.Carrera;

public class ManejaTablaH 
{
    
    Hashtable<Integer,Carrera> tabla = new Hashtable<Integer, Carrera>();
    
	 
	    public void AgregaCarrera(int clave, String nombre)
	    {
	        Carrera car= new Carrera(clave,nombre);
	        tabla.put(clave, car);
	    }

	    Hashtable<Integer,Calificacion> tabla1 = new Hashtable<Integer, Calificacion>();
	    
		 
	    public void AgregaCalificaion(int clave, int materia,int calificacion)
	    {
	    	Calificacion cal= new Calificacion(clave,materia,calificacion);
	        tabla1.put(clave, cal);
	    }
	    
	    Hashtable<Integer,Carga_Alumno> tabla2 = new Hashtable<Integer, Carga_Alumno>();
	    
		 
	    public void AgregaCarga(int clave, int materia1)
	    {
	    	Carga_Alumno car= new Carga_Alumno(clave,materia1);
	        tabla2.put(clave, car);
	    }
	    
	    public void AgregaCarga(int clave, int materia1,int materia2)
	    {
	    	Carga_Alumno car= new Carga_Alumno(clave,materia1,materia2);
	        tabla2.put(clave, car);
	    }
	    public void AgregaCarga(int clave, int materia1,int materia2,int materia3)
	    {
	    	Carga_Alumno car= new Carga_Alumno(clave,materia1,materia2,materia3);
	        tabla2.put(clave, car);
	    }
	    public void AgregaCarga(int clave, int materia1,int materia2, int materia3,int materia4)
	    {
	    	Carga_Alumno car= new Carga_Alumno(clave,materia2,materia3,materia4);
	        tabla2.put(clave, car);
	    }
	    public void AgregaCarga(int clave, int materia1,int materia2, int materia3,int materia4,int materia5)
	    {
	    	Carga_Alumno car= new Carga_Alumno(clave,materia2,materia3,materia4,materia5);
	        tabla2.put(clave, car);
	    }

		
	    public String CantidadCarrera ()
	    {
	    	int contador=1;
	    	String cont;
	    	
	    	
	    	Enumeration<Carrera> enumeration = tabla.elements();
	    	while (enumeration.hasMoreElements()) 
	    	{
	    		Carrera c= enumeration.nextElement();
	    		contador++;
	    	}
	    	
	    	cont=Integer.toString(contador);
	    	return cont;
	    }
	    
	    
	    
	    /*
	    
	    
	    
	    public Object[][] ObtenArticulo ()
	    {
	    	//int size=tabla.size();
	    	Object[][] list = new Object [tabla.size()][5];
	    	
	    	int contador=0;
	    	
	    	Enumeration<Articulo> enumeration = tabla.elements();
	    	while (enumeration.hasMoreElements()) 
	    	{
	    		Articulo a= enumeration.nextElement();
	    		list[contador][0]=Integer.toString(a.getClave());
	    		list[contador][1]=a.getNombre();
	    		list[contador][2]=a.getMarca();
	    		list[contador][3]=Integer.toString(a.getCantidad());
	    		list[contador][4]= String.valueOf(a.getPrecio());
	 
	    		contador++;
	    		
				
	    		
	    		
	    	}
	    	
	    
	    	return list;
	    }
	    
	    
	    
	    public Object[][] ObtenArticulo1 (String clave)
	    {
	    	//int size=tabla.size();
	    	Object[][] list = new Object [1][5];
	    	
	    	int contador=0;
	    	
	    	Enumeration<Articulo> enumeration = tabla.elements();
	    	while (enumeration.hasMoreElements()) 
	    	{
	    		Articulo a= enumeration.nextElement();
	    		if(Integer.toString(a.getClave()).equals(clave))
	    		{
	    			list[contador][0]=Integer.toString(a.getClave());
		    		list[contador][1]=a.getNombre();
		    		list[contador][2]=a.getMarca();
		    		list[contador][3]=Integer.toString(a.getCantidad());
		    		list[contador][4]= String.valueOf(a.getPrecio());
		    		contador++;
		    		
		    		return list;
	    		}
	   	
	    	}
	    	
	    
	    	return list;
	    }
	    
	    public Boolean ObtenMarca3 (String clave)
	    {
	    	//int size=tabla.size();
	    	
	    	
	    	
	    	Enumeration<Marca> enumeration = tabla1.elements();
	    	while (enumeration.hasMoreElements()) 
	    	{
	    		Marca a= enumeration.nextElement();
	    		if(a.getMarca().equals(clave))
	    		{
	    			
		    		
		    		
		    		return true;
	    		}
	   	
	    	}
	    	
	    
	    	return false;
	    }
	    
	    public Boolean ObtenArticulo3 (String clave)
	    {
	    	//int size=tabla.size();
	    	
	    	
	    	
	    	Enumeration<Articulo> enumeration = tabla.elements();
	    	while (enumeration.hasMoreElements()) 
	    	{
	    		Articulo a= enumeration.nextElement();
	    		if(a.getNombre().equals(clave))
	    		{
	    			
		    		
		    		
		    		return true;
	    		}
	   	
	    	}
	    	
	    
	    	return false;
	    }
	    
	    
	    
	    public String[] ObtenMarca ()
	    {
	    	int contador=0;
	    	String[] list=new String [tabla1.size()];
	    	
	    	
	    	Enumeration<Marca> enumeration = tabla1.elements();
	    	while (enumeration.hasMoreElements()) 
	    	{
	    		Marca m= enumeration.nextElement();
	    		list[contador]=Integer.toString(m.getClave());
	    		contador++;
	    	}
	    	
	    
	    	return list;
	    }
	    
	    
	   
	    
	    public String[] ObtenArticulo2 ()
	    {
	    	int contador=0;
	    	String[] list=new String [tabla.size()];
	    	
	    	
	    	Enumeration<Articulo> enumeration = tabla.elements();
	    	while (enumeration.hasMoreElements()) 
	    	{
	    		Articulo a= enumeration.nextElement();
	    		list[contador]=Integer.toString(a.getClave());
	    		contador++;
	    	}
	    	
	    
	    	return list;
	    }
	    
	    
	    
	    
	    
	    public Object[][] ObtenMarca1 ()
	    {
	    	int contador=0;
	    	Object[][] list1=new Object[tabla1.size()][2];
	    	
	    	
	    	Enumeration<Marca> enumeration = tabla1.elements();
	    	while (enumeration.hasMoreElements()) 
	    	{
	    		Marca m= enumeration.nextElement();
	    		list1[contador][0]=Integer.toString(m.getClave());
	    		list1[contador][1]=m.getMarca();
	    		contador++;
	    	}
	    	
	    
	    	return list1;
	    }
	    
	    
	    public Object[][] ObtenMarca4 (String clave)
	    {
	    	String nombre="";
	    	int contador=0;
	    	int Clave = Integer.parseInt(clave);
	    	Object[][] list1=new Object[1][2];
	    	
	    	
	    	Enumeration<Marca> enumeration = tabla1.elements();
	    	while (enumeration.hasMoreElements()) 
	    	{
	    		Marca m= enumeration.nextElement();
	    		
	    		if(m.getClave()==Clave)
	    		{
	    			list1[contador][0]=Integer.toString(m.getClave());
		    		list1[contador][1]=m.getMarca();
		    		contador++;
		    		return list1;
	    		}
	    		
	    		
	    		
	    	}
	    	
	    
	    	return list1;
	    }
	  	
	    
	    
	    
	    public String ObtenMarca2 (String clave)
	    {
	    	int Clave = Integer.parseInt(clave);
	    	String nombre = "";
	    	Enumeration<Marca> enumeration = tabla1.elements();
	    	while (enumeration.hasMoreElements()) 
	    	{
	    		//System.out.println(clave);
	    		Marca m= enumeration.nextElement();
	    		nombre = m.getMarca();
	    	   // System.out.println(nombre);
	    		//nombre=m.getMarca();
	    		//String clav=Integer.toString(m.getClave());
	    		//System.out.println(clav);
	    		//System.out.println(m.getClave());
	    		if(m.getClave()==Clave)
	    		{
	    			//System.out.print(m.getMarca());
	    			//System.out.print(m.getMarca());
		    		nombre=m.getMarca();
		    		return nombre;
	    		}
	    		    	
	    	//	nombre=m.getMarca();
	    	//	System.out.println(nombre);
	    		
	    	}
	    	
	    	//System.out.println(nombre);
			return nombre;
	    	
	    
	    	
	    }
	    public String ObtenMarcaArticulo (String clave)
	    {
	    	int Clave = Integer.parseInt(clave);
	    	String nombre = "";
	    	Enumeration<Articulo> enumeration = tabla.elements();
	    	while (enumeration.hasMoreElements()) 
	    	{
	    		//System.out.println(clave);
	    		Articulo a= enumeration.nextElement();
	    		nombre = a.getMarca();
	    	   // System.out.println(nombre);
	    		//nombre=m.getMarca();
	    		//String clav=Integer.toString(m.getClave());
	    		//System.out.println(clav);
	    		//System.out.println(m.getClave());
	    		if(a.getClave()==Clave)
	    		{
	    			//System.out.print(m.getMarca());
	    			//System.out.print(m.getMarca());
		    		nombre=a.getMarca();
		    		ObtenMarca2(nombre);
		    		
		    		return ObtenMarca2(nombre);
	    		}
	    		    	
	    	//	nombre=m.getMarca();
	    	//	System.out.println(nombre);
	    		
	    	}
	    	
	    	//System.out.println(nombre);
			return ObtenMarca2(nombre);
	    	
	    
	    	
	    }
	    
	    public String ObtenAtriculo3 (String clave)
	    {
	    	int Clave = Integer.parseInt(clave);
	    	String nombre = "";

	    	Enumeration<Articulo> enumeration = tabla.elements();
	    	while (enumeration.hasMoreElements()) 
	    	{
	    		//System.out.println(clave);
	    		Articulo a= enumeration.nextElement();
	    		
	    		nombre= a.getNombre();
	    	   // System.out.println(nombre);
	    		//nombre=m.getMarca();
	    		//String clav=Integer.toString(m.getClave());
	    		//System.out.println(clav);
	    		//System.out.println(m.getClave());
	    		if(a.getClave()==Clave)
	    		{
	    			//System.out.print(m.getMarca());
	    			//System.out.print(m.getMarca());
	    			nombre= a.getNombre();
		    		return nombre;
	    		}
	    		    	
	    	//	nombre=m.getMarca();
	    	//	System.out.println(nombre);
	    		
	    	}
	    	
	    	//System.out.println(nombre);
			return nombre;
	    	
	    
	    	
	    }
	    
	    
	    public String CantidadMarcas ()
	    {
	    	int contador=1;
	    	String cont;
	    	
	    	
	    	Enumeration<Marca> enumeration = tabla1.elements();
	    	while (enumeration.hasMoreElements()) 
	    	{
	    		Marca m= enumeration.nextElement();
	    		contador++;
	    	}
	    	
	    	cont=Integer.toString(contador);
	    	return cont;
	    }
	    
	    
	    
	    public String CantidadArticulos ()
	    {
	    	int contador=1;
	    	String cont;
	    	
	    	
	    	Enumeration<Articulo> enumeration = tabla.elements();
	    	while (enumeration.hasMoreElements()) 
	    	{
	    		Articulo a= enumeration.nextElement();
	    		contador++;
	    	}
	    	
	    	cont=Integer.toString(contador);
	    	return cont;
	    }
	  
	  	*/
	    
}