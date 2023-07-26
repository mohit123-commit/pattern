package kajallmam;

class A{
    void show(){
        System.out.println("show");
    }
    void run(){
        this.show();
    }

}

class Main {
    void m(){
        System.out.println("m");
    }
    void n(){
        this.m();
    }
    public static void main(String args[]){
        A k=new A();
        k.run();

    }
}