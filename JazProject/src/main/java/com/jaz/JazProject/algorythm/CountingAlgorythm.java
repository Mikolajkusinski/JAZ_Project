package com.jaz.JazProject.algorythm;

import com.jaz.JazProject.entities.InfoAboutClient;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.math3.util.Precision;

public class CountingAlgorythm {


    public static double countFees(InfoAboutClient infoAboutClient){
        double finalResult = 0;

        switch (infoAboutClient.getType()){
            case FLAT -> {
                if(infoAboutClient.isRecycling()) {
                if (infoAboutClient.getYardage() <= 50) {
                    finalResult = (((infoAboutClient.getWaterUsage() * 12.73) + (infoAboutClient.getYardage() * 1.35)) / 2);
                }else if(infoAboutClient.getYardage() > 50 && infoAboutClient.getYardage() <= 100){
                    finalResult = (((infoAboutClient.getWaterUsage() * 12.73) + (infoAboutClient.getYardage() * 1.05)) / 2);
                }else if(infoAboutClient.getYardage() > 100){
                    finalResult = (((infoAboutClient.getWaterUsage() * 12.73) + (infoAboutClient.getYardage() * 0.75)) / 2);
                }
            }else{
                if (infoAboutClient.getYardage() <= 50) {
                    finalResult = (((infoAboutClient.getWaterUsage() * 12.73) + (infoAboutClient.getYardage() * 1.35)) * 1.5);
                }else if(infoAboutClient.getYardage() > 50 && infoAboutClient.getYardage() <= 100){
                    finalResult = (((infoAboutClient.getWaterUsage() * 12.73) + (infoAboutClient.getYardage() * 1.05)) * 1.5);
                }else if(infoAboutClient.getYardage() > 100){
                    finalResult = (((infoAboutClient.getWaterUsage() * 12.73) + (infoAboutClient.getYardage() * 0.75)) * 1.5);
                }
            }
            }
            case DETACHED_HOUSE -> {
                if(infoAboutClient.isRecycling()){
                    finalResult = ((infoAboutClient.getWaterUsage() * 4.73)+ (16.50 * infoAboutClient.getHowManyPeople() ));
                }else {
                    finalResult = ((infoAboutClient.getWaterUsage() * 4.73)+ (16.50 * infoAboutClient.getHowManyPeople() )) * 2;

                }
            }
        }
        return Precision.round(finalResult, 2);
    }
}
