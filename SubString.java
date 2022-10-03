// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        String name = "Ayesha";
        int c = 4;
        int n = name.length();
        
        for(int i=0; i< n; i++){
            if((i+c)<=n){
            System.out.print(name.substring(i,(i+c)) + System.lineSeparator());
            }
        }
        
    }
}
