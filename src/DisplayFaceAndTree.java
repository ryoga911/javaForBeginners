
public class DisplayFaceAndTree extends MyFrame {
	public void run() {
		Face face1=new Face(50,50,10,5);
		tree tree1=new tree(200,100,-10,-5);
		for (int i=0 ;i<30; i++) {
			clear();
			face1.draw(this);
			face1.draw(this);
			face1.move();
			face1.move();
			sleep(0.1);
		}
	}

}
