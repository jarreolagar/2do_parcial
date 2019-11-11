public class Main{

    public static void main(String[] args) {

        Festival myFestival = new Festival("Festivales", "GDL-CDMX", "Año 2019");
        Coordenada myCoordenada = new Coordenada("Coordenada", "Trasloma", "24 de Marzo", 300);
        CoronaCapital myCC = new CoronaCapital("Corona Capital", "Trasloma", "16 de Noviembre", 800);
        ViveLatino myVV = new ViveLatino("Vive Latino", "Foro Sol", "15 de Agosto", 900);
        
        System.out.println(myFestival.getNombre()+ " " + myFestival.getLugar() + " " + myFestival.getFecha());
        
        //Eliges que festival mostrar
        System.out.println(myCoordenada.getNombre() + "\n");
        System.out.println(myCC.getNombre() + "\n");
        System.out.println(myVV.getNombre() + "\n");
        myFestival.anunciarFecha();
        System.out.println(myCoordenada.getNombre()+ " " + myCoordenada.getLugar() + " " + myCoordenada.getFecha());
        myFestival.ventaBoletos();
        System.out.println("Precio: " + myCoordenada.getCosto());
        System.out.println("Dsiponibilidad: ");
        myCoordenada.disponible();
        System.out.println("\n");
        myFestival.anunciarFecha();
        System.out.println(myCC.getNombre()+ " " + myCC.getLugar() + " " + myCC.getFecha());
        myFestival.ventaBoletos();
        System.out.println("Precio: " + myCC.getCosto());
        System.out.println("Dsiponibilidad: ");
        myCoordenada.agotados();
        System.out.println("\n");
        myFestival.anunciarFecha();
        System.out.println(myVV.getNombre()+ " " + myVV.getLugar() + " " + myVV.getFecha());
        myFestival.ventaBoletos();
        System.out.println("Precio: " + myVV.getCosto());
        System.out.println("Dsiponibilidad: ");
        myCoordenada.agotados();
        
    }
}