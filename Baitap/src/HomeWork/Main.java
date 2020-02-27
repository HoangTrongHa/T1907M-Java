package HomeWork;


    public class Main {
        public static void main(String[] args) {
            New myNews = new New() {
            };
            myNews.setID(1);
            myNews.setTitle("Naruto");
            myNews.setAuthor("Japan");
            myNews.setContent("Ninja");
            myNews.setPublishDate("14/11/1994");
            myNews.setAverageRate(10);
            System.out.println(myNews);
            myNews.Display();
        }
    }

