package tool;

public class find {
	static public  String[][] arr={{"0a166bdaed7025d955654e590820ccdd",
		"e02419985ed5e65c40a9b07b175fb043","3636bebbc10a446e2a341c36933a826c"},{"³ÂÕÜ","»ÆÒ»Ìì","¸ßÓê"}};
	public find(){}
	public String fd(String a)
	{
		int i=0;
		while(!a.equals(arr[0][i])){i++;}
		String b=arr[1][i];

		return b;
	}
}
