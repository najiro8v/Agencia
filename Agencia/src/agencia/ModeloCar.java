/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia;
import temp.*;
/**
 *
 * @author reyna
 */
public class ModeloCar {
    private String Name;
    private int Cant=0;
    //get and set nombre
    public void NameSet(String nombre)
    {
        this.Name=nombre;
    }
    public String NameGet()
    {
        return this.Name;
    }
    //get and set cant
    public void CantSet()
    {
        this.Cant+=1;
    }
    public int CantGet()
    {
        return this.Cant;
    }
    
}
