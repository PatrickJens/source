//use a heap

import java.util.*;

public class TXRX
{

	public static void printLists(ArrayList<String> la, ArrayList<Integer> lb)
	{
		System.out.println("....print list...");
		int i = 0;
		if( la.size() != lb.size())
		{
			System.out.println("List lengths do not match");
		}
		else
		{
			for(i = 0 ; i < la.size(); i ++)
			{
				
				System.out.print(""+la.get(i)+"   ");
				System.out.println(""+lb.get(i));
			}
		}
	}

	public static List<String> processLogs(List<String> logs, int threshold)
	{
		String[] tmp = 				new String[3];
		ArrayList<String> ids = 	new ArrayList<String>();
		ArrayList<Integer> cnt = 	new ArrayList<Integer>();
		int i, j 				=		0;

		//per entry in logs, split each string entry on space delimiter
		for(i = 0 ; i < logs.size(); i ++)
		{
			tmp = logs.get(i).split(" ");

			if( !(tmp[0].equals(tmp[1])) )
			{	
				if( !(ids.contains(tmp[0])) )
				{
					System.out.println("----Not equal, Not Contains, 0----");
					ids.add(tmp[0]);															//System.out.println("T/F" + (ids.contains(tmp[0])) + " " );
					cnt.add(1);
					System.out.println("ids index:  " + ids.get(ids.indexOf(tmp[0])) + "     tmp:     "+tmp[0] +"    cnt num:    " + cnt.get(ids.indexOf(tmp[0])));
				}
				else //if( ids.contains(tmp[0]) )
				{
					System.out.println("----Not equal, Contains, 0----");
					cnt.set(ids.indexOf(tmp[0]),cnt.get(ids.indexOf(tmp[0]))+1);   				//System.out.println(""+cnt.get(0));//System.out.println("" + cnt.get(ids.indexOf(tmp[0])) + " " );
					System.out.println("ids index:  " + ids.get(ids.indexOf(tmp[0])) + "     tmp:     "+tmp[0] +"    cnt num:    " + cnt.get(ids.indexOf(tmp[0])));
				}  
				if( !(ids.contains(tmp[1])))
				{
					System.out.println("----Not equal, Not Contains, 1----");
					ids.add(tmp[1]);
					cnt.add(1);
					System.out.println("ids index:  " + ids.get(ids.indexOf(tmp[1])) + "     tmp:     "+tmp[1] +"    cnt num:    " + cnt.get(ids.indexOf(tmp[1])));
				}
				else //if( ids.contains(tmp[1]))
				{
					System.out.println("----Not equal, Contains, 1----");
					cnt.set(ids.indexOf(tmp[1]),cnt.get(ids.indexOf(tmp[1]))+1);
					System.out.println("ids index:  " + ids.get(ids.indexOf(tmp[1])) + "     tmp:     "+tmp[1] +"    cnt num:    " + cnt.get(ids.indexOf(tmp[1])));
				}
			}
			else
			{
				
				if( !(ids.contains(tmp[0])) )
				{
					System.out.println("----Equal, Not Contains, 0=1----");
					ids.add(tmp[0]);															//System.out.println("" + ids.get(ids.indexOf(tmp[0])) + " " );
					cnt.add(1);
					System.out.println("ids index:  " + ids.get(ids.indexOf(tmp[0])) + "     tmp:     "+tmp[0] +"    cnt num:    " + cnt.get(ids.indexOf(tmp[0])));
					
				}
				else //if( ids.contains(tmp[0]) )
				{
					System.out.println("----Equal, Contains, 0=1----");
					cnt.set(ids.indexOf(tmp[0]),cnt.get(ids.indexOf(tmp[0]))+1);
					System.out.println("ids index:  " + ids.get(ids.indexOf(tmp[0])) + "     tmp:     "+tmp[0] +"    cnt num:    " + cnt.get(ids.indexOf(tmp[0])));
				}  
			}
		}

		printLists(ids, cnt);

		//sort
		if(cnt.size() != ids.size())
		{
			System.out.println("Sort:   Lengths don't match");
			return null;
		}

		String  tmp_id  = ids.get(0);
		Integer tmp_cnt = cnt.get(0);
		Integer max     = cnt.get(0);
		int idx     = 0;


		for(i=0; i < cnt.size() - 1 ; i ++)
		{
			for( j=0; j < cnt.size()-1-i; j ++)
			{
				//System.out.println(""+cnt.get(j)+"  compareTo  "+cnt.get(j+1)+"  results in " +  cnt.get(j).compareTo(cnt.get(j+1)));
				if(cnt.get(j).compareTo(cnt.get(j+1)) > 0 )
				{
					tmp_cnt      = cnt.get(j+1);
					cnt.set(j+1,cnt.get(j));
					cnt.set(j, tmp_cnt);

					tmp_id       = ids.get(j+1);
					ids.set(j+1,ids.get(j));
					ids.set(j,tmp_id);
				}
			}

		} 
		printLists(ids, cnt);


		ArrayList<String> result = new ArrayList<String>();
		for(i=0; i < cnt.size(); i ++)
		{
			System.out.println("i    "+i+"  count  "+cnt.get(i)+"  compareTothres  "+threshold+"  results in " +  cnt.get(i).compareTo(threshold));
			if( cnt.get(i).compareTo(threshold) >= 0)
			{
				result.add(ids.get(i));
			}
		}
		for(i=0;i<result.size();i++)
		{
			System.out.println(" " +result.get(i) );
		}
		return null;
	}  
	public static void main(String args[])
	{
		List<String> logs = new ArrayList<>(Arrays.asList("88 99 200", "88 99 300", "99 32 100", "12 12 15"));
		int threshold = 2;
		processLogs(logs, threshold);
	}
}