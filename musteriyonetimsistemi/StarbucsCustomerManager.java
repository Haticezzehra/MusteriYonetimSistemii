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
public class StarbucsCustomerManager extends BaseCustomerManager  {
private IPersonCheckService _personCheckService;
   public StarbucsCustomerManager(IPersonCheckService personCheckService )
   {
   _personCheckService=personCheckService;
   }
@Override
    public void Save(Customer customer) {
        if(_personCheckService.CheckIfRealPerson(customer))
        {
        super.Save(customer);
        }
      else
        {
        System.out.println("Not a valid person");
        }
    }

    
   


    
    
}
