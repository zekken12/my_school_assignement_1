package assignment2;

public class mark {
public int mark;	

public mark(int mark){
	this.mark=mark;
}

	
	public int getmark() {
	    return mark;
	}
	public void setmark(int mark) {
	    this.mark = mark;
	}
	
	public void pass() {
	    if (mark>=40) {
	    	System.out.println("The student passes");
	    }
	    else  {
	    	System.out.println("The student fails");
	    }

	
}
	
}
