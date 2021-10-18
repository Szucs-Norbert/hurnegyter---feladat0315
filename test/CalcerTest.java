import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class CalcerTest {
    Calcer calcer;
    
    @BeforeEach
    void setUp(){
        calcer= new Calcer();
    }

    @Test
    void calcAreaNormal1Test(){
        double aSide= 30;
        double bSide= 35;
        double cSide= 40;
        double dSide= 45;
        calcer.setSides(aSide, bSide, cSide, dSide);

        double actualArea= calcer.calcArea();
        double expectedArea= 1374.77;
        assertEquals(expectedArea, actualArea, 0.01);
    }

    @Test
    void calcAreaNormal2Test(){
        double aSide= 100;
        double bSide= 105;
        double cSide= 110;
        double dSide= 115;
        calcer.setSides(aSide, bSide, cSide, dSide);

        double actualArea= calcer.calcArea();
        double expectedArea= 11524.97;
        assertEquals(expectedArea, actualArea, 0.01);
    }
}
