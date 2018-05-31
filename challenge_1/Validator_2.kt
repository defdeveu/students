
fun validateInputIsValidUrl(input : String) : Boolean {
    val maxLength = 100
    if(input.length > maxLength) {
        return false
    }

    val URL_PATTERN = Pattern.compile("^(http:\\/\\/|https:\\/\\/)?(www.)?([a-zA-Z0-9]+).[a-zA-Z0-9]*.[a-z]{3}.?([a-z]+)?\$")
    //return regex check is true
}
