/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musteriyonetimsistemi;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args)
    {
    BaseCustomerManager customerManager=new NeroCustomerManager();
    customerManager.Save(new Customer(323,"Hatice","oRHAN",5,"2324"));
    }
    
}
