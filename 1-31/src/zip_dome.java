import java.util.zip.*;
import java.io.*;
public class zip_dome {
	public static void main(String[] args) {
		zip_dome z = new zip_dome();
		try {
			System.out.println("kkkkloading...");
			z.zip("E:/dome.zip",new File("E:/dome"));
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	private void zip(String zipFileName,File inputFile) throws Exception{
		System.out.println("loading...");
		ZipOutputStream out = new ZipOutputStream(
				new FileOutputStream(zipFileName));
		zip(out,inputFile,"");
		System.out.println("loading...");
		out.close();
	}
	private void zip(ZipOutputStream out,File f,String base)throws Exception
	{
		if(f.isDirectory()) {
			File[] fl = f.listFiles();
			out.putNextEntry(new ZipEntry(base + "/"));
			base = base.length() == 0?"":base + "/";
			System.out.print(base);
			for(int i = 0;i<fl.length;i++) {
				zip(out,fl[i],base + fl[i]);
			}
		}
		else {
			out.putNextEntry(new ZipEntry(base));
			FileInputStream in = new FileInputStream(f);
			byte byt[] = new byte[1024];
			int len = in.read(byt);
			System.out.println(new String(byt,0,len));
			int b ;
			System.out.println("qqqqqq");
			System.out.println(base);
			while((b = in.read())!=-1) {
				out.write(b);
			}
			System.out.println("gggg");
			in.close();
		}
	}
}
