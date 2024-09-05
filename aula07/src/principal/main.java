package principal;


import entidade.animal;
import entidade.cachorro;
import entidade.gato;
public class main {

	public static void main(String[] args) {
        
     cachorro cachorro = new cachorro();
     gato gato = new gato();
     
     System.out.println(cachorro.EmitirSom());
     System.out.println(gato.EmitirSom());
	}
}