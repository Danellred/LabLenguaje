import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class GuardarEstudiante {
    public static void main(String[]args){
        Estudiante estudiante1 = new Estudiante("Ana Gomez", 1001, 8.5);
        Estudiante estudiante2 = new Estudiante("Luis Perez", 1002, 9.0);
        Estudiante estudiante3 = new Estudiante("Maria Lopez", 1003, 7.8);

        try {
            FileOutputStream fileOut = new FileOutputStream("estudiantes.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(estudiante1);
            out.writeObject(estudiante2);
            out.writeObject(estudiante3);

            out.close();
            fileOut.close();

            System.out.println("Estudiantes guardados en (estudiantes.txt)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
    


