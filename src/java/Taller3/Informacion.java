package Taller3;

public class Informacion {
    private String nombre;
    private String gentilicio;
    private String moneda;
    private String idioma;
    private String capital;

    public Informacion() {
    }

    public Informacion(String nombre, String gentilicio, String moneda, String idioma, String capital) {
        this.nombre = nombre;
        this.gentilicio = gentilicio;
        this.moneda = moneda;
        this.idioma = idioma;
        this.capital = capital;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGentilicio(String gentilicio) {
        this.gentilicio = gentilicio;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGentilicio() {
        return gentilicio;
    }

    public String getMoneda() {
        return moneda;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getCapital() {
        return capital;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
