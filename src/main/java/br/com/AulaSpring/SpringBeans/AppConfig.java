package br.com.AulaSpring.SpringBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Livro getLivro (){
        return new Livro();
    }//versão xml: <bean id="Livro" class="br.com.AulaSpring.SpringBeans"/>

    @Bean
    public AuthorLivro getAuthorLivro() {
        return  new Author();
    }

}
