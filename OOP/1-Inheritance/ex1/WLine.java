public class WLine extends Line{

	private int width;

	public WLine(int length, int width){
		super(length);
		this.width=width;
	}

	public void draw(){
		for(int i=0;i<width;i++){
			super.draw();
			System.out.println("");
		}
		
	}
}