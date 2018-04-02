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
public class AgenciaList {
    Vendedor ve[] =new Vendedor [10];
   public AgenciaList()
   {
       for(int i=0;i<10;i++){
           ve[i]=new Vendedor();
       }     
   }
   public void set()
   {
       for(int i=0;i<10;i++){
       ve[i].NameVenddedorset(temp.AgenciaCaro.Vend.getItemAt(i).toString());
       ve[i].ChocheSET();
        }
   }
   public void ventaNueva()
   {    
       int tempo=temp.AgenciaCaro.Vend.getSelectedIndex(),tempo2=temp.AgenciaCaro.Mod.getSelectedIndex();
       ve[tempo].newVentaSET(tempo2);
       ve[tempo].VentaSet();
       System.out.println("cantidad: "+this.ve[tempo].VentatGet()+
                          "\nvendedor: "+this.ve[tempo].NamVendedorGet()+
                          "\nModelo: "+this.ve[tempo].ChocheGEtNam(tempo2)+
                          "\nCantidad vendida"+this.ve[tempo].ChocheGEtCan(tempo2));
   
      ve[0].NameVenddedorset(temp.AgenciaCaro.Vend.getItemAt(0).toString());
       
    }
   public int getModel(int tempV,int TempM)
   {
       return this.ve[tempV].ChocheGEtCan(TempM);
   }
    public int getV(int tempV)
   {
       return this.ve[tempV].VentatGet();
   }
    public String metodo_mayor()
    {  
        int Mayor =this.ve[0].VentatGet(),pos=0;
        for(int i=1;i<10;i++)
        {
            if(Mayor<this.ve[i].VentatGet())
            {
                Mayor=this.ve[i].VentatGet();
                pos=i;
            }
            
        }
        if (Mayor==this.ve[0].VentatGet())
            {             
                pos=0;
            }
        return this.ve[pos].NamVendedorGet();
    }
  
}
