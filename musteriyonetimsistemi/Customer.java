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
public class Customer implements IEntity{
    private int id;
    private String firstname;
    private String lastName;
    private int dateOfBirth;
    private String NationalityId;

    public Customer(int id, String firstname, String lastName, int dateOfBirth, String NationalityId) {
        this.id = id;
        this.firstname = firstname;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.NationalityId = NationalityId;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the dateOfBirth
     */
    public int getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the NationalityId
     */
    public String getNationalityId() {
        return NationalityId;
    }

    /**
     * @param NationalityId the NationalityId to set
     */
    public void setNationalityId(String NationalityId) {
        this.NationalityId = NationalityId;
    }
    
}
