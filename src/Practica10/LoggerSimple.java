package Practica10;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class LoggerSimple {

    private String archivo = "banco_log_monrreal.csv";

    public synchronized void log(String mensaje) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(archivo, true))) {
            pw.println(LocalDateTime.now() + "," + mensaje);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}