public class Plato {
    private String nombre;
    private int Id;
    private double precio;
    private int calorias;
    private int tiempoPreparacion;

    public Plato(String nombre, double precio, int calorias, int tiempoPreparacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.calorias = calorias;
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
        }

    @Override
    public String toString() {
        return "Plato{" +
                "nombre='" + nombre + '\'' +
                ", Id=" + Id +
                ", precio=" + precio +
                ", calorias=" + calorias +
                ", tiempoPreparacion=" + tiempoPreparacion +
                '}';
    }
}
