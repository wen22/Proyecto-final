package proyectofinal;

import Vehiculo.Categoria;
import Vehiculo.Vehiculo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Wen
 */
public class Interface { //Esto va a contener el menu y los sub menus que se encarga de mostrar todo para los usuarion

    ArrayList<Categoria> categorias = new ArrayList<Categoria>();//esto me va a permitir guardar las categorias por las que se va a clasificar 

    public void llenarCategorias() {
        categorias.add(new Categoria("Economico", "MODIFICAR"));//Descripcion de la categoria
        categorias.add(new Categoria("Estandar", "MODIFICAR"));
        categorias.add(new Categoria("Lujo", "MODIFICAR"));
        categorias.add(new Categoria("4x4", "MODIFICAR"));
    }

    public void menuPrincipal() {//para que este menu principal trabaje con los usuarios y cuales opciones quieren
        boolean bandera = true;//para determinar cuando empieza y termina, siempre antes del do
        do {
            String menu = JOptionPane.showInputDialog("Ingrese la opcion de usuario que desea seleccionar: \n"
                    + "1.Cliente nuevo \n"
                    + "2.Cliente frecuente\n"
                    + "3.Administrador\n"
                    + "4.Salir");
            int opcion = Integer.parseInt(menu);
            switch (opcion) {
                case 1:
                    break;
                case 2:

                    break;
                case 3:
                    this.menuAdmin();
                    break;
                case 4:
                    bandera = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error", "El dato que ingreso es invalido", JOptionPane.ERROR_MESSAGE);//despliega un error si lo que entra no esta entre las opciones
                    break;
            }
        } while (bandera);//para repetir hasta que la variable auxiliar bandera sea falsa
    }

    public void menuAdmin() {//para que este menu va a reaccionar cuando seleccione la opcion Administrador
        boolean bandera = true;//para determinar cuando empieza y termina, siempre antes del do
        do {
            String menu = JOptionPane.showInputDialog("Ingrese la opcion que desea seleccionar: \n"
                    + "1.Ver lista de vehiculos actuales\n"
                    + "2.Agregar vehiculo\n"
                    + "3.Modificar evento\n"
                    + "4.Eliminar vehiculo\n"
                    + "5.Salir");
            int opcion = Integer.parseInt(menu);
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    boolean puerta3 = true; //creacion de auxiliares booleanas para las caracteristicas del vehiculo
                    boolean ac3 = true;
                    boolean pasajeros3 = true;
                    boolean trans3 = true;
                    boolean bandera1 = true;
                    boolean bandera2 = true;
                    boolean bandera3 = true;
                    boolean bandera4 = true;
                    boolean bandera5 = true;

                    String marca = JOptionPane.showInputDialog("Ingrese la marca del vehiculo");
                    String precio = JOptionPane.showInputDialog("Ingrese la precio del vehiculo");
                    float precio2 = Integer.parseInt(precio);
                    do {//para que el usuario pueda devolverse a completar la siguiente opcion del menu
                        String puertas = JOptionPane.showInputDialog("Ingrese 1 si tiene 2 puertas 2 si tiene 4 puertas");
                        int puerta2 = Integer.parseInt(puertas);
                        if (puerta2 == 1 || puerta2 == 2) {
                            if (puerta2 - 1 == 0) {
                                puerta3 = false;// esto es lo que cambia el booleano
                            }
                            bandera1 = false;
                        }

                    } while (bandera1);//para continuar con el siguiente booleano, y asi susecibamente
                    do {
                        String ac = JOptionPane.showInputDialog("Ingrese 1 si tiene A/C o 2 si no tiene A/C");
                        int ac2 = Integer.parseInt(ac);
                        if (ac2 == 1 || ac2 == 2) {
                            if (ac2 - 1 == 0) {
                                ac3 = false;
                            }
                            bandera2 = false;
                        }

                    } while (bandera2);
                    do {
                        String pasajeros = JOptionPane.showInputDialog("Ingrese 1 para 2 pasajero o 2 para 4 pasajeros");
                        int pasajeros2 = Integer.parseInt(pasajeros);
                        if (pasajeros2 == 1 || pasajeros2 == 2) {
                            if (pasajeros2 - 1 == 0) {
                                pasajeros3 = false;
                            }
                            bandera3 = false;
                        }
                    } while (bandera3);
                    do {
                        String transmision = JOptionPane.showInputDialog("Ingrese 1 si es automatico o 2 si es manual");//lleva el orden de los constructores en la clase vehiculo
                        int trans2 = Integer.parseInt(transmision);
                        if (trans2 == 1 || trans2 == 2) {
                            if (trans2 - 1 == 0) {
                                trans3 = false;
                            }
                            bandera4 = false;
                        }
                    } while (bandera4);
                    Vehiculo vehiculo = new Vehiculo(marca, precio2, 0.0f, puerta3, true, pasajeros3, ac3, trans3);
                    do {
                        String categoria = JOptionPane.showInputDialog("Escriba la categoria del vehiculo ");
                        for (Categoria c : categorias) { //para recorrer la lista
                            if (c.getNombre() == categoria) {
                                c.getVehiculos().add(vehiculo);//para guardar el vehiculo dentro de la categoria                               
                            }
                            bandera5 = false;
                        }
                    } while (bandera5);

                    break;
                case 3:
                    this.menuEditarVehiculo();
                    break;
                case 4:
                    String cat = JOptionPane.showInputDialog("Ingrese la categoria del vehiculo");
                    String marca1 = JOptionPane.showInputDialog("Ingrese la marca");
                    for (Categoria c : categorias) {
                        if (c.getNombre() == cat) {
                            for (Vehiculo v : c.getVehiculos()) {
                                if (v.getMarca() == marca1) {
                                    c.getVehiculos().remove(v);
                                }

                            }

                        }
                    }
                    break;
                case 5:
                    bandera = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error", "El dato que ingreso es invalido", JOptionPane.ERROR_MESSAGE);//despliega un error si lo que entra no esta entre las opciones
                    break;
            }
        } while (bandera);//para repetir hasta que la variable auxiliar bandera sea falsa
    }

    public void menuEditarVehiculo() {//va a recibir el vehiculo que va a editar, la variable e es para la validacion de datos
        boolean bandera = true;//para determinar cuando empieza y termina, siempre antes del do
        String cat = "";
        String marca = "";
        do {
            String menu = JOptionPane.showInputDialog("Ingrese la opcion que desea seleccionar: \n"
                    + "1.Editar marca\n"
                    + "2.Editar precio\n"
                    + "3.Editar cantidad de puertas\n"
                    + "4.Editar cantidad de pasajeros\n"
                    + "5.Editar A/C\n"
                    + "6.Editar transmision\n"
                    + "7.Salir");
            int opcion = Integer.parseInt(menu);
            switch (opcion) {
                case 1:
                    cat = JOptionPane.showInputDialog("Ingrese la categoria del vehiculo");
                    String marcaAntigua = JOptionPane.showInputDialog("Ingrese la marca antigua");
                    marca = JOptionPane.showInputDialog("Ingrese la nueva marca");
                    for (Categoria c : categorias) {
                        if (c.getNombre() == cat) {
                            for (Vehiculo v : c.getVehiculos()) {
                                if (v.getMarca() == marcaAntigua) {
                                    v.setMarca(marca);
                                }

                            }

                        }
                    }
                    break;
                case 2:
                    cat = JOptionPane.showInputDialog("Ingrese la categoria del vehiculo");
                    marca = JOptionPane.showInputDialog("Ingrese la marca");
                    String p = JOptionPane.showInputDialog("Ingrese el nuevo precio");
                    int precio = Integer.parseInt(p);
                    for (Categoria c : categorias) {
                        if (c.getNombre() == cat) {
                            for (Vehiculo v : c.getVehiculos()) {
                                if (v.getMarca() == marca) {
                                    v.setPrecio(precio);
                                }

                            }

                        }
                    }
                    break;
                case 3: //de esta forma se modifican los booleanos
                    cat = JOptionPane.showInputDialog("Ingrese la categoria del vehiculo");
                    marca = JOptionPane.showInputDialog("Ingrese la marca");
                    boolean pasajeros3 = true;
                    boolean bandera3 = true;
                    do {
                        String pasajeros = JOptionPane.showInputDialog("Ingrese 1 para 2 pasajero o 2 para 4 pasajeros");
                        int pasajeros2 = Integer.parseInt(pasajeros);
                        if (pasajeros2 == 1 || pasajeros2 == 2) {
                            if (pasajeros2 - 1 == 0) {
                                pasajeros3 = false;
                            }
                            bandera3 = false;
                        }
                    } while (bandera3);
                    for (Categoria c : categorias) {
                        if (c.getNombre() == cat) {
                            for (Vehiculo v : c.getVehiculos()) {
                                if (v.getMarca() == marca) {
                                    v.setCantPasajeros(pasajeros3);
                                }

                            }

                        }
                    }
                    break;

                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    bandera = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error", "El dato que ingreso es invalido", JOptionPane.ERROR_MESSAGE);//despliega un error si lo que entra no esta entre las opciones
                    break;
            }
        } while (bandera);
    }

}
