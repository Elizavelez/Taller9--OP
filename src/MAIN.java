public class MAIN {

    public static void main(String[] args){

    Cliente cliente = new Cliente();
    cliente.Nombre= "Isaac";
    cliente.Edad= 28;
    cliente.Telefono="2986756";
    cliente.Credito= 200000;

    System.out.println(" Soy " + cliente.Nombre + " ,tengo " + cliente.Edad + " años. " + " Mi número telefonico es "
            + cliente.Telefono + " y tengo un credito de " + cliente.Credito );

    Trabajador trabajador = new Trabajador();
    trabajador.Nombre= "Valeria";
    trabajador.Edad= 23;
    trabajador.Telefono="4657834";
    trabajador.Salario= 1400580;

    System.out.println(" Soy " + trabajador.Nombre + " ,tengo " + trabajador.Edad + " años. " + " Mi número telefonico es "
                + trabajador.Telefono + " y mi salario mensual es de $" + trabajador.Salario );


    }

}

class Persona{
    int Edad;
    String Nombre;
    String Telefono;


}

class Cliente extends Persona{
    double Credito;
}

class Trabajador extends Persona{
    double Salario;
}