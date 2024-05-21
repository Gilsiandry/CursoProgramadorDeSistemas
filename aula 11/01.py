# Faça um programa para ler 5 valores e , em seguida, mostre a posição onde se encontram o maior e o menor valor
#valor = [0]*5
'''valor = [4,8,5,6,3]
maior = 0
menor = 0
pos_maior = 0
pos_menor = 0
for i in range (5):
    #valor [i] = int(input ("Informe um valor: "))
    if valor [i]> maior:
        maior = valor [i]
        pos_maior = i

    if valor [i]< menor:
        menor = valor [i]
        pos_menor = i
        

print ("O maior valor é", maior, "e ele está na posição" ,pos_maior)
           
print ("O menor valor é", menor, "e ele está na posição", pos_menor)'''



# Faça um programa que leia um vetor de 10 posições com valor zero. para isso, todos os elementos a frente do valor zero, devem ser movidos uma posição para trás no vetor.
'''V = [0,2,0,4,0,6,0,8,0,10]
for i in V:
    if i==0:
        V.remove(0)
print (V)'''

#ou
'''V = [0,2,0,4,0,6,0,8,0,10]
final = []
for i in range(10):
    if V[i]!=0:
        final.append (V[i])
print (final)'''


# Faça um programa que leia doirs vetoes de 5 elementos. Crie um vetor que seja a intersecção entre os 2 vetoress anteriores, ou seja, que contém apenas os números que estão em ambos os vetrores.
'''A = [1,2,3,4,5]
B = [1,3,5,7,9]
I= []
for i in range (5):
    if A[i]==B[i]:
        I = A[i],B[i]
        I.append(A[i])

print ("A intersecção entre A e B é:" ,I)'''

# Faça um programa que preenche uma matriz com o produto do valor da linha e da coluna de cada elemento. Em seguida, imprima na tela a matriz.
'''matriz= [[0]*3,
   [0]*3,
   [0]*3]
linha = 0
coluna = 0

for i in range (3):
    for j in range (3):
        matriz [0][0] = i*j
    for i in matriz:
        print (i)'''


#Leia duas matrizes 4x4 e escreva uma terceira com os maiores valores de cada posição das matrizes lidas.
m1 = [[],
      [],
      [],
      []]

m2 = [[],
      [],
      [],
      []]

m3 = [[0]*4,
      [0]*4,
      [0]*4,
      [0]*4]

for i in range (4):
    for j in range (4):
        if m1[i][j] > m2[i][j]:
            m3[i][j] = m1[i][j]
        else: 
            m3[i][j] = m2[i][j]
for i in m3:
    print(i)