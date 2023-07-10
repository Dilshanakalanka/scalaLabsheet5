object q4 {

  def main(args: Array[String]): Unit = {
    print("Enter a number here : ")
    val number: Int = scala.io.StdIn.readInt()
    check (number)

  }

  def check (x: Int): Unit = {
    if (x==0) {
      println("Even")
    }
    else if (x==1){
      println("Odd")
    }
    else{
      check (x-2)
    }


  }

}
