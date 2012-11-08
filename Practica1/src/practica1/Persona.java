/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Ivan Rangel Ostos C.I. 16540560
 */
public class Persona {
    String Nombre;
    String Apellido;
    int Cedula;
    float Sueldo;        
    
    public Persona()
    {
    }     
    
    public void Guadar_Persona(String Nombre1, String Apellido1, int Cedula1, float Sueldo1)
    {
      Nombre = Nombre1;
      Apellido = Apellido1;
      Cedula = Cedula1;
      Sueldo = Sueldo1;                
    }
    
    public boolean Buscar_Persona(int Cedula1)
    {
        if(Cedula1==Cedula)
        {    
            return true;
        }    
        else
        {    
            return false;
        }    
    }        
    
    public void Listar_Persona()
    {
        System.out.println("Nombre: "+Nombre);             
        System.out.println("Apellido: "+Apellido);                      
        System.out.println("Cedula: "+Cedula);                            
        System.out.println("Sueldo: "+Sueldo);
        System.out.println("\n");
    }     
    
    public void Prueba_Github()
    {
        System.out.println("Prueba de Github");
        System.out.println("Prueba de Github 2");
        System.out.println("JUAN CARLOS");
    }        
}
