package Vehiculo;//caracteristicas de los vehiculos a alquilar 
                //constructores de cada uno
import java.util.ArrayList;

/**
 *
 * @author Wen
 */
public class Vehiculo {
    private String marca;
    private float precio, descuento;
    private boolean cantPuertas, tanque, cantPasajeros, ac, transmision;
    private ArrayList<Seguro> seguros= new ArrayList<Seguro>();//hace referencia a la clase seguro
   
    public Vehiculo() {
    }

    public Vehiculo(String marca, float precio, float descuento, boolean cantPuertas, boolean tanque, boolean cantPasajeros, boolean ac, boolean transmision) {
        this.marca = marca;
        this.precio = precio;
        this.descuento = descuento;//preguntarle a la profe
        this.cantPuertas = cantPuertas;
        this.tanque = tanque;
        this.cantPasajeros = cantPasajeros;
        this.ac = ac;
        this.transmision = transmision;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public boolean isCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(boolean cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public boolean isTanque() {
        return tanque;
    }

    public void setTanque(boolean tanque) {
        this.tanque = tanque;
    }

    public boolean isCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(boolean cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public boolean isTransmision() {
        return transmision;
    }

    public void setTransmision(boolean transmision) {
        this.transmision = transmision;
    }

    public ArrayList<Seguro> getSeguros() {
        return seguros;
    }

    public void setSeguros(ArrayList<Seguro> seguros) {
        this.seguros = seguros;
    }
   
    
}
