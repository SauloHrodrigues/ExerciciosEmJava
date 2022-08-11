package Secao13_EnumeracaoComposicao.exercicioDeComposicao01.programa;

import Secao13_EnumeracaoComposicao.exercicioDeComposicao01.entidadeEnum.NivelDoTrabalhador;
import Secao13_EnumeracaoComposicao.exercicioDeComposicao01.entidades.ContratoDeTrabalho;
import Secao13_EnumeracaoComposicao.exercicioDeComposicao01.entidades.Departamento;
import Secao13_EnumeracaoComposicao.exercicioDeComposicao01.entidades.Trabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeComposica01 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner input= new Scanner(System.in);
        System.out.print("Entre com o nome do departamento: ");
        String nomeDepartamento = input.nextLine();
        System.out.println("Entre com os dados do trabalhador:");
        System.out.print("Nome: ");
        String nomeDoTrabalhador = input.nextLine();
        System.out.print("Nivel: ");
        String nivelDoTrabalhador = input.nextLine();
        System.out.print("Salário base: ");
        Double salarioBase = input.nextDouble();
        Trabalhador trabalhador = new Trabalhador(new Departamento(nomeDepartamento),nomeDoTrabalhador,
                salarioBase, NivelDoTrabalhador.valueOf(nivelDoTrabalhador));
        System.out.print("Quanto contratos do trabalhador? ");
        int quantidadeContrato = input.nextInt();

        for(int i = 1; i <= quantidadeContrato; i++){
            System.out.println("Entre com os dados do "+i+"º contrato: ");
            System.out.print("Data (dd/mm/aaaa): ");
            Date dataDoContrato = sdf.parse(input.next());
            System.out.print("Valor por hora: R$  ");
            Double valorDaHora = input.nextDouble();
            System.out.print("Quantidade de horas: ");
            int quantidadeDeHoras = input.nextInt();
            trabalhador.adicionarContrato(new ContratoDeTrabalho(dataDoContrato,valorDaHora,quantidadeDeHoras));
        }

        System.out.print("Entre com o mês e ano (mm/aaaa) que deseje calcular ganhos: ");
        String mesEAno = input.next();
        int mes = Integer.parseInt(mesEAno.substring(0,2));
        int ano = Integer.parseInt(mesEAno.substring(3));
        System.out.println("Nome: "+trabalhador.getNomeDoTrabalhador());
        System.out.println("Departamento: "+trabalhador.getDepartamentoDoTrabalhador().getNomeDoDepartamento());
        System.out.printf("O trabalhador teve de ganho em %s a importância de : ", mesEAno);
        System.out.println("Valor "+ trabalhador.ganhoMensalDoTrabalhador(ano,mes) );


        input.close();
    }
}
