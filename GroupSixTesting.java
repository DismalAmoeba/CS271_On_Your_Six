// Group 6
        //Written by Group 6 members Enlil Adam and Hans Johnson.
	public int hashCode()
    {
        int hashCode = 1;
		//Starts the finger at the heads
		Node<E> finger = heads.get(0);
		//Moves finger over to a node where a value might be stored.
		finger.next(0);
		//If the list isn't empty or if finger hasn't reached the end it'll hash the current value and move to the next.
		while (finger != null){
			hashCode = 31*hashCode + (finger == null ? 0 : finger.value().hashCode());
			finger = finger.next(0);
		}
        return hashCode;
    }
	
	public boolean testHashCode()
	{
		List<Integer> testList1 = new SkipList<Integer>();
		List<Integer> testList2 = new SkipList<Integer>();
		
		testList1.add(3);
		testList1.add(4);
		testList1.add(7);
		
		testList2.add(3);
		testList2.add(4);
		testList2.add(7);
		
		return testList1.hashCode() == testList2.hashCode();
	}

	public Object[] toArray()
        {
          //Thaer Mohomad and Hans Johnson's code
          Object[] arr = new Object[size()];
          //Starting position is set equal to the head (null)
          Node<E> current = null;
          //loop created that iterates through the values of the list
          for (int i = 0; i < size(); i++)
          {
	    //current set to position of head at index, which changes after for loop completes
            current = heads.get(i);
            arr[i] = current;
          }
          return arr;
        }

        public static boolean testToArrayObj() {
        //Hans Johnson & Thaer Mohomad

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(18);
        list1.add(12);
        list1.add(6);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(18);
        list2.add(12);
        list2.add(6);

        return list1.equals(list2);
        }

    /* --> Old code that does not compile
    public Object[] toArray()
    {
        //Thaer Mohomad's code
          Object[] arr = new Object[arr.length + 1 ];
        //Created an object that will be ascending
          while (indexOf(heads) <= arr.length)
          {
            //loop created that iterates through the values of the list
            arr[ heads.hashCode()] = heads;
            //hashCode called on & array created 
            heads = heads.next();
          }
          //returns the array 
        return arr;
    }
    */

    public <T> T[] toArray(T[] a)
    {
    // written by Collin Yan and Nguyen Do
      Node <E> pointer = heads.get(0); // start at the head
      int index = 0; // the current index of the array is 0
      if (this.size() > a.length) // makes a new ArrayList if the one passed is too big
      {
    	    T[] arr =  (T[]) new Object[this.size()]
    	
    	    for (int i = 0; i < index; i++) // iterates through the SkipList and stores the nodes into the array
   		    {
   			      arr[i] = (T)pointer.value(); // stores the value of the pointer into the ArrayList
			        pointer = pointer.next(); // moves pointer to the next node
			        // after storing the value it moves the pointer to the node after it and then it would store that value and continue iterating through the loop
		       }
	    }
      else
      {
    	  arr[i] = (T)pointer.value();
    	  pointer = pointer.next;
	    }
      return arr;
      }
    
public static boolean testToArrayT()
{
// I tried to make a SkipList here to test the toArray part, whatever the outcome is is what affects the ArrayList ***
	SkipList<T> testList = new SkipList<T>(); // new SkipList to test out the toArray
	Node<E> pointer = heads.get(0); // Start SkipList at head
	int arr[] = new int[30]; // makes a new arr with size 30
	for (int i = 0; i <= arr.length; i++) // iterates testList.add to add to the SkipList for the length of the array
	{	
		testList.add(i, Math.random(5000)); // add random value to the index
		System.out.println(testList(i, testList.get(i));
	}
	//testList.toArray(arr); // passes testList through the Array arr
	//for (int i = 0; i <= arr.length; i++)
	//{
		//System.out.println(arr[i]);
	//}
	return testList; 
}
