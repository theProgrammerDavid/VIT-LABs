public class rewrite {
    public static void main(String[] args) {
        professor satish = new professor("satish", "vellore", "111", "a06");
        satish.display_professor();
    }
}

abstract class person {
    protected String name;
    protected String address;

    public abstract void display_vitadd();
};

class faculty extends person {
    public String empid;

    public void display_vitadd() {

    }

    public void display_faculty() {
        System.out.println(name + address + empid);
    }
}

class professor extends faculty {
    public String cabinno;

    public professor(String name, String location, String empid, String cabinno) {
        this.name = name;
        this.address = location;
        this.empid = empid;
        this.cabinno = cabinno;
    }

    public void display_professor() {
        System.out.println(name + address + empid + cabinno);
    }
}