/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia;
import java.util.LinkedList;
/**
 *
 * @author reyna
 */
public class Vendedor {
    private LinkedList Modelo;
    private String vendedor;
    public Vendedor(String Vendedor)
    {
        this.vendedor=Vendedor;
    }/******************nodo******************/
    public void newVentaSET(String modeloV)
    {
        this.Modelo.add(modeloV);
    }        
    public LinkedList Ventas()
    {        return this.Modelo;
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
}
