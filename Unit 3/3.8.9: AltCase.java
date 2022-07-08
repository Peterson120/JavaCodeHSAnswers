public String altCase(String text)
{
    String result = "";
    for(int i = 0; i < text.length(); i++) {result += (i%2 == 0)?String.valueOf(text.charAt(i)).toUpperCase():String.valueOf(text.charAt(i)).toLowerCase();}
    return result;
}

