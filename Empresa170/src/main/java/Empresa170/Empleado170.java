package Empresa170;

public class Empleado170 {
    String nombreEmpleado;
    int edadEmpleado;
    String emailEmpleado;
    String rol;

    public Empleado170(String nombreEmpleado, String rol) {
        this.nombreEmpleado = nombreEmpleado;
        this.rol = rol;
    }

    public void ingresarEmpleado(int edadEmpleado,String emailEmpleado){
        this.edadEmpleado = edadEmpleado;
        this.emailEmpleado = emailEmpleado;
    }
    public String mostrarEmpleado(){
        return "El empleado se llama " + nombreEmpleado + " y tiene una edad de " + edadEmpleado + " y su correo es " + emailEmpleado + " y tiene un rol de " + rol;
    }

    public String tareaBasica(){
        return "solo hace tareas basicas" ;
    }

}
