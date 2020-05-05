package Moni;

public class Constructor {
 
	public static void main(String[] args) {
		Cube C = new Cube();
		System.out.println(C.getCubeVolume());
		
		Cube C1 = new Cube(50,40,10);
		System.out.println(C1.getCubeVolume());
		
	}

}
