import java.io.IOException;

import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;


public class HundredPercent extends EvalFunc<Boolean>{

	@Override
	public Boolean exec(Tuple tuple) throws IOException {
		if (tuple==null)
				return null;
		float percentage=0;
		float objective=Float.valueOf(((String)tuple.get(0)).trim());
		float performance=Float.valueOf(((String)tuple.get(1)).trim());;
		percentage= performance/objective *100;
		
		if(percentage>=100f)
		{
			return true;
		}
		return false;		
	}
}
