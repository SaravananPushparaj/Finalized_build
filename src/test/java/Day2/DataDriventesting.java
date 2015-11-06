package Day2;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;

public class DataDriventesting {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		App1 a1= new App1();
		a1.launch();		
		
		App2 a2=new App2();
		a2.launch();
				
		//Readin the inputs
		ExcelReadWrite x=new ExcelReadWrite("D:\\Testing_emi.xls");
		HSSFSheet Sheet = x.Setsheet("Sheet1");
		int Rowcount = x.getrowcount(Sheet);
		
		for(int i=1;i<=Rowcount;i++)
		{
			String Amount = x.Readvalue(Sheet, i, 0).replace(".0", "");
			String Interest = x.Readvalue(Sheet, i, 1).replace(".0", "");
			String Tenure = x.Readvalue(Sheet, i, 2).replace(".0", "");
			
			String EMI1 = a1.ExtractEMI(Amount, Interest, Tenure);
			EMI1 = EMI1.replace("$", "");
			EMI1 = EMI1.replace(",", "");
			
			double EMI1_Result=Double.parseDouble(EMI1);
			x.writecell(Sheet, i, 3, EMI1);
			
			String EMI2 = a2.ExtractEMI(Amount, Interest, Tenure);
			double EMI2_Result=Double.parseDouble(EMI2);
			x.writecell(Sheet, i, 4, EMI2);
			
			
			if(EMI1_Result==EMI2_Result)
			{
				x.writecell(Sheet, i, 5, "Pass");
			}
			else
			{
				x.writecell(Sheet, i, 5, "Fail");
			}
			
					
			
		}//end of for loop
		
		x.save_excel("D:\\Testing_emi.xls");
		
		a1.Appclose();
		a2.Appclose();

	}//end of main

}//end of class
