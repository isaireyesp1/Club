
package celular;
import java.util.Scanner;
public class prueva {
   public static void main (String [] args){
       Scanner sc = new Scanner(System.in);
       telefono tel = new telefono();
       System.out.println("Ingresa la marca del telefono");
       String marca = sc.nextLine();
       System.out.println("Ingresa el precio del telefono");
       int precio = sc.nextInt();
       System.out.println("Ingresa la ram del telefono");
       int ram = sc.nextInt();
       System.out.println("Ingresa la rom del telefono");
       int rom = sc.nextInt();
       tel.setMarca(marca);
       tel.setPrecio(precio);
       tel.setRom(rom);
       tel.setRam(ram);
       // imprecion de los retornos de los datos de los metodos get
       System.out.println(""+tel.getPrecio());
       System.out.println(""+tel.getMarca());
       System.out.println(""+tel.getRam());
       System.out.println(""+tel.getRom());
   } 
}
