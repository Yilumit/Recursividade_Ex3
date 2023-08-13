package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}
	public int fatorial(int num) {
		if (num>1) {	//A condiçao de parada será quando o número a ser multiplicado for 1
			
			//Quando o número for mairo que 1
			int fat = num * fatorial(num-1); //a var 'fat' receberá a multiplicaçao do num recebido como parâmetro pelo fatorial do próximo número da sequência fatorial	
			
			return fat;
        } 
        return 1;
	}
	
}
