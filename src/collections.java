public class collections {
    public static void main(String[] args) {
        Integer i=   new Integer(20);
        //wrappper object
        Integer i1=Integer.valueOf(28);
        Integer i2=Integer.valueOf("123");
        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);

        int obj=Integer.parseInt("123");
        System.out.println(obj);
        boolean abj2=Boolean.parseBoolean("true");
        System.out.println(abj2);
        Integer k=66;
        String k2=k.toString();
        System.out.println(k2);
        Integer a=10;
        Integer b=10;
        System.out.println(a==b);
    }
}
