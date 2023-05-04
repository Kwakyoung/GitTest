package pack03.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex03_Text {
	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("D:\\\\Study_Java\\\\WorkSpace\\\\12.IO_FileTest\\Ex03_Text.txt");
			writer.write("KYGasdf");  // 내용 수정시 기존내용은 저장안됌
			writer.flush();  // flush가 있으면 out
			writer.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
