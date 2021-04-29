import com.simran.ISubscriber;
import com.simran.StockPublisher;
import com.simran.StockSubscriber;
import org.junit.Test;

public class DriverTest
{
    @Test
    public void defaultTest()
    {
        StockPublisher stockPublisher = new StockPublisher();
        ISubscriber subscriber = new StockSubscriber(stockPublisher);
        stockPublisher.setAaplPrice(100.0);
        stockPublisher.setIbmPrice(20.0);
        stockPublisher.setGoogPrice(50.0);

    }
}
