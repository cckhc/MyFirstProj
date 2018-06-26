/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooproj18;

import java.util.ArrayList;

/**
 *
 * @author chankh
 * SAMPLE ONLY, Students may delete this in their final submission
 */
public class SampleUser extends User{
    String extraFONE, extraFTWO;
    SampleUser(String uID, String uPwd){
        super(uID, uPwd);
    }
    SampleUser(String uID, String uPwd, UInfo uInfo){
        super(uID, uPwd, uInfo);
    }
    SampleUser initExtraFONE(String extraFONE){
        this.extraFONE = extraFONE;
        return this;
    }
    SampleUser initExtraFTWO(String extraFTWO){
        this.extraFTWO = extraFTWO;
        return this;
    }
    
    public ArrayList<String> getSUInfo(){
        ArrayList<String> retAL = super.getUInfo();
        retAL.add(extraFONE);   retAL.add(extraFTWO); 
        return retAL;
    }
}
