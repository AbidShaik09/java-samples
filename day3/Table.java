public class Table {
    public static void main(String []params){
        String s = new String("hellow world");   
        System.out.println(s.toCharArray()[0]);
        for(int counter=1;counter<=10;counter++){
        int num  = Integer.parseInt(params[0]);
        System.out.println(counter +" * "+num + " = " + counter*num );
    }
    }
}
