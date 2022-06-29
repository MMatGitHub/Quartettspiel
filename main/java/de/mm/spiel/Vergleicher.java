package de.mm.spiel;

import de.mm.spiel.model.Eigenschaft;

public class Vergleicher {


	  public boolean jaEsGewinntA( Eigenschaft ersteEigenschaftA, Eigenschaft zweiteEigenschaftB ){
		  return (ersteEigenschaftA.getWert() > zweiteEigenschaftB.getWert());
	  }
	  
	  String getDifferenzBetragAsString( Eigenschaft ersterWertA, Eigenschaft zweiterWertB ){
		   return new String(""+(Math.abs(ersterWertA.getWert()-zweiterWertB.getWert())));
	   }


		
	}