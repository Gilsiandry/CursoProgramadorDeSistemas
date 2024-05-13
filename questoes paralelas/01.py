#Faça um algoritmo que leia 20 pares de valores a e b, e para cada par de valores lido escreve qual é o maior valor
#portugol
'''programa {
  funcao inicio() {
    inteiro a,b,i
    para (i =1; i<=20;i++){
      escreva ("Digite o valor de a para o par ", i, ": ")
      leia (a)
      escreva ("Digite o valor de b para o par: ", i, ": ")
      leia (b)
      se (a>b){
        escreva("O maior valor entre ", a, " e ", b, " é: ", a)
      } senao {
        escreva("O maior valor entre ", a, " e ", b, " é: ", b)
      }
  }
}
}'''

#python
A=0
B=0
for i in range (1,21,1):
  print ("Digite o valor de a para o par ", i, ": ")
  A=input()
  print ("Digite o valor de b para o par: ", i, ": ")
  B=input()

  if (A>B):
    print("O maior valor entre ", A, " e ", B, " é : ", A)
  else:
    print("O maior valor entre ", A, " e ", B, " é : ", B)





