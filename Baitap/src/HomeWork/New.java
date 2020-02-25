package HomeWork;

public class New implements Inews {
    int Id;
    String Title;
    String PublisDate;
    String Author;
    String Content;
    float AvengeRate;

    @Override
    public void Display() {
        System.out.println(""+getTitle());
        System.out.println(""+getAuthor());
        System.out.println(""+getContent());
        System.out.println(""+getPublisDate());
        System.out.println(""+getAvengeRate());
    }

    public New() {
    }

    public New(int id, String title, String publisDate, String author, String content, float avengeRate) {
        Id = id;
        Title = title;
        PublisDate = publisDate;
        Author = author;
        Content = content;
        AvengeRate = avengeRate;
    }

    public int getId() {
        return Id;
    }

    public String getTitle() {
        return Title;
    }

    public String getPublisDate() {
        return PublisDate;
    }

    public String getAuthor() {
        return Author;
    }

    public String getContent() {
        return Content;
    }

    public float getAvengeRate() {
        return AvengeRate;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setPublisDate(String publisDate) {
        PublisDate = publisDate;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setContent(String content) {
        Content = content;
    }
}

