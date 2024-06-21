
/* Dato un array indicante il volume di scatoloni in m3 in ordine di inserimento verificare la quantità di container da 100 m3 necessari per il trasporto di tutti gli scatoloni ed il loro riempimento medio
Esempio:
int volumi[] = {10, 30, 20, 50, 20, 20, 10, 40, 40};
Stamp Numero di container necessaris: ##, con riempimento medio ##%  */

package com;
import java.util.ArrayList;

public class Container {
	
	int volumeContainer = 100;
	int volumi[] = {10, 30, 20, 50, 20, 20, 10, 40, 40};
	ArrayList<Integer> riempimento = new ArrayList<>();
	

	public void trovaContainer() { //trova e riempie i container
		
		int container = 1; //numero di container (è almeno uno)
		int capienza = 0; //capienza di partenza del container vuoto
		
		for(int i = 0; i <= volumi.length - 1; i++) {	
			
			capienza += volumi[i];

			if(capienza > volumeContainer) {
				container++;
				riempimento.add(capienza - volumi[i]);
				i--;
				capienza = 0;		
			}		
		} 
		
		riempimento.add(capienza);
		System.out.println("Numero di container necessari: " + container);
	}
		
		
	public void calcolaMedia() { //trova il riempimento medio dei container
		int somma = 0;
		
	    for (int i : riempimento) {
	            somma += i;
	        }
	        
	    double media = (double) somma / riempimento.size();

	    System.out.println("Riempimento medio dei container: " + media + "%");
	}
	
}
