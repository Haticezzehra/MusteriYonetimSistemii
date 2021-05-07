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
public abstract class BaseCustomerManager implements CustomerI{

    @Override
    public void Save(Customer customer) {
        System.out.println("Saved To db"+customer.getFirstname());
    
}}
