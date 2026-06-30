package interviewBasedJavaProgramming;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class General006_DDTWriteAndReadFromExcelFile {
	public static void main(String[] args) throws IOException, InvalidFormatException {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
            File file = new File("./TestData/ExcelFile.xlsx");
            file.createNewFile();
            
        Workbook book  = WorkbookFactory.create(true);// true means new excel workbook create kro with xlssx extension
                                                     //false means new excel workbook create kro with xlsx extension old version of excel
                                                    // Read krte time esme file ka path pass krna hota hai b/z excelworkbook already created hota hai
            Sheet sheet = book .createSheet("Sheet1");
            
            for (int i = 0; i <list.size(); i++) {
				Row row = sheet.createRow(i);
				for (int j = 0; j <1; j++) {
					Cell cell = row.createCell(j++);
					cell.setCellValue(list.get(i));
					
				}
			}
           FileOutputStream fos = new FileOutputStream(file);
           book .write(fos); 
           
 //----------------------------Read----------------------------------
           FileInputStream fis =  new FileInputStream(file);
           Workbook book1 = WorkbookFactory.create(fis);
           Sheet sheet1 = book1.getSheet("Sheet1");
           
           for (int i = 0; i <=sheet1.getLastRowNum(); i++) {
        	   String value = sheet1.getRow(i).getCell(0).toString();
        	   System.out.println(value);
		}		  
	}
}
