import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random gerador = new Random();
		
		int op_usuario;
		int op_maquina;		
		
		System.out.println("Digite 1 para pedra, 2 para papel e 3 para tesoura...");
		op_usuario = scan.nextInt();
		
		op_maquina = gerador.nextInt(3) + 1;		
		System.out.println(op_maquina);
				
		if(op_usuario != op_maquina){
			switch(op_usuario){
				case 1:
					if(op_maquina == 3){
						System.out.println("Parab�ns, voc� ganhou!!!");
						
					}else{
						System.out.println("Ahhhh, que pena, voc� perdeu! :'(");
					}				
					break;
				case 2:
					if(op_maquina == 1){
						System.out.println("Parab�ns, voc� ganhou!!!");
					}else{
						System.out.println("Ahhhh, que pena, voc� perdeu! :'(");
					}
					break;
				case 3:
					if(op_maquina == 2){
						System.out.println("Parab�ns, voc� ganhou!!!");
					}else{
						System.out.println("Ahhhh, que pena, voc� perdeu! :'(");
					}
					break;
					default:
						System.out.println("Op��o invalida..");
						break;
				}
		}else{
			System.out.println("Vixe, rolou um empate!!!!!!!!!!");
		}

	}

}
