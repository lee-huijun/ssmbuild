import com.li.pojo.Books;
import com.li.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mytest {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookServiceImpl = context.getBean("BookServiceImpl", BookServiceImpl.class);
        for (Books book:bookServiceImpl.queryAllBook()
             ) {
            System.out.println(book);
        }
    }
    @Test
    public void test2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Books books = new Books(4, "嫩爹修炼之道", 99, "盗版");
        BookServiceImpl bookServiceImpl = context.getBean("BookServiceImpl", BookServiceImpl.class);
        int i = bookServiceImpl.addBook(books);
        System.out.println(i);
    }
}
