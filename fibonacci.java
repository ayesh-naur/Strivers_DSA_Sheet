// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int n=10, s=0, b=1, m;
        
        System.out.println(s);
        System.out.println(b);
        
        for(int i=2; i<=n ; i++){
            m = s+b;
            System.out.println(m);
           s=b;
           b=m;
        }
        
    }
}
