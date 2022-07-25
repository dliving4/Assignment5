public class HolidayBonus {

	/**
	 * Calculates the holiday bonus for each store
	 * @param data array of type double
	 * @param double high
	 * @param double low
	 * @param double other
	 * @return result
	 */
	public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other) {
		
		double result[] = new double[data.length];
		double lowest = -1;
		int lowIndex = -1;
		double highest = -1;
		int highIndex = -1;

		
		for (int i = 0; i < data.length; i++) {
			
			double total = 0;
			
			for (int k = 0; k < data[i].length; k++) {
				total += data[i][k];
			}

			if (lowest == -1 || total < lowest) {
				lowest = total;
				lowIndex = i;
			}
			if (highest == -1 || highest < total) {
				highest = total;
				highIndex = i;
			}
		}
		for (int i = 0; i < data.length; i++) {
			if (i == lowIndex) {
				result[i] = low;
				continue;
			}
			if (i == highIndex) {
				result[i] = high;
				continue;
			}

			result[i] = other;
		}

		return result;
	}
	
	/**
	 * Calculates the total holiday bonuses
	 * @param data, array of type double
	 * @param double high
	 * @param double low
	 * @param double other
	 * @return total
	 */
	public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other) {
		
		double total = 0;
		double bonus[] = HolidayBonus.calculateHolidayBonus(data, high, low, 0);

		for (int i = 0; i < bonus.length; i++) {
			total += bonus[i];
		}

		return total;
	}
	
	
}
