package br.com.jacksontenorio8.variaveis;

public class Cachorro {
    String nome;

    public static void main(String[] args){
        //Cria um objeto Cao e o acessa
        Cachorro cachorro1 = new Cachorro();
        cachorro1.late();
        cachorro1.nome = "Sheik";

        //Agora uma matriz Cachorro
        Cachorro[] meusCachorros = new Cachorro[3];

        //E coloca alguns cães nela
        meusCachorros[0] = new Cachorro();
        meusCachorros[1] = new Cachorro();
        meusCachorros[2] = cachorro1;

        //agora acessa os objetos Cachorro
        //usando referencia da matriz
        meusCachorros[0].nome = "Maradona";
        meusCachorros[1].nome = "Sheik";

        //Hum... Qual é mesmo o nome do último cão.
        System.out.print("O nome do último cão é ");
        System.out.println(meusCachorros[2].nome);
        //agora executa um loop pela matriz
        //e pede para todos os cães latirem
        //as matrizes tem a variável 'length' que lhe fornecerá a quantidade de elementos
        int x = 0;
        while(x < meusCachorros.length) {
            meusCachorros[x].late();
            x = x + 1;
        }
    }

    public void late() {
        System.out.println(nome + " diz AuAu");
    }

    public void come() {}

    public void perseguirGato() {}
}
