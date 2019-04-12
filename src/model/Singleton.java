package model;

public class Singleton {

    //Atributos convencionais de uma classe
    private int numero;
    private String letra;

    /* Atributo que possui a instancia da minha classe Singleton
       Necessário que seja static, pois meu metodo que irá instanciar a classe é static também, isso se dá 
       pela necessidade de eu ter acesso a esse método antes mesmo da Classe ser instanciada!
    */
    private static Singleton uniqueInstance;

    private Singleton() {
        //Defino meu construtor vazio como privado,
        //Assim garanto que ele nunca será usado indevidamente
    }

    //Metodo que Instancia minha classe
    public static Singleton getInstance() {
        /* Aqui eu verifico se ja não existe uma intancia do meu Singleton
        Caso Exista já irei retorna a mesma, se não eu continuo pela busca da instancia do meu objeto  */
        if (uniqueInstance == null) {
            /* Caso multiplas Threads o instancie é necessária manter meu Objeto Avisado, por isso antes de usar o construtor
            Faço a ultima Sincronização na Classe */
            synchronized (Singleton.class) {
                /*Se após a sincronização do Objeto ele ainda permanecer sem Intancia 
                ai é o momento que eu devo usar o construtor */
                if (uniqueInstance == null) {
                    // Usando o Construtor e criando a instancia da Classe
                    uniqueInstance = new Singleton();
                }
            }
        }
        //Retorno a Intancia da minha classe Singleton
        return uniqueInstance;
    }
    
    //Gets e Sets
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

}
