package mapuser;

import java.io.BufferedReader;
import java.io.FileReader;
//import java.Exception;
import java.util.HashMap;
import java.util.Map;

public class DomainCount {

	public static void main(String[] args) {
		String fileName="D:/java/JavaWorkspace/CollectionFrameworkString/src/mapuser/emails.txt";
		Map<String,Integer> domainMap =new HashMap<>();
		try {
			BufferedReader br=new BufferedReader(new FileReader (fileName));
			String email;
			while((email=br.readLine())!=null) {
				email=email.trim();
				if(email.length()==0) {
					continue;
				}
				int position=email.indexOf("@");
				if (position!=-1) {
					String domain=email.substring(position+1);
					if(domainMap.containsKey(domain)) 
					{
						domainMap.put(domain, domainMap.get(domain)+1);
								
					}
			
					else {
						domainMap.put(domain,1);
					}
					
				}
				
			}
			br.close();
			System.out.println("Occurence of Domain: ");
			
			for(Map.Entry<String,Integer>entry:domainMap.entrySet()) {
				System.out.println(entry.getKey()+"="+entry.getValue());
			}
			

		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
