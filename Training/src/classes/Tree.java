package classes;
public class Tree
{
private int leaves,branches=10,roots=48;
private String leafcolor="Green";
private String stemcolor="Brown";
public void displayLeafColor()
{
System.out.println("The colour of the leaf is:"+leafcolor);
}
public void displayStemColor()
{
System.out.println("The colour of the stem is:"+stemcolor);
}
public void branchCount()
{
System.out.println("The no.of branches are:"+branches);
}
public void rootCount()
{
System.out.println("The no.of roots are:"+roots);
}
public int leafCount()
{
leaves=branches*30;
return leaves;
}
public static void main(String args[])
{
Tree T=new Tree();
T.displayLeafColor();
T.displayStemColor();
T.branchCount();
T.rootCount();
System.out.println("The no.of leaves in the tree are:"+T.leafCount());
}
}