import java.io.Serializable;
public class Estudiante implements Serializable {

    public String nombre;
    private int matricula;
    private double promedio;

    public Estudiante(String nombre,int matricula,double promedio){
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }
    public String getnombre(){
         return nombre;
    }
       
    public int getmatricula(){
        return matricula;
    }
    public double getpromedio(){
        return promedio;
    }

    public String toString(){
        return "Nombre: " + nombre + ", Matricula: " + matricula + ", Promedio: " + promedio;
    }
    
}
