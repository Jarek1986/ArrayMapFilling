/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wykres1;

/**
 *
 * @author jaroslaw.ziolkowski
 */
public class WykresKolorowyAlgorytmy {

    public long AverageCalc(long[] my) {
        long averageVal;
        long sum = 0;
        
        for (int i = 0; i < my.length; i++) {
            sum = sum + my[i];
        }
        // calculate average
        averageVal = sum / my.length;

        return averageVal;
    }

}
