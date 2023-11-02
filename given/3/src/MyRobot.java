
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class MyRobot implements IRobot{
    @Override
    public int f1(List<Robot> t) {
        int sum = 0;
        for(int i=0; i<t.size(); i++) {
            if(!t.get(i).getLabel().contains("A") && !t.get(i).getLabel().contains("B")) {
                sum += t.get(i).getStep();
            }
        }
        return sum;
    }

    @Override
    public void f2(List<Robot> t) {
        int maxIndex = maxIndex(t);
        t.remove(maxIndex);
    }

    @Override
    public void f3(List<Robot> t) {
        
    }

    private int maxIndex(List<Robot> t) {
        int maxIndex = t.get(0).getStep();
        int max = 0;
        for(int i=0; i<t.size(); i++) {
            if(t.get(i).getStep()>max) {
                max = t.get(i).getStep();  
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    
}
