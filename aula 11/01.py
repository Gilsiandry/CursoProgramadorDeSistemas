# Faça um programa para ler 5 valores e , em seguida, mostre a posição onde se encontram o maior e o menor valor
'''n = [1,2,3,4,5]
maior = 0
menor = 0
for i in range (1,5,1):
    if i > n:
        maior = n
        

print ("O maior valor é", maior, "e ele está na posição" ,i)

for i in range (len(n)):
    if i < n:
        menor = n
           
print ("O menor valor é", menor, "e ele está na posição", i)'''



# Faça um programa que leia um vetor de 10 posições com valor zero. para isso, todos os elementos a frente do valor zero, devem ser movidos uma posição para trás no vetor.
'''V = [0,2,0,4,0,6,0,8,0,10]
for i in V:
    if i==0:
        V.remove(0)
print (V)'''


# Faça um programa que leia doirs vetoes de 5 elementos. Crie um vetor que seja a intersecção entre os 2 vetoress anteriores, ou seja, que contém apenas os números que estão em ambos os vetrores.
A = [1,2,3,4,5]
B = [1,3,5,7,9]
I= []
for i in range (len(A[0])):
    if A[i]==B[i]:
        I = A[i],B[i]
for i in range (len(B[0])):
    if B[i]==A[i]:
        I = B[i],A[i]

print ("A intersecção entre A e B é:" ,I)

# Faça um programa que preenche uma matriz com o produto do valor da linha e da coluna de cada elemento. Em seguida, imprima na tela a matriz.
'''A= [[0,0],
   [0,0]]
linha = 0
coluna = 0


for i in range (len(A)):
    for j in range (len(A[0])):
        matriz = A[0][0]*A[0][0]
print (matriz)'''




#Leia duas matrizes 4x4 e escreva uma terceira com os maiores valores de cada posição das matrizes lidas.