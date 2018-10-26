package cup.objects.dam.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cup.objects.NonMatchingAccounts;
import cup.objects.dam.NonMatchingAccountsExtractor;

@RestController
@RequestMapping("/nonmatching")
public class NonMatchingAccountsApi {

	@Autowired
	NonMatchingAccountsExtractor DAM;
	
	/**
	 * @return GET - http://localhost:8080/nonmatching/all | Returns ALL NonMatchingAccounts objects
	 */
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<NonMatchingAccounts> getAllNonMatchingAccounts() {
		return DAM.getAllNonmatchingAccounts() ;
	}
	
}
