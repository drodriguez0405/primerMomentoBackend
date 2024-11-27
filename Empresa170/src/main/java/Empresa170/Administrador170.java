package Empresa170;

public class Administrador170 {
    String nombreAdmin;
    int edadAdmin;
    String emailAdmin;
    String rol;

    public Administrador170(String nombreAdmin, String rol) {
        this.nombreAdmin = nombreAdmin;
        this.rol = rol;
    }
    public void ingresarAdmin(int edadAdmin, String emailAdmin){
        this.edadAdmin = edadAdmin;
        this.emailAdmin = emailAdmin;
    }
    public String mostrarAdmin(){
        return "El nombre del administrador es "+ nombreAdmin + " y tiene la edad de " + edadAdmin + " y su correo es " + emailAdmin + " y su rol es " + rol;
    }

    public String crearUsuarios(){
        return "El admin crea el Usuario";
    }
    public String modificarUsuario() {
    return "El admin modifica un usuario";
    }
    public String eliminarUsuario(){
        return "El admin elimina un usuario";
    }
}
