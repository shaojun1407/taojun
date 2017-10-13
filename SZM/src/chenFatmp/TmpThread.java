package chenFatmp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Method;

import chenFatmp.result;
@SuppressWarnings("all")
public class TmpThread {

	public static void main(String[] args) throws IOException {

		Runnable runnable = new TmpRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
//固定路径
//		File out = new File("d:/b.txt");
//		FileOutputStream fos = new FileOutputStream(out);
//		 PrintStream ps = new PrintStream(fos);
//		 System.setOut(ps);
		 File f = new File("d:/b.txt");
		 FileWriter fw = null;
		 try {
		 fw = new FileWriter(f);
		 for (int i = 0; i <result.size(); i++) {
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



class TmpRunnable implements Runnable {

	@Override
	public void run() {
		Class<Admin> clazz = Admin.class;
		try {
			Method method = clazz.getDeclaredMethod("chengFa");
			Admin admin = clazz.newInstance();
			method.invoke(admin);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}