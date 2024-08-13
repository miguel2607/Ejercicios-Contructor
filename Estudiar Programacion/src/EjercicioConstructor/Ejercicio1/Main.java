package EjercicioConstructor.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Mascota mascota = new Mascota("Mbappe",3,"Pitbull","negro");
        Mascota mascota2 = new Mascota("Anthoine",2,"Yorkie","Castaño con gris");
        Mascota mascota3 = new Mascota("Brandon",6,"Bulldog","Blanco");


        System.out.println(mascota.toString());
        System.out.println(mascota2.toString());
        System.out.println(mascota3.toString());
    }
}
