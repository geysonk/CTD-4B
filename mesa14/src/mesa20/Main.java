package mesa20;

import java.util.ArrayList;
import java.util.List;

import static mesa20.Porto.conteineres;
import static mesa20.Porto.getConteineres;

public class Main {

    public static void main(String[] args) {

        List<Conteiner> conteineres = new ArrayList<>();
        Porto porto = new Porto("Porto de Buenos Aires");

        Conteiner conteiner1 = new Conteiner(1, "Conteiner 1", false, "Brasil");
        Porto.getConteineres().add(conteiner1);
        Conteiner conteiner2 = new Conteiner(2, "Conteiner 2", true, "China");
        Porto.getConteineres().add(conteiner2);
        Conteiner conteiner3 = new Conteiner(3, "Conteiner 1", false, "Desconhecido");
        Porto.getConteineres().add(conteiner3);

        System.out.println(porto);
        System.out.println(getConteineres());
        porto.calcularConteinersPerigosos();
}}