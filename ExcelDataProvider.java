package Utils;

import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
	
	@DataProvider(name = "TestData")
    public static Object[][] data_providerMethod() throws Exception{
		
        Object[][] testObjArray = ExcelUtils.getTableArray("Data\\TestData.xlsx","Sheet1");       
        return (testObjArray);
        
    }
	
}
