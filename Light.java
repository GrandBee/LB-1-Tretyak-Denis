class Light {
    public static void main(String args[]) {
        int LightSpeed = 186000;
        long days = 1000;
        long seconds = days * 24 * 60 * 60;
        long distance = LightSpeed * seconds;
        System.out.println("In 1000 days light will travel about " + distance + " miles");
    }
}