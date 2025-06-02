public class Perro extends Animal {
    private String raza;
    private String tamanio;
    private String color;
    private int edad;

    public Perro(String especie, String reproduccion, String sexo) {
        super(especie, reproduccion, sexo);
    }

    public Perro(String especie, String reproduccion, String sexo, String raza, String tamanio, String color, int edad) {
        super(especie, reproduccion, sexo);
        this.raza = raza;
        this.tamanio = tamanio;
        this.color = color;
        this.edad = edad;
    }

    public void hacerRuido(){
        System.out.println("Ladrando");
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getTamanio() {
        return tamanio;
    }
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", color='" + color + '\'' +
                ", edad=" + edad +
                '}';
    }
}