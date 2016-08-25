package onlyfun.caterpillar; 

import java.util.Date; 

public class HelloBean { 
    private String helloWord; 
    private Date date; 
    
    public void setHelloWord(String helloWord) { 
        this.helloWord = helloWord; 
    } 

    public String getHelloWord() { 
        return helloWord; 
    } 

    public void setDate(Date date) { 
        this.date = date; 
    }    

    public Date getDate() { 
        return date; 
    } 
}