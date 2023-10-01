/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

import java.util.Scanner;

/**
 *
 * @author anhdu
 */
public class SpecRobot extends Robot {
    protected int step;
    
    public SpecRobot() {
        super();
    }
    
    public SpecRobot(String label, int type, int step) {
        super(label, type);
        this.step = step;
    }
    
    @Override
    public String toString() {
        return super.toString()+", "+step;
    }
    
    public void setData() {
        super.setLabel(label.substring(0,1)+step+label.substring(1));
    }

    
    public int getValue() {
        if(type < 3 && label.contains("A")) {
            return step;
        } else {
            return step + 2;
        }
    }
    
}
