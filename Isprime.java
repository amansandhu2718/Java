class Isprime{
    public static void main(String[] args) {
        int n=17;
        boolean isPrime=true;
        
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime==true){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
        }
    }
