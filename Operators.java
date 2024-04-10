//&= Operator
class AndEql {
  public static void main(String[] args) {
    int x = 5;
    x &= 3;
    System.out.println(x);    //  1
  }
}


// TO PRINT THE BINARY DIGIT OF A NUMBER
class Binary {
  public static void main(String[] args) {
    int x = 7;
    System.out.println(Integer.toBinaryString(x));   //   Binary Value = 111
  }
}


// To CHECK THE BINARY VALUES of 1-50
public class Binary {
  public static void main(String[] args) {
    for (int i = 1; i <= 50; i++) {
      System.out.println("Binary of " + i + " is " + Integer.toBinaryString(i));
    }
  }
}


// |= Operator  (Bitwise OR Operator)
public class Or {
  public static void main(String[] args) {
    int x = 5;
    x |= 3;
    System.out.println(x);   //  7
  }
}


//  ^= Operator  (Bitwise XOR Operator)
public class Xor {
  public static void main(String[] args) {
    int x = 5;
    x ^= 3;
    System.out.println(x);   //   6
  }
}


// >>= (Right shift Assignment Operator)
public class Right {
  public static void main(String[] args) {
    int x = 5;
    x >>= 3;
    System.out.println(x);  //  0
  }
}

/*  EXPLANATION
`x >>= 3;`: This line uses the right shift assignment operator (`>>=`). 
It shifts the binary representation of `x` (which is `5` or `101` in binary) three places to the right,
and then assigns the result back to `x`. The right shift operation discards the three lowest order bits
and shifts the remaining bits to the right. So, `101` (5 in binary) right shifted by 3 places results
in `0`.
*/


//  <<== (Left shift Assignment Operator)
public class Left {
  public static void main(String[] args) {
    int x = 5;
    x >>= 3;
    System.out.println(x);  //  0
  }
}


