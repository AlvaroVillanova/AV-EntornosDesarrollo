#Refactorizacion: Mejorar la legibilidad. Poner nombres intuitivos
#Refactorizacion: Simplificar la logica. Evitar redundancias
#Refactorizacion: Facilitar la mantenibilidad. Hacer Funciones
#Refactorizacion: Facilitar las pruebas. Automatizar/facilitar los valores de entrada.

def calcularDobleNumero(num1):
    return num1*2

"""
numeroDuplicar=int(input("Dame un numero. "))

print(calcularDobleNumero(5))
"""

"""
Bateria de pruebas simplificada:
Crear una funcion que se va a llamar probandoCalcularDoble() que va a tener una lista de numeros "aleatorios/convenientes" (introducidos por nosotros manualmente) que vamos a recorrer con un bucle for. Para cada numero de la lista va a llamar a la funcion calcularDoble(numero) y a imprimir por pantalla: "El doble de {numero} es {dobleDeNumero}"
"""

def solicitaNumero():
    return int(input("Dame un numero: "))

def probandoCalcularDoble(num1,num2,num3,num4):
    listaNumeros=[num1,num2,num3,num4]
    for numero in listaNumeros:
        dobleNumero=calcularDobleNumero(numero)
        print("El doble de "+str(numero)+" es "+str(dobleNumero))


num1=solicitaNumero()
num2=solicitaNumero()
num3=solicitaNumero()
num4=solicitaNumero()

print(probandoCalcularDoble(num1,num2,num3,num4))







"""
def solicitaNumero():
    return int(input("Dame un numero: "))

def probandoCalcularDoble(lista):
    for range(0,4,1) in listaNumeros:


listaNumeros[]=0,1,2,3,4
num1=solicitaNumero()
num2=solicitaNumero()
num3=solicitaNumero()
num4=solicitaNumero()

Resultado=listaNumeros[num1,num2,num3,num4]


"""




