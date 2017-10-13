package chenFatmp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import chenFatmp.result;

@SuppressWarnings("all")
public class Admin {

	public void chengFa() {
		List result = new ArrayList();
		  for(int i=1;i<=9;i++){
			   for(int j=1;j<=i;j++){
			    System.out.print(j+"*"+i+"="+i*j+"\t"); 
				result.add(j + "*" + i + "=" + i * j + "	");
			}
			System.out.println();
			result.add("\r\n");
		}

		File f = new File("d:/b.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(f);
			for (int i = 0; i < result.size(); i++) {
				fw.write(String.valueOf(result.get(i)));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.flush();
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}