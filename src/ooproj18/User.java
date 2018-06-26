/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooproj18;

import java.util.ArrayList;

class UInfo { // suppose to be used within the same package
    String uName;
    int uAge;
    String uAddr;
    UInfo(String uName, int uAge, String uAddr){
        this.uName=uName; this.uAge=uAge;   this.uAddr=uAddr;
    }
    public ArrayList<String> getUInfo(){
        ArrayList<String> retAL = new ArrayList<String>();
        retAL.add(uName);   retAL.add(String.valueOf(uAge));    retAL.add(uAddr);
        return retAL;
    }
}
/**
 *
 * @author chankh
 * Given User Class, MUST BE USED in the project
 */
public abstract class User {
    protected String uID;   // user ID
    protected String uPwd;  // user Password
    protected UInfo uInfo;  // user Personal Information
    User(){}
    User(String uID, String uPwd){
        this.uID = uID;        this.uPwd = uPwd;
    }
    User(String uID, String uPwd, UInfo uInfo){
        this(uID, uPwd);
        this.uInfo = uInfo;
    }
    
    public ArrayList<String> getUInfo(){
        ArrayList<String> retAL = new ArrayList<String>();
        retAL.add(uID);   retAL.add(uPwd);    retAL.addAll(uInfo.getUInfo());
        return retAL;
    }
}
