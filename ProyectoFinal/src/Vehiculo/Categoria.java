package Vehiculo; //Esta clase contiene el nombre y la descripcion en la que se van a subdividir 
//las opciones para seleccionar el carro a rentar, ademas contiene la lista
import java.util.ArrayList;



/**
 *
 * @author Wen
 */
public class Categoria {//este no utiliza ninguna interfaz

    private String nombre, descripcion;
    private ArrayList<Vehiculo> vehiculos= new ArrayList<Vehiculo>();//hace referencia a la clase vehiculo para empezar a guardar los datos de los vehiculos para la categoria
   
    public Categoria() {
    }

    public Categoria(String nombre, String desc) {//para dar una descripcion de las categorias
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
 
}
