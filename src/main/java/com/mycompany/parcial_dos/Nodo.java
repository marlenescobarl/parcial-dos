
package com.mycompany.parcial_dos;

/* clase que apoyara al programa a crear nuevos datos cada vez que el usuario 
introduzca un nuevo valor*/
public class Nodo 
{
    int informacion;
    //apuntador al siguiente nodo
    Nodo siguiente;
    
    //constructor para guardar cada valor
    public Nodo(int valor )
    {
        //guardar el valor que el usuario ha ingresado
        informacion = valor;
        //apuntador de inicio, con valor nulo
        siguiente =null;
    }
}
