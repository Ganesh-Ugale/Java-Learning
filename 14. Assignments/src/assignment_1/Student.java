package assignment_1;

public class Student {
	float bi;
	float dl;
	float ml;
	float ai;
	float stqa;
	float csdf;
	float project;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(float bi, float dl, float ml, float ai, 
			float stqa, float csdf, float project) {
		super();
		this.bi = bi;
		this.dl = dl;
		this.ml = ml;
		this.ai = ai;
		this.stqa = stqa;
		this.csdf = csdf;
	}
	
	public float averageMarks(){
		return (bi + dl + ml + ai + stqa + csdf + project) / 7f;
	}
}
