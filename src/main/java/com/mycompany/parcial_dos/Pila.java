
package com.mycompany.parcial_dos;

import javax.swing.JOptionPane;

/**
 *
 * @author escobarlima
 */
//clase para bases necesarias para asignar el comportamiento tipo pila
public class Pila 
{
    private Nodo UltimoValorIngresado;
    int tamano = 0;
    String Lista = "";
    //construcctor de esta clase
    public Pila()
    {
        //iniciar el primer valor en cero
        UltimoValorIngresado = null;
        tamano = 0;
    }
    //metodos que daran vida el programa
    
    //Metodo para saber cuando la lista tipo pila esta vacia
    public boolean PilaVacia()
    {
        return UltimoValorIngresado == null;
    }
    
    //Metodo para insertar un valor a la pila
    public void InsertarNodo(int nodo)
    {
        Nodo nuevo_nodo = new Nodo(nodo);
        nuevo_nodo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nodo;
        tamano ++;
    }
    //metodo para eliminar un valor de la pila
    public int EliminarNodo()
    { 
        int auxiliar = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tamano --;
        return auxiliar;
    }
    //metodo para saber cual es el ultimo valor ingresado
    public int MostrarUltimoValorIngresado()
    {
        return UltimoValorIngresado.informacion;
    }
    //metodo para conocer el tamano de la pila
    public int TamanoPila()
    {
        return tamano;
    }
    //metodo para vacir la pila
    public void VaciarPila()
    {
        while (!PilaVacia())
        {
            EliminarNodo();
        }
    }
    //metodo para mostar el contenido de la pila
    public void MostrarValores()
    {
        Nodo recorrido = UltimoValorIngresado;
        while (recorrido != null)
        {
            Lista += recorrido.informacion + "/n";
            recorrido = recorrido.siguiente;
        }
        //Indicar al programa que esto lo tiene que mostrar en un JOptionPane
        JOptionPane.showMessageDialog(null, Lista);
        //limpiar la lista para que no acumule demaciados numeros
        Lista = "";
    }
}
