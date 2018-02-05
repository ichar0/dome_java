import java.io.*;
import java.util.zip.*;
public class Stream_ {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File file = new File("e:/","dome.txt");
		if(file.exists()) {
			try {
			FileOutputStream out = new FileOutputStream(file); 
			DataOutputStream  ds = new DataOutputStream(out);
			ds.writeUTF("this is utf 写入！");
			ds.close();
			//System.out.println(file.getName());
			//byte test[] = "米姆迷惘与在木屋！".getBytes();
			//out.write(test);
			out.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			try {
				FileInputStream in = new FileInputStream(file);
				DataInputStream dis = new DataInputStream(in);
				System.out.println(dis.readUTF());
				//byte byt[] = new byte[1024];
				//int len = in.read(byt);
				//System.out.println(new String(byt,0,len));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		String content[] = {"字符串1","字符串2","字符串3"};
		File file2 = new File("D:/work.txt");
		if(!file2.exists()) {
			try {
			file2.createNewFile();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		try {
			FileWriter fw = new FileWriter(file2);
			BufferedWriter bufw = new BufferedWriter(fw);
			for(int i = 0;i<content.length;i++) {
				bufw.write(content[i]);
				bufw.newLine();
			}
			bufw.close();
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			FileReader fr = new FileReader(file2);
			BufferedReader bufr = new BufferedReader(fr);
			String s = null;
			int i = 0;
			while((s = bufr.readLine())!=null) {
				i++;
				System.out.println(s);
			}
			bufr.close();
			fr.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
//		if(file.exists()) {
//			file.delete();
//			System.out.println("the file had deleted!");
//		}
//		else {
//			try {
//				file.createNewFile();
//				System.out.println("the file had created!");
//			}
//			catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
		
		
	}

}
