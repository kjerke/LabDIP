/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author kevinjerke
 */
public class ServiceQualityRating {
    
    
    public static enum ServiceQuality {
           GOOD, FAIR, POOR
    };
    
    public final void setServiceRating(BaggageServiceTipCalculator.ServiceQuality q) {
        // No need to validate because enums provide type safety!
        BaggageServiceTipCalculator.ServiceQuality serviceQuality = q;
    }

    public BaggageServiceTipCalculator.ServiceQuality getServiceQuality() {
        BaggageServiceTipCalculator.ServiceQuality serviceQuality = null;
        return serviceQuality;
   
}
    }
