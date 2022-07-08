public String replaceLetter(String word, char letterToReplace, char replacingLetter)
{
    return word.replaceAll(String.valueOf(letterToReplace),String.valueOf(replacingLetter));
}

