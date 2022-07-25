import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;


/**
 * 
 * @author Dylan Livingstone
 *
 */
public class TwoDimRaggedArrayUtility {
	
	/**
	 * Returns the average of the elements in the two dimensional array
	 * @param an array of type double
	 * @return average of the array
	 */
	static double getAverage(double[][] data) {
		
		int count = 0;
		double total = 0;

		for (int i = 0; i < data.length; i++) {
			for (int k = 0; k < data[i].length; k++) {
				total += data[i][k];
				count++;
			}
		}

		return total / count;
	}
	
	/**
	 * Returns the total of the selected column in the two dimensional array index 0 refers to the first column.
	 * @param data, array of type double
	 * @param col, the column you want to get the total of
	 * @return total
	 */
	static double getColumnTotal(double[][] data, int col) {

		double total = 0;

		for (int i = 0; i < data.length; i++) {
			
			if (data[i].length <= col || col < 0) { continue; }
			
			total += data[i][data[i].length == 1 && col == 1 ? col-1 : col];
		}

		return total;
	}
	
	/**
	 * Returns the largest element in the two dimensional array
	 * @param data, array of type double
	 * @return highest
	 */
	static double getHighestInArray(double[][] data) {

		double highest = 0;

		for (int i = 0; i < data.length; i++) {
			for (int k = 0; k < data[i].length; k++) {
				double index = data[i][k];

				if (index > highest) { highest = index; }
			}
		}

		return highest;
	}
	/**
	 * Returns the largest element of the selected column in the two dimensional array index 0 refers to the first column.
	 * @param data, array of type double
	 * @param column that you want to find the highest in
	 * @return highest
	 */
	static double getHighestInColumn(double[][] data, int col) {

		double highest = 0;

		for (int i = 0; i < data.length; i++) {

			if (data[i].length <= col || col < 0) { continue; }
			if (data[i][col] > highest) { highest = data[i][col]; }
		}

		return highest;
	}
	
	/**
	 * Returns index of the largest element of the selected column in the two dimensional array index 0 refers to the first column.
	 * @param data, array of type double
	 * @param int column
	 * @return index
	 */
	static int getHighestInColumnIndex(double[][] data, int col) {

		double highest = 0;
		int index = 0;

		for (int i = 0; i < data.length; i++) {

			if (data[i].length <= col || col < 0) { continue; }
			if (data[i][col] > highest) {
				highest = data[i][col];
				index = i;
			}
		}

		return index;
	}
	
	/**
	 * Returns the largest element of the selected row in the two dimensional array index 0 refers to the first row.
	 * @param array of type double
	 * @param int row
	 * @return highest
	 */
	static double getHighestInRow(double[][] data, int row) {

		if (data.length < row || row < 0) { return 0; }

		double highest = 0;

		for (int i = 0; i < data[row].length; i++) {

			if (data[row][i] > highest) { highest = data[row][i]; }
		}

		return highest;
	}
	
	/**
	 * Returns the largest element of the selected row in the two dimensional array index 0 refers to the first row.
	 * @param array of type double
	 * @param int row
	 * @return index
	 */
	static int getHighestInRowIndex(double[][] data, int row) {

		if (data.length < row || row < 0) { return 0; }

		double highest = 0;
		int index = 0;

		for (int i = 0; i < data[row].length; i++) {
			if (data[row][i] > highest) {
				highest = data[row][i];
				index = i;
			}
		}

		return index;
	}
	
	/**
	 * Returns the smallest element in the two dimensional array
	 * @param data, array of type double
	 * @return lowest
	 */
	static double getLowestInArray(double[][] data) {

		double lowest = 0;

		for (int i = 0; i < data.length; i++) {
			for (int k = 0; k < data[i].length; k++) {
				if (lowest == 0 || data[i][k] < lowest) { lowest = data[i][k]; }
			}
		}

		return lowest;
	}
	
	/**
	 * Returns the smallest element of the selected column in the two dimensional array index 0 refers to the first column.
	 * @param data, array of type double
	 * @param int column 
	 * @return lowest
	 */
	static double getLowestInColumn(double[][] data, int col) {

		double lowest = 0;

		for (int i = 0; i < data.length; i++) {

			if (data[i].length <= col || col < 0) { continue; }
			if (lowest == 0 || data[i][col] < lowest) { lowest = data[i][col]; }
		}

		return lowest;
	}
	
	/**
	 * Returns the index of the smallest element of the selected column in the two dimensional array index 0 refers to the first column.
	 * @param data, array of type double
	 * @param int column
	 * @return index
	 */
	static int getLowestInColumnIndex(double[][] data, int col) {

		double lowest = 0;
		int index = 0;

		for (int i = 0; i < data.length; i++) {

			if (data[i].length <= col || col < 0) { continue; }
			if (lowest == 0 || data[i][col] < lowest) {
				lowest = data[i][col];
				index = i;
			}
		}

		return index;
	}
	
	/**
	 * Returns the smallest element of the selected row in the two dimensional array index 0 refers to the first row.
	 * @param data, array of type double
	 * @param int row
	 * @return lowest
	 */
	static double getLowestInRow(double[][] data, int row) {

		if (data.length < row || row < 0) { return 0; }

		double lowest = 0;

		for (int i = 0; i < data[row].length; i++) {
			if (lowest == 0 || data[row][i] < lowest) { lowest = data[row][i]; }
		}

		return lowest;
	}
	
	/**
	 * Returns the index of the smallest element of the selected row in the two dimensional array index 0 refers to the first row.
	 * @param data, array of type double
	 * @param int row
	 * @return index
	 */
	static int getLowestInRowIndex(double[][] data, int row) {

		if (data.length < row || row < 0) { return 0; }

		double lowest = 0;
		int index = 0;

		for (int i = 0; i < data[row].length; i++) {
			if (lowest == 0 || data[row][i] < lowest) {
				lowest = data[row][i];
				index = i;
			}
		}

		return index;
	}
	
	/**
	 * Returns the total of the selected row in the two dimensional array index 0 refers to the first row.
	 * @param data, array of type double
	 * @param int row
	 * @return total
	 */
	static double getRowTotal(double[][] data, int row) {

		double total = 0;

		for (int i = 0; i < data[row].length; i++) {
			total += data[row][i];
		}

		return total;
	}
	
	/**
	 * Returns the total of all the elements of the two dimensional array
	 * @param data, array of type double
	 * @return total
	 */
	static double getTotal(double[][] data) {

		double total = 0;

		for (int i = 0; i < data.length; i++) {
			for (int k = 0; k < data[i].length; k++) {
				total += data[i][k];
			}
		}

		return total;
	}
	
	
	/**
	 *  Reads from a file and returns a ragged array of doubles The maximum rows is 10 and the maximum columns for each 
	 *  row is 10 Each row in the file is separated by a new line Each element in the row is separated by a space 
	 *  Suggestion: You need to know how many rows and how many columns there are for each row to create a ragged array.
	 * @param File file
	 * @return array of double
	 * @throws FileNotFoundException
	 */
	static double[][] readFile(File file) throws FileNotFoundException {
		
		double data[][] = null;
		Scanner scan1, scan2;
		int rows = 0;
		int currentRow = 0;
		scan1 = new Scanner(file);

		while (scan1.hasNextLine()) { rows++; scan1.nextLine(); }
		scan1.close();

		data = new double[rows][];
		scan2 = new Scanner(file);

		while (scan2.hasNextLine()) {

			String line = scan2.nextLine();
			String cols[] = line.trim().split(" ");
			data[currentRow] = new double[cols.length];

			for (int i = 0; i < cols.length; i++) {
				data[currentRow][i] = Double.parseDouble(cols[i]);
			}
			currentRow++;
		}

		scan2.close();

		return data;
	}
	
	/**
	 * Writes the ragged array of doubles into the file.
	 * @param data, array of type double
	 * @param File outputFile
	 * @throws FileNotFoundException
	 */
	static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException {

		 PrintWriter output = new PrintWriter(outputFile);
		 StringBuilder string = new StringBuilder();
		    
		 for (int i = 0;i < data.length;i++) {
		      for (int k = 0;k < data[i].length;k++) {
		        string.append(data[i][k]+ " ");
		      }
		      string.append("\n");
		    }
		    output.print(string.toString());
		    output.close();
		  }
}
