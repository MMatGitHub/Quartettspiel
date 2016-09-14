package de.mm.spiel.test;

import org.junit.Assert;
import org.junit.Test;

import de.mm.spiel.model.Quartett;



public class QuartettTest {

	@Test
	public void EsSind32KartenImSpiel() {
		int anzKarten = new Quartett().getAnzahlKarten();
		Assert.assertTrue("Es sind "+ anzKarten + " im Spiel", 32== anzKarten ) ; 
	}

}
