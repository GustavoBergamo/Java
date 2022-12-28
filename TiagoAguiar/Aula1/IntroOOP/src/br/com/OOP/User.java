package br.com.OOP;

//Isso é um molde para usuário, uma classe nova
public class User {
    // classe define membros (propriedades e comportamentos(métodos))

    //PROPRIEDADES
    private boolean isLogged; //criando uma variável para estar loggado.
    public String firstname;
    //se fosse private String... não seria visto em outras classes
    public String lastname;
    public String password;
    private String fullname; //coloquei private para não mexerem em outras classes

    //COMPORTAMENTOS, coisas que o objeta faz, são VERBOS
public String getfullname(){//quando não põe nada entre parênteses é porque não precisa chegar nada junto
    return firstname + " " + lastname;
}
    public void setLooged(boolean looged){
        isLogged = looged;
    }
public void seguir(){
}

public void darmatch(){

}

public void vender(){

}

public void recebergorjeta(){

}

}

