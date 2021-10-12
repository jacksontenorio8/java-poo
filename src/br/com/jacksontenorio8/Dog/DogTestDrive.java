package br.com.jacksontenorio8.Dog;

import br.com.jacksontenorio8.Dog.Dog;

public class DogTestDrive {
    public static void main (String[] args) {
        // O código de teste de Dog está logo abaixo
        // Cria um novo objeto
        Dog d = new Dog();
        /* O operador ponto (.) lhe dará acesso ao
        * ao estado e comportamento (variáveis de
        * instância e metódos) de um objeto.*/

        /* Use o opereador ponto (.) para configurar
        * o tamanho do objeto Dog*/
        d.size = 40;

        // E para chamar seu método bark()
        d.bark();

    }
}
