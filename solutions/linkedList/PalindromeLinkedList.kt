package solutions.linkedList

// O(n) time; O(1) space
fun isPalindrome(head: ListNode?): Boolean {
    var slow = head
    var fast = head

    // find middle using slow & fast pointer
    while (fast != null && fast.next != null) {
        slow = slow?.next
        fast = fast?.next?.next
    }

    // reverse second half
    var prev: ListNode? = null

    while (slow != null) {
        val temp = slow?.next
        slow?.next = prev
        prev = slow
        slow = temp
    }

    // compare both halves
    var p1 = head
    var p2 = prev

    while (p2 != null) { // must check p2 and not p1. This is because of how the slow/fast pointer logic works to divide the list. Walk through the division logic if still confused.
        if (p1?.`val` != p2?.`val`) {
            return false
        }

        p1 = p1?.next
        p2 = p2?.next
    }

    return true
}