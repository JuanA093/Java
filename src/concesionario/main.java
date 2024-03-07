
package concesionario;
import java.util.Scanner;

public class main {

    
    public static void main(String[] args) {
        
       
        Cliente miCliente = new Cliente(); 
        
        Auto miAuto = new Auto();
        
        Scanner miScanner = new Scanner(System.in);
        
        
        System.out.println("*****CONCESIONARIO*****");
        System.out.println();
        
        System.out.println("Ingrese el numero de ventas que desea ingresar");
        System.out.println();
        
        int selector = miScanner.nextInt();
        
        Venta [] ventas = new Venta [selector];
        Cliente [] clientes = new Cliente [selector];
        Auto [] autos = new Auto [selector];
       
        
        
        for(int i = 0; i < selector; i++){

            Cliente cliente = miCliente;
            cliente.atraparDatos();

            Auto auto = miAuto;
            auto.atraparDatos();

            Venta miVenta = new Venta();
            miVenta.atraparDatos();



            ventas[i] = new Venta(cliente, auto,miVenta.getIdVenta(), miVenta.getCodigoVenta(), miVenta.getFechaVenta(), miVenta.getIdVendedor(), miVenta.getNombreVendedor());
            clientes[i] = new Cliente(miCliente.getId(), miCliente.getTelefono(), miCliente.getNombre(), miCliente.getApellido(), miCliente.getNoIdentificacion());
            autos[i] = new Auto(miAuto.getId(), miAuto.getMarca(), miAuto.getColor(), miAuto.getMatricula(), miAuto.getPrecio());
            
            System.out.println();
        }
            
         System.out.println("--------Lista de Ventas--------");  
         for(int i = 0; i < ventas.length; i++){
         
             Venta venta = ventas[i];
             
             Cliente cliente = clientes[i];
             
             Auto auto = autos[i];
             
             System.out.println();
             System.out.println("Datos de la venta");
             System.out.println();
             venta.imprimirDatos(venta.getIdVenta(), venta.getCodigoVenta(), venta.getFechaVenta(), venta.getIdVendedor(), venta.getNombreVendedor());
             System.out.println();
             
             System.out.println("Datos del cliente");
             cliente.imprimirDatos(cliente.getId(), cliente.getTelefono(), cliente.getNombre(), cliente.getApellido(), cliente.getNoIdentificacion());
             System.out.println();
             
             System.out.println("Producto comprado");
             System.out.println();
             auto.imprimirDatos(auto.getId(), auto.getMarca(), auto.getColor(), auto.getMatricula(), auto.getPrecio());
             System.out.println();
             
        }
         
         System.out.println("¡Gracias por su compra!");
        
    }
}
        
        
        