package priorityQueueandHeaps;

import java.util.ArrayList;

/*
 * In priority queue, it does work on the basis of FIFO but priority/
 * Max priority and min priority queue
 * 
 * Used in problems where we need to find min/max element
 * 
 * Lets see how we can implement PQ 3 methods:
 * 1. GetMin()
 * 2. RemoveMin()
 * 3. Insert
 * 
 * 	Ways to implement PQ:
 * 
 * 
 * 					 |	getMin			|	removeMin				| Insert
 * 	--------------------------------------------------------------------------
 *	Array - unsorted |	O(n)			|	O(n)					| O(1)
 *	Array - sorted	 |	O(1)			|	O(n) bcz shifting req	| O(n)
 *	LL - unsorted	 |	O(n)			|	O(n)					| O(1)
 *	LL - sorted		 | 	O(1)			|	O(1)					| O(n)
 *	Stack			 |	O(n)			|	O(n)					| O(1)
 *	BST			 	 |	O(log n)		|   O(log n)				| O(log n)
 *  Hashmap          |  O(n)            |   O(n)                    | O(1)
 *  
 *  Out of all the data structures, BST seems perfect to implement. But BST needs to be balanced for O(log n) 
 *  
 *  
 *  There are 2 issues with the BST:
 *  1. It needs to be balanced
 *  2. Storage
 *  
 *  We have another better DS - Heap
 *  
 *  Heap - Heap is a binary tree
 *  Two properties:
 *  1. Complete binary tree except last level
 *  2. Heap order property
 *  3. When inserting in last level, insertion should happen from left to right
 *  
 *  
 *  Min number of nodes in heap - 2^(h-1)
 *  Max number of nodes in heap - 2^(h) -1
 * 
 *  Overcoming storage issue of BST:
 *  We won't be storing Heap in a tree but array
 * 
 *					 1 
 * 				   /   \
 * 				  2		3
 * 				 / 		 
 * 				4  
 * 
 * 
 *    1,2, 3, 4  we will store it in array level wise
 *    So how to determine the left and right child
 *    
 *    ith ----> left child -----> 2 * (i + 1)
 *    ith ----> right child ----> 2 * (i + 2)
 *    
 *    
 *    Find parent from the child node 
 *    ith node ---> parent ----> (i - 1) / 2
 *    
 *    So, we are able to achieve all the properties of binary trees, without storing references for left and right child   
 *
 *	2 variations of PQ - Max and Min PQ and we have 2 heaps corresponding to them max and min heaps
 *
 *  What is heap order property??
 *  
 *  Min Heap -- every node should be less than both of the children -- so root should be min than children
 *  
 *  Max Heap -- every node should be more than both of the children --- so root should be max than children
 *  
 *  Now, let's implement the above three methods using heap:
 *  
 *  1. getMin / getMax   -- O(1)
 *  2. Insert  -- O(h)  -- O(log n)
 *  3. Remove   -- O(log n)
 *
 *	Insert:  insert 22 in min heap
 *
 *			   10
 *			 /    \
 *			25	   45
 *	       /  \	   /  \
 *		30    32  50  48
 *		/
 *	  22
 *
 *	 Here one propeprty is satisfied that its balanced but does not follow heap order property
 *	So we will check if 22 is less than parent or not and swap
 * 	Process is called up- heapify.
 * 	We will compare the priority with the parent
 * 
 *
 *  Delete in min heap:
 *  
 *   			8
 *			 /    \
 *			10	   45
 *	       /  \	   /  \
 *		22    32  50  48
 *		/\
 *	  30  25
 * 
 * 	arr - 8, 10, 45, 22, 32, 50, 48, 30, 25
 * 
 * 	delete: in min heap, 8 should be deleted but then shifting in arr will take O(n) time
 * so, deletion is easier at last node so swap 25 with 8 and then delete 8
 * 
 * 				25
 *			 /    \
 *			10	   45
 *	       /  \	   /  \
 *		22    32  50  48
 *		/
 *	  30  
 * 
 * 
 * Now, it doesn't satisfy heap order property so re heapify 
 * check 25 with 10 and 45 and bring it to its correct position by swapping
 * process is called down heapify
 * 
 * 
 * 
 */

// Min Heap Implementation
public class PriorityQueue {

	// arraylist for dynamic array
	private ArrayList<Integer> heap;

	public PriorityQueue() {
		heap = new ArrayList<>();
	}

	public boolean isEmpty() {
		return heap.size() == 0;
	}

	public int size() {
		return heap.size();
	}

	int getMin() throws PriorityQueueException {
		if (heap.isEmpty()) {
			throw new PriorityQueueException();
		}
		return heap.get(0);
	}

 /*
 *	    	    5
 *			 /    \
 *			10	    8
 *	       /  \	   /  \
 *		15    20  35   4
 *
 *	5, 10, 8, 15, 20, 35, 4
 *	
 *  after one swap -  5, 10, 4, 15, 20, 35, 8
 *  needs another swap so do in loop, now child index will be parent index
 */
	
	
	void insert(int elem) {

		heap.add(elem);

		// satisfy heap order property
		// up - heapify compare with parent

		// find child and parent index
		// child - last index
		// parent by formula

		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		// since its min heap, child should be greater so compare
		// stop loop when we reach root

		while (childIndex > 0) {
			if (heap.get(childIndex) < heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			}
			// if its equal or <
			else {
				return;
			}
		}
	}
	
	/*
	 *
	 *   		    4
	 *			 /    \
	 *			10	    5
	 *	       /  \	   /  \
	 *		15    20  7    8
	 *		
	 *  delete --  1. copy 8 in root
	 *  		   2. delete 8 in last 
	 *  
	 *   			8
	 *			 /    \
	 *			10	    5
	 *	       /  \	   /  
	 *		15    20  7    
	 *		
	 *	compare and down heapify 
	 *
	 *  			5
	 *			 /    \
	 *			10	    7
	 *	       /  \	   /  
	 *		15    20   8 
	 *
	 *	
	 *
	 */
	
	int removeMin() throws PriorityQueueException {

		if(heap.isEmpty()) {
			throw new PriorityQueueException();
		}
		// store root since its min
		int minElem = heap.get(0);

		// set last element to root
		heap.set(0, heap.get(heap.size() - 1));
		heap.remove(heap.size() - 1);

		// now down heapify
		// 2*0+1 and 2*0+2

		int index = 0;
		int minIndex = index;
		int leftChildIndex = 1;
		int rightChildIndex = 2;

		// loop until index priority is less or until we reach leaf node
		while (leftChildIndex < heap.size()) {

			if (heap.get(leftChildIndex) < heap.get(minIndex)) {
				minIndex = leftChildIndex;
			}

			// if rightchild doesnt exist --> rightChildIndex < heap.size()
//			line 262 and 264 are way different, 262 gives ArrayIndexOutOfBound because first we need to check size 
//			if ((heap.get(rightChildIndex) < heap.get(minIndex)) && rightChildIndex < heap.size()) {
			
			if (rightChildIndex < heap.size() && (heap.get(rightChildIndex) < heap.get(minIndex)) ) {

				minIndex = rightChildIndex;
			}

			// if its already a min heap and doesnt need to reheapify
			if (minIndex == index) {
				break;
			} else {
				// now we have figured out the correct index, so swap

				int temp1 = heap.get(index);
				heap.set(index, heap.get(minIndex));
				heap.set(minIndex, temp1);
				index = minIndex;
				leftChildIndex = 2 * index + 1;
				rightChildIndex = 2 * index + 2;
			}
		}
		return minElem;
	}
	
	
	void print() {
		for(int i: heap) {
			System.out.println(i);
		}
	}
}
