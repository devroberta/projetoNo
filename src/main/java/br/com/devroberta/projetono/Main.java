package br.com.devroberta.projetono;

public class Main {

    public static void main(String[] args) {

        //instanciando um nó
        No no1 = new No("Conteúdo no1");
        No no2 = new No("Conteúdo no2");

        //apontando a referência no no1 para o no2
        no1.setProximoNo(no2);
        System.out.println("OBJETO no1 {\n  Conteúdo: " + no1.getConteudo() + "\n  Referência: " + no1.getProximoNo() + "\n}\n");

        No no3 = new No("Conteúdo no3");

        //apontando a referência no no2 para o no3
        no2.setProximoNo(no3);

        No no4 = new No("Conteúdo no4");

        //apontando a referência no no3 para o no4
        no3.setProximoNo(no4);

        System.out.println("no1 -> no2 -> no3 -> no4 -> null \n");

        System.out.println("Nós encadeados: \n"
                + no1 + " -> "
                + no1.getProximoNo() + " -> "
                + no1.getProximoNo().getProximoNo() + " -> "
                + no1.getProximoNo().getProximoNo().getProximoNo() + " -> "
                + no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
