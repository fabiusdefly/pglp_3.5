package fr.uvsq.pglp;

import org.junit.Before;
import org.junit.Test;

public class ClasseMetierTest {
    ClasseMetier metier;

    @Before
    public void setMetier() {
        this.metier = new ClasseMetier();;
    }

    @Test
    public void test() {
        metier.UneMethodeMetier();
    }

}
