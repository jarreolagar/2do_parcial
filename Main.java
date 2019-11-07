public class Main{

    public static void main(String[] args) {
        System.out.println("FESTIVAL JUANELO COORDENADA\n");

        Banda myBanda = new Banda("Juanes", "Rock");

        Escenario myEscenario = new Escenario("Metallica", "Metal", "JuanitoStage", 5);

        Horario myHorario = new Horario("Metallica", "Metal", "JuanitoStage", 5, "Indio");
        
        System.out.println("Banda invitada: " + myBanda.getNombre() + "\n" + "Gnero: " + myBanda.getGenero());
        System.out.println("Banda tocando: " + myEscenario.getNombre() + "\n" + "Escenario: " + myEscenario.getNombreEscenario() + "\n" + "Hora: " + myHorario.getHora());
        
    }
}