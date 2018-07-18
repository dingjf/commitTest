import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Map;

import org.junit.Test;

import com.google.gson.Gson;
import com.omniprimeinc.finance.installment.settlement.services.object.InstalmentObject;
public class TestTest {


	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void test1() throws ParseException {
		Gson gson = new Gson();
		gson.fromJson(
		        "{\"appId\":appId1,\"outStanding\":615.34,\"numInstalment\":4}", InstalmentObject.class)
		JSONObject jsonObject = JSONObject.fromObject(json);
		return JSONObject.toBean(jsonObject, type);
	}

}
