/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test04;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Test04{
    public Test04(){
        try {
            window1 obj = new window1();
        } catch (IOException ex) {
            Logger.getLogger(Test04.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public static void main(String[] args) {
        new Test04();
        
        
        
        //new Test04();
    }
}
