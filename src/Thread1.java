
public class Thread1 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Thread1 Running");
			System.out.println("My Name = "+this.getName()+"My Priority"+this.getPriority());
		}
	}

}
