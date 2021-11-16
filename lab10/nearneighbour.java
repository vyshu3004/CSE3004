import java.util.*;
public class nearestneighbour{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
System.out.println("enter no of points");
int n=sc.nextInt();
int s[]=new int[n];
int e[]=new int[n];
System.out.println("enter start and end points");
for(int i=0;i<n;i++)
{
s[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
e[i]=sc.nextInt();
}
near(s,e,n);
}

static void near(int s[],int e[],int n)
{
	int count;
int minlef=Min(s,0,n);
int minrig=Min(e,0,n);
int mind=Math.min(minlef,minrig);
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(s[i]==e[j])
{
	count=0;
}
}
}
System.out.println("output: 0");
}
static int Min(int a[], int index, int l)
{
    int min;
    if (index >= l - 2)
    {
        if (a[index] < a[index + 1])
            return a[index];
        else
            return a[index + 1];
    }
    min = Min(a, index + 1, l);
 
    if (a[index] < min)
        return a[index];
    else
        return min;
}
}