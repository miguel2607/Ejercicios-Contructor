package EjercicioConstructor.Ejercicio2;

public class Estudiantes {


    private String nombre;
    private String Apellidos;
    private int grado;
    private int edad;
    private int promedioAcademico;
    private String nombreDeMadre;
    private String nombreDePadre;
    private  float contactoPadre1;
    private float contactopadre2;






    public Estudiantes(String nombreDePadre, String nombreDeMadre, int promedioAcademico, int edad, String apellidos, int grado, String nombre) {
        this.nombreDePadre = nombreDePadre;
        this.nombreDeMadre = nombreDeMadre;
        this.promedioAcademico = promedioAcademico;
        this.edad = edad;
        Apellidos = apellidos;
        this.grado = grado;
        this.nombre = nombre;
    }


    public Estudiantes(String nombre, String apellidos, int grado, int edad, int promedioAcademico, String nombreDeMadre, String nombreDePadre, float contactoPadre) {
        this.nombre = nombre;
        Apellidos = apellidos;
        this.grado = grado;
        this.edad = edad;
        this.promedioAcademico = promedioAcademico;
        this.nombreDeMadre = nombreDeMadre;
        this.nombreDePadre = nombreDePadre;
        this.contactoPadre1 = contactoPadre;
    }


    public Estudiantes(String nombre, String apellidos, int grado, int edad, int promedioAcademico, String nombreDeMadre, String nombreDePadre, float contactoPadre1, float contactopadre2) {
        this.nombre = nombre;
        Apellidos = apellidos;
        this.grado = grado;
        this.edad = edad;
        this.promedioAcademico = promedioAcademico;
        this.nombreDeMadre = nombreDeMadre;
        this.nombreDePadre = nombreDePadre;
        this.contactoPadre1 = contactoPadre1;
        this.contactopadre2 = contactopadre2;
    }




    public float getContactopadre2() {
        return contactopadre2;
    }

    public void setContactopadre2(float contactopadre2) {
        this.contactopadre2 = contactopadre2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPromedioAcademico() {
        return promedioAcademico;
    }

    public void setPromedioAcademico(int promedioAcademico) {
        this.promedioAcademico = promedioAcademico;
    }

    public String getNombreDeMadre() {
        return nombreDeMadre;
    }

    public void setNombreDeMadre(String nombreDeMadre) {
        this.nombreDeMadre = nombreDeMadre;
    }

    public String getNombreDePadre() {
        return nombreDePadre;
    }

    public void setNombreDePadre(String nombreDePadre) {
        this.nombreDePadre = nombreDePadre;
    }

    public float getContactoPadre() {
        return contactoPadre1;
    }

    public void setContactoPadre(float contactoPadre) {
        this.contactoPadre1 = contactoPadre;
    }








    @Override
    public String toString() {
        return "Estudiantes" +
                "nombreDePadre='" + nombreDePadre + '\'' +
                ", nombreDeMadre='" + nombreDeMadre + '\'' +
                ", promedioAcademico=" + promedioAcademico +
                ", edad=" + edad +
                ", grado=" + grado +
                ", Apellidos='" + Apellidos + '\'' +
                ", nombre='" + nombre + '\'' +
                ", contactoPadre1=" + contactoPadre1 +
                ", contactopadre2=" + contactopadre2
                ;
    }
}
