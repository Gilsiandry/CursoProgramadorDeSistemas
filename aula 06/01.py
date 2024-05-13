
# Questão 1
'''sexo = input ("Informe seu sexo (F ou M): ").upper()

if sexo == "F":
    altura = float(input ("Informe sua altura em metros (x.xx): "))
    if altura >=1.60:
        print ("Você está apta para se alistar no exécito.")
    else:
        print ("Inápta ao alistamento")

elif sexo == "M":
    altura = float(input ("Informe sua altura em metros (x.xx): "))
    if altura >=1.70:
       print ("Você está apto para se alistar no exécito.")
    else:
        print ("Inápto ao alistamento")
else:
    print ("Valor não esperado.")'''


#Questão 2
'''n1 = int(input("Digite um número: "))
n2 = int(input("Digite outro número: "))
n3 = int(input("Digite mais um número: "))

if n1>n2 and n1>n3:
    maior = n1
elif n2>n1 and n2>n3:
    maior = n2
else:
    maior = n3

if n1<n2 and n1<n3:
    menor = n1
elif n2<n1 and n2<n3:
    menor = n2
else:
    menor = n3


print ("O menor número é o ", menor, "e o maior número é o " , maior)'''



#Questão 3
print ("1 - Converter de Celsius para Fahrenheit")
print ("2 - Converter de Fahrenheit para Celsius")

converte = int(input ("Escolha o tipo de converção que deseja fazer (1 ou 2): "))
match converte:
    case 1:
        temperatura = float(input ("Informe a temperatura em Celsius: "))
        Fahrenheit = (temperatura*9/5)+32
        print ("O resultado da temperatuta", temperatura, "em Fahrenheit é: ", Fahrenheit )


    case 2:
        temperatura = float(input ("Informe a temperatura em Fahrenheit: "))
        Celsius = (temperatura-32)*5/9
        print ("O resultado da temperatuta", temperatura, "em Fahrenheit é: ", Celsius )

    case _:
        print ("Opção inválida")