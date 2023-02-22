

//TODO Static Variables and Methods

//TODO they can be accessed before any objects of its class are created,
// and without reference to any object

public class StaticBasic {
    public static void main(String[] args) {

        System.out.println("Our Company Name:"+ZohoEmployee.getCompanyName());

        //TODO can't access default constructor
        ZohoEmployee roohi = new ZohoEmployee(3100, "Roohi S", "roohifathima@zohocorp.com");
        ZohoEmployee sudakar = new ZohoEmployee(600, "Sudakar R", "sudakar@zohocorp.com");
        ZohoEmployee nadimuthu = new ZohoEmployee(13000, "Nadimuthu G", "nadimuthu@zohocorp.com");

        System.out.println("Roohi's Company Name:"+roohi.getCompanyName());
        roohi.setCompanyName("ZOHO Corporations");
        System.out.println("Sudakar's Company Name:"+sudakar.getCompanyName());
        System.out.println("Our Company Name:"+ZohoEmployee.getCompanyName());

        System.out.println("Total number of employees:"+ZohoEmployee.getEmployeeCount());

        System.out.println("To prove static methods are inherited but cannot be overridden:"+ContractZohoEmployee.getCompanyName());
    }
}


class ZohoEmployee extends Employee{
    private static String companyName = "AdventNet Inc";
    private static int employeeCount;

    //TODO constants - should be initialized, at least in static block - otherwise compiler error
    static final int numberOfHolidays = 9;

//    static{
//        numberOfHolidays = 9;
//    }

    //TODO this keyword
    ZohoEmployee(int empID, String name, String mailID) {
        this.empID = empID;
        this.name = name;
        this.mailID = mailID;

        employeeCount++;
    }

    static String getCompanyName() {
        //return super.getCompanyName();
        //TODO cannot refer to "this" or "super"
        return companyName;
    }

    static void setCompanyName(String companyName) {
        ZohoEmployee.companyName = companyName;
        //TODO static methods cannot access non-static variables

        //TODO try name = "Bla bla bla";
    }


    static int getEmployeeCount() {
        return employeeCount;
    }

    void setMailID(String mailID) {
        this.mailID = mailID;
        //TODO non-static methods can access static variables
        //this.employeeCount++;
    }
}

class ContractZohoEmployee extends ZohoEmployee{
    ContractZohoEmployee(int empID, String name, String mailID) {
        super(empID, name, mailID);
    }
}

abstract class Employee {
    protected int empID;
    protected String name;
    protected String mailID;
}
