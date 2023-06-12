import javax.swing.*;
import java.util.ArrayList;

public class Menu {
    private int count = 0;
    private ArrayList<Plato> platos;

    public Menu() {
        this.platos = new ArrayList<>();
    }

    public boolean ingresarPlato(String nombre, int Id, double precio, int calorias, int tiempoPreparacion) {
        // Verificar si un plato con el mismo nombre ya existe
        for (Plato plato : platos) {
            if (plato.getNombre().equals(nombre)) {
                return false; // Plato ya existe
            }
        }

        // Si no existe, agregarlo
        Plato p = new Plato(nombre, precio, calorias, tiempoPreparacion);
        count++;
        p.setId(count);
        platos.add(p);
        return true; // Plato agregado exitosamente
    }
    public Plato eliminarPlatoPorNombre(String nombre) {
        for (Plato plato : platos) {
            if (plato.getNombre().equals(nombre)) {
                Plato p = plato;
                platos.remove(p);
                return p; // Plato eliminado exitosamente
            }
        }
        return null; // Plato no encontrado
    }
    public Plato buscarSecuencial(String nombre) {
        for (Plato libro : platos) {
            if (libro.getNombre().equals(nombre)) {
                return libro;
            }
        }
        return null;
    }

}
