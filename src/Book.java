public class Book {
 int book;
 String title , author;
 double price;

 public void setBookId(int bo){
     book = bo;
 }
 public int getBookId(){
        return book;
 }
 public void setTitle(String t){
        title = t;
 }
 public String getTitle(){
        return title;
 }
 public void setAuthor(String A){
        author = A;
 }
 public String getAuthor(){
      return author;
 }
 public void setPrice(Double D){
        price = D;
    }
 public double getPrice(){
      return price;
    }

void displayDetails(){
     System.out.println("book id :"+getBookId()+" "+"Author : "+ getAuthor()+" "+"Book Title"+ getTitle()+" "+"Book Price"+ getPrice());
}
}
