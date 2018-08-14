package pl.javastart.dobrex;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import pl.javastart.dobrex.distance.DistanceCalc;
import pl.javastart.dobrex.distance.Point;

public class DistanceCalcTest {

    DistanceCalc distanceCalc = new DistanceCalc();

    @Test
    public void should301(){
        //given
        Point point1 = new Point(52.2297700, 21.0117800);
        Point point2 = new Point(51.1000000, 17.0333300);
        //when
        double distance=distanceCalc.distanceCalculation(point1,point2);
        //then
        Assert.assertThat(distance, CoreMatchers.is(301.73));
    }
    @Test
    public void should278(){
        //given
        Point point1 = new Point(52.2297700, 21.0117800);
        Point point2 = new Point(52.4069200, 16.9299300);
        //when
        double distance=distanceCalc.distanceCalculation(point1,point2);
        //then
        Assert.assertThat(distance, CoreMatchers.is(278.11));
    }
}