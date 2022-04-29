package pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static void main(String[] args) throws IOException {
		String filePath="D:\\empdetails.xlsx"; //set the location
		FileInputStream inputStream=new FileInputStream(filePath);//to open the file
		XSSFWorkbook workbook=new XSSFWorkbook(inputStream);//get the workbook from the file
		XSSFSheet sheet=workbook.getSheetAt(0);//get the sheet from the workbook
		
		//using Iterator
		//----------------
		
		/*Iterator iterator=sheet.iterator();//it will returns all the rows
		while(iterator.hasNext())//it checks iterator having another record or not
		{
			XSSFRow row=(XSSFRow) iterator.next();//return the first row
			Iterator cellIterator=row.cellIterator();//it will returns all cells
			while(cellIterator.hasNext())//it checks all the cells
			{
				XSSFCell cell=(XSSFCell) cellIterator.next();//it returns the cell
				switch(cell.getCellType())//return the type of the cell
				{
					case STRING:
					System.out.print(cell.getStringCellValue());
					break;
					case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
					case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				}
				System.out.print(" | ");
			}
		System.out.println();
		}*/
		
		//using for loop
		//----------------------
		
		int rows=sheet.getLastRowNum();//return the last row
		int column=sheet.getRow(1).getLastCellNum();//return the no of cells in that particular row
		
		for(int r=0;r<rows;r++)
		{
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<column;c++)
			{
				XSSFCell cell=row.getCell(c);
				switch(cell.getCellType())//return the type of the cell
				{
					case STRING:
					System.out.print(cell.getStringCellValue());
					break;
					case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
					case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
		
	}

}
