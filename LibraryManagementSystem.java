// LibraryItem (abstract class)
abstract class LibraryItem {
    private String title;
    private String itemID;
    private boolean checkedOut;

    public LibraryItem(String title, String itemID) {
        this.title = title;
        this.itemID = itemID;
        this.checkedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getItemID() {
        return itemID;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkOut() {
        checkedOut = true;
    }

    public void checkIn() {
        checkedOut = false;
    }

    public abstract void displayItemDetails();
}

// Book (subclass of LibraryItem)
class Book extends LibraryItem {
    private String author;
    private int numPages;

    public Book(String title, String itemID, String author, int numPages) {
        super(title, itemID);
        this.author = author;
        this.numPages = numPages;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumPages() {
        return numPages;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Item ID: " + getItemID());
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numPages);
        System.out.println("Checked Out: " + isCheckedOut());
    }
}

// Magazine (subclass of LibraryItem)
class Magazine extends LibraryItem {
    private String issueDate;
    private String publisher;

    public Magazine(String title, String itemID, String issueDate, String publisher) {
        super(title, itemID);
        this.issueDate = issueDate;
        this.publisher = publisher;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Item ID: " + getItemID());
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Publisher: " + publisher);
        System.out.println("Checked Out: " + isCheckedOut());
    }
}

// LibraryMember class
class LibraryMember {
    private String memberID;
    private String name;

    public LibraryMember(String memberID, String name) {
        this.memberID = memberID;
        this.name = name;
    }

    public String getMemberID() {
        return memberID;
    }

    public String getName() {
        return name;
    }

    public void displayMemberDetails() {
        System.out.println("Member ID: " + memberID);
        System.out.println("Name: " + name);
    }
}

// Main class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create 5 objects of the Book class
        Book book1 = new Book("The Catcher in the Rye", "B001", "J.D. Salinger", 240);
        Book book2 = new Book("To Kill a Mockingbird", "B002", "Harper Lee", 281);
        Book book3 = new Book("1984", "B003", "George Orwell", 328);
        Book book4 = new Book("Pride and Prejudice", "B004", "Jane Austen", 432);
        Book book5 = new Book("The Hobbit", "B005", "J.R.R. Tolkien", 320);

        // Create 5 objects of the Magazine class
        Magazine magazine1 = new Magazine("National Geographic", "M001", "August 2023", "National Geographic Society");
        Magazine magazine2 = new Magazine("Time", "M002", "September 2023", "Time USA, LLC");
        Magazine magazine3 = new Magazine("Forbes", "M003", "June 2023", "Forbes Media");
        Magazine magazine4 = new Magazine("Vogue", "M004", "July 2023", "Condé Nast");
        Magazine magazine5 = new Magazine("Sports Illustrated", "M005", "July 2023", "Maven Coalition");

        // Create 5 objects of the LibraryMember class
        LibraryMember member1 = new LibraryMember("L001", "John Doe");
        LibraryMember member2 = new LibraryMember("L002", "Jane Smith");
        LibraryMember member3 = new LibraryMember("L003", "David Johnson");
        LibraryMember member4 = new LibraryMember("L004", "Emily Davis");
        LibraryMember member5 = new LibraryMember("L005", "Michael Brown");

        // Set the properties of the objects using appropriate setter methods (if needed)

        // Call the checkOut() and checkIn() methods on one of the library items
        book1.checkOut();
        book1.displayItemDetails();
        book1.checkIn();
        book1.displayItemDetails();

        // Display the details of all the library items and library members
        System.out.println("Books:");
        book1.displayItemDetails();
        book2.displayItemDetails();
        book3.displayItemDetails();
        book4.displayItemDetails();
        book5.displayItemDetails();

        System.out.println("\nMagazines:");
        magazine1.displayItemDetails();
        magazine2.displayItemDetails();
        magazine3.displayItemDetails();
        magazine4.displayItemDetails();
        magazine5.displayItemDetails();

        System.out.println("\nLibrary Members:");
        member1.displayMemberDetails();
        member2.displayMemberDetails();
        member3.displayMemberDetails();
        member4.displayMemberDetails();
        member5.displayMemberDetails();
    }
}
