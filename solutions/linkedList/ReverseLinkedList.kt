package solutions.linkedList

// O(n) time; O(1) space
fun reverseList(head: ListNode?): ListNode? {
    var prev: ListNode? = null
    var curr = head

    while (curr != null) {
        val temp = curr.next
        curr.next = prev
        prev = curr
        curr = temp
    }

    return prev
}