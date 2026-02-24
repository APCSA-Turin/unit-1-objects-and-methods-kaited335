public class Payroll {
  private int[] itemsSold; // number of items sold by each employee
  private double[] wages; // wages to be computed in part (b)
  
  
  public Payroll(int[] items) {
    itemsSold = items;
    wages = new double[items.length];
  }
    public double[] getWages() {
    return wages;
}

 
  /*  Returns the bonus threshold as described in part (a).
   */
  public double computeBonusThreshold() {
    double average = 0.0;
	int min = itemsSold[0];
	int max = itemsSold[0];
	for (int items : itemsSold) {
		if (items < min) {
			min = items;
}
if (items > max) {
			max = items;
}
average += items;
	}
	average = average - min - max;
	average = average / (itemsSold.length - 2);
	return average;

  }
 
  /* Computes employee wages as described in part (b) and stores
     them in wages. The parameter fixedWage represents the fixed
     amount each employee is paid per day. The parameter
     perItemWage represents the amount each employee is paid per
     item sold.
   */
  public void computeWages(double fixedWage, double perItemWage) {
    for (int i = 0; i < itemsSold.length; i++) {
		if (itemsSold[i] > computeBonusThreshold()) {
			wages[i] = (fixedWage + (perItemWage * itemsSold[i])) * 1.1;
} else {
	wages[i] = (fixedWage + (perItemWage * itemsSold[i]));
}
}

  }
}

