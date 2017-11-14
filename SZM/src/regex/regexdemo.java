package regex;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;
import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector.Matcher;
public class regexdemo {
private static final String REGEX="\\bcat\\b";
private static final  String INPUT="cat cat cat cattie cat";
public static void main(String args[]) {
	Pattern p=Pattern.compile(REGEX);
	Matcher m=p.matcher(INPUT);
	int count=0;
	while(m.find()) {
		count++;
		System.out.println("Matcher number "+count);
		System.out.println("start():"+m.start());
		System.out.println("end():"+m.end);
	}
}
}
