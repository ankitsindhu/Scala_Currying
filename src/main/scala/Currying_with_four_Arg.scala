/**
  * Created by ankit on 20/3/17.
  */
object Currying_with_four_Arg extends App{
  def sum(s1:Int)(s2:Int)(s3:Int)(s4:Int) : Int = s1+s2+s3+s4
  def func(f:Int =>(Int => (Int => Int)), a:Int, b:Int, c:Int) : Int= f(a)(b)(c)

  println(s"Cuurrying with 1 initial argument ${func(sum(4),5,6,7)}")

  def sum1(s1:Int)(s2:Int)(s3:Int)(s4:Int) : Int = s1+s2+s3+s4
  def func1(f:Int =>(Int => Int), a:Int, b:Int, c:Int) : Int= f(a)(b)+c

  println(s"Cuurrying with 2 initial argument ${func1(sum1(4)(5),5,6,7)}")

  def sum2(s1:Int)(s2:Int)(s3:Int)(s4:Int) : Int = s1+s2+s3+s4
  def func2(f:Int => Int, a:Int, b:Int, c:Int) : Int= f(a)+b+c

  println(s"Cuurrying with 3 initial argument ${func2(sum2(4)(5)(7),5,6,7)}")
}
