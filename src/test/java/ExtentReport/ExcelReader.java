package ExtentReport;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	    private static DataFormatter dataFormatter = new DataFormatter();
	    private static Logger logger = Logger.getLogger(ExcelReader.class.getName());

	    public static Object[][] readData(String excelPath, String sheetName) {
	        List<Object[]> excelData = new ArrayList<>();
	        try (FileInputStream fis = new FileInputStream(excelPath)) {
	            XSSFWorkbook workbook = new XSSFWorkbook(fis);
	            XSSFSheet sheet = workbook.getSheet(sheetName);
	            if (sheet == null) {
	                throw new IllegalArgumentException("Sheet not found: " + sheetName);
	            }

	            Map<Integer, String> columnHeaders = getColumnHeaders(sheet);
	            int numRows = sheet.getLastRowNum();
	            for (int i = 1; i <= numRows; i++) {
	                Map<String, String> rowData = getRowData(sheet, i, columnHeaders);
	                excelData.add(new Object[] { rowData });
	            }
	        } catch (IOException e) {
	            logger.warning(e.getMessage());
	        }
	        return excelData.toArray(new Object[0][]);
	    }

	    private static Map<Integer, String> getColumnHeaders(XSSFSheet sheet) {
	        XSSFRow headerRow = sheet.getRow(0);
	        if (headerRow == null) {
	            return new HashMap<>();
	        }

	        int numCells = headerRow.getLastCellNum();
	        Map<Integer, String> columnHeaders = new HashMap<>();
	        for (int i = 0; i < numCells; i++) {
	            String header = dataFormatter.formatCellValue(headerRow.getCell(i));
	            columnHeaders.put(i, header);
	        }
	        return columnHeaders;
	    }

	    private static Map<String, String> getRowData(XSSFSheet sheet, int rowIndex, Map<Integer, String> columnHeaders) {
	        XSSFRow row = sheet.getRow(rowIndex);
	        if (row == null) {
	            return new HashMap<>();
	        }

	        Map<String, String> rowData = new HashMap<>();
	        int numCells = row.getLastCellNum();
	        for (int i = 0; i < numCells; i++) {
	            String header = columnHeaders.get(i);
	            String value = dataFormatter.formatCellValue(row.getCell(i));
	            rowData.put(header, value);
	        }
	        return rowData;
	    }
	    
	    public static void main(String[] args)
	    {
	    	readData("C:\\Users\\savita.dighade\\Desktop\\Doc\\TestData(1)", "Sheet1");
	    	
	    }
	}



