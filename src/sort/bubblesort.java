package sort;

public class bubblesort {

		public static void main(String[] args) {

			int ar[]={2,5,1,14,3,76,34,6,9,24};
			for(int i=0;i<10;i++){
				if(ar[i]<ar[i+1]){
					System.out.println("1");
					int temp=ar[i];
					ar[i]=temp;
				}
				else{
					System.out.println("2");
						int temp=ar[i+1];
						ar[i]=temp;
				}
			}
			System.out.println("Your bubble sort is "+ar);
			System.out.println(ar[1]);
		}

	}
