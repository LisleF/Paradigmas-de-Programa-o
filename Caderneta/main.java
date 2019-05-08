import java.util.ArrayList;
import java.util.Scanner;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double mediaTotal = 0;
		System.out.println("Digite quantos alunos terá:");
		int n = ent.nextInt();
		ArrayList<Aluno> alunos = new ArrayList<>();
    ArrayList <Double> notas = new ArrayList<>();
		for(int i = 0 ; i < n ;i++) {
			System.out.println("Digite o nome do aluno:");
			String nome = ent.next();
			System.out.println("Digite as notas:");
			double p1 = ent.nextDouble();
			double p2 = ent.nextDouble();
			double p3 = ent.nextDouble();
			double p4 = ent.nextDouble();
			double NotaFinal = ent.nextDouble();
			Aluno estudante = new Aluno(nome, p1, p2, p3, p4, NotaFinal);
			alunos.add(estudante);
      notas.add(p1);
      notas.add(p2);
      notas.add(p3);
      notas.add(p4);
      notas.add(NotaFinal);
		}
		for(Aluno e: alunos) {//for(tipo do obejto dentro do vetor  variavél : lista que vai ser interada
			System.out.println("nome:"+e.getNome());
			System.out.println("P1:"+e.getP1());
			System.out.println("P2:"+e.getP2());
			System.out.println("P3:"+e.getP3());
			System.out.println("P4:"+e.getP4());
			System.out.println("Nota Final:"+e.getNotaFinal());
			System.out.println("Media:"+e.getMedia());
			System.out.println("Situacao:"+e.getSituacao());
			mediaTotal = mediaTotal + e.getMedia();
		}
		System.out.println("media total:"+mediaTotal/n);

    int[] values = new int[11];
    for( int i = 0; i <11;i++){
      values[i] = 0;

    }
    for(Double aux :notas){

      values[aux.intValue()] = values[aux.intValue()]+1;

  

    } 
    for (int i = 0; i < values.length; i++ ) {
    // output bar label ( "00-09: ", ..., "90-99: ", "100: " )
      if ( i == 10 ){
        System.out.printf( "%5d: ", 10 );
      }else{
        System.out.print( (i)+"-"+((i) + 0.9 ) + ": ");
        //System.out.printf( "%d-%d: ", i*0.1, i*0.1 + 0.9 );
        // print bar of asterisks
        
      }
      for ( int stars = 0; stars < values[i]; stars++ ){
          System.out.print( "*" );
          
        }
        System.out.println();
    } 
  }
}