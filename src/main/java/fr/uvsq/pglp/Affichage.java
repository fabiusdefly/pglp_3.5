package fr.uvsq.pglp;

import java.time.LocalDateTime;

public class Affichage implements Affiche{

    public  void Affich(String text) {

        System.out.println(LocalDateTime.now() +""+text);
    }

}
