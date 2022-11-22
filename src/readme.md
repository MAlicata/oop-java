POO

CLASE, OBJETO, ABSTRACCION, HERENCIA, POLIMORFISMO
ENCAPSULAMIENTO.

QUÉ ES UN OBJETO? Es una representacion abstracta 
de una cosa(auto, moto, bicicleta, etc). 
LOS OBJETOS REPRESENTAN COSAS SIMPLES O COMPLEJAS.

Atributos o propiedades están consttituidos los objetos.


En nuestros objetos vamos a guardar la información más
relevantes. 


Clases: forma en la que definimos los objetos(definen objetos), 
que indican los atributos.
En otras palabras una clase es como una plantilla que nos permite crear
objetos.


* LOS OBJETOS SON INSTANCIAS DE CLASES
* (UTILIZAMOS EL OPERADOR NEW)
* LAS CLASES DEFINEN COMO ESTAN COMPUESTOS LOS OBJETOS

OBJETOS ->TIENE:
* ATRIBUTOS, CARACTERISTICAS, CUALIDADES
* COMPORTAMIENTO, OPERACIONES, FUNCIONES, MÉTODOS

objeto.atributo = valor;
objeto.metodo();

PILARES DE POO:
POO-> ENCASULAMIENTO, HERENCIA, POLIMORFISMO. 

Recordar:
* los objetos tienen datos y operaciones. 


Encapsulacion: 
me asegura que los datos ingresados en los objetos
sean correctos. Y evitar datos invalidos. 
El encapsulamiento sirve para proteger datos y tiene control
sobre sus datos, antes de la modificacion y despues de la
modificacion. 
el encapsulamiento acompaña al cambio de estado del objeto.
por ej: el método set, puedo establecer cierto valor para un objeto pero antes realizar
alguna validacion y despues de asignarle un valor al objeto, realizar alguna
acción.



* public -> puede ser mensionado fuera de la clase
* private -> solo puede ser mensionado desde la clase


Métodos getter and setter. 


Herencia:
crear clases nuevas a partir de clases que ya existen
*
class Persona {
    String nombre;
    int edad;
}
*
class Alumno extends Persona{
    int legajo;
    String carrera;
}

la herencia me ayuda a no duplicar código. La clase Persona
seria la generalizacion, si agrego un atributo todas las clases
hijas lo tendran agregado.
Generalizacion: ALUMNO, EMPLEADO, CLIENTE -> PERSONA
ESPECIALIZACION: ALUMNO <- BECARIO 
* CLASES -> UN PADRE
* NO PERMITE HERENCIA MULTIPLE
* INTERFAZ PERMITE HACER ALGO PARECIDO A LA HERENCIA MULTIPLE

  * Validacion de la herencia: "Es un"
  * Por ejemplo un alumno es una persona? sí
  * la clase padre es la clase object. 

*De una clase abstract no sé puede instaciar objetos
* Una clase abstract sirve para generalizar una clase



Repaso: 
encapsulamiento: (elementos privados, funciones publicas).
herencia: definir una clase a partir de otra(PERSONA, ALUMNO, PASANTE)

Polimorfismo: enviar el mismo msj a objetos diferentes
y que cada objeto responda de manera particular.
polimorfismo de herencia nos estamos refiriendo cuando hablamos 
de los pilares de la oop. 
polimorfismo: muchas formas. 
