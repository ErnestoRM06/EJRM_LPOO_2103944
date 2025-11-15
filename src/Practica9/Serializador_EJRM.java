package Practica9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializador_EJRM {

    public void guardarObjeto(PersonaESerializable p, String ruta) throws Exception {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
            oos.writeObject(p);
        }
    }

    public PersonaESerializable cargarObjeto(String ruta) throws Exception {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))) {
            return (PersonaESerializable) ois.readObject();
        }
    }
}
