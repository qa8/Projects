package mf_plus.model;

import java.util.LinkedList;

/**
 * Created by admin on 22.02.2017.
 */
public class QuotationData {

    private String number;
    private String bookingType;
    private String booker;
    private String bookerContact;
    private String account;
    private String accountContact;
    private String source;
    private String clientName;
    private String jobType;
    private String mode;
    private String type;
    private String service;
    private LinkedList<CostsData> costs = new LinkedList<CostsData>();

    public String getNumber() {
        return number;
    }

    public String getBookingType() {
        return bookingType;
    }

    public String getBooker() {
        return booker;
    }

    public String getBookerContact() {
        return bookerContact;
    }

    public String getAccount() {
        return account;
    }

    public String getAccountContact() {
        return accountContact;
    }

    public String getSource() {
        return source;
    }

    public String getClientName() {
        return clientName;
    }

    public String getJobType() {
        return jobType;
    }

    public String getMode() {
        return mode;
    }

    public String getType() {
        return type;
    }

    public String getService() {
        return service;
    }

    public QuotationData withNumber(String number) {
        this.number = number;
        return this;
    }

    public QuotationData withBookingType(String bookingType) {
        this.bookingType = bookingType;
        return this;
    }

    public QuotationData withBooker(String booker) {
        this.booker = booker;
        return this;
    }

    public QuotationData withBookerContact(String bookerContact) {
        this.bookerContact = bookerContact;
        return this;
    }

    public QuotationData withAccount(String account) {
        this.account = account;
        return this;
    }

    public QuotationData withAccountContact(String accountContact) {
        this.accountContact = accountContact;
        return this;
    }

    public QuotationData withSource(String source) {
        this.source = source;
        return this;
    }

    public QuotationData withClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    public QuotationData withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public QuotationData withMode(String mode) {
        this.mode = mode;
        return this;
    }

    public QuotationData withType(String type) {
        this.type = type;
        return this;
    }

    public QuotationData withService(String service) {
        this.service = service;
        return this;
    }

    public QuotationData addCost(CostsData cd){
        costs.add(cd);
        return this;
    }

}
