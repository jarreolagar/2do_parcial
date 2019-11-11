public class ViveLatino extends Coordenada implements Boletos{

    public ViveLatino(String nombre, String lugar, String fecha, int costo) {
        super(nombre, lugar, fecha, costo);
    }
    
    public void anunciarFecha(){
        System.out.println("15 de Agosto de 2019");
    }

    public void ventaBoletos(){
        System.out.println("Venta de boletos en 900 pesos");
    }
    
    public void disponible(){
        System.out.println("Boletos Disponibles");
    }
    public void agotados(){
        System.out.println("Boletos Agotados");

    }
}