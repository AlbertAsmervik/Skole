// 1. Create a class named Docs that contains data fields for the archive number, title, subtitle, and year. Include Get and Set methods for these fields (2 points).
// 2. Class Docs should have two method constructors that assign values to the specific fields. One constructor with two arguments (number and title) and one with three arguments (number, title, subtitle) (3 points). Year should be updated in the constructors with the current year (1 point).
// 3. Class Docs should offer print method that writes a message about the title and subtitle of the document (3 points).
// 4. Create two subclasses that will extend class Docs and which will be named: Reports and Contracts (2 points).
// 5. Reports subclass should contain additional fields (1 point):
// a. One that holds a number of the FBI department that issued the report.
// b. One field that indicates whether the report is confidential or not.
// 6. Reports should have additional constructor that updates those two additional fields (3 points) in addition to the constructor from the superclass.
// 7. Add methods getDepartment and isConfidental that read and return values of the fields department and isConfidental, respectively (3 points).
// 8. Override the print method from the superclass to create method in Reports class to print information from all available fields (3 points).
// 9. Contract subclass should contain additional field that stores the name of the partner (that contract is signed with) (2 points).
// 10. Add constructor in Contract class updates the value of partner field (in addition to the constructor from the superclass) (2 points).
// 11. Use polymorphism to create two methods in Contract class to print information about the contract. One method should print only department, title and year. Other method should print all available information. These methods should not override the print method from the superclass (4 points).
// 12. Create simple Test class with main method, that will create instances of one Report and one Contract and print details from both (6 points).


import java.util.Calendar;

class Docs {
    private int archiveNumber;
    private String title;
    private String subtitle;
    private int year;

    public Docs(int archiveNumber, String title) {
        this.archiveNumber = archiveNumber;
        this.title = title;
        this.year = Calendar.getInstance().get(Calendar.YEAR);
    }

    public Docs(int archiveNumber, String title, String subtitle) {
        this.archiveNumber = archiveNumber;
        this.title = title;
        this.subtitle = subtitle;
        this.year = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getArchiveNumber() {
        return archiveNumber;
    }

    public void setArchiveNumber(int archiveNumber) {
        this.archiveNumber = archiveNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printInfo() {
        System.out.println("Document title: " + title);
        System.out.println("Document subtitle: " + subtitle);
    }
}

class Reports extends Docs {
    private int departmentNumber;
    private boolean isConfidential;

    public Reports(int archiveNumber, String title, int departmentNumber, boolean isConfidential) {
        super(archiveNumber, title);
        this.departmentNumber = departmentNumber;
        this.isConfidential = isConfidential;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public boolean isConfidential() {
        return isConfidential;
    }

    public void setConfidential(boolean confidential) {
        isConfidential = confidential;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Department number: " + departmentNumber);
        System.out.println("Is confidential: " + isConfidential);
    }
}

class Contracts extends Docs {
    private String partner;

    public Contracts(int archiveNumber, String title, String partner) {
        super(archiveNumber, title);
        this.partner = partner;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public void printSummary() {
        System.out.println("Department: " + getArchiveNumber() + ", Title: " + getTitle() + ", Year: " + getYear());
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Partner: " + partner);
    }
    
}

public class test {
    public static void main(String[] args) {
        Reports report = new Reports(1234, "Top Secret Report", 567, true);
        Contracts contract = new Contracts(4321, "Contract with ABC Inc.", "ABC Inc.");

        System.out.println("Report details:");
        report.printInfo();
        System.out.println("\nContract details (summary):");
        contract.printSummary();
        System.out.println("\nContract details (full):");
        contract.printInfo();
    }
}
