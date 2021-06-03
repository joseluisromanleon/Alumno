package alumnos;
import alumno.Alumno;
import java.util.Scanner;

public class Alumnos {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    Alumno[] istalum = new Alumno[5];
    
    

    String nombreIntroducido;       // variable nombre introducido no se lee nunca se debe eliminar
    double notaIntroducida;
    double  sumaDeMedias = 0;

        IntroduceNotas(istalum, entrada);

        sumaDeMedias = MuestraResultados(istalum, sumaDeMedias); 
        
    System.out.println("La media global de la clase es " + sumaDeMedias / 5);
  
  }

    public static double MuestraResultados(Alumno[] istalum, double sumaDeMedias) {  // el nombre del metodo no se adapta a la metodologia convencional de nombres
        System.out.println("Los datos introducidos son los siguientes:");
        for(int i = 0; i < 5; i++) {
            System.out.println("Alumno " + i);
            System.out.println("Nombre: " + istalum[i].getNombre());
            System.out.println("Nota media: " + istalum[i].getNotaMedia());
            System.out.println("----------------------------");
            sumaDeMedias += istalum[i].getNotaMedia();
        }   return sumaDeMedias;
    }

    public static void IntroduceNotas(Alumno[] istalum, Scanner entrada) throws NumberFormatException {  //esta declaracion no debe ser superflua
        String nombreIntroducido;
        double notaIntroducida;
        System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumnos.");
        for (int i = 0; i < 5; i++) {
            
            istalum[i] = new Alumno();
            System.out.println("Alumno " + i);
            System.out.print("Nombre: ");
            nombreIntroducido = entrada.nextLine();
            System.out.print("Nota media: ");
            notaIntroducida = Double.parseDouble(entrada.nextLine());
            istalum[i].AsignarNota(nombreIntroducido, notaIntroducida, (int) notaIntroducida);
        }
    }
}

