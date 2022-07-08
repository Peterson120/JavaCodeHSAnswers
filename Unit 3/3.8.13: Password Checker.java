public boolean passwordCheck(String password)
{
    return password.matches("[A-Za-z0-9]+") && (password.length() >= 8);
}

