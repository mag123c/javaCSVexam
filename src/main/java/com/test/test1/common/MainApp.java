package com.test.test1.common;

import java.util.List;

public class MainApp {
	
	private int length;
	private List<ExcelVo> contains;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public List<ExcelVo> excelRead() {
		ExcelRead excelRead = new ExcelRead();        
//        System.out.println("*****xls*****");
//        List<ExcelVo> xlsList = excelRead.xlsToExcelVoList("C:\\excel\\test.xls");
//        printList(xlsList);
        System.out.println("*****xlsx*****");
        List<ExcelVo> xlsxList = excelRead.xlsxToExcelVoList("C:\\excel\\test.xlsx");
        contains = xlsxList; 
        length = xlsxList.size();
        printList(xlsxList);
        return xlsxList;
	}
	
	public void excelWrite(List<ExcelVo> list) {
        
        ExcelWrite excelWrite = new ExcelWrite();
//        //xls 파일 쓰기
//        excelWrite.xlsWiter(list);        
        //xlsx 파일 쓰기
        excelWrite.xlsxWiter(list, contains);  
	}
    
//    public static void main(String[] args) {
//        
//        ExcelRead excelRead = new ExcelRead();
//        
//        System.out.println("*****xls*****");
//        List<ExcelVo> xlsList = excelRead.xlsToExcelVoList("C:\\excel\\test.xls");
//        printList(xlsList);
//        
//        System.out.println("*****xlsx*****");
//        List<ExcelVo> xlsxList = excelRead.xlsxToExcelVoList("C:\\excel\\test.xlsx");
//        printList(xlsxList);
//        
//        /******************************************************************************/
//        // 엑셀로 쓸 데이터 생성            
//        List<ExcelVo> list = new ArrayList<ExcelVo>();
//        list.add(new ExcelVo("asdf1", "사용자1", "30", "asdf1@naver.com"));
//        list.add(new ExcelVo("asdf2", "사용자2", "31", "asdf2@naver.com"));
//        
//        ExcelWrite excelWrite = new ExcelWrite();
//        //xls 파일 쓰기
//        excelWrite.xlsWiter(list);        
//        //xlsx 파일 쓰기
//        excelWrite.xlsxWiter(list);  
//    }
    
    public static void printList(List<ExcelVo> list) {
        ExcelVo vo;
        
        for (int i = 0; i < list.size(); i++) {
            vo = list.get(i);
            System.out.println(vo.toString());
        }
    }
    
}
 
