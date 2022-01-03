package com.jaz.JazProject.algorythmTest;

import com.jaz.JazProject.algorythm.CountingAlgorythm;
import com.jaz.JazProject.entities.InfoAboutClient;
import com.jaz.JazProject.enumes.TypeOfBuldingEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class algorythmTest {


    @Test
    public void flatWithRecycling38m2And4WaterUsageShouldCost51dot11(){
        Assertions.assertEquals(51.11,CountingAlgorythm.countFees(new InfoAboutClient("test","test","test",4.00,38.00,1, TypeOfBuldingEnum.FLAT,true)));
    }


    @Test
    public void flatWithoutRecycling38m2And4WaterUsageShouldCost153dot33(){
        Assertions.assertEquals(153.33,CountingAlgorythm.countFees(new InfoAboutClient("test","test","test",4.00,38.00,1, TypeOfBuldingEnum.FLAT,false)));
    }

    @Test
    public void dHouseWithRecycling150m2and9WaterUsageAnd3PeopleShouldCost92dot07(){
        Assertions.assertEquals(92.07,CountingAlgorythm.countFees(new InfoAboutClient("test","test","test",9.00,150.00,3, TypeOfBuldingEnum.DETACHED_HOUSE,true)));

    }
    @Test
    public void dHouseWithoutRecycling150m2and9WaterUsageAnd3PeopleShouldCost181dot14(){
        Assertions.assertEquals(184.14,CountingAlgorythm.countFees(new InfoAboutClient("test","test","test",9.00,150.00,3, TypeOfBuldingEnum.DETACHED_HOUSE,false)));

    }
}
