#Faça  um programa que peça duas notas, entre 0 e 10. Mostre uma mensagem caso o valor inserido seja inválido
'''n1 = float(input("Insira uma nota: "))
while n1<0 or n1 >10:
    n1 = float(input("Nota inválida. Informe outra nota: "))
n2 = float(input("Insira mais uma nota: "))
while n2<0 or n2 >10:
    n2 = float(input("Nota inválida. Informe outra nota: "))'''


#Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10. o usuário deve informar de qual númro ele deseja ver a tabuada.
num = int(input("Digite um número: "))
i = 1
while i <=10:
    print (num, "x", i, "=", num*i)
    i+=1