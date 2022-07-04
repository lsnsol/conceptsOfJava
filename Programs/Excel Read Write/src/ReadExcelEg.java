
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import java.io.File;

public class ReadExcelEg {

    private static final String EXCEL_FILE_LOCATION = "./MyFirstExcel.xls";

    public static void main(String[] args) {

        Workbook workbook = null;
        try {

            workbook = Workbook.getWorkbook(new File(EXCEL_FILE_LOCATION));

            Sheet sheet = workbook.getSheet(0);
            Cell cell1 = sheet.getCell(0, 0);
            System.out.print(cell1.getContents() + ":");    // Test Count + :
            Cell cell2 = sheet.getCell(0, 1);
            System.out.println(cell2.getContents());        // 1

            Cell cell6 = sheet.getCell(0, 2);
            System.out.println(cell2.getContents());  
            
            Cell cell3 = sheet.getCell(1, 0);
            System.out.print(cell3.getContents() + ":");    // Result + :
            Cell cell4 = sheet.getCell(1, 1);
            System.out.println(cell4.getContents());        // Passed

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (workbook != null) {
                workbook.close();
            }

        }

    }

}
