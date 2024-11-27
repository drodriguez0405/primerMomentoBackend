package Empresa170;

public class Main170 {
    public static void main(String[] args) {
        Empleado170 empleado1 = new Empleado170("douglas","Empleado");
        Supervisor170 supervisor1 = new Supervisor170("Jairo","supervisor");
        Administrador170 admin1 = new Administrador170("Pepe","administrador");

        empleado1.ingresarEmpleado(20,"douglas@gmail.com");
        System.out.println(empleado1.mostrarEmpleado());

        supervisor1.ingresarSupervisor(40,"jairo@gmail.com");
        System.out.println(supervisor1.mostrarSupervisor());

        admin1.ingresarAdmin(60,"pepe@gmail.com");
        System.out.println(admin1.mostrarAdmin());
    }
}
