package test;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PicTest {
	public static int cut(BufferedImage bi)throws IOException {
		String u ="";
		System.out.println(bi.getWidth());
		System.out.println(bi.getHeight());
		for(int p=0;p<bi.getHeight();p++){
			for(int q=0;q<bi.getWidth();q++){
				if(String.valueOf(bi.getRGB(q, p)).equals("-16777216")){
					u += "1";
				}else{
					u += "0";
				}
				 
			}
			u += "\r\n";
		}
		System.out.println(u);
		String fileName = "f://newtemp2.txt";
		FileWriter writer = new FileWriter(fileName, true);
        writer.write(u);
        writer.close();
		
//      ImageIO.write(bi,"jpg",new File("d:/test1"+name+".gif"));
		return u.hashCode();
	}
	
	public static void main(String[] arg){
		Image image = null;
		File sourceimage = new File("f://7.png");  
		try {
			BufferedImage iis= ImageIO.read(sourceimage);
			cut(iis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
