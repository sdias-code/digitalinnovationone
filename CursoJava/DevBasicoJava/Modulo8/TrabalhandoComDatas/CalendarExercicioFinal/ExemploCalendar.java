package Exemplo002;

import java.util.Calendar;

public class ExemploCalendar {
	public static void main(String[] args) {
	    //Inserir data que será pago
		Calendar dataPagamento = Calendar.getInstance();
		dataPagamento.set(2020,0, 6);//obs. lembrar que mes começa em 0-11

		//Inserir data do vencimento
		Calendar dataVencimento = Calendar.getInstance();
		dataVencimento.set(2020,11, 29);//obs. lembrar que mes começa em 0-11

	   int dpAno = dataPagamento.get(Calendar.YEAR);
	   int dpMes = dataPagamento.get(Calendar.MONTH);
	   int dpDia = dataPagamento.get(Calendar.DATE);
	   int dpSemana = dataPagamento.get(Calendar.DAY_OF_WEEK);
		System.out.println("Data do pagamento: "+dpDia+"-"+(dpMes+1)+"-"+dpAno);

	   int dvAno = dataVencimento.get(Calendar.YEAR);
	   int dvMes = dataVencimento.get(Calendar.MONTH);
	   int dvDia = dataVencimento.get(Calendar.DATE);
		System.out.println("Dia do vencimento: "+dvDia+"-"+(dvMes+1)+"-"+dvAno);

	   int contarMes;
	   int contarDia;

	   //Condicional - verificar se o ano é igual ao ano do pagamento
		if(dpAno > dvAno){
			System.out.println("Data inserida inválida. Ano superior ao vencimento.");
		}

		//Condicional - verifica ano e mes estão dentro do intervalo de pagamento
		if((dpAno == dvAno) && (dpMes <= dvMes)){
			//descobrindo mes
			contarMes = 0;
			for(int i=dpMes; i< dvMes; i++){ // no lugar do for poderia usar dvMes - dpMes
				contarMes++;
			}

			//Só exibirá mensagem se o mes for diferente de 0
			if(contarMes != 0){
				System.out.println("Falta(m) "+contarMes+" Mês(es) para o pagamento.");
			}

			//contagem de dias
			contarDia = 0;
			for(int i=dpDia; i<dvDia; i++ ){ //no lugar do for poderia usar dvDia - dpDia
				contarDia++;
			}
			if(contarDia !=0){
				System.out.println("Falta(m) "+contarDia+" dia(s) para o pagamento da fatura.");
			}else {
				System.out.println("Hojé é o dia do pagamento.");
			}

            //Verificar se data caiu no final de semana (Sábado ou Domingo)
            if(dpSemana  == 1 || dpSemana == 7) {
                System.out.println("O pagamento caiu no final de semana. Pagar só Segunda-feira.");

                //Imprimir dia fim de semana
                if(dpSemana == 1){
                    System.out.println("Data do pagamento caiu no Domingo.");
                }
                if (dpSemana == 7){
                    System.out.println("Data do pagamento caiu no Sábado.");
                }
            }
			}
		 else {
			System.out.println("Data inserida inválida.");
		}

	}
}
