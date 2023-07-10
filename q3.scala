object q3 {

  def main(args: Array[String]): Unit = {
    print("Enter a number here : ")
    val number: Int = scala.io.StdIn.readInt()
    print(addition(number))
  }

   def addition (number: Int): Int={
     if (number > 0) {
       var x = number + addition(number - 1)
       return x
     }
     else{
       return 0
     }
   }
}
