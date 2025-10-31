class Aa {
    public static String details(String country, String names){
        return names + " from " + country;
    }
    public static void main(String[] args){
        System.out.println("I am " + details("Rwanda", "Happy David"));
    }
}