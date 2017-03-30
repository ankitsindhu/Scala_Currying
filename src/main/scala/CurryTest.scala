/**
  * Created by ankit on 18/3/17.
  */

object CurryTest extends App {
def filter(num:List[Int], f:Int => Boolean): List[Int]={
  if(num.isEmpty) num
  else if(f(num.head)) num.head :: filter(num.tail,f)
  else filter(num.tail,f)
   }
def modN(a:Int)(b:Int):Boolean=b%a==0
  val list:List[Int]=List(1,2,3,4,5,6,7,8,9)
  println(filter(list,modN(2)))
  println(filter(filter(list,modN(2)),modN(4)))
  println(filter(filter(filter(list,modN(2)),modN(4)),modN(8)))
}