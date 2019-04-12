/*
    Já que o Objetivo do Singleton é garantir que uma classe seja instanciada apenas uma vez 
    Abaixo tem um exemplo extremamente simples da situação. 

    Note que criamos 2 objetos do Tipo tipo Singleton.

    Abaixo um passo a passo da Aplicação do Singleton
*/

import model.Singleton;

public class Sistema {
    
    //Declaração dos Objetos dintintos
    private static Singleton objetoA;
    private static Singleton objetoB;

    public static void main(String[] args) {
        
        //Instancia do Objeto A
        objetoA = Singleton.getInstance();
        //Atrubuindo valores ao Objeto A
        objetoA.setLetra("A");
        objetoA.setNumero(3);
        
        /* Intancia do Objeto B, normalmente instanciariamos outro objeto completamente indenpendente 
           do Objeto anteriormente instanciado, mas nesse caso a solicitar a instancia para minha classe Singleton
           eu recebo a instancia já existente e logicamente o valor dos Atributos também serão os mesmos!
        */
        objetoB = Singleton.getInstance();
        
        //Duvidou? Então execute e verifique sua saída abaixo e mude seu entedimento sobre o Universo!!        
        System.out.println(objetoB.getLetra());
        System.out.println(objetoB.getNumero());
    }
}
