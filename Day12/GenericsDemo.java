package day12;

public class GenericsDemo {
	public static void main(String[] args) {
		//Paint paint1 = new RedPaint();
		//PaintBrush paintbrush = new PaintBrush();
		//paintbrush.paint = paint1;
		PaintContainer pc = new PaintContainer();
		pc.fun();
	}
}

class PaintContainer
{
	Paint paint1 = new BluePaint();
	PaintBrush paintbrush = new PaintBrush();
	//paintbrush.paint = this.paint1;
	public void fun()
	{
		paintbrush.paint = paint1;
		paintbrush.doPaint();
	}
}

abstract class Paint
{
	
}

class RedPaint extends Paint
{
	
}

class BluePaint extends Paint
{
	
}

class PaintBrush
{
	Paint paint;
	public void doPaint()
	{
		System.out.println(paint);
	}
}