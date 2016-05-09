package conceptosAvanzados.Taller5;

import conceptosAvanzados.CalularIntegral;
import junit.framework.TestCase;

public class AppTest extends TestCase
{
	public void testCaso1()
    {
		CalularIntegral objectoCalculo = new CalularIntegral();
		objectoCalculo.setDof(9);
		objectoCalculo.setNumSeg(10);
		objectoCalculo.setX(1.1);
		objectoCalculo.calcularp();
		
		assertEquals(0.35006D, objectoCalculo.getP(), 0.00001D);
		
    }
    
	public void testCaso2()
    {
		CalularIntegral objectoCalculo = new CalularIntegral();
		objectoCalculo.setDof(10);
		objectoCalculo.setNumSeg(10);
		objectoCalculo.setX(1.1812);
		objectoCalculo.calcularp();
		
		assertEquals(0.36757D, objectoCalculo.getP(), 0.00001D);
    }
    
	public void testCaso3()
    {
		CalularIntegral objectoCalculo = new CalularIntegral();
		objectoCalculo.setDof(30);
		objectoCalculo.setNumSeg(10);
		objectoCalculo.setX(2.750 );
		objectoCalculo.calcularp();
		
		assertEquals(0.49500D, objectoCalculo.getP(), 0.00001D);
    }
    
}
