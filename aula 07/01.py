#Faça um programa que imnprima os números de 1 a 20, um abaixo do outro
'''for i in range (1,21):
    print (i)'''

#Faça um programa que imnprima os números pares de 1 a 20, um abaixo do outro
'''for i in range (2,21,2):
    print (i)'''

#faça um programa que solicite ao usuário 5 números e imprima os números maiores que dez
'''cont = 0
for i in range (5):
    num = int(input("Informe o valor: "))
    if num>10:
        cont+=1'''

#Faça um programa para calcular o fatorial de um número n. O fatorial é a sequência, 5! 5x4x3x2x1 = 120
n = int(input("Informe o valor: "))
fatorial = n
for i in range (n-1, 1, -1):
    fatorial = fatorial*i #ou fatorial *=1
print (fatorial)