package tcs.com.capaNegocio;

public class Empleado {

    String nombre, cedula;
    Double salario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public static void calculoSalarioNeto(String nombre,double salarioBruto, double rFuente, double salud, double pension){
        double salarioNeto= salarioBruto-(rFuente+salud+pension);
        System.out.println("Empleado: "+nombre+
                "\nSalario Bruto: "+salarioBruto+
                "\nDeducción rete Fuente: "+rFuente+
                "\nDeducción salud: "+salud+
                "\nDeducción pension: "+pension+
                "\nSalario Neto Final: "+salarioNeto);
    }

}
