/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

/**
 *
 * @author anhdu
 */
public class Engine {
    private String designer;
    private int power;
    
    public Engine() {
        super();
    }
    
    public Engine(String designer, int power) {
        super();
        this.designer = designer;
        this.power = power;
    }

    public String getDesigner() {
        return designer.substring(0,1).toLowerCase() + designer.substring(1,3);
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
