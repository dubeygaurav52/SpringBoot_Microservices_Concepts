package in.gaurav.generators;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderIdGenerator implements IdentifierGenerator{

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		String prefix="OD";
		String suffix="";
		try {
			//session
		} catch (Exception e) {
			
		}
		return prefix+suffix;
	}

}
