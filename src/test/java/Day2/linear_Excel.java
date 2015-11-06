package Day2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class linear_Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//excel connection
		FileInputStream fis= new FileInputStream("D:\\Age.xls");
		
		//workbook object
		HSSFWorkbook wb= new HSSFWorkbook(fis);
		
		//sheet object
		HSSFSheet Sheet = wb.getSheet("Sheet1");
		//get the row count
		int lastRowNum = Sheet.getLastRowNum();
		System.out.println(lastRowNum);
		
		for(int i=1;i<=lastRowNum;i++)
		{
			
			HSSFCell cell = Sheet.getRow(i).getCell(1);
			
			String celltext=null;
			
			if(cell==null)
			celltext="";
			
			else if(cell.getCellType()==cell.CELL_TYPE_STRING)
			celltext=cell.getStringCellValue();
			
			else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC)
			celltext=String.valueOf(cell.getNumericCellValue());
			
			else if(cell.getCellType()==cell.CELL_TYPE_BLANK)
			celltext="";
			
			//writing the cell
			HSSFCell writecell = Sheet.getRow(i).getCell(2);
			if(writecell==null)
			{
				writecell=Sheet.getRow(i).createCell(2);
			}
			
			//convert from string to double
			
			double Age=Double.parseDouble(celltext);
			System.out.println(Age);
			
			if(Age>18)
			{
				writecell.setCellValue("Major");
			}
			else
			{
				writecell.setCellValue("Minor");
			}
			
			
		}//end of for loop
		
		fis.close();
		
		
		FileOutputStream fos= new FileOutputStream("D:\\Age.xls");		
		wb.write(fos);
		fos.close();	
		

	}
	

}
