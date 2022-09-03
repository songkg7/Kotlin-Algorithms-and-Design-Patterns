package sorting

/**
 * merge sort algorithm implemented with recursion
 *
 * the best time: n * log(n)
 * average time: n * log(n)
 * worst time: n * log(n)
 *
 * amount of memory: n
 *
 */

fun Array<Int>.mergeSortRecursive() {
    val array = this

    if (size < 2)
        return

    val mid = size / 2

    val left = Array(mid) { 0 }
    val right = Array(size - mid) { 0 }

    for (i in 0 until mid) {
        left[i] = array[i]
    }

    for (i in mid until size) {
        right[i - mid] = array[i]
    }

    left.mergeSortRecursive()
    right.mergeSortRecursive()

    var i = 0;
    var j = 0;
    var k = 0

    val leftSize = left.size
    val rightSize = right.size

    while (i < leftSize && j < rightSize) {
        if (left[i] <= right[j]) {
            array[k++] = left[i++]
        } else {
            array[k++] = right[j++]
        }
    }

    while (i < leftSize) {
        array[k++] = left[i++]
    }

    while (j < rightSize) {
        array[k++] = right[j++]
    }
}

fun MutableList<Int>.mergeSortRecursive() {
    val list = this

    if (size < 2)
        return

    val mid = size / 2

    val left = Array(mid) { 0 }
    val right = Array(size - mid) { 0 }

    for (i in 0 until mid) {
        left[i] = list[i]
    }

    for (i in mid until size) {
        right[i - mid] = list[i]
    }

    left.mergeSortRecursive()
    right.mergeSortRecursive()

    var i = 0;
    var j = 0;
    var k = 0

    val leftSize = left.size
    val rightSize = right.size

    while (i < leftSize && j < rightSize) {
        if (left[i] <= right[j]) {
            list[k++] = left[i++]
        } else {
            list[k++] = right[j++]
        }
    }

    while (i < leftSize) {
        list[k++] = left[i++]
    }

    while (j < rightSize) {
        list[k++] = right[j++]
    }
}
