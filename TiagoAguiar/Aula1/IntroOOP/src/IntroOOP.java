//Objeto precisa de molde (nome, idade...)
//A classe é o molde do objeto, onde estão as propriedades e comportamentos.
public class IntroOOP {
    public static void main(String[] args) {
//criando um objeto, declarar o UserA a partir do User (importar)
        User userA = new User(); //ESSA LINHA É: instanciar, tornar vivo, alocar espaço memória
        userA.firstname = "Antonie";
        userA.lastname = "Peixoto";


        //Instanciando Usuário B (criando)
        User userB = new User();
        userB.firstname = "John";
        userB.lastname = "from Silva";

        System.out.println(userA.firstname);
        System.out.println(userB.firstname);

        //Instanciando uma guitarra fender
        Guitar fender = new Guitar();
        fender.chords = 6;
        fender.name = "Fender";

        //Instanciando e colocando dados da guitarra Ibanez
        Guitar ibanez = new Guitar();
        ibanez.name = "Ibanez";
        ibanez.chords = 6;



    }
}