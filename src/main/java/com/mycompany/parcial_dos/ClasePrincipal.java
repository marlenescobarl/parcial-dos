
package com.mycompany.parcial_dos;

import javax.swing.JOptionPane;

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
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "1. Clientes\n" +
                        "2. Peliculas\n"+
                        "3. Mostrar"+
                        "4. Salir"));
                //menu
                switch(opcion)
                {
                    case 1:
                        int op =0;
                        op = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "1. Ver listado de clientes" +
                            "2.crear nuevo cliente" + 
                            "3. Seleccionar cliente"));
                        switch(op)
                        {
                            case 1:
                                
                                pila.MostrarValores();
                                break;
                            case 2:
                                nodo = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Ingresar Cliente"));
                                pila.InsertarNodo(nodo);
                                break;
                            case 3:
                                break;
                                        
                        }
                        break;
                    case 2:
                        break;

                    case 3:
                        
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelve a intentarlo");
                        break;
                }
            }catch(NumberFormatException e)
            {
            }
        }while(opcion !=3);
    }
}
