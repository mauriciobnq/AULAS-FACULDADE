programa {
  const inteiro LIN = 9
  const inteiro COL = 2
  const cadeia VAZIO = "       "
  funcao inicio() {
    
    cadeia matrizVagas[LIN][COL]
    inteiro i , j ,opcao


    para(i=0;i<LIN;i++){
     para(j=0;j<COL;j++){
      matrizVagas[i][j]=VAZIO
    }
  }

    faca{

escreva("\n\n#################################################################")
escreva("\n################   Sistema Estacionamento do zé  ##################")
escreva("\n# 1) Vagas do estacionamento                                      #")
escreva("\n# 2) Cadastrar um veiculo                                         #")
escreva("\n# 3) Liberar uma vaga                                             #")
escreva("\n# 0) Sair                                                         #")
escreva("\nOpção-> ")
    leia(opcao)

    escolha(opcao) {
      caso 1:
      escreva("\n\nMapa Estacionamento:\n")
          para (i=0; i<5;i++){
            para (j=0;j<6;j++){
              escreva ("       ",matrizVagas[i][j])
            }
            escreva("\n") //Pula linha
          }




          pare

      
      caso 2:
          
          pare
                 
      caso 3:

      pare  

      caso 0:
      escreva("\nSistema Finalizado. Bom descanso.")
      pare

      caso contrario:
      escreva("\nOpção Inválida")
    }
    }enquanto(opcao!=0)


  }
}