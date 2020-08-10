import java.applet.Applet; //アプレットを使うにはこれが必要
import java.awt.*; //java.awt のすべてのクラスライブラリを参照

public class lec13_1 extends Applet //Applet クラスの継承 
{
public void paint(Graphics g) //Graphics クラスのオブジェクト g
{
g.drawLine(20,10,120,50);
g.drawString("同志社",20,95);
}
}