package contro;

public class ForEach {

	public static void main(String[] args) {
int a[]={1,2,3,4,5,6,7};
int sum=0;
for(int x : a){
	sum=sum+x;
	if(x==4){
		break;
	}
}
System.out.println("the sum is " +sum);
	}

}
