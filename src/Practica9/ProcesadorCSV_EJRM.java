package Practica9;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ProcesadorCSV_EJRM {

    public List<String[]> leerCSV(String ruta) throws Exception {
        List<String[]> datos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                datos.add(linea.split(","));
            }
        }
        return datos;
    }

    public void escribirLogCSV(String ruta, String accion, String archivo) throws Exception {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true))) {
            String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            bw.write(accion + "," + archivo + "," + time + "\n");
        }
    }
}
