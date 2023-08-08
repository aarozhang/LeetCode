package solutions.arraysAndHashing

fun numUniqueEmails(emails: Array<String>): Int {
    val unique = mutableSetOf<String>()

    for (e in emails) {
        val localDomain = e.split('@')
        val local = localDomain[0]
        val domain = localDomain[1]

        val localWithoutPlus = local.split('+')[0]
        val final = localWithoutPlus.replace(".", "")

        unique.add("$final@$domain")
    }

    return unique.size
}
