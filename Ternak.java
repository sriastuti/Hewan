public class Ternak extends Hewan{
	
	public int kaki;

	public Ternak(String makan, int kaki){
		super(makan);		
		this.kaki = kaki;
	}

	public Ternak(String makan){
		super(makan);
	}


	public void showKaki(){
		System.out.println("Punya kaki "+kaki);
	}

}