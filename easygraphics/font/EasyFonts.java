package andeditor.lib.easygraphics.font;

import java.awt.GraphicsEnvironment;

public class EasyFonts 
{
	public static void getAllFonts()
	{
		String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		String data = "";
		int a = fonts.length;
		for (int i = 0; i < a; i++)
		{
			data += fonts[i] + ",\n";
		}
		System.out.println(data);
	}
}