package br.dio.InversaoDeControle;

public class EnviaEmail {

    public EnviaEmail(String tipo, String endereco, String senha) {
    }

    public static EnviaEmail obterDadosDoEmail (){
       return new EnviaEmail("stmp","contato@email.com","Senha");

    }

    public void retorna (String menssagem){
        System.out.println("Email Enviado");
    }

}
