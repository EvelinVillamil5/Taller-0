package uniandes.dpoo.taller0.modificacion;
import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {
	
	public void ejecutarAplicacion()
	{
		System.out.println("Hola, mundo!");
		CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		System.out.println(calc.paisConMasMedallistas());
	}
	
	public static void main(String[] args)
	{
		Modificacion consola = new Modificacion();
		consola.ejecutarAplicacion();
	}

}

