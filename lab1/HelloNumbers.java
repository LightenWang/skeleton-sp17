public class HelloNumbers {
	public static void main(String[] args) {
		// int i = 0;
		// while (i < 10) {
		// 	System.out.println(i);
		// 	i = i + 1;
		// }


		/*
		 * Exercise1.1.2;
		 * prints out the cumulative sum of the integers from 0 to 9.          
		*/
		int num = 0;
		int cumulativeSum = 0;
		while (num < 10) {
			cumulativeSum += num;
			System.out.print(cumulativeSum + " ");
			num++;
		}
		System.out.println();
	}
}

/*
1. Before Java variables can be used, they must be declared
2. Java variables must have a specific type.
3. Java variables types can never change.
4. Types are verified before the code even runs.
*/