package view;

import controller.FatorialController;

public class Principal_Fatorial {

	public static void main(String[] args) {
		int num = 5;
		FatorialController chamaFat = new FatorialController();
		System.out.println("Fatorial de "+num+": "+chamaFat.fatorial(num));
		
	}

}
