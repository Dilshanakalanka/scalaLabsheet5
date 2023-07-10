object q1 {

  var divisor  = 2

  def main(args: Array[String]): Unit = {
    print("Enter a number here : ")
    val number: Int = scala.io.StdIn.readInt()

    println(checkprime(number))
  }

  def checkprime(number: Int): Boolean = {

      if (number % divisor == 0 && (divisor < number)) {
        return false
      }

      else if(divisor < number) {
          divisor = divisor + 1
          checkprime(number)
      }

      else
         return true

  }

}
