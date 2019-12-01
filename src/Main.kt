package ex

class Node(
    val name: String
) {
    val node = mutableListOf<Node>()
}

fun root(function: () -> Node) = function

fun node(s: String): Node {
    return Node(s)
}

fun node(s: String, function: (Node) -> Unit): Node {
    val n = Node(s)
    function(n)
    return n
}

// create root and node
fun main(args: Array<String>) {
    root {
        node("1") {
            node("3") {
                node("5"){
                    node("9")
                }
            }
            node("4")
        }
        node("2")
    }

}


