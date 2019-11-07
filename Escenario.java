public class Escenario extends Banda implements Publico {

    private String nombreEscenario;
    private int hora;

    public Escenario(String nombre, String genero, String nombreEscenario, int hora) {
        super(nombre, genero);
        this.nombreEscenario = nombreEscenario;
        this.hora = hora;
    }

    public String getNombreEscenario() {
        return nombreEscenario;
    }

    public void setNombreEscenario(String nombreEscenario) {
        this.nombreEscenario = nombreEscenario;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    public void cantar(){
        System.out.println("lalalalalalala");
    }

    public void gritar(){
        System.out.println("aaaaaaaaaaaaa");
    }
}