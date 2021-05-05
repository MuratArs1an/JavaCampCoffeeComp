package coffeeCompnyDemo;

import java.rmi.RemoteException;
import java.util.function.ToLongBiFunction;

import org.apache.axis.AxisFault;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapStub;

public class MernisServiseAdapter implements CustomerCheckServise{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client= new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(customer.nationalId,customer.firstName.toUpperCase(),customer.lastName.toUpperCase(),customer.dogumYili);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

}
