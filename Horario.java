public class Horario extends Escenario{

    private String cervezaEnVenta;

    public Horario(String nombre, String genero, String nombreEscenario, int hora, String cervezaEnVenta) {
        super(nombre, genero, nombreEscenario, hora);
        this.cervezaEnVenta = cervezaEnVenta;
    }

    public String getCervezaEnVenta() {
        return cervezaEnVenta;
    }

    public void setCervezaEnVenta(String cervezaEnVenta) {
        this.cervezaEnVenta = cervezaEnVenta;
    }

    public void anuncio(){
        System.out.println("Bienvenidos al Juanelo Coordenada");
    }

}