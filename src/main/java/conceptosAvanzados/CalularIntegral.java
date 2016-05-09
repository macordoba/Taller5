package conceptosAvanzados;

import conceptosAvanzados.Operaciones;

public class CalularIntegral 
{
	private int numSeg;
	private double w;
	private double x;
	private int dof;
	private double p = 0;

	public void calcularp() {
		int multiplicador;
		double xi = 0;
		
		calularW();
		
		for(int indice = 0; indice <= numSeg ;indice++){

			if(indice == 0 || indice == numSeg)
				multiplicador = 1;				
			else if(indice % 2 == 0)
				multiplicador = 2;	
			else
				multiplicador = 4;	
			
			p+=Operaciones.calcularFx(dof,xi)*multiplicador*(w/3);
			xi += w;
		}
	}
	
	private void calularW() {
		w=x/numSeg;
	}

	public void setNumSeg(int numSeg) {
		if(numSeg % 2 ==0)
		{
			this.numSeg = numSeg;
		}
		else
		{
			System.out.println("el numero de segundos debe ser par");
			System.exit(0);
		}
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setDof(int dof) {
		this.dof = dof;
	}

	public double getP() {
		return p;
	}
    	
}
