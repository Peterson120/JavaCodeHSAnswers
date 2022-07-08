public boolean isInteger(String str) {
    // an empty string is not an integer
    if (str.length() == 0) return false;

    for (int i = 0; i < str.length(); ++i) {
        if (!Character.isDigit(str.charAt(i))) return false;
    }

    // Went over all the characters, all of them are digits
    return true;
}
