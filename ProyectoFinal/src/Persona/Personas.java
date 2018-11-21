package Persona;//Esta interface es para crear todas las variables relacionadas con losusuarios(personas)
                //Esto se va a encargar de relacionar los atributos en comun

/**
 *
 * @author Wen
 */
public interface Personas { //el atributo que comparten cliente nuevo, frecuente y admin
    public String getNombre(); 
    public void setNombre (String nombre);//va a guargar el nombre
    
    public String getUser ();
    public void setUser (String user);
    
    public String getPassword ();
    public void setPassword (String pass);    
    
    @Override//para llamar al to string para imprimir informacion
    public String toString();
    
    
    
}
