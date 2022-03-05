package br.dio.InversaoDeControle;

import java.time.Period;

public class EnviaPedido {
    public static void main(String[] args) {
        EnviaPedido pedido = new EnviaPedido();

        pedido.gravar();

    }

    private  EnviaEmail enviar = EnviaEmail.obterDadosDoEmail();

    public  void gravar(){
        this.enviar.retorna("Pedido Criado!");
    }
}
