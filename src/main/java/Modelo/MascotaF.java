
package Modelo;

public class MascotaF {

    public static Object stream() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String nombre2;
    private String raza2;
    private String color2;
    private int edad2;
    private String toxo;

    public MascotaF() {
        this.nombre2 = null;
        this.raza2 = null;
        this.color2 = null;
        this.edad2 = 0;
        this.toxo = null;

    }
    public MascotaF(String nombre2, String raza2, String color2, int edad2, String toxo) {
        this.nombre2 = nombre2;
        this.raza2 = raza2;
        this.color2 = color2;
        this.edad2 = edad2;
        this.toxo = toxo;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getRaza2() {
        return raza2;
    }

    public void setRaza2(String raza2) {
        this.raza2 = raza2;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public int getEdad2() {
        return edad2;
    }

    public void setEdad2(int edad2) {
        this.edad2 = edad2;
    }

    public String getToxo() {
        return toxo;
    }

    public void setToxo(String toxo) {
        this.toxo = toxo;
    }


    public String getDatos(){
        return "\nNombre:"+ nombre2+
               "\nRaza:"+ raza2+
               "\nColor:"+ color2+
               "\nEdad:"+ edad2+   
               "\nSe encuentran libres de Toxoplasmosis?:"+ toxo; 
    }
    
}
