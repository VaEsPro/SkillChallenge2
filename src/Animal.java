public class Animal {
    private String especie;
    private String reproduccion;
    private String sexo;

    public Animal(String especie, String reproduccion, String sexo) {
        this.especie = especie;
        this.reproduccion = reproduccion;
        this.sexo = sexo;
    }

    public void hacerRuido(){
        System.out.println("Hacer Ruido");
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
