package solutions.arraysAndHashing

class Codec() {
    private val encodeMap = mutableMapOf<String, String>()
    private val decodeMap = mutableMapOf<String, String>()

    // Encodes a URL to a shortened URL.
    fun encode(longUrl: String): String {
        if (!encodeMap.contains(longUrl)) {
            val shortUrl = "http://tinyurl.com/" + (encodeMap.size + 1).toString()
            encodeMap[longUrl] = shortUrl
            decodeMap[shortUrl] = longUrl
        }

        return encodeMap[longUrl]!!
    }

    // Decodes a shortened URL to its original URL.
    fun decode(shortUrl: String): String {
        return decodeMap[shortUrl]!!
    }
}

/**
 * Your Codec object will be instantiated and called as such:
 * var obj = Codec()
 * var url = obj.encode(longUrl)
 * var ans = obj.decode(url)
 */
