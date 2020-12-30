package test;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		 
		Impreciones con =new Impreciones();
	    con.cargarVehiculos();
	    con.ImprimirVehiculos();
	    System.out.println("===================================" );
	    con.ImprimirMasCaro();
	    con.ImprimirMasBarato();
	    con.ImprimirVehiculoContiene();
	    System.out.println("===================================" );
	    con.ImprimirVehiculoOrdenado();
	}

}
