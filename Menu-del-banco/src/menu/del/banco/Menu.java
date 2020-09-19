
package menu.del.banco;

import java.util.Scanner;

/**
 *
 * @author PabloHerrera
 */
public class Menu {
int totalsaldo;
Scanner input = new Scanner(System.in);
    String opcion;
     Bancos[] arregloCuenta = new Bancos[20];
    boolean salir = false;
 Persona per =new Persona();
    
    public void menu() {
         arregloCuenta[1] = per.cuenta1;
         arregloCuenta[2] = per.cuenta2;
         arregloCuenta[3] = per.cuenta3;
        
do {System.out.println("============================================");
    System.out.println("Bienvenido a Banco Juntos por el Desarrollo ");
    System.out.println("============================================");
 System.out.println("Introduzca numero de cuenta del 1-3 las cuentas fueron creadas por diferente titular y un saldo de Q 100.00: ");
 int NumeroCuenta = input.nextInt();
         
 System.out.println("==========\nMenú\n==========\n1 para Deposito.\n2 para retiros."
         + "\n3 para mostrar Saldo.\n4 para Salir y mostar el total de saldo.\n Seleccionar su opción:");
 opcion = input.next();

         
switch (opcion) {

    case "1":             
      System.out.println("Introduzca cantidad a depositar: ");
      int deposito = input.nextInt();
      arregloCuenta[NumeroCuenta].deposito(deposito);
      System.out.println("Depositó a la cuenta: " + deposito );
      break;
                    

case "2":
System.out.println("Introduzca cantidad a retirar: ");
int retiro = input.nextInt();
arregloCuenta[NumeroCuenta].retiro(retiro);
System.out.println("Retiró de la cuenta: " + retiro );
break;
                   

case "3":
System.out.println("Nombre del propietario  El saldo es de:");
System.out.println(arregloCuenta[NumeroCuenta].getNombre()+"\t"+arregloCuenta[NumeroCuenta].getSaldo());
break;

case "4":
salir = true;
break;}

} while (salir == false); 

totalsaldo = (arregloCuenta[1].getSaldo()+arregloCuenta[2].getSaldo()+arregloCuenta[3].getSaldo());
System.out.println("Datos de los clientes registrados");
System.out.println("Numero de cuenta\tNombre\t\tTipoCuenta\tSaldo");
System.out.println(arregloCuenta[1].getId()+"\t\t\t"+ arregloCuenta[1].getNombre()+arregloCuenta[1].getTipoCuenta()+arregloCuenta[1].getSaldo());
System.out.println(arregloCuenta[2].getId()+"\t\t\t"+ arregloCuenta[2].getNombre()+arregloCuenta[2].getTipoCuenta()+ arregloCuenta[2].getSaldo());
System.out.println(arregloCuenta[3].getId()+"\t\t     "+ arregloCuenta[3].getNombre()+arregloCuenta[3].getTipoCuenta()+ arregloCuenta[3].getSaldo());
System.out.println("\t\t\tEl saldo total es de:\t\t"+totalsaldo);

    }    
}
