/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_bachy0;
/**
 *
 * @author musha
 */
public class Users implements java.io.Serializable {
    public String name,f_name,gender,age,file_path;
    
    
    public void set_name(String n){
        name =n;
    }
    public void set_fname(String n){
        f_name =n;
    }
    public void set_gender(String n){
        gender =n;
    }
    public void set_age(String n){
        age =n;
    }
    public void set_path(String n){
        file_path = n;
    }
    public String get_path(){
        return file_path;
    }
    public String get_name(){
        return name;
    }
    public String get_fname(){
        return f_name;
    }
    public String get_gender(){
        return gender;
    }
    public String get_age(){
        return age;
    }         
}
