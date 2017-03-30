/**
  * Created by ankit on 15/3/17.
  */
object FoodItems extends App{
val fd=new Foods("Pizza","Italian",8)
  val fd1=new Foods("Hakka-Nudals","Chinese",8)
  val fd2=new Foods("Burger","American",6)

  fd.catagory("Non-Veg with full cheese")
  fd.spiceyOrNot("Spicy")
  fd.tastyEnough(8)

  fd1.catagory("Veg with half cheese")
  fd1.spiceyOrNot("Spicy")
  fd1.tastyEnough(5)

  fd2.catagory("Veg with no cheese")
  fd2.spiceyOrNot("less spicy")
  fd2.tastyEnough(4)

  val obj1= new Student1("Ankit",27,"P15220","System engineer")
  val obj2= new Student1("Orijit",37,"P15221","System engineer")

  val list1:List[Student1]=List(obj1,obj2)
  list1.foreach(x=>println(x))

  val list:List[Any]=List(fd,fd1,fd2,obj1,obj2)

/* list.foreach(f=>{
   if(f[Foods]) println("Eat it"+f.getClass)
   else println("Enroll it"+f.getClass)
 })*/

  for (i<-list){
    if(i.isInstanceOf[Foods]) println("Eat "+i.asInstanceOf[Foods].foodName)
    else println("Enroll "+i.asInstanceOf[Student1].studentName)
    //println(i.getClass.toString)
  }
}
abstract class food {
  def catagory(nm:String):Unit
  def spiceyOrNot(sp:String):Unit= println("Spicey")
}
trait Tasty{
  def tastyEnough(ratings:Int):Unit
}

class Foods(name:String,orig:String,rating:Int) extends food with Tasty{

  override def catagory(nm: String):Unit = {
    println("Here is Your ----" + name.toUpperCase+"-----")
    println("catagory is " + nm)
  }
  override def spiceyOrNot(spice: String):Unit = {
    if(spice.equalsIgnoreCase("spicy")) println("spicy enough as you want")
    else println("Less Spicy as you want")
  }

  override def tastyEnough(ratings: Int):Unit= {
    if (rating > 5) println("You felt it tasty enough")
    else if(rating<5 && rating>3) println("for you it is Less tasty we will try to improve it")
    else println("Not eatable we will give you another one")
  }
  def foodName():String=name
}
class Student1(name:String, Age:Int, Emp_Id:String, Desig:String){
   /*def studentDetails():Unit =
    println("Name "+name+" Age= "+Age+" Emp_id= "+Emp_Id+" Desig= "+Desig)*/

  override def toString: String = "Name "+name+" Age= "+Age+" Emp_id= "+Emp_Id+" Desig= "+Desig
  def studentName():String=name
}
