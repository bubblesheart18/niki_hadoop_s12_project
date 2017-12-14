import java.io.IOException;

import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;



public class CalculatePercent extends EvalFunc<Boolean>{

		@Override
		public Boolean exec(Tuple tuple) throws IOException {
			if (tuple==null)
					return null; 
		
			float percentage=0;
			float objective=Float.valueOf(((String)tuple.get(0)).trim());
			float performance=Float.valueOf(((String)tuple.get(1)).trim());
			float percent =(Integer) tuple.get(2);
			percentage= performance/objective * 100f;
			
			if(percentage>=percent)
			{
				return true;
			}
			return false;		
		}

}
