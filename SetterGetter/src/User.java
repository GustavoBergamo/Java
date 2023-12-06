//Não é interessante deixar variáveis públicas,
//Então cria-se comportamentos setting/getting
public class User {
    private String firstName;
    private String lastName;



    //Funções para mudar os parâmetros
    //Abaixo um SETTER
    public void setFirstName(String firstName){
        //acessa o firstName dessa classe para armazenar o que veio lá do main () e armazena tudo maiúsculo
        this.firstName = firstName.toUpperCase();
    }



    //Abaixo um GETTER
    public String getFirstName(){
        return this.firstName;//vai retornar o que armazenou no firstName (agora tudo em maiúsculo)
    }
}
