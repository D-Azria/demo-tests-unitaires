package fr.diginamic.enumerations;
import org.junit.Test;
import static fr.diginamic.enumerations.Saison.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SaisonTest {
    @Test
    public void testValueOfLibellePrintemps(){
        // A
        String libelle = "Printemps";

        // Action
        Saison saison = Saison.valueOfLibelle(libelle);

        // Assertion
        assertEquals( PRINTEMPS, saison);
    }
    @Test
    public void testValueOfLibelleEte(){
        // A
        String libelle = "Eté";

        // Action
        Saison saison = Saison.valueOfLibelle(libelle);

        // Assertion
        assertEquals( ETE, saison);
    }

    @Test
    public void testValueOfLibelleAutomne(){
        // A
        String libelle = "Automne";

        // Action
        Saison saison = Saison.valueOfLibelle(libelle);

        // Assertion
        assertEquals( AUTOMNE, saison);
    }
    @Test
    public void testValueOfLibelleHiver(){
        // A
        String libelle = "Hiver";

        // Action
        Saison saison = Saison.valueOfLibelle(libelle);

        // Assertion
        assertEquals( HIVER, saison);
    }
    @Test
    public void testValueOfLibelleNull(){
        // A
        String libelle = "toto";

        // Action
        Saison saison = Saison.valueOfLibelle(libelle);

        // Assertion
        assertNull(saison);
    }
}