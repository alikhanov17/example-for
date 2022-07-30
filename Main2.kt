object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val n = 25
        var count = 0
        var temp = n
        while (temp != 0) {
            count++
            temp = temp / 10
        }
        println(count)
    }
}