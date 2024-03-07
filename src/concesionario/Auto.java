
package concesionario;
import java.util.Scanner;


public class Auto {
    
    
    private int id;
    private String marca;
    private String color;
    private String matricula;
    private int precio;

    
    Scanner miEntrada = new Scanner(System.in);
    
    public Auto(){
    
        this.id = 0;
    
    }
    
    public Auto(int id, String marca, String color, String matricula, int precio){
        
        this.id = id;
        this.marca = marca;
        this.color = color;
        this.matricula = matricula;
        this.precio = precio;
  
    
    
    
    }
    
    public int getId(){
    
        return id;
    
    }
    
    public void setId(int id){
    
        this.id = id;
    
    }
    
    public String getMarca(){
    
        return marca;
    
    }
    
    public void setMarca(String marca){
    
        this.marca = marca;
    
    }
    
    public String getColor(){
    
        return color;
    
    }
    
    public void setColor(String color){
    
        this.color = color;
    
    }
    
    
    public String getMatricula(){
    
        return matricula;
    
    }
    
    public void setMatricula(String matricula){
    
        this.matricula = matricula;
    
    }
    
    public int getPrecio(){
    
        return precio;
    
    }
    
    public void setPrecio(int precio){
    
        this.precio = precio;
    
    }
    
 
    
    public void atraparDatos(){
    
        System.out.println("Id auto: ");
        setId(miEntrada.nextInt());
        System.out.println();
        
        System.out.println("Marca auto: ");
        setMarca(miEntrada.next());
        System.out.println();
        
        System.out.println("Color Auto: ");
        setColor(miEntrada.next());
        System.out.println();
       
        
        
        System.out.println("Matricula auto: ");
        setMatricula(miEntrada.next());
        System.out.println();
        
        
        System.out.println("Precio auto: ");
        setPrecio(miEntrada.nextInt());
        System.out.println();
        
        
    
    }
    
    public void imprimirDatos(int elId, String laMarca, String elColor, String laMatricula, int elPrecio){
        System.out.println(" ");
        System.out.println("Id auto: "+elId);
        System.out.println("Marca auto: "+laMarca);
        System.out.println("Color auto: "+elColor);
        System.out.println("Matricula auto: "+laMatricula);
        System.out.println("Precio auto: "+elPrecio);
        System.out.println();
    
    }

   
    
}
