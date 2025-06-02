public class Ave extends Animal {
    private String tamanio;
    private String color;
    private boolean volador;

    public Ave(String especie, String reproduccion, String sexo, String tamanio, String color, boolean volador) {
        super(especie, reproduccion, sexo);
        this.tamanio = tamanio;
        this.color = color;
        this.volador = volador;
    }

    public void hacerRuido(){
        System.out.println("Graznido");
    }

    public void comprobarVolar(){
        if(volador){
            System.out.println("Esta ave puede volar");
        } else {
            System.out.println("Esta ave no puede volar");
        }
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

    public boolean isVolador() {
        return volador;
    }

    public void setVolador(boolean volador) {
        this.volador = volador;
    }
}
