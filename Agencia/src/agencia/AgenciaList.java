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
}
