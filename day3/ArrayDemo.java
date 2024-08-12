public class ArrayDemo {
    public String toString(){
        return "ArrayDemo";
    }
    public static void main(String ... a){
        Object []collection = new Object[10];
        collection[0] = 10;
        collection[1] = 1.0;
        collection[2] = "actalent";
        for(Object o : collection)
        System.err.println(o);
        ArrayDemo ad = new ArrayDemo();
        System.out.println(ad);
        // int prices[] = new int[5]; //Array prices = new Array(int,10);
        // prices[1] = 10; // 1000 baseadderss =(size * index) =1004
        // System.out.println(Float.parseFloat(collection[1].toString())+Integer.parseInt(collection[0]));
    }
}
