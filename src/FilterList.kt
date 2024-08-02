fun main(){
val names= listOf("Hind","Noura","Asmaa","Hagar")
    val filterList=names.asSequence().filter {it[0] == 'H'  }
    println("filtered :${filterList.toList()}")
}

