/*
 * 		file.Classes[0].Name	"Pizza2"	string
+		file.Operands	Count = 440	System.Collections.Generic.List<string>
-		file.Operators	Count = 33	System.Collections.Generic.List<string>
		[0]	"<"	string
		[1]	">"	string
		[2]	"="	string
		[3]	"="	string
		[4]	"+"	string
		[5]	"<"	string
		[6]	">"	string
		[7]	"<"	string
		[8]	">"	string
		[9]	"if"	string
		[10]	"<"	string
		[11]	"<"	string
		[12]	">"	string
		[13]	">"	string
		[14]	"<"	string
		[15]	">"	string
		[16]	"<"	string
		[17]	"<"	string
		[18]	">"	string
		[19]	">"	string
		[20]	"="	string
		[21]	"<"	string
		[22]	"<"	string
		[23]	">"	string
		[24]	">"	string
		[25]	"for"	string
		[26]	"="	string
		[27]	"if"	string
		[28]	"<"	string
		[29]	">"	string
		[30]	"="	string
		[31]	"<"	string
		[32]	">"	string
+		Raw View		
		file.Node.EntityId	1872358177	long

		BM_CognitiveComplexity	2.41025641025641	double
		BM_CouplingBetweenObjectClasses	0	double
		BM_CyclomaticComplexity	1	double
		BM_DepthOfInheritance	0	int
		BM_EffectiveComplexityScoreLogicalComplexity	0	double
		BM_EffectiveComplexityScoreRelations	0	double
		BM_EffectiveComplexityScoreSoftwareScience	0	double
		BM_HalsteadNumOperands	59.84615384615385	double
		BM_HalsteadNumOperators	10.205128205128204	double
		BM_HalsteadNumUniqueOperands	21.76923076923077	double
		BM_HalsteadNumUniqueOperators	2.5641025641025643	double
		BM_InherentComplexityScoreLogicalComplexity	0	double
		BM_InherentComplexityScoreRelations	0	double
		BM_InherentComplexityScoreSoftwareScience	0	double
		BM_LackOfCohesion	0.94	double
		BM_LinesOfCode	80	int
		BM_LinesOfComments	2	int
		BM_LinesPseudoDeleted	0	int
		BM_NestingDepth	2	int
		BM_Size	1880	long
		Binary	false	bool
		
 */
package basic.classes.enums;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

public class Pizza2 {
	private static EnumSet<PizzaStatus> undeliveredPizzaStatuses =
		      EnumSet.of(PizzaStatus.ORDERED, PizzaStatus.READY);
	
	private PizzaStatus status;	
	
	public enum PizzaStatus {
		//This is a comment 1
		ORDERED(5) {
			@Override
			public boolean isOrdered() {
				return true;
			}
		},
		READY(2) {
			//This is a comment 1
			@Override
			public boolean isReady() {
				//This is a comment 2
				return true;
			}
		},
		DELIVERED(0) {
			@Override
			public boolean isDelivered() {
				return true;
			}
		};

		private int timeToDelivery;

		public boolean isOrdered() {
			return false;
		}

		public boolean isReady() {
			return false;
		}

		public boolean isDelivered() {
			return false;
		}

		public int getTimeToDelivery() {
			return timeToDelivery;
		}

		PizzaStatus(int timeToDelivery) {
			this.timeToDelivery = timeToDelivery;
		}
	}
	
	public boolean isDeliverable() {
		return this.status.isReady();
	}

	public void printTimeToDeliver() {
		System.out.println("Time to delivery is " + this.getStatus().getTimeToDelivery());
	}

	public static List<Pizza> getAllUndeliveredPizzas(List<Pizza> input) {
        return input.stream().filter(
          (s) -> undeliveredPizzaStatuses.contains(s.getStatus()))
            .collect(Collectors.toList());
    }
	
	public void deliver() { 
        if (isDeliverable()) { 
            ((PizzaDeliverySystemConfiguration) PizzaDeliverySystemConfiguration.getInstance()).getDeliveryStrategy()
              .deliver(this); 
            this.setStatus(PizzaStatus.DELIVERED); 
        } 
    }

	private void setStatus(PizzaStatus delivered) {
		// TODO Auto-generated method stub
		
	}

	private PizzaStatus getStatus() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static EnumMap<PizzaStatus, List<Pizza>> 
	  groupPizzaByStatus(List<Pizza> pizzaList) {
	    EnumMap<PizzaStatus, List<Pizza>> pzByStatus = 
	      new EnumMap<PizzaStatus, List<Pizza>>(PizzaStatus.class);
	    
	    for (Pizza pz : pizzaList) {
	        PizzaStatus status = pz.getStatus();
	        if (pzByStatus.containsKey(status)) {
	            pzByStatus.get(status).add(pz);
	        } else {
	            List<Pizza> newPzList = new ArrayList<Pizza>();
	            newPzList.add(pz);
	            pzByStatus.put(status, newPzList);
	        }
	    }
	    return pzByStatus;
	}
}
