
package menu.del.banco;

/**
 *
 * @author Emmanuel Zapata
 */
public class Bancos {
    private String tipoCuenta;
    private String nombre;
    private int saldo;
    private int id;
       public Bancos(String tipoCuenta, String nombre, int saldo, int id) {
        this.tipoCuenta = tipoCuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    this.id = id;
    }
   
    public String getTipoCuenta() {
        return tipoCuenta;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoCuenta(String tipo) {
        this.tipoCuenta = tipo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
       
    public void retiro(int monto) {
        this.saldo = saldo - monto;
    }
   
    public void deposito(int monto) {
        this.saldo = saldo + monto;
    }    
}


