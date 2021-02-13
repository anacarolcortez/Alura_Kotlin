fun main() {
  step(2);
}

fun downTo() {
  for(i in 20 downTo 0){
    print("$i ")
  }
}

//não considera o último elemento
  fun until() {
    for(i in 0 until 20){
        print("$i ")
    }
}

fun step(num:Int){
  for (i in 0.. 20 step num){
      print("$i ")
  }
}


