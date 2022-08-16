package Secao13_EnumeracaoComposicao.exercicioDeComposicao03.programa;

import Secao13_EnumeracaoComposicao.exercicioDeComposicao03.classes.Cliente;
import Secao13_EnumeracaoComposicao.exercicioDeComposicao03.classes.ItensDaOrdem;
import Secao13_EnumeracaoComposicao.exercicioDeComposicao03.classes.Ordem;
import Secao13_EnumeracaoComposicao.exercicioDeComposicao03.classes.Produto;
import Secao13_EnumeracaoComposicao.exercicioDeComposicao03.classesEnum.StatusDaOrdem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioOrdemDeCompra {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        LocalDateTime horaDataDoSistema =LocalDateTime.now();
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf("*************** ORDEM DE PEDIDO *************\n\n");
        System.out.println("Entre com os dados do cliente: ");
        System.out.print("Nome: ");
        String nomeDoCliente = input.nextLine();
        System.out.print("E-Mail: ");
        String emailDoCliente = input.nextLine();
        System.out.print("Aniversário (dd/mm/aaaa): ");
        Date aniversarioDoCliente = sdf.parse(input.next());
        //Cliente novoCliente = new Cliente(nomeDoCliente,emailDoCliente,aneversarioDoCliente);
        // dados da ordem
        System.out.println("Entre com os dados da ordem: ");
        System.out.print("Status da ordem: ");
        String statusDaOrdem = input.next();
        Ordem novaOrdem = new Ordem(horaDataDoSistema.toString(),StatusDaOrdem.valueOf(statusDaOrdem),
                new Cliente(nomeDoCliente,emailDoCliente,aniversarioDoCliente));
        System.out.print("Quantos itens terá esta ordem? ");
        int quantidadeDeItens = input.nextInt();
        for (int i =1; i<=quantidadeDeItens;i++){
            System.out.println("Entre com os dados do "+i+"º item:");
            input.nextLine();
            System.out.print("Nome do produto: ");
            String nomeDoProduto = input.nextLine();
            System.out.print("Preço do produto: ");
            Double precoDoProduto = input.nextDouble();
            System.out.print("Quantidade de produto: ");
            int quantidadeDeProduto = input.nextInt();
            ItensDaOrdem novoItem = new ItensDaOrdem();
            novaOrdem.removerItemDaOrdem(novoItem);
            novaOrdem.addNovoItem(new ItensDaOrdem(quantidadeDeProduto,precoDoProduto,
                    new Produto(nomeDoProduto,precoDoProduto)));
        }

        System.out.println(novaOrdem.toString());
        input.close();
    }
}
