#Crie um programa que solicite o sexo do usuário.
'''sexo = input("Digite seu sexo (F ou M): ").upper()

match sexo:
    case "F":
        print ("Sexo feminino")
    case "M":
        print ("Sexo masculino")
    case _:
        print ("Sexo não definido")'''


#Escreva um programa que peça ao Adriel para abonar a sua primeira falta
'''motivo = input("Digite o motivo do atraso: ")

match motivo:
    case "Fui levar meu coelho no veterinário":
        print ("Motivo plausivel, a Gil merece a presença")

    case "Atrasei apenas 32 minutos":
        print ("Atraso bobo, a Gil merece a presença")

    case "Por votação unanime da turma":
        print ("A voz do povo é a voz de Deus, a Gil merece a presença")

    case "A Gil criou um código para pedir presença":
        print ("Muito criativa, a Gil merece a presença")

    case "O códido compile perfeitamente":
        print ("Parabéns, a Gil merece a presença")
    case _:
        print ("A Gil merece a presença")'''



#Calculadora aritmética
'''n1 = int(input("Digite um número: "))
n2 = int(input("Digite outro número: "))
operacao = input("Escolha a operação desejada: ")
match operacao:
    case "+":
        print ("A soma de" ,n1, "e" ,n2, "é: ", n1+n2)
    case "-":
        print ("A subtração de" ,n1, "e" ,n2, "é: ", n1-n2)
    case "*":
        print ("A multiplicação de" ,n1, "e" ,n2, "é: ", n1*n2)
    case "/":
        print ("A divisão de" ,n1, "e" ,n2, "é: ", n1/n2)
    case _:
        print ("Operação inválida")'''


#Faça um programa que leia três números e mostre-os em ordem crescente
n1 = int(input("Digite um número: "))
n2 = int(input("Digite outro número: "))
n3 = int(input("Digite mais um número: "))
if n1>n2:
    temp = n1
    n1 = n2
    n2 = temp

if n2>n3:
    temp = n2
    n2 = n3
    n3 = temp

if n1>n2:
    temp = n1
    n1 = n2
    n2 = temp

print ("A ordem crescente dos número é: ", n1, n2, n3)