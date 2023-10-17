public class Perro {
    private String nombre, raza;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String ladrar() {
        return "guau,guau!";
    }

    public void comer(String tipoComida, double gramos) {
        System.out.println(nombre + " come " + tipoComida + " y su cantidad de gramos es de " + gramos);
    }

}