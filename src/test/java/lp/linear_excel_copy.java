package lp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class linear_excel_copy {

	public static void main(String[] args) throws IOException {
		
		ExcelReadWrite x=new ExcelReadWrite("D:\\Age.xls");
		HSSFSheet Sheet = x.Setsheet("Sheet1");
		int rowcount = x.getrowcount(Sheet);			
				
				for(int i=1;i<=rowcount;i++)
					{
					
					String celltext = x.Readvalue(Sheet, i, 1);
											
					//convert from string to double
					
					double Age=Double.parseDouble(celltext);
					System.out.println(Age);
					
					if(Age>18)
					{
						x.writecell(Sheet, i, 2, "Major");
					}
					else
					{
						x.writecell(Sheet, i, 2, "Minor");
					}
					
					
				}//end of for loop
				
				
				x.save_excel("D:\\Age.xls");
					
				


	}

}
