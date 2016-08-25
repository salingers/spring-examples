package onlyfun.caterpillar;

public class SomeServiceImpl implements ISomeService {
    public String doSomeService(String some) {
        return some + " is processed";
    } 
    
    public int doOtherService(int other) {
        return ++other;
    }
} 
