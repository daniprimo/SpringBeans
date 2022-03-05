package br.com.AulaSpring.SpringBeans;

public class Author implements AuthorLivro {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirAutor (){
        System.out.println(this.nome);

    }


}
