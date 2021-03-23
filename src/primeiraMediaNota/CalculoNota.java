package primeiraMediaNota;


import java.text.DecimalFormat;
import java.util.Scanner;


public class CalculoNota {
	
	// technique: breaking code into small pieces
	// more easy to view all code (when together)
	
	
	public static void main(String[] args) {
		
		DecimalFormat fixFormat = new DecimalFormat("0.00");
		
		float prova1, projeto1, exercicios1, pslmooc1;
		float prova2, projeto2, exercicios2, pslmooc2;
		float notaBimestre1;
		float notaBimestre2;
		float mediaSemestre;
		
		String aluno, disciplina;
		
		Scanner sn = new Scanner(System.in);
			
		
		// step 1: input data
		System.out.println("Qual o nome do aluno? ");
		aluno = sn.nextLine();
		
		
		System.out.println("Qual a disciplina? ");
		disciplina = sn.nextLine();
		
		
		System.out.println("Qual a nota da prova no primeiro bimestre? ");
		prova1 = sn.nextFloat();
		
		
		System.out.println("Qual a nota do projeto no primeiro bimestre? ");
		projeto1 = sn.nextFloat();
		
		
		System.out.println("Qual a nota dos exercicios no primeiro bimestre? ");
		exercicios1 = sn.nextFloat();
		
		
		System.out.println("Qual a nota das outras atividades no primeiro bimestre? ");
		pslmooc1 = sn.nextFloat();
		
		
		System.out.println("Qual a nota da prova no segundo bimestre? ");
		prova2 = sn.nextFloat();
		
		
		System.out.println("Qual a nota do projeto no segundo bimestre? ");
		projeto2 = sn.nextFloat();
		
		
		System.out.println("Qual a nota dos exercicios no segundo bimestre? ");
		exercicios2 = sn.nextFloat();
		
		
		System.out.println("Qual a nota das outras atividades no segundo bimestre? ");
		pslmooc2 = sn.nextFloat();
		
		
		// step 2: bimester 1 results
		notaBimestre1 = ((prova1 * 3 + projeto1 * 3 + exercicios1 * 2 + pslmooc1 * 3) / 11);
		System.out.println("A nota final do aluno " + aluno + " no 1º Bimestre em " + disciplina + " foi: " + fixFormat.format(notaBimestre1));
		
		
		// step 3: bimester 2 results
		notaBimestre2 = ((prova2 * 3 + projeto2 * 3 + exercicios2 * 2 + pslmooc2 * 3) / 11);
		System.out.println("A nota final do aluno " + aluno + " no 2º Bimestre em " + disciplina + " foi: " + fixFormat.format(notaBimestre2));
			
		
		// step 4: semester results
		mediaSemestre = ((notaBimestre1 + notaBimestre2) / 2);
        System.out.println("A média semestral do aluno " + aluno + " em " + disciplina + " é: " + fixFormat.format(mediaSemestre));
        
        
        // step5: criteria pass alumni
        if (mediaSemestre >= 80) {
        	System.out.println("O aluno " + aluno + " esta aprovado.");
        }else if (mediaSemestre < 80) {
        	System.out.println("O aluno " + aluno + " esta em recuperacao.");
        	float notaNecessaria;
        	notaNecessaria = (100 - mediaSemestre);
        	System.out.println("Para ser aprovado o aluno " + aluno + " precisa tirar uma pontuação de " + fixFormat.format(notaNecessaria) + " na prova final.");
        }	
		
	}
}