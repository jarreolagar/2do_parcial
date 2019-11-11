public class Coordenada extends Festival implements Boletos {

    private int costo;

    public Coordenada(String nombre, String lugar, String fecha, int costo) {
        super(nombre, lugar, fecha);
        this.costo = costo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void anunciarFecha(){
        System.out.println("24 de Marzo 2019");
    }

    public void ventaBoletos(){
        System.out.println("Venta de boletos en 300 pesos");
    }

    public void disponible(){
        System.out.println("Boletos Disponibles");
    }
    public void agotados(){
        System.out.println("Boletos Agotados");

    }
}


