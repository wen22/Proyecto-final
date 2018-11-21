package Persona; //representa los constructores de los que esta compuesto el administrador
                 //cada constructor va a su vez enlasado a la interface persona
/**
 *
 * @author Wen
 */
public class Admin implements Personas {

    private String nombre, user, pass;

    public Admin() {
    }

    public Admin(String nombre, String user, String pass) {
        this.nombre = nombre;
        this.user = user;
        this.pass = pass;
    }
    //hace los override porque esta enazada a personas
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getUser() {
        return user;
    }

    @Override
    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String getPassword() {
        return pass;
    }

    @Override
    public void setPassword(String pass) {
        this.pass = pass;
    }

}
