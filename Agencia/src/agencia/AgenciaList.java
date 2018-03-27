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
   private Vendedor ve[] =new Vendedor [10];
   public AgenciaList()
   {    for(int i=0;i<10;i++){
       ve[i].NameVenddedorset(temp.AgenciaCaro.Vend.getItemAt(i).toString());
        }
   }
   public void ventaNueva()
   {
       int tempo=temp.AgenciaCaro.Vend.getSelectedIndex();
       ve[tempo].newVentaSET(temp.AgenciaCaro.Vend.getSelectedItem().toString());
       ve[tempo].VentaSet();
   }
}
