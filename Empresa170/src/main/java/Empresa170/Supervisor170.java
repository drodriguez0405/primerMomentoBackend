package Empresa170;

public class Supervisor170 {
    String nombreSupervisor;
    int edadSupervisor;
    String emailSupervisor;
    String rol;

    public Supervisor170(String nombreSupervisor,String rol) {
        this.nombreSupervisor = nombreSupervisor;
        this.rol = rol;
    }
    public void ingresarSupervisor(int edadSupervisor, String emailSupervisor){
        this.edadSupervisor = edadSupervisor;
        this.emailSupervisor = emailSupervisor;
    }
    public String mostrarSupervisor(){
        return "Se llama" + nombreSupervisor + " tiene una edad de " + edadSupervisor + "su correo es " + emailSupervisor + " y su rol es " + rol;
    }

    public String supervisarEmpleados(){
        return "el supervisor revisa los empleados";
    }
}
