public class CoronaCapital extends Coordenada implements Boletos{

    public CoronaCapital(String nombre, String lugar, String fecha, int costo) {
        super(nombre, lugar, fecha, costo);
    }

    public void anunciarFecha(){
        System.out.println("16 de Noviembre 2019");
    }

    public void ventaBoletos(){
        System.out.println("Venta de boletos en 800 pesos");
    }
    
    public void disponible(){
        System.out.println("Boletos Disponibles");
    }
    public void agotados(){
        System.out.println("Boletos Agotados");

    }
}