/*
 * 		file.Classes[0].Name	"Main"	string
-		file.Operands	Count = 110	System.Collections.Generic.List<string>
		[0]	"package"	string
		[1]	"basic"	string
		[2]	"."	string
		[3]	"classes"	string
		[4]	"."	string
		[5]	"enums"	string
		[6]	";"	string
		[7]	"public"	string
		[8]	"class"	string
		[9]	"Main"	string
		[10]	"{"	string
		[11]	"enum"	string
		[12]	"Level"	string
		[13]	"{"	string
		[14]	"LOW"	string
		[15]	","	string
		[16]	"MEDIUM"	string
		[17]	","	string
		[18]	"HIGH"	string
		[19]	"}"	string
		[20]	"public"	string
		[21]	"static"	string
		[22]	"void"	string
		[23]	"main"	string
		[24]	"("	string
		[25]	"String"	string
		[26]	"["	string
		[27]	"]"	string
		[28]	"args"	string
		[29]	")"	string
		[30]	"{"	string
		[31]	"Level"	string
		[32]	"myVar"	string
		[33]	"Level"	string
		[34]	"."	string
		[35]	"MEDIUM"	string
		[36]	";"	string
		[37]	"System"	string
		[38]	"."	string
		[39]	"out"	string
		[40]	"."	string
		[41]	"println"	string
		[42]	"("	string
		[43]	"myVar"	string
		[44]	")"	string
		[45]	";"	string
		[46]	"("	string
		[47]	"myVar"	string
		[48]	")"	string
		[49]	"{"	string
		[50]	"LOW"	string
		[51]	":"	string
		[52]	"System"	string
		[53]	"."	string
		[54]	"out"	string
		[55]	"."	string
		[56]	"println"	string
		[57]	"("	string
		[58]	"\"Low level\""	string
		[59]	")"	string
		[60]	";"	string
		[61]	";"	string
		[62]	"MEDIUM"	string
		[63]	":"	string
		[64]	"System"	string
		[65]	"."	string
		[66]	"out"	string
		[67]	"."	string
		[68]	"println"	string
		[69]	"("	string
		[70]	"\"Medium level\""	string
		[71]	")"	string
		[72]	";"	string
		[73]	";"	string
		[74]	"HIGH"	string
		[75]	":"	string
		[76]	"System"	string
		[77]	"."	string
		[78]	"out"	string
		[79]	"."	string
		[80]	"println"	string
		[81]	"("	string
		[82]	"\"High level\""	string
		[83]	")"	string
		[84]	";"	string
		[85]	";"	string
		[86]	"}"	string
		[87]	"("	string
		[88]	"Level"	string
		[89]	"myVar1"	string
		[90]	":"	string
		[91]	"Level"	string
		[92]	"."	string
		[93]	"values"	string
		[94]	"("	string
		[95]	")"	string
		[96]	")"	string
		[97]	"{"	string
		[98]	"System"	string
		[99]	"."	string
		[100]	"out"	string
		[101]	"."	string
		[102]	"println"	string
		[103]	"("	string
		[104]	"myVar1"	string
		[105]	")"	string
		[106]	";"	string
		[107]	"}"	string
		[108]	"}"	string
		[109]	"}"	string
+		Raw View		
-		file.Operators	Count = 9	System.Collections.Generic.List<string>
		[0]	"="	string
		[1]	"switch"	string
		[2]	"case"	string
		[3]	"break"	string
		[4]	"case"	string
		[5]	"break"	string
		[6]	"case"	string
		[7]	"break"	string
		[8]	"for"	string
+		Raw View		
		file.Node.EntityId	-1629264588	long

		BM_CognitiveComplexity	5	double
		BM_CouplingBetweenObjectClasses	0	double
		BM_CyclomaticComplexity	7	double
		BM_DepthOfInheritance	0	int
		BM_EffectiveComplexityScoreLogicalComplexity	0	double
		BM_EffectiveComplexityScoreRelations	0	double
		BM_EffectiveComplexityScoreSoftwareScience	0	double
		BM_HalsteadNumOperands	89	double
		BM_HalsteadNumOperators	9	double
		BM_HalsteadNumUniqueOperands	28	double
		BM_HalsteadNumUniqueOperators	5	double
		BM_InherentComplexityScoreLogicalComplexity	0	double
		BM_InherentComplexityScoreRelations	0	double
		BM_InherentComplexityScoreSoftwareScience	0	double
		BM_LackOfCohesion	1	double
		BM_LinesOfCode	23	int
		BM_LinesOfComments	0	int
		BM_LinesPseudoDeleted	0	int
		BM_NestingDepth	2	int
		BM_Size	422	long
		
 */
package basic.classes.enums;

public class Main {

	enum Level {
		LOW, MEDIUM, HIGH
	}

	public static void main(String[] args) {
		Level myVar = Level.MEDIUM;
		System.out.println(myVar);

		switch (myVar) {
		case LOW:
			System.out.println("Low level");
			break;
		case MEDIUM:
			System.out.println("Medium level");
			break;
		case HIGH:
			System.out.println("High level");
			break;
		}

		for (Level myVar1 : Level.values()) {
			System.out.println(myVar1);
		}
	}

}
