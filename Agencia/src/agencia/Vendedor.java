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
public class Vendedor {
    private String vendedor;
    private int VentasT=0;
    private ModeloCar coche[]=new ModeloCar[15];
    
/***************************************/
    
    public void ChocheSET() {
        for(int i=0;i<15;i++){
       this.coche[i].NameSet(temp.AgenciaCaro.Mod.getItemAt(i).toString());
        }
      
       
    }
    public String ChocheGEtNam(int pos)
    {
        return this.coche[pos].NameGet();
    }
    public int ChocheGEtCan(int pos)
    {
        return this.coche[pos].CantGet();
    }
    /****************************************************/
    public Vendedor(String Vendedor)
    {
        this.vendedor=Vendedor;
    }
    public Vendedor()
    {
        for(int i=0;i<15;i++ ){
             this.coche[i]=new ModeloCar();
        }
    }
//******************nodo******************/
    public void newVentaSET(int pos)
    {
        
        this.coche[pos].CantSet();
        
    }        
   
    /***********vendendor**********************/
    public void NameVenddedorset(String Vendedor)
    {
        this.vendedor=Vendedor;
    }
    public String NamVendedorGet()
    {
        return this.vendedor;
    }
    /********************************/
    public void VentaSet()
    {
        this.VentasT+=1;
    }
    public int VentatGet()
    {
        return this.VentasT;
    }
    
}
