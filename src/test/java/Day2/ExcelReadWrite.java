package Day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReadWrite {
	
	FileInputStream fis;
	HSSFWorkbook wb;
	
	
	public ExcelReadWrite(String xlPath) throws IOException
	{
		 fis= new FileInputStream(xlPath);
		
		//workbook object
		 wb= new HSSFWorkbook(fis);
		
	}
	
	
	public HSSFSheet Setsheet(String sheetname)
	{
		HSSFSheet Sheet = wb.getSheet(sheetname);
		return Sheet;
		
	}
	
	
	public int getrowcount(HSSFSheet Sheet)
	{
		int lastRowNum = Sheet.getLastRowNum();
		return lastRowNum;
		
	}
	
	public String Readvalue(HSSFSheet Sheet,int rowIndex, int cellnum)
	{
		HSSFCell cell = Sheet.getRow(rowIndex).getCell(cellnum);
		
		String celltext=null;
		
		if(cell==null)
		celltext="";
		
		else if(cell.getCellType()==cell.CELL_TYPE_STRING)
		celltext=cell.getStringCellValue();
		
		else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC)
		celltext=String.valueOf(cell.getNumericCellValue());
		
		else if(cell.getCellType()==cell.CELL_TYPE_BLANK)
		celltext="";
		
		return celltext;
	}
	
	public void writecell(HSSFSheet Sheet,int rowIndex,int cellnum, String wvalue )
	{
		//writing the cell
		HSSFCell writecell = Sheet.getRow(rowIndex).getCell(cellnum);
		if(writecell==null)
		{
			writecell=Sheet.getRow(rowIndex).createCell(cellnum);
		}
		
		writecell.setCellValue(wvalue);
	}
	
	
	public void save_excel(String xlPath) throws IOException
	{
		fis.close();
		
		FileOutputStream fos= new FileOutputStream(xlPath);		
		wb.write(fos);
		fos.close();
		
	}
	
	
	
	
	
	
	
	
	
	

}
