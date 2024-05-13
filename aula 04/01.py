#Faça um programa que peça o tamanho de um arquivo para donload (em B) e a velocidade do link de internet é de 1bps, calcule e informe o tempo de download do arquivo em minutos.
'''download = int(input("Qual tamanho download em byte: "))
download = download*8 # 1 byte = 8 bits
velocidade = download/60 #60 minutos
print ("O download do seu arquivo de ",download, "Byte levará ", velocidade, "minutos")'''


#Faça um programa que peça dois números e imprima o maior deles.
'''n1 = int(input("Informe um número: "))
n2 = int(input("Informe outro número: "))
if n1<n2:
    print ("O maior número é o ", n2)
elif n1>n2:
    print ("O maior número é o ", n1)
else:
    print ("Os números são iguais!")'''


#Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo
'''valor = int(input("Informe um valor: "))
if valor >0:
    print ("O número informado é positivo")
elif valor <0:
    print ("O número informado é negativo")
else:
    print ("O número informado é neutro/indefinido")'''


#Faça um programa que leia três números e mostre o maior dele
'''n1 = int(input("Informe um número: "))
n2 = int(input("Informe um número: "))
n3 = int(input("Informe um número: "))'''

#ou:
'''n1, n2, n3 = map(int, input("Digite três números separando-os com espaço: ").split())'''


'''if n1>n2 and n1>n3:
    print ("O maior número é o ", n1)
elif n2>n1 and n2>n3:
    print ("O maior número é o ", n2)
elif n3>n1 and n3>n2:
    print ("O maior número é o ", n3)
else:
    print ("Os números são iguais.")'''


#Faça um programa