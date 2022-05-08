import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class NewApplet extends Applet {

  public void paint(Graphics g) {
    String myFont = getParameter("font");
    String myString = getParameter("string");
    int mySize = Integer.parseInt(getParameter("size"));

    Font f = new Font(myFont, Font.PLAIN, mySize);
    g.setFont(f);
    g.setColor(Color.BLUE);
    g.drawString(myString, 10, 50); //cột, hàng
  }

}
