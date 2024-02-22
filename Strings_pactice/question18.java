class question18 {
    public static void main(String[] args) {
        // Creating a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello, World!");

        // Set length of the buffer
        stringBuffer.setLength(5);
        System.out.println("Set Length: " + stringBuffer);

        // charAt() - Accessing character at a specific index
        char charAtIndex = stringBuffer.charAt(1);
        System.out.println("Char at index 1: " + charAtIndex);

        // setCharAt() - Modifying character at a specific index
        stringBuffer.setCharAt(1, 'i');
        System.out.println("After setCharAt: " + stringBuffer);

         // getChars() - Copying characters to a char array
        char[] charArray = new char[5];
        stringBuffer.getChars(0, 5, charArray, 0);
        System.out.print("getChars: ");
        System.out.println(charArray);

        // append() - Concatenating a string
        stringBuffer.append(" How are you?");
        System.out.println("After append: " + stringBuffer);

        // insert() - Inserting a string at a specific position
        stringBuffer.insert(7, "Awesome ");
        System.out.println("After insert: " + stringBuffer);

   

        // delete() - Deleting a portion of the content
        stringBuffer.delete(7, 15);
        System.out.println("After delete: " + stringBuffer);

        // deleteCharAt() - Deleting a character at a specific index
        stringBuffer.deleteCharAt(0);
        System.out.println("After deleteCharAt: " + stringBuffer);

        // replace() - Replacing characters within a range
        stringBuffer.replace(0, 5, "Hola");
        System.out.println("After replace: " + stringBuffer);

        // substring() - Extracting a portion of the content
        String substring = stringBuffer.substring(0, 4);
        System.out.println("Substring: " + substring);

        // reverse() - Reversing the content
        stringBuffer.reverse();
        System.out.println("After reverse: " + stringBuffer);

    }
}