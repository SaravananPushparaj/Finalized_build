package lp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlGroups;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class driver {
	
	
	public static void main(String[] args) throws IOException {
		
	
		XmlSuite suite = new XmlSuite();
		suite.setName("Suite1");
		 
		XmlTest test = new XmlTest(suite);
		test.setName("test1");
		
		List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass("lp.Scenario_Login"));

		ExcelReadWrite x= new ExcelReadWrite("D:\\Test_Data_Book.xls");
		HSSFSheet Control_sheet = x.Setsheet("Control_Sheet");
		int ctrl_Rowcount = x.getrowcount(Control_sheet);
		
		for(int ctrl_i=1;ctrl_i<=ctrl_Rowcount;ctrl_i++)
		{
			if(x.Readvalue(Control_sheet, ctrl_i, "Execute").equalsIgnoreCase("Y"))
			{
				
				test.addIncludedGroup(x.Readvalue(Control_sheet, ctrl_i, "Groups").trim());
			}
			
		}


		test.setXmlClasses(classes) ;

		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.run();

}}