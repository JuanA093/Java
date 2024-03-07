
package concesionario;
import java.util.Scanner;

public class Venta {
    
   private int idVenta;
   private int codigoVenta;
   private int fechaVenta;
   private int idVendedor;
   private String nombreVendedor;
   private Cliente cliente;
   private Auto auto;
   
   Scanner atrapar = new Scanner(System.in);
   
   public Venta(){
   
       this.idVenta = 0;
       
   }
   
   public Venta(Cliente cliente, Auto auto,int idVenta, int codigoVenta, int fechaVenta, int idVendedor,String nombreVendedor){
   
       this.idVenta = idVenta;
       this.codigoVenta = codigoVenta;
       this.fechaVenta = fechaVenta;
       this.idVendedor = idVendedor;
       this.nombreVendedor = nombreVendedor;
       this.cliente = new Cliente();
       this.auto = new Auto();
       
   
   }
   
   public int getIdVenta(){
   
       return idVenta;
   
   }
   
   public void setIdVenta(int idVenta){
       
       this.idVenta = idVenta;
   
   }
   
   public int getCodigoVenta(){
   
       return codigoVenta;
   
   }
   
   public void setCodigoVenta(int codigoVenta){
       
       this.codigoVenta = codigoVenta;
   
   }
   
   public int getFechaVenta(){
   
       return fechaVenta;
   
   }
   
   public void setFechaVenta(int fechaVenta){
       
       this.fechaVenta = fechaVenta;
   
   }
   
   public String getNombreVendedor(){
   
       return nombreVendedor;
   
   }
   
    public void setIdVendedor(int idVendedor){
       
       this.idVendedor = idVendedor;
   
   }
   
   public int getIdVendedor(){
   
       return idVendedor;
   
   }
   
   public void setNombreVendedor(String nombreVendedor){
       
       this.nombreVendedor = nombreVendedor;
   
   }
   
   public Cliente getCliente(){
   
       return cliente;
   }
   
   public void setCliente(Cliente cliente){
   
       this.cliente = cliente;
   
   }
   
   public Auto getAuto(){
   
       return auto;
   }
   
   public void setAuto(Auto auto){
   
       this.auto = auto;
   
   }
   
   public void atraparDatos(){
   
       System.out.println();
       System.out.println("Ingrese el id de la venta: ");
       setIdVenta(atrapar.nextInt());
       
       System.out.println();
       
       System.out.println("Ingrese el codigo de la venta: ");
       setCodigoVenta(atrapar.nextInt());
       
       System.out.println();
       
       System.out.println("Ingrese la fecha de la venta: ");
       setFechaVenta(atrapar.nextInt());
       
       System.out.println();
       
       System.out.println("Ingrese el id del vendedor: ");
       setIdVendedor(atrapar.nextInt());
       
       System.out.println();
       
       System.out.println("Ingrese el nombre del vendedor: ");
       setNombreVendedor(atrapar.next());
   
   }
   
   public void imprimirDatos(int elId, int elCodigoVenta, int laFechaVenta, int elIdVendedor, String elNombreVendedor){
        System.out.println(" ");
        System.out.println("Id venta: "+elId);
        System.out.println("Codigo venta: "+elCodigoVenta);
        System.out.println("Fecha venta: "+laFechaVenta);
        System.out.println("Id vendedor : "+elIdVendedor);
        System.out.println("Nombre vendedor: "+elNombreVendedor);
        System.out.println();
    
    }
   
   
   
    
}
