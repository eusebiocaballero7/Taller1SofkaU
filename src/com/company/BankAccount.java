/**
 * Author: Eusebio Caballero.
 */
package com.company;

/**
 * Instancia de una clase cuenta de banco para crear el número de cuenta y establecer la activación de la misma.
 */

public class BankAccount {
    private int accountNumber;
    protected boolean activated;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setActived(boolean actived){
        this.activated = actived;
    }

    public boolean getActived() {
        return activated;
    }

}
