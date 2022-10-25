public class Book 
{
    private String isbn; 
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;
    
    
    public Book()
    {

    }

    Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity)
    {
        this. isbn = isbn;
        this. bookTitle = bookTitle;
        this. authorName = authorName;
        this. price = price;
        this. availableQuantity = availableQuantity;
        
    
    }
    
    public void setisbn(String isbn)
    {
        this.isbn = isbn;
    }
    public void setbookTitle(String bookTitle)
    {
        this.bookTitle = bookTitle;
    }
    public void setauthorName(String authorName)
    {
        this.authorName = authorName;
    }
    public void setprice(double price)
    {
        this.price = price;
    }
    public void setavailableQuantity(int availableQuantity)
    {
        this.availableQuantity = availableQuantity;
    }
   
   
    public String getisbn()
    {
        return isbn;
    }
    public String getbookTitle()
    {
        return bookTitle;
    }
    public String getauthorName()
    {
        return authorName;
    }
    public double getprice()
    {
        return price;
    }
    public int getavailableQuantity()
    {
        return availableQuantity;
    }
    public void addQuantity(int amount)
    {
        availableQuantity=availableQuantity+amount;
    }
    public void sellQuantity(int amount)
    {
        availableQuantity=availableQuantity-amount;
    }
    public void showdetails()
    {
        System.out.println("The Isbn no             : " + isbn);
        System.out.println("The BookTitle           : " + bookTitle);
        System.out.println("The authorName          : " + authorName);
        System.out.println("Book MRP                : " + price);
        System.out.println("Total AvailableQuantity : " + availableQuantity);
    }
    public static void main(String [] args)
    {
        Book b = new Book();
        b. setisbn("IYI");
        b. setbookTitle("MY LIFE");
        b. setauthorName("SAKIF KHAN");
        b. setprice(2000);
        b. setavailableQuantity(1001);
        b. showdetails();


    }

    

    
}
    

