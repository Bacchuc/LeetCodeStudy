package simplify_path

import java.util.*

fun main() {
    println(getSimplifyPath("/home//foo/"))
}

private fun getSimplifyPath(str: String): String {
    val split = str.split("/")
    var strings: Stack<String> = Stack()

    for (word in split) {
        if ("".equals(word) || ".".equals(word) || ("..".equals(word) && strings.isEmpty()))
            continue;
        else if ("..".equals(word) && !strings.isEmpty()) {
            strings.pop();
        } else {
            strings.push(word);
        }
    }

    if (strings.empty()) {
        return "/"
    }

    var result = ""
    while (!strings.empty()) {
        result = "/" + strings.pop() + result
    }

    return result
}