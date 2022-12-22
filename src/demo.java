public class demo {

    public static void main(String[] args) {
        try {
            System.out.println("A");
            System.out.println(Hello());
            System.out.println("B");
        }catch (Exception e){
            System.out.println("C");
        }
    }

    public static String Hello(){
        try{
            System.out.println("1");
            throw new Exception();
        }catch (Exception e){
            System.out.println("2");
            return "X";
        }
        finally {
            System.out.println("3");
        }
    }

}
