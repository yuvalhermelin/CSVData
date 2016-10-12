/***
 * A class to read/write numerical CSV files and allow easy access
 * 
 * @author yuvalhermelin
 *
 */
public class CSVData {
	private double[][] data;
	private String[] columnNames;

	public static CSVData readCSVFile(String fileName, int numLinesToIgnore, String[] columnNames) {
		return null;
	}

	public static CSVData readCSVFile(String fileName, int numLinesToIgnore) {
		return null;
	}

	public double[] getRow(int rowIndex) {
		return data[rowIndex];
	}

	public double[] getColumn(int collumIndex) {
		return null;
	}

	public double[][] getRows(int[] rowIndexes) {
		return null;
	}

	public double[][] getColumns(int[] ColumnIndexes) {
		return null;
	}

	public void setIndividualValue(int row, int column, double value) {

	}

	public void setRow(int row, double[] rowValues) {

	}

	public void setColumn(int column, double[] columnValues) {

	}

	public String[] getTitlesColumns() {
		return null;
	}

	public void saveCurrentState() {

	}

}
