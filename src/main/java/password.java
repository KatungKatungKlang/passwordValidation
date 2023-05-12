public class password {
    public static void main(String[] args) {

    }
    /**
     * @param val the password string
     * @return boolean that indicates if the password matches the regexp
     *    (?=.*[a-z])     : This matches the presence of at least one lowercase letter.
               (?=.*d)         : This matches the presence of at least one digit i.e. 0-9.
               (?=.*[@#$%])  : This matches the presence of at least one special character.
               ((?=.*[A-Z])    : This matches the presence of at least one capital letter.
               {8,16}          : This limits the length of password from minimum 8 letters to maximum 16 letters.
     */
    public static boolean passwordValidator(String val) {
        String regex = "((?=.*[a-z])(?=.*\\d)(?=.*[@#$%])(?=.*[A-Z]).{8,16})";
        return val.matches(regex);
    }

}
