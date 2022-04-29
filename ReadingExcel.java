package pack1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.*;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		String filePath="D:\\empdetails.xlsx"; //location
		FileInputStream inputstream=new FileInputStream(filePath); //open that file
		XSSFWorkbook workbook=new XSSFWorkbook(inputstream); //get the workbook
		//XSSFSheet sheet=workbook.getSheet("sheet1");
		XSSFSheet sheet=workbook.getSheetAt(0); //get the sheet
		
		/*int rows=sheet.getLastRowNum(); //know how many rows 
		int column=sheet.getRow(1).getLastCellNum(); //how many column
		
		for(int r=0;r<rows;r++) 
		{
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<column;c++)
			{
				XSSFCell cell=row.getCell(c);
				
				switch(cell.getCellType())
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
		} */
		
		//using iterator
		
		Iterator iterator=sheet.rowIterator();
		while(iterator.hasNext())
		{
			XSSFRow row=(XSSFRow) iterator.next();
			
			Iterator cellIterator=row.cellIterator();
			while(cellIterator.hasNext());
			{
				XSSFCell cell=(XSSFCell) cellIterator.next();
			
						
						switch(cell.getCellType())
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
