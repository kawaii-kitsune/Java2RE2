/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author babis
 */
public abstract class Human {
    String Sur ,Age;
    String Name;
    String Id;
    public Human(){
    }
    public abstract void introduceSelf();
    public abstract String getName();
    public abstract String getSur();
    public abstract String getAge();
    public abstract String getId();
    public abstract void setId(String i);
    public abstract void setName(String i);
    public abstract void setSur(String i);
    public abstract void setAge(String i);
    
    }
