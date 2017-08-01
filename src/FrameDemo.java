/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danushka Ariyarathna
 */
import javax.swing.JFrame;


public class FrameDemo{
    public static void main(String args[]){
        JFrame myFrame = new JFrame("Sample Frame");
        myFrame.setSize(300,400);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}