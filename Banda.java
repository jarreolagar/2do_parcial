public class Banda {

    private String nombre;
    private String genero;

    public Banda(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void tocarMusica(){

        System.out.println("Estamos tocando bien chido");
    }

    public void saludarPublico(){

        System.out.println("Hola Guadalajara!");
    }
    
}