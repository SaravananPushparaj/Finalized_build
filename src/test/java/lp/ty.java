package lp;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;


public class ty {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ExcelReadWrite x= new ExcelReadWrite("D:\\Age.xls");
		HSSFSheet Sheet = x.Setsheet("Sheet1");
		int Rowcount = x.getrowcount(Sheet);
		System.out.println(Rowcount);
		for(int j=1;j<=Rowcount;j++)
		{
		String Age = x.Readvalue(Sheet, j, "Age");
		System.out.println(Age);
		
		

	}

	}
}
