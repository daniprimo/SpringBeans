package br.com.AulaSpring.SpringBeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Livro {

    private String nomeDoLivro;
    private String codigo;

    @Autowired
    AuthorLivro autorlivro;

    public AuthorLivro getAutorlivro() {
        return autorlivro;
    }

    public void setAutorlivro(AuthorLivro autorlivro) {
        this.autorlivro = autorlivro;
    }

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void exibir(){
        System.out.println(this.nomeDoLivro +" - "+ this.codigo);
        autorlivro.exibirAutor();
    }
}
