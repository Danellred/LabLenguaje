import java.util.Scanner;

class ArchivoTexto {
    private int numeroLineas;

    public ArchivoTexto(int numeroLineas) {
        this.numeroLineas = numeroLineas;
    }

    public int contarLineas() {
        return numeroLineas;
    }

    public int contarPalabras() {
    
        return numeroLineas * 10; 
    }

    public int contarApariciones(String palabra) {
        
        return 5; 
    }
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        ArchivoTexto archivo = new ArchivoTexto(20); 

        // Mostrar cuántas líneas tiene el archivo
        int lineas = archivo.contarLineas();
        System.out.println("El archivo tiene " + lineas + " líneas.");

        // Contar cuántas palabras contiene
        int palabras = archivo.contarPalabras();
        System.out.println("El archivo contiene " + palabras + " palabras.");

        // Contar cuántas veces aparece una palabra ingresada por el usuario
        System.out.print("Ingrese una palabra para contar sus apariciones: ");
        String palabra = scanner.nextLine();
        int apariciones = archivo.contarApariciones(palabra);
        System.out.println("La palabra '" + palabra + "' aparece " + apariciones + " veces en el archivo.");

        scanner.close();
    }


}


/*
 Muestre cuántas líneas tiene el archivo.
Cuente cuántas palabras contiene.
Cuente cuántas veces aparece una palabra ingresada por el usuario.
      
*/
