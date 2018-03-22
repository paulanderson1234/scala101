package scala101.example

object CalculateTax {

  def percentageCalc(number: Int): Int = {

   if (number < 0)  0

   else if (number > 100000) (number * 0.4).toInt

   else if (number > 50000) (number * 0.2).toInt

   else if (number > 10000) (number * 0.15).toInt

   else if (number <= 10000) (number * 0.1).toInt

   else number


  }


}
