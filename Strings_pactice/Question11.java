class Question11 {
	public static void main(String[] args) {

	String names[] = { "van", "watch", "ball", "cat", "apple" }; 
	int n = 5; 
	String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
               
                // to compare one string with other strings
                if (names[i].compareTo(names[j]) > 0) {
                    // swapping
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
       
        // print output array
        System.out.println(
            "The names in alphabetical order are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }		
	}
}