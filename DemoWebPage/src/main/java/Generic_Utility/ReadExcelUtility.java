package Generic_Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelUtility {
	/**
	 * this method are used to fetch the single data from the excel sheet
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return 
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */
	public static String testData(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(Iconstant.excel_path);
		Workbook w = WorkbookFactory.create(fis);
		  Sheet s = w.getSheet(sheet);
		 Row r = s.getRow(row);
		 return r.getCell(cell).toString();
	}
/**
 * this method is used to return the row size in excel path
 * @param sheet
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	public static int rowSize (String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(Iconstant.excel_path);
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);
		return s.getPhysicalNumberOfRows();
	}
	/**
	 * this method used to return column size in excel sheet
	 * @param sheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static int cellSize (String sheet) throws EncryptedDocumentException, IOException  {
		FileInputStream fis = new FileInputStream(Iconstant.excel_path);
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);
	return s.getRow(0).getPhysicalNumberOfCells();
	}
	/**
	 * this method is used to fetch all data in the excel sheet
	 * @param sheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static Object[][]fetchAllData(String sheet) throws EncryptedDocumentException, IOException{
	FileInputStream fis = new FileInputStream(Iconstant.excel_path);
	Workbook w = WorkbookFactory.create(fis);
	Sheet s = w.getSheet(sheet);
	int rowsize = s.getPhysicalNumberOfRows();
	int cellsize = s.getRow(0).getPhysicalNumberOfCells();
	Object[][] d = new Object[rowsize][cellsize];
	for(int i=0; i< rowsize; i++) {
		for (int j=0; j< cellsize; j++) {
			d[i][j]=s.getRow(i).getCell(j).toString();
			
		}
	}
	return d;
	}
	
}
