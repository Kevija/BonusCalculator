import scala.io.StdIn.readLine

  object BonusCalculator extends App {

    //TODO
    //Ask for person's name
    //Ask for how long they have worked at the firm
    //Ask for monthly wage
    //Calculate Xmas bonus if they have worked at least 2  years otherwise print sorry no bonus
    //Bonus is years worked over 2 years * 15% of monthly wage
    //so 5 years worked, 1000 Euros wage would give 450 Euro bonus (3 years * 150)

    println("Christmas bonus calculator")

    val personsName = readLine("Please enter your name:")
    val workingYears = readLine(s"Hello, $personsName! Please enter how many years you are working at this firm:").toInt
    val monthlyWage = readLine(s"Great, $personsName! Please enter your monthly salary:").toDouble

    if (workingYears > 2) {
      val bonusMoney = (monthlyWage * 15 / 100) * (workingYears-2)
      println(s"Your monthly wage in euros: $monthlyWage, your Christmas bonus: $bonusMoney")
    } else {
      println(s"$personsName, sorry, this year you have no bonus :(")
    }
  }


