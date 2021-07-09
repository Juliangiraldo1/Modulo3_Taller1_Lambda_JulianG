import tcs.com.capaNegocio.Empleado;
import tcs.com.capaNegocio.operacionesSalario;

public class calcularSalarioFinal {

    public static void main (String [] args){
        double rFuenteCalculo;

        operacionesSalario deduccionSalud= (salario, salud)->(salario*salud)/100;
        operacionesSalario deduccionPension= (salario, pension)->(salario*pension)/100;
        operacionesSalario deduccionReteFuente= (salario, reteFuente)->(salario*reteFuente)/100;

        //Empleado sin reteFuente
        Empleado empleado = new Empleado();

        empleado.setNombre("Julian Giraldo");
        empleado.setCedula("5263897412");
        empleado.setSalario(1300.000);
        //empleado.setSalario(2600.000);//--->Salario para rete Fuente

        rFuenteCalculo=(empleado.getSalario()>2500.000)?1.5:0;

        empleado.calculoSalarioNeto(empleado.getNombre(), empleado.getSalario(),
                deduccionReteFuente.calculoDeduccion(empleado.getSalario(),rFuenteCalculo),
                deduccionSalud.calculoDeduccion(empleado.getSalario(), 4),
                deduccionPension.calculoDeduccion(empleado.getSalario(), 4));

    }
}
