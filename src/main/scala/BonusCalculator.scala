import scala.io.StdIn.readLine

  object BonusCalculator extends App {

    println("Christmas bonus calculator")

    println("Please enter your name:")
    val personsName = readLine
    println(s"Hello, $personsName! Please enter how many years you are working at this firm:")
    val workingYears = readLine().toInt
    println(s"Great, $personsName! Please enter your monthly salary:")
    val monthlyWage = readLine().toDouble

    if (workingYears > 2 || workingYears==2) {
      val bonusMoney = (monthlyWage * 15 / 100) * workingYears
      println(s"Your monthly wage: $monthlyWage, your Christmas bonus: $bonusMoney")
    }
    else {
      println(s"$personsName, sorry, this year you have no bonus :(")
    }
  }


