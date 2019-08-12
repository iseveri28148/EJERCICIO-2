import java.util.Scanner;

/**
 * Hallar eficiencia del combustible
 * 
 * @author ISRAEL SEVERICHE 
 * @version 20190811
 */
public class Eficiencia
{
    public static void main(String[] args)
    {
        double gal=0,mill,mpg,lpk;
        
        Scanner Teclado = new Scanner (System.in);
        
        while ( -1 != gal)
        {
            System.out.println("Favor insertar el numero de galones");
            gal=Teclado.nextDouble();
            System.out.println("Insertar las millas que recorrera");
            mill=Teclado.nextDouble();
            
            mpg=mill/gal;
            lpk=mpg*2.352;
        
            System.out.println("la eficiencia del vehiculos en MPG es " + mpg);
            System.out.println("la eficiencia del vehiculos en LPK es " + lpk);
        }
        
        
              
    }
}