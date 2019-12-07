/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.cs472;

/**
 *
 * @author 610522
 */
public class RadioState {

    private String yesCheck;
    private String noCheck;

    RadioState() {
        yesCheck = "";
        noCheck = "";
    }

    public String getNoCheck() {
        return noCheck;
    }

    public String getYesCheck() {
        return yesCheck;
    }

    public void setNoCheck(String noCheck) {
        this.noCheck = noCheck;
    }

    public void setYesCheck(String yesCheck) {
        this.yesCheck = yesCheck;
    }

}
