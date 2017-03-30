//1. Currying
/*val byFive = multiplier(5)_
val byTen = multiplier(10)_
println(byFive(2))
println(byTen(2))*/
def multiplier(i: Int)(factor: Int) = i * factor
def sum(f:Int => Int, i: Int )= f(i)
println(sum(multiplier(5), 6))

//2. Currying
def add(s1:String)(s2:String)=s1+s2
def addboth(f:String=> String, string: String)=f(string)
def addt(f:String=> String,string: String)=f(string)

/*
def add1(s1:String)= (s2:String)=> s1+s2
val bc=add1("burjit")
println(bc("bk"))
*/

println(addboth(add("Ankit "),"Kumar"))
println(add("burjit")("bhatara"))
println(addboth((add(addboth(add("ankit ")_, "kumar "))),"sindhu"))
println(addboth(add(addboth((add(addboth(add("ankit ")_, "kumar "))),"sindhu"))," MCA"))
println(addboth(add(addboth(add(addboth((add(addboth(add("ankit ")_, "kumar ")))
  ,"sindhu"))," MCA"))," 2016"))

//3. list with loop
val list:List[Int]=List(1,2,3,4,5)
println(list.head)
println(list.tail)
val x = List(1,2,3)
x.foreach {println(_)}
println(x(1))
