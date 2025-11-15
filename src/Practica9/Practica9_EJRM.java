package Practica9;
import java.util.*;

public class Practica9_EJRM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorArchivosReyna3944 gestor = new GestorArchivosReyna3944();
        Serializador_EJRM serial = new Serializador_EJRM();
        ProcesadorCSV_EJRM pcsv = new ProcesadorCSV_EJRM();

        int opcion;

        do {
            System.out.println("\n===== MENU DEL SISTEMA DE ARCHIVOS =====");
            System.out.println("1. Crear archivo de texto");
            System.out.println("2. Leer archivo de texto");
            System.out.println("3. Guardar objeto serializado");
            System.out.println("4. Cargar objeto serializado");
            System.out.println("5. Crear CSV");
            System.out.println("6. Procesar CSV");
            System.out.println("7. Generar backup");
            System.out.println("8. Listar directorio");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            try {
                switch (opcion) {
                    case 1 :
                        gestor.escribirTexto("datos_3944.txt", "Archivo de prueba generado.");
                        break;
                    case 2 :
                        System.out.println(gestor.leerTexto("datos_3944.txt"));
                        break;
                    case 3 :
                        PersonaESerializable p = new PersonaESerializable("Ernesto Reyna", 19, "2103944");
                        serial.guardarObjeto(p, "PersonaE.dat");
                        break;
                    case 4 :
                        System.out.println(serial.cargarObjeto("PersonaE.dat"));
                        break;
                    case 5 :
                        pcsv.escribirLogCSV("log_Reyna.csv", "Escribir en archivo csv", "Archivo log_Reyna");
                        break;
                    case 6 :
                        List<String[]> datos = pcsv.leerCSV("log_Reyna.csv");
                        datos.forEach(arr -> System.out.println(Arrays.toString(arr)));
                        break;
                    case 7 :
                        gestor.generarBackup("datos_3944.txt");
                        break;
                    case 8 :
                        gestor.listarDirectorio(".");
                        break;
                    case 0 :
                        break;
                        
                    default :
                        System.out.println("Error: La opción dada no es válida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 0);
    }
}
