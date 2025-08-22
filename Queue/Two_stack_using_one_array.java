
import java.util.*;

class twoStacks {
	int[] arr;
	int size;
	int s1, s2;

	// Constructor
	twoStacks(int n) {
		size = n;
		arr = new int[n];
		s1 = -1;
		s2 = n;
	}

	// Method to push an element x to stack1
	void push1(int x) {
		int size1 = s1 + 1;
		int size2 = size - s2;
		if (size1 + size2 < size) {
			arr[++s1] = x;
		}
	}

	// Method to push an element
	// x to stack2
	void push2(int x) {
		int size1 = s1 + 1;
		int size2 = size - s2;
		if (size1 + size2 < size) {
			arr[--s2] = x;
		}

	}

	// Method to pop an element from first stack
	void pop1() {
		if (s1 >= 0)
			System.out.println(arr[s1--]);
		else {
			System.out.println(-1);
		}
	}

	// Method to pop an element
	// from second stack
	void pop2() {
		if (s2 < size)
			System.out.println(arr[s2++]);

		else{
			System.out.println(-1);
		}
	}
};

public class Two_stack_using_one_array {

	/* Driver program to test twoStacks class */
	public static void main(String[] args) {
		twoStacks ts = new twoStacks(50);
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int temp;
			temp = sc.nextInt();
			if (temp == 1)
				ts.pop1();
			else if (temp == 3)
				ts.pop2();
			else if (temp == 2) {
				int temp2;
				temp2 = sc.nextInt();
				ts.push1(temp2);
			} else {
				int temp2;
				temp2 = sc.nextInt();
				ts.push2(temp2);
			}
		}
	}
}