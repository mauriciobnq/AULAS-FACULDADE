programa
{
	
	funcao inicio()
	{
	//Variaveis
		cadeia descricao
		inteiro quantidade
		real preco, total, totalpagar, desconto, porcdesc

	//Entrada de Dados
		escreva("Nome do produto: ")
		leia(descricao)

		escreva("Quantidade do produto: ")
		leia(quantidade)

		escreva("Preço do produto: ")
		leia(preco)

	//Processamento

		total = quantidade*preco

		se(quantidade <=5){
			desconto = total*(2/100)
      porcdesc = 2
		}
		senao se(quantidade <=10){
			desconto = total*(3/100)	
      porcdesc = 3
		}
		senao se(quantidade > 10){
			desconto = total*(5/100)
      porcdesc = 5
		}

		totalpagar = total - desconto
			
	//Saida

		escreva("O produto comprado foi: ",descricao,"\n a quantidade de itens comprados foi de: ",quantidade, "\n o desconto foi de: ",desconto,"\n correspondente a ",porcdesc,"%","\n total a pagar: ",totalpagar)
		
	}
}

