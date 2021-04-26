
package com.mycompany.parcial_dos;

/**
 Esta clase contiene el menu de opciones, tanto su parte logica como
  su parte grafica
 */
public class ClasePrincipal 
{
    public static void main (String args [])
    {
        int opcion = 0, nodo = 0;
        Pila pila = new Pila();
        
        do
        {
            try
            { 
                opcion = Interger.parseInt(JOptionPane.showInputDialog(null, 
                        "1. Clientes\n" +
                        "2. Peliculas\n"));
            }catch(NumberFormatException e)
            {
            }
        }while(opcion !=2);
    }
}
