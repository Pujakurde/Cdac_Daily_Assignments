package stack;

public class ValidParenthesis {
	public static void main(String[] args) {
		ValidParenthesis vp= new ValidParenthesis();
        String input="()[]{}";
        String input1="()";
        String input2="(]";
        String input3="([])";
        String input4="([)]";

        System.out.println("The result is: "+vp.isValid(input));//true
        System.out.println("The result is: "+vp.isValid(input1));//true
        System.out.println("The result is: "+vp.isValid(input2));//false
        System.out.println("The result is: "+vp.isValid(input3));//true
        System.out.println("The result is: "+vp.isValid(input4));//false
    }

	private boolean isValid(String s) {
		 char[] stack = new char[s.length()];
	     int top = -1;

	     for (char c : s.toCharArray()) {
	    	 if(c=='('|| c=='{'|| c== '[') {
	    		 stack[++top]=c;
	    	 }
	    	 else {
	    		 if(top==-1) {
	    			 return false;
	    		 }
	    		 char open= stack[top--];
	    		 if(c==')'&& open!='(') {
	    			 return false;
	    		 }
	    		 if(c=='}'&& open!='{') {
	    			 return false;
	    		 }
	    		 if(c==']'&& open!='[') {
	    			 return false;
	    		 }
	    	 }
	    	 
	     }
	     //empty or not
		return top==-1;
	}

}
