public class investment{
	public float a;
	public float r;
	investment(float a, float r){
		this.a=a;
		this.r=r;
	}
	public float getReturnPercentage(){
		return 100*r/a;
	}
	
	public static void main(String args[]){
		investment sortetInvestments[]=new investment[4];
		sortetInvestments[0]=new investment(2000,400);
		sortetInvestments[1]=new investment(3000,300);
		sortetInvestments[2]=new investment(900,90);
		sortetInvestments[3]=new investment(80,4);
		
		System.out.println(invest(5000,sortetInvestments,sortetInvestments.length));
	}
	public static float invest(float totalAmount, investment sortedInvestment[],int investmentNum){
		float totalReturns=0;
		int i=0;
		while(totalAmount>=sortedInvestment[investmentNum-1].a){
			int quotient=0;
			if(totalAmount>=sortedInvestment[i].a){
				quotient=(int)Math.floor(totalAmount/sortedInvestment[i].a);
				totalReturns=totalReturns+sortedInvestment[i].r*quotient;
				totalAmount=totalAmount-sortedInvestment[i].a*quotient;
			}
			else{
				if(i<investmentNum)
					i++;
			}
		}
		
		return totalReturns;
	}
}