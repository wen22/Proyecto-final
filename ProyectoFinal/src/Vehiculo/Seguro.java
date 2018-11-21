package Vehiculo; //la opciones de seguro que el usuario puede o no selsccionar y sus constructores correspondientes
/**
 *
 * @author Wen
 */
public class Seguro {
    private String nombre, descripcion;
    private float monto;

    public Seguro() {
    }

    public Seguro(String nombre, String descripcion, float monto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.monto = monto;
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

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    
    
}
