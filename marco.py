## AGENDA
def menu():
 print ("1.- Agregar Persona y su número")
 print ("2.- Buscar Persona")
 print ("3.- Eliminar Persona")
 print ("4.- Modificar Persona")
 print ("5.- Salir")
 print ('Ingrese una opción: ') 

lista_nombre = []
lista_numero = []
op= menu(int(input()))
while op!=0:
  if op<=0  or op > 5:
     print ("Ingreso una opción errónea, vuelva a intentarlo")   
  elif op == 1:
     print ("1.- Agregar Persona")
     persona = str(input("Ingrese Nombre: "))
     num = int(input("Ingrese Número: "))
     lista_nombre.append(persona)
     lista_numero.append(num)
  elif op == 2:
     print ("2.- Mostrar Persona")
     persona = str(input("Ingrese Nombre: "))
     posicion = lista_nombre.index(persona)
     print (lista_numero[posicion])
  elif op == 3:
     print ("3.- Eliminar Persona")
     persona = str(input("Ingrese Nombre: "))
     posicion = lista_nombre.index(persona)
     del lista_nombre.remove[posicion]
     del lista_numero.remove[posicion]     
  elif op == 4:
     print ("4.- Modificar Persona")
     persona =str(input("Ingrese Nombre: "))
     posicion = lista_nombre.index(persona)
     op1 =int(input("1) Cambiar Nombre \n 2) Cambiar Número: "))
     while op1 <= 0 or op > 3:
       print ("Ingrese opción valida")
       op1 = int(input("1) Cambiar Nombre ; 2) Cambiar Número: "))

       if op1 == 1:
          lista_nombre.append[posicion] = str(input("Ingrese Nombre: ")
       if op1 == 2:
          lista_numero.append[posicion] = str(input("Ingrese Número: ")     
  elif op == 5:
    print("adios")
  op= menu(int(input()))