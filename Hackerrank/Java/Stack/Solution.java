import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
        ArrayList<String> queries = new ArrayList<String>();
		while (sc.hasNext()) {
			String input=sc.next();
            queries.add(input);
            //Complete the code
		}
        for(int i=0;i<queries.size();i++){
            String pattern = queries.get(i);
            ArrayList<Character> stack = new ArrayList<Character>();
            for(int j=0;j<pattern.length();j++){
                if(pattern.charAt(j) == '{' || pattern.charAt(j) == '[' || pattern.charAt(j) == '('){
                    stack.add(pattern.charAt(j));
                }
                else{
                    if(pattern.charAt(j) == '}'){
                        if(stack.size() > 0 && stack.get((stack.size()-1))=='{'){
                            stack.remove((stack.size()-1));
                        }
                        else{
                            stack.add('}');
                        }
                    }
                    else if(pattern.charAt(j) == ']'){
                        if(stack.size() > 0 && stack.get((stack.size()-1))=='['){
                            stack.remove((stack.size()-1));
                        }
                        else{
                            stack.add(']');
                        }
                    }
                    else if(pattern.charAt(j) == ')'){
                        if(stack.size() > 0 && stack.get((stack.size()-1))=='('){
                            stack.remove((stack.size()-1));
                        }
                        else{
                            stack.add(')');
                        }
                    }       
                }
                // System.out.println(stack);
            }
            // System.out.println(stack);
            if(stack.size()==0){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        }
        
		
	}
}
