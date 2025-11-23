public class BufferBuilder{
    public static void main(String[] args) {
        String name= "Reva";
        System.out.println("Upper Case string: "+name.toUpperCase());
        System.out.println("Original String: "+name);
        Long startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Reva");
        for (int i=1; i<1000000; i++)
        {
            System.out.println("original string: "+sbf);
            sbf.append("College");
        }
        System.out.println("Buffer Time:"+ (System.currentTimeMillis()-startTime)+ "ms");
        startTime = System.currentTimeMillis();
        System.out.println("New buffer string: "+sbf); 
        StringBuilder sbl= new StringBuilder("Reva");
        for(int i=1; i<1000000; i++) {
            System.out.println("old string: "+sbl);
            sbl.append("College");
        }
        System.out.println("Builder Time: "+(System.currentTimeMillis()-startTime)+ "ms"); 
        System.out.println("New builder string: "+sbl);
    }
}