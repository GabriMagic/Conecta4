package conecta4;
import java.util.Scanner;

public class conecta4 {
//Thread.sleep(10000);   //10segundos
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		Scanner teclado = new Scanner(System.in);
		
		/*
		System.out.print("Creando partida");
		for(int i=0;i<10;i++){
			Thread.sleep(600);
			System.out.print(".");
		}
		*/
		
		System.out.println();
		System.out.println();
		
		partida juego = new partida();
		
		while (!juego.terminado()){
			switch(juego.getTurno()){
				
				case "BLANCO":
					System.out.print("Columna: ");
					int col = teclado.nextInt();
					partida.mesa.ponerFicha(partida.blanco, col);
					//partida.mesa.cuatroEnRaya(partida.blanco);
					break;
				
				case "NEGRO":
					System.out.print("Columna: ");
					col = teclado.nextInt();
					partida.mesa.ponerFicha(partida.negro, col);
					//partida.mesa.cuatroEnRaya(partida.negro);
					break;			
			}
		}
		
		System.out.println("-___- GAME OVER -___-");
		System.out.println();
		juego.mostrarTablero();
	}
}
