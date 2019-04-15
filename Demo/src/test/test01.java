import com.itheima.domin.item;
import com.itheima.service.itemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class test01 {
    @Autowired
    itemService implService;
    @Test
    public void tt(){
        item item = implService.find(1);
        System.out.println(item);
    }

}
