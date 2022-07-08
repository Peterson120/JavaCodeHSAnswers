public String toUpper(String str) {
    String result = "";
    for(int i = 0; i < str.length(); i++) result += Character.toUpperCase(str.charAt(i));
    return result;
}

