import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Fecha{
    public static void main(String[]args){

         
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese  la fecha (AAAA/MM/DD): ");
        String fecha1Str = scanner.nextLine();

        System.out.print("Ingrese la segunda fecha (AAAA/MM/DD): ");
        String fecha2Str = scanner.nextLine();

        LocalDate fecha1 = LocalDate.parse(fecha1Str);
        LocalDate fecha2 = LocalDate.parse(fecha2Str);

        long dias = ChronoUnit.DAYS.between(fecha1,fecha2);

        Period periodo = Period.between(fecha1, fecha2);

        System.out.println("\n---- RESULTADOS ------");
        System.out.println("Dias transcurridos:"+ Math.abs(dias));
        System.out.println("Años: " + Math.abs(periodo.getYears()));
        System.out.println("Meses: " + Math.abs(periodo.getMonths()));


        if (fecha2.isAfter(fecha1)){
            System.out.println("La segunda fercha es POSTERIO a la primera.");
        } else if (fecha2.isBefore(fecha1)){
            System.out.println("La segunda fecha es Anterior a la primera.");
        } else {
            System.out.println("Ambas fechas son IGUALES.");

        }

        scanner.close();
    }
    

}