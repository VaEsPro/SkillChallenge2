import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo 2");
        System.out.println("Nueva funcionalidad"); //1er cambio
        Perro perro1=new Perro("canina","mamifero","hembra","pug","pequeño","baige",2);
        perro1.hacerRuido();
        Perro perro2=new Perro("canina","mamifero","hembra","pitbull","mediano","gris",5);
        //Ave ave1=new Ave("pajaros","oviparos","macho","pequeño","blanco",false);
        //ave1.hacerRuido();
        //ave1.comprobarVolar();
        ArrayList<Perro> listaPerros=new ArrayList<>();
        listaPerros.add(perro1);
        listaPerros.add(perro2);
        System.out.println("Lista de perros:"+listaPerros);
        System.out.println(listaPerros.get(1).getRaza());
    }
}