package ex3;

import java.util.Scanner;

public class Programa {

    Student student;
    Scanner entrada = new Scanner(System.in);

    public void start() {
        System.out.println("Digite o primeiro nome do aluno:");
        String nome = entrada.next();
        System.out.println("Digite a nota do primeiro trimestre deste aluno:(máx. 30pts)");
        double notaUm = Double.parseDouble(entrada.next().replace(",", "."));
        System.out.println("Digite a nota do segundo trimestre deste aluno:(máx. 35pts)");
        double notaDois = Double.parseDouble(entrada.next().replace(",", "."));
        System.out.println("Digite a nota do terceiro trimestre deste aluno:(máx. 35pts)");
        double notaTres = Double.parseDouble(entrada.next().replace(",", "."));

        student = new Student(nome, notaUm, notaDois, notaTres);

        System.out.println("A nota final de " + student.getName() + " é " + student.notaFinal());
        System.out.println(student.passouDeAno());
    }
}
