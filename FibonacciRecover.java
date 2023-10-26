import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FibonacciRecover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String filePath = "C:\\Users\\adria\\OneDrive\\Documentos\\Ilerna\\Java Projects\\src\\Fibonacci.java"; // Ruta al archivo eliminado
		Path source = Paths.get(filePath);
		Path destination = Paths.get("C:\\Users\\adria\\OneDrive\\Documentos\\Ilerna\\Java Projects\\Recover"); // Ruta de destino

		try {
		   Files.move(source, destination.resolve(source.getFileName()));
		   System.out.println("Archivo recuperado con éxito.");}
		    
		catch (Exception e) {
		   e.printStackTrace();
		   System.out.println("No se pudo recuperar el archivo.");}
		      
		}

}
