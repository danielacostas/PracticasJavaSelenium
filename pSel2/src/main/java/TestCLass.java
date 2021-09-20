import org.testng.annotations.Test;

public class TestCLass {

    Toolsqa toolsqa = new Toolsqa();

    @Test
    public void testCase(){

        toolsqa.invokeBrowser();
        toolsqa.getMenuList();
        toolsqa.getSocialMedia();
        toolsqa.searchPostman();
        toolsqa.getArticleList();
    }

}
