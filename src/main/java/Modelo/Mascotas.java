
package Modelo;

public class Mascotas {
    private String nombre1;
    private String raza1;
    private String color1;
    private int edad1;
    private int nivel1;
 

    public Mascotas() {
        this.nombre1 = null;
        this.raza1 = null;
        this.color1 = null;
        this.edad1 = 0;
        this.nivel1 = 0;

    }

    public Mascotas(String nombre1, String raza1, String color1, int edad1,int nivel1) {
        this.nombre1 = nombre1;
        this.raza1 = raza1;
        this.color1 = color1;
        this.edad1 = edad1;
        this.nivel1 = nivel1;

    }
    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public void setRaza1(String raza1) {
        this.raza1 = raza1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public void setEdad1(int edad1) {
        this.edad1 = edad1;
    }

    public String getNombre1() {
        return nombre1;
    }

    public String getRaza1() {
        return raza1;
    }

    public String getColor1() {
        return color1;
    }

    public int getEdad1() {
        return edad1;
    }


    public int getNivel1() {
        return nivel1;
    }

    public void setNivel1(int nivel1) {
        this.nivel1 = nivel1;
    }

    
    public String getDatos(){
        return "\nNombre:"+ nombre1+
               "\nRaza:"+ raza1+
               "\nColor:"+ color1+
               "\nEdad:"+ edad1+   
               "\nNIvel de entrenamiento:"+ nivel1; 
    }
    
        
       
         
       
      
    
}
