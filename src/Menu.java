import java.util.ArrayList;

public class Menu {

    private ArrayList<Plato> platos;

    public Menu() {
        this.platos = new ArrayList<>();
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public Plato ingresarPlato(String nombre, double precio, int calorias, int tiempoPreparacion){
        Plato plato = new Plato(nombre, precio, calorias, tiempoPreparacion);
        if(validarPlato(plato)){
            platos.add(plato);
            return plato;
        }
        return null;
    }

    public Plato modificarPlato(int i, double precio, int calorias, int tiempoPreparacion){
        platos.get(i).setPrecio(precio);
        platos.get(i).setCalorias(calorias);
        platos.get(i).setTiempoPreparacion(tiempoPreparacion);
        return platos.get(i);
    }

    public boolean validarPlato(Plato p){
        for (Plato plato : platos) {
            if (plato.getNombre().equals(p.getNombre())) {
                return false;
            }
        }
        return true;
    }

    public void eliminarPlato(int i){
        platos.remove(i);
    }

    //String para imprimir platos
    public String imprimirMenu(){
        String text = "";
        for (Plato plato : platos) {
            text+=plato.toString();
        }
        return text;
    }

    public void quemarDatos(){
        ingresarPlato("Pasta al Pesto", 22.0, 1250, 45);
        ingresarPlato("Pollo en salsa de champiñones", 15.0, 700, 25);
        ingresarPlato("Tacos al Pastor", 7.50, 900, 15);
        ingresarPlato("Nuggets de pescado", 9.0, 1000, 12);
        ingresarPlato("Yahuarlocro", 8.0, 500,14);
    }

}