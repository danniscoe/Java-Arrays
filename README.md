    Part one:
        Write a program to sum all the values of a given Array in Java.
    Part two:
        What is the output of this example array?

          double[ ] exampleArray = {1,5,6,5,4,1};
          double maximum = examplesArray[0];
          int index = 0;

          for (int i = 1; i<exampleArray.length>; i++){

               if (exampleArray[ i ] > maximum) {
                    maximum = exampleArray[ i ];
                    index = i;
               }
          }

          System.out.println(index);

   Part three: 
      Write a public static method called "toPower" that takes in as parameters two integers called size and power. The method should return an array of size "size" with each array index raised to the value of "power." 
