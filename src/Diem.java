
public class Diem {
	
	private int x;
	private int y;

//	Constructor khong tham so
	public Diem(){
		
	}
//	Consstructor co tham so
	public Diem(int x, int y) {
		this.x = x;
		this.y = y;
	}	
//	tinh khoang cach
	public double getDistance(int x, int y){
		return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y, 2));		
	}
	
	public double getDistance(Diem diem){
		return Math.sqrt(Math.pow(this.x-diem.getX(),2)+Math.pow(this.y-diem.getY(),2));
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "x = "+getX()+" ; y = "+getY();
	}
//	getter + setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
