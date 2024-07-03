#A matriz sempre inicia na linha e coluna zero
'''matriz = [[1,2,3],
           [4,5,6],
           [7,8,9]]

print (matriz[1][2])

matriz [1][0]=14


for i in range (len (matriz)):
    for j in range (len(matriz [0])):
        print (matriz [i][j])'''


#Declare uma matriz para armazenar o nome dos colegas presentes em aula, com as linhas e colunas conforme a posição dos mesmos. ao final imprima os elementos.
'''colegas = [["Felipe","Luiz Felipe", "", "Adriel"],
        ["Pedro", "Higor", "Gil", "Maynara"],
        ["", "Adrian", "Luiz Carlos", "Luiz Gustavo"],
        ["" , "Gabriel", "", "Arthur"],
        ["", "", "Anderson","" ]]

for i in range (len(colegas)):
    for j in range (len(colegas [0])):
        print (colegas[i][j])
    print ("-------")'''


#Leia uma matriz 4x4, conte e escreva quantos valores maiores que 10 ela possui
'''matriz = [[0,0,0],
          [0,0,0],
          [0,0,0]]
contador = 0
for i in range (len(matriz)):
    for j in range (len (matriz[0])):
        matriz[i][j] = int(input(f"Digite um valor para a matriz [{i}][{j}]: "))
        if matriz[i][j] >10:
            contador +=1
print ("Existem", contador, "valores maiores que 10")'''


#Informe a posição do maior elemento (linha e coluna)
'''matriz = [[0,0,0],
          [0,0,0],
          [0,0,0]]
maior = 0
linha = 0
coluna = 0
for i in range (len(matriz)):
    for j in range (len (matriz[0])):
        matriz[i][j] = int(input(f"Digite um valor para a matriz [{i}][{j}]: "))
        if matriz[i][j] > maior:
            maior = matriz [i][j]
            linha = i
            coluna = j
print ("O maior elemento é o ", maior, "e ele está na posicionada na linha", linha, "coluna", coluna)'''



#Declare uma matriz 5x5. Preencha com 1 diagonal principal e com e com 0 os demais elementos. Escreva ao final a matriz obtida.
matriz = [[0]*5 for k in range(5)]
for i in range(len(matriz)):
    for j in range(len(matriz)):
        if i == j:
         matriz[i][j] = 1
print (matriz)