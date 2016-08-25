package onlyfun.caterpillar; 

import java.util.List;
import java.util.Map;

public class SomeBean {
    private String[] someStrArray;
    private Some[] someObjArray;
    private List someList;
    private Map someMap;

    public String[] getSomeStrArray() {
        return someStrArray;
    }

    public void setSomeStrArray(String[] someStrArray) {
        this.someStrArray = someStrArray;
    }

    public Some[] getSomeObjArray() {
        return someObjArray;
    }

    public void setSomeObjArray(Some[] someObjArray) {
        this.someObjArray = someObjArray;
    }

    public List getSomeList() {
        return someList;
    }

    public void setSomeList(List someList) {
        this.someList = someList;
    }

    public Map getSomeMap() {
        return someMap;
    }

    public void setSomeMap(Map someMap) {
        this.someMap = someMap;
    }
}
