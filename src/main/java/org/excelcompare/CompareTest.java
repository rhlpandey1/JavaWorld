/*
package org.excelcompare;

import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CompareTest {
    static String userDir = System.getProperty("user.dir");

    static String file1 = userDir + "/src/test/resources/abc.xlsx";
    static String file2 = userDir + "/src/test/resources/xyz.xlsx";
    static Xls_Reader cReader = new Xls_Reader(file1);
    static Xls_Reader rReader = new Xls_Reader(file2);
    String cSheetName = "Sheet1";
    String rSheetName = "Sheet1";
    String columnName ="serial_number";//"hostname";// "doc_number";
    Set<String> columnNames = new HashSet<String>();
    List<String> rList = new ArrayList<String>();
    List<String> cList = new ArrayList<String>();
    List<String> commonList = new ArrayList<String>();

    int rRowCount = rReader.getRowCount(rSheetName);
    int cRowCount = cReader.getRowCount(cSheetName);

    int cColumnCount = cReader.getColumnCount(cSheetName);


    public CompareTest() {
    }

    */
/***
     * Verifies the serial_no in both files.
     *
     *
     *//*


    public CompareTest(boolean workflow) {
        if (!workflow) {
            for (int i = 0; i < cColumnCount; i++) {
                String camsColumnName = cReader.getCellData(cSheetName, i, 1);
                columnNames.add(camsColumnName);
            }
        } else {
            columnNames.add("document_number");
        }
        for (int j = 0; j < rRowCount; j++) {
            String ramsData = rReader.getCellData(rSheetName, columnName, j);
            if (!ramsData.equalsIgnoreCase("N/A")) {
                rList.add(ramsData);
            }
        }
        for (int j = 0; j < cRowCount; j++) {
            String camsData = cReader.getCellData(cSheetName, columnName, j);
            if (!camsData.equalsIgnoreCase("N/A")) {
                cList.add(camsData);
            }
        }
        for (String temp : cList) {
            if (rList.contains(temp)) {
                commonList.add(temp);
            }
        }
        System.out.println("cams size :->" + cList.size() + " ramsSize :->" + rList.size() + " common :->" + commonList.size());
       */
/* camsList.removeAll(ramsList); //todo..
        System.out.println(camsList);*//*

      */
/*  for (int i = 2; i < camsList.size(); i++) {
           // xls_reader1.setCellData("MissingSerialNos", "serial_no", i, camsList.get(i));
        }*//*

        //todo...
        // Assert.assertTrue(camsList.size() > 0, " Serial_nos in cams not imported in RAMS Please check the difference in MissingSerialNos sheet ");

        if (cList.size() > 0) {
         //  System.exit(1);
        }
        System.out.println(" Exit of const");
    }

    public int getRowNum(String sheetName, String coulmnValue) {
        System.out.println("getRowNum() :->" + sheetName + " columnValue :->" + coulmnValue);
        int rowNumber = 0;
        System.out.println("Rams size :->" + rList.size());
        if (!coulmnValue.equalsIgnoreCase("N/A")) {
            */
/*int index = Collections.binarySearch(ramsList, coulmnValue);
            System.out.println(index);*//*

            int index=0;
            if(rList.contains(coulmnValue)){
                index= rList.indexOf(coulmnValue);
            }
                return index;
        }
        return rowNumber;
    }

    public void findDifference() {
        SoftAssert softAssert = new SoftAssert();
        for (int i = 2; i <= cRowCount; i++) {
            String hostname_cams = cReader.getCellData(cSheetName, columnName, i);
            if (!hostname_cams.equals("") && !hostname_cams.equalsIgnoreCase("N/A")) {
                if (rList.contains(hostname_cams)) {
                    int ramsRowNum = getRowNum(rSheetName, hostname_cams);
                    for (String colName : columnNames) {
                        String camsColumnValue = cReader.getCellData(cSheetName, colName, i);
                        String ramsColumnValue = rReader.getCellData(rSheetName, colName, ramsRowNum);
                        softAssert.assertEquals(camsColumnValue, ramsColumnValue, " cams Column Name:-> " + camsColumnValue + " Rams Column Name :->" + ramsColumnValue + " are not same for the cams row no :" + i + "rams row no =" + ramsRowNum);
                        //softAssert.assertEquals(camsColumnName, ramsColumnName, " Column not matching in CAMs row no:->" + i + " and RAMS row number " + ramsRowNum + " serial_no in CAMS is :->" + hostname_cams);
                    //    System.out.println("Column Name " + colName + "Cams Column Value " + camsColumnValue + " Rams column value " + ramsColumnValue + " ramsRow No " + ramsRowNum + " cams row " + i);
                        if (!camsColumnValue.equalsIgnoreCase(ramsColumnValue)) {
                            System.out.println("!!!!!!!!!!!!!! COLUMN_NAME ( " + colName + " ) CAMS_COLUMN_VALUE ( " + camsColumnValue + " ) RAMS_COLUMN_VALUE ( " + ramsColumnValue + " ) RAMS_ROW_NO ( " + ramsRowNum + " ) CAMS_ROW " + i);
                        }
                    }
                }
            } else {
                System.out.println("!!!!!!!!!!!! Serial no Row number " + i + " cams sheet is empty or N/A ");
            }
        }
        softAssert.assertAll();
    }

    public static void main(String args[]) {
        new CompareTest(Boolean.TRUE).findDifference();
    }


}
*/
