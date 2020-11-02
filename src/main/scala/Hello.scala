import java.util.Date

object Hello {
  def main(args: Array[String]): Unit = {
    println("Hello world")

    new Date();
    new DateTime.now();

    import java.text.SimpleDateFormat

    val format = new SimpleDateFormat("dd/mm/yy")
    val date = format.parse("31/12/19")
    println(date.toString())
  }

  /** Converting celcuis to farhrenheit */
  def far(temp: Double): Double = (temp * 9/5) + 32

}