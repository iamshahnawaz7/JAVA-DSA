package GitHub;

public class SortAStack {
	class GfG{
		public Stack<Integer> sort(Stack<Integer> s)
		{
		    for(int i=0;i<s.capacity();i++){
		        s=descending(s);
		    }
		    return s;
		}
		    
		    public static Stack<Integer> descending(Stack<Integer>s){
		        int p=s.pop();
		        if(s.isEmpty())
		        {
		            s.push(p);
		            return s;
		        }
		        
		        if(p<s.peek()){
		            int temp=p;
		            int po=s.pop();
		            p=po;
		            po=temp;
		            s.push(po);
		        }
		        s=descending(s);
		        s.push(p);
		        return s;
		    }
	}
}
