class practice {
	public static void main(String[] args) {
		int arr[]= {2,4,-2,9,8,-2,-1,6};
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=i;j++) {
				int sum=0;
				for(int k=j;k<=i;k++) {
//					System.out.print(arr[k]+" ");
					sum+=arr[k];
				}
				if(max<sum) {
					max=sum;
				}
//				System.out.println();
			}
			
		}
		System.out.println(max);
	}

}
