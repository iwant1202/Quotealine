import java.util.LinkedList;

public class QuoteList{
	private dirNode prevDir = new dirNode;
	private dirNode root = addDir("Home", null);
	private dirNode currDir = root;

	public quoteNode deleteQuote(quoteNode target){
		//Remove from linked list
		return null;
	}

	public dirNode deleteDir(dirNode target){
		//Remove from linked list
		//Check Java garbage collection, could have nasty leak
		return null;
	}
	
	public dirNode forwardTraverse(dirNode target){
		//Select directory from linked list
		//preferably also number selection implement
	}
	public dirNode backwardsTraverese(dirNode target){
		//Go to prevDir, could be useful if any hopping 
		//is later implemented in the code
	}
	

	public quoteNode addQuote(String quote){
		return addQuote(quote, currDir);
	}
	public dirNode addDir(String title, dirNode parent){
		return addDir(title, currnode);
		
	}
	
	public quoteNode addQuote(String quote, dirNode parent){
		quoteNode newQuote = new quoteNode;
	
		newQuote.parent = currDir;
		newQuote.quote = quote;
		
		currDir.tchildren.addlast(newDir);
		
		return newQuote;
	}

	public dirNode addDir(String title, dirNode parent){
		private dirNode newDir = new dirNode; 
		newDir.tchildren = null;
		newDir.dchildren = null;
		newDir.title = title;
		newDir.parent = currDir;
		
		currDir.dchildren.addLast(newDir);
		return newDir; 

	}

	private class Node{
		//maybe delete
		private Anytype data; 
		private dirNode parent;
	}
	private class quoteNode{
		private String quote;
		private dirNode parent;
	}

	private class dirNode{
		private String title;
		private LinkedList<txtNode> tchildren;
		private LinkedList<dirNode> dchildren;
		private dirNode parent;
	}

}
