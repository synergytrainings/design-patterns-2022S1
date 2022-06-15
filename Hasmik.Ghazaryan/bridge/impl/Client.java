package impl;

public class Client {

    private String fullName;
    private ContactMethod preferredContactMethod;
    private String contactUniqueId;

    public Client(String fullName, ContactMethod preferredContactMethod, String contactUniqueId) {
        this.fullName = fullName;
        this.preferredContactMethod = preferredContactMethod;
        this.contactUniqueId = contactUniqueId;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ContactMethod getPreferredContactMethod() {
        return preferredContactMethod;
    }
    public void setPreferredContactMethod(ContactMethod preferredContactMethod) {
        this.preferredContactMethod = preferredContactMethod;
    }

    public String getContactUniqueId() {
        return contactUniqueId;
    }
    public void setContactUniqueId(String contactUniqueId) {
        this.contactUniqueId = contactUniqueId;
    }
}
