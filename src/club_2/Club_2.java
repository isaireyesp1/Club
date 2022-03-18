package club_2;
import java.util.Scanner;
public class Club_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      text set = new text();
      System.out.println("Ingresa tu nombre");
      String nom = sc.nextLine();
      System.out.println("Ingresa tu edad");
      int ed = sc.nextInt();
      set.setEdad(ed);
      set.setNombre(nom);
     System.out.println("Edad : " + set.getEdad());
      System.out.println("Nombre : " + set.getNombre());
      /*
      int edad = set.getEdad();
      String nombre  = set.getNombre();
      System.out.println("Edad : "+edad);
      System.out.println("Nombre : "+nombre);
      */
    }
    
}
