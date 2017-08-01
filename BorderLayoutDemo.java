/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BorderLayout;

/**
 *
 * @author Danushka Ariyarathna
 */
import javax.swing.JFrame;
public class BorderLayoutDemo {
    public static void main(String[] args){
        BorderLayoutFrame borderLayoutFrame = new BorderLayoutFrame();
        borderLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        borderLayoutFrame.setSize(300,200);
        borderLayoutFrame.setVisible(true);
    }
}
