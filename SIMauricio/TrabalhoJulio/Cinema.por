  programa {
  funcao inicio() {
    inteiro poltrona[5][6]
    inteiro i, j, lin, col, opcao, soma=0
    //Inicializando a Matriz de Poltronas como Livres
    para (i=0; i<5;i++){
      para (j=0;j<6;j++){
        poltrona[i][j] = 0 //Poltrona Livre
      }
    }
faca { 
escreva("\n\n###################################################################")
escreva("\n################ Sistema Venda Ingressos Teatro ###################")
escreva("\n# 1) Mostrar a Matriz de Poltronas                                #")
escreva("\n# 2) Venda de Ingresso                                            #")
escreva("\n# 3) Quantidade de Poltronas Livres                               #")
escreva("\n# 4) Quantidade de Poltronas Compradas                            #")
escreva("\n# 5) Consultar Poltronas Ocupadas                                 #")
escreva("\n# 0) Sair                                                         #")
escreva("\nOpção-> ")
    leia(opcao)
    escolha(opcao){
      caso 1: //Imprimindo a Matriz de Poltronas    
          escreva("\n\nMatriz Poltronas:\n")
          para (i=0; i<5;i++){
            para (j=0;j<6;j++){
              escreva (" ",poltrona[i][j])
            }
            escreva("\n") //Pula linha
          }
          pare
caso 2: //Venda de um Ingresso - Marcando a Poltrona
          escreva("Digite a Linha (0 a 4): ")
          leia(lin)
          escreva("Digite a Coluna(0 a 5):")
          leia(col)
          se (poltrona[lin][col]==0) { //Se a poltrona está Livre
            poltrona[lin][col] = 1 //Marca como ocupada
            escreva("Ok. Poltrona Reservada.")
          } senao { //Poltrona já está ocupada
            escreva("Erro! Esta Poltrona já está ocupada!")
          }
          pare
      caso 3:
      soma = 0
      para (i=0; i<5;i++){
        para (j=0; j<6; j++){
          se (poltrona[i][j]==0)
          soma = soma + 1 
        }
      }  
      escreva("\nQuantidade de Poltronas Livres: ",soma)
      pare 
      caso 4:
        soma=0
        para (i=0; i<5;i++){
        para (j=0; j<6; j++){
          se (poltrona[i][j]!=0)
          soma = soma + 1 
        }
      }
      escreva("\nQuantidade de Poltrinas Vendidas: ", soma)
      pare  
      caso 5:
      escreva("\nDigite a Linha(0 a 4): ")
      leia(lin)
      escreva("\nDigite a Coluna(0 a 5): ")
      leia(col)

      se(poltrona[lin][col]==0){
        (poltrona[lin][col]==1)
        escreva("\nPoltrona Livre!")
      } senao 
        escreva("\nPoltrona Ocupada!")
        pare
        

      caso 0: //Sair do sistema
          escreva("\nhasta la vista baby! \n")
          pare
      caso contrario:
          escreva("\nOpção Inválida!")
    }
  } enquanto(opcao!=0)
  }
}
