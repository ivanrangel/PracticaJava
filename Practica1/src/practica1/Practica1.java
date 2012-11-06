/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.io.*;
import java.util.*;


/**
 *
 * @author Ivan Rangel Ostos C.I. 16540560
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String Nombre;
        String Apellido;
        int Cedula;  
        int Recorrido_Personas;
        int Persona_Encontrada;
        float Sueldo;
        String menu = "0"; 
        Vector vec = new Vector();
        
        InputStreamReader lector = new InputStreamReader(System.in);
        BufferedReader leer = new BufferedReader (lector);
        
        while(!menu.equals("4"))
        {               
            Persona_Encontrada = 0;
            System.out.print("1. Guardar Persona \n");
            System.out.print("2. Buscar Personas \n");
            System.out.print("3. Listar Personas \n");
            System.out.print("4. Salir \n");
            System.out.println("Seleccione la Opción: ");        
            menu = leer.readLine();           
            if(menu.equals("1"))
            {            
                System.out.println("Ingrese el Nombre: ");
                Nombre = leer.readLine();           
                System.out.println("Ingrese el Apellido: ");
                Apellido = leer.readLine();           
                System.out.println("Ingrese la Cedula: ");            
                Cedula = Integer.parseInt(leer.readLine());           
                System.out.println("Ingrese el Sueldo: ");
                Sueldo = Float.parseFloat(leer.readLine());   
                Persona persona1 = new Persona();               
                persona1.Guadar_Persona(Nombre, Apellido, Cedula, Sueldo);
                vec.add(persona1);
            }
            if(menu.equals("2"))
            {
               Recorrido_Personas = 0;
               System.out.println("Ingrese la Cedula a Buscar: ");
               Cedula = Integer.parseInt(leer.readLine());                               
               while(Recorrido_Personas < vec.size())
               {                     
                    Persona persona2 = new Persona();                     
                    persona2 = (Persona) vec.elementAt(Recorrido_Personas);
                    Recorrido_Personas++;                     
                    if(persona2.Buscar_Persona(Cedula))
                    {
                        System.out.println("La Persona Es: \n"); 
                        persona2.Listar_Persona();
                        Persona_Encontrada = 1;
                    }                        
               }    
               if(Persona_Encontrada == 0)
               {    
                   System.out.println("La Persona No se Encontro: \n"); 
               }     
            }
            if(menu.equals("3"))
            {    
                Recorrido_Personas = 0;
                 while(Recorrido_Personas < vec.size())
                 {                     
                     Persona persona2 = new Persona();
                     persona2 = (Persona) vec.elementAt(Recorrido_Personas);
                     Recorrido_Personas++; 
                     System.out.println("Empleado: "+Recorrido_Personas);  
                     persona2.Listar_Persona();                                                 
                 }                                      
            }
       }
    }
}
