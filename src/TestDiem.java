
public class TestDiem {
	
	public static void main(String[] args) {
		
//		Khoi tao 2 diem A va B theo 2 cach khac nhau 
		Diem diemA = new Diem();
		diemA.setX(5);
		diemA.setY(8);
		
		Diem diemB = new Diem(4,3);
		
//		test
		System.out.println("Diem A: "+diemA.toString());
		System.out.println("Diem B: "+diemB.toString());
		
		System.out.println("AB = "+diemA.getDistance(diemB.getX(), diemB.getY()));
		System.out.println("AB = "+diemA.getDistance(diemB));
	}
	
}
