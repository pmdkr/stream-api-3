package OOPS.relationships.HasA.composition;

public class College {

    private String collName;
    private int estYear;


    //by final keyword, now its mandatory to create dept object with college during constructor, final keyword behavior

    // like final variable should be initialized during declaration or objcet createion
    private final Department dept;


    public College(String collName, int estYear, String deptName, String hodName) {
        this.collName = collName;
        this.estYear = estYear;
        this.dept = new Department(deptName, hodName);
    }

    // composition - strong relationships between classes
    // Department class not be available without college object

    //here container class College contain department, and once college object destroyed, dept object also gets destroyed
    private class Department {
        String deptName;
        String hodName;

        public Department(String deptName, String hodName) {
            this.deptName = deptName;
            this.hodName = hodName;
        }
    }


    public void showDetails() {
        System.out.println("College name: " + collName);
        System.out.println("East Year : " + estYear);
        System.out.println("Dept Name: " + dept.deptName);
        System.out.println("HOD name : " + dept.hodName);
    }
}
