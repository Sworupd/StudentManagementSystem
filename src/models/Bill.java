package models;

public class Bill {
    int BillId;
    String BillName;
    String BillAddress;
    Student IssuedTo;

    public Bill(int billId, String billName, String billAddress, Student issuedTo) {
        BillId = billId;
        BillName = billName;
        BillAddress = billAddress;
        IssuedTo = issuedTo;
    }

    public int getBillId() {
        return BillId;
    }

    public void setBillId(int billId) {
        BillId = billId;
    }

    public String getBillName() {
        return BillName;
    }

    public void setBillName(String billName) {
        BillName = billName;
    }

    public String getBillAddress() {
        return BillAddress;
    }

    public void setBillAddress(String billAddress) {
        BillAddress = billAddress;
    }

    public Student getIssuedTo() {
        return IssuedTo;
    }

    public void setIssuedTo(Student issuedTo) {
        IssuedTo = issuedTo;
    }
}
