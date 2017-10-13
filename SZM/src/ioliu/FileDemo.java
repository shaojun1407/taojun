package ioliu;
import java.io.File;
public class FileDemo {

	public static void main(String[] args) {
		java.io.File f = new java.io.File("E:\\1.txt");
		File f2=new File("D:\\Teacher\\tao\\SZM\\src\\ioliu");
		File f3=new File("D:\\Teacher\\tao\\SZM\\src\\ioliu\\FileDemo.java");
		if (f.exists()) {
			f.delete();
		} else
			try {
				f.createNewFile();

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		// getName()方法，取得文件名
		System.out.println("文件名: " + f.getName());
		System.out.println("文件名: " + f2.getName());
		System.out.println("文件名: " + f3.getName());
		// getPath()方法，取得文件路径
		System.out.println("文件路径:" + f.getPath());
		System.out.println("文件路径:" + f2.getPath());
		System.out.println("文件路径:" + f3.getPath());
		// getAbsolutePath()方法，取得绝对路径名
		System.out.println("绝对路径:" + f.getAbsolutePath());
		// getParent()方法，得到父文件夹名
		System.out.println("父文件夹名:" + f.getParent());
		System.out.println("父文件夹名:" + f2.getParent());
		System.out.println("父文件夹名:" + f3.getParent());
		// exists(),判断文件是否存在
		System.out.println(f.exists() ? "文件存在" : "文件不存在");
		System.out.println(f2.exists() ? "文件存在" : "文件不存在");
		System.out.println(f3.exists() ? "文件存在" : "文件不存在");
		// canWrite(),判断文件是否可写
		System.out.println(f.canWrite() ? "文件可写" : "文件不可写");
		// canRead(),判断文件是否可读
		System.out.println(f3.canRead() ? "文件可读" : "文件不可读");
		// isDirectory(),判断是否是目录
		System.out.println(f.isDirectory() ? "是" : "不是" + "目录");
		// isFile(),是否是文件
		System.out.println(f.isFile() ? "是文件" : "不是文件");
		System.out.println(f3.isFile() ? "是文件" : "不是文件");
		// isAbsolute(),是否是绝对路径
		System.out.println(f.isAbsolute() ? "是绝对路径" : "不是绝对路径");
		// lastModified(),文件最后的修改时间
		System.out.println("文件最后修改时间:" + f.lastModified());
		// length(),文件的长度
		System.out.println("文件大小:" + f.length() + "Bytes");
		System.out.println("文件大小:" + f2.length() + "Bytes");
		System.out.println("文件大小:" + f3.length() + "Bytes");
	}

}
