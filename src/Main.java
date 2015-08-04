import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random gerador = new Random();
		
		int op_usuario;
		int op_maquina;
		
		op_maquina = gerador.nextInt(3) + 1;		
		System.out.println(op_maquina);
		
		System.out.println("Digite 1 para pedra, 2 para papel e 3 para tesoura...");
		op_usuario = scan.nextInt();
				
		if(op_usuario != op_maquina){
		switch(op_usuario){
			case 1:
				if(op_usuario + op_maquina == 4){
					System.out.println("Parabéns, você ganhou!!!");
					
				}else{
					System.out.println("Ahhhh, que pena, você perdeu! :'(");
				}				
				break;
			case 2:
				if(op_usuario + op_maquina == 3){
					System.out.println("Parabéns, você ganhou!!!");
				}else{
					System.out.println("Ahhhh, que pena, você perdeu! :'(");
				}
				break;
			case 3:
				if(op_usuario + op_maquina == 5){
					System.out.println("Parabéns, você ganhou!!!");
				}else{
					System.out.println("Ahhhh, que pena, você perdeu! :'(");
				}
				break;
			}
		}else{
			System.out.println("Vixe, rolou um empate!!!!!!!!!!");
		}

	}

}
