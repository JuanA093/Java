
package concesionario;
import java.util.Scanner;

public class Cliente {
    
    private int id;
    private int telefono;
    private String nombre;
    private String apellido;
    private String noIdentificacion;
  
    
    
    Scanner miEntrada = new Scanner(System.in);
    
    public Cliente(){
    
        this.id = 0;   
        
    }
    
    public Cliente(int id, int telefono,String nombre, String apellido, String noIdentificacion){
    
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.noIdentificacion = noIdentificacion;
        this.telefono = telefono;
    }
    
    public int getId(){
    
        return id;
    
    }
    
    public void setId(int id){
    
        this.id = id;
    
    }
    
    public String getNombre(){
    
        return nombre;
    
    }
    
    public void setNombre(String nombre){
    
        this.nombre = nombre;
    
    }
    
    public String getApellido(){
    
        return apellido;
    
    }
    
    public void setApellido(String apellido){
    
        this.apellido = apellido;
    
    }
    
    public String getNoIdentificacion(){
    
        return noIdentificacion;
    
    }
    
    public void setNoIdentificacion(String noIdentificacion){
    
        this.noIdentificacion = noIdentificacion;
    
    }
    
    public int getTelefono(){
    
        return telefono;
    
    }
    
    public void setTelefono(int telefono){
    
        this.telefono = telefono;
    
    }
    
    
    
    public void atraparDatos(){
    
        System.out.println("Id cliente: ");
        setId(miEntrada.nextInt());
        System.out.println();
        
        System.out.println("Nombre cliente: ");
        setNombre(miEntrada.next());
        System.out.println();
        
        System.out.println("Apellido cliente: ");
        setApellido(miEntrada.next());
        System.out.println();
        
        System.out.println("Telefono cliente: ");
        setTelefono(miEntrada.nextInt());
        System.out.println();
        
        System.out.println("Identificacion cliente: ");
        setNoIdentificacion(miEntrada.next());
        System.out.println();
        
        
    
    }
    
    public void imprimirDatos(int elId, int elTelefono, String elNombre, String elApellido, String elNoIdentificacion){
        System.out.println(" ");
        System.out.println("Su id es: "+elId);
        System.out.println("Su nombre es: "+elNombre);
        System.out.println("Su apellido es: "+elApellido);
        System.out.println("Su numero de identificacion es: "+elNoIdentificacion);
        
    
    }

    
}
