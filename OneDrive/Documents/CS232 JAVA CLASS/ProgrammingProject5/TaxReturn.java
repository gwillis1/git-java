package ProgrammingProject5;

public class TaxReturn {
    
        //declare variables

        private String ssn;
        private String lastName;
        private String firstName;
        private String streetAddress;
        private String city;
        private String state;
        private String zipCode;
        private double annualIncome;
        private String maritalStatus;
        private double taxLiability;
        
        //constructors

        public TaxReturn(String ssn, String lastName, String firstName, String streetAddress, String city, String state, String zipCode, double annualIncome, String maritalStatus) {
            this.ssn = ssn;
            this.lastName = lastName;
            this.firstName = firstName;
            this.streetAddress = streetAddress;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
            this.annualIncome = annualIncome;
            this.maritalStatus = maritalStatus;
        
            
            if (annualIncome >= 0 && annualIncome <= 20000) {
                if (maritalStatus.equalsIgnoreCase("S")) {
                    taxLiability = annualIncome * 0.15;
                } else if (maritalStatus.equalsIgnoreCase("M")) {
                    taxLiability = annualIncome * 0.14;
                }
            } else if (annualIncome > 20001 && annualIncome <= 50000) {
                if (maritalStatus.equalsIgnoreCase("S")) {
                    taxLiability = annualIncome * 0.22;
                } else if (maritalStatus.equalsIgnoreCase("M")) {
                    taxLiability = annualIncome * 0.20;
                }
            } else if (annualIncome > 50001) {
                if (maritalStatus.equalsIgnoreCase("S")) {
                    taxLiability = annualIncome * 0.30;
                } else if (maritalStatus.equalsIgnoreCase("M")) {
                    taxLiability = annualIncome * 0.28;
                } else {
                    System.out.println("Invalid marital status");
            }
        }
    }

    //Getters
        
    public String getSsn() {
        return ssn;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public double getTaxLiability() {
        return taxLiability;
    }

    //Setters
    
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }


    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setTaxLiability(double taxLiability) {
        this.taxLiability = taxLiability;
    }
}
