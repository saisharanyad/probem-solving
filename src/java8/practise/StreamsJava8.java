package java8.practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsJava8 {
	
	
	
	public static void main(String args[]) {
		Trader raoul = new Trader("Raoul","Cambridge");
		Trader  mario = new Trader("Mario","Milan");
		Trader alan = new Trader("Alan","Cambridge");
		Trader brian = new Trader("Brian","Cambridge");
		
		 List<Transaction> transactionList = Arrays.asList(
				new Transaction(brian,2011,300),
				new Transaction(raoul,2012,1000),
				new Transaction(raoul,2011,400),
				new Transaction(mario,2012,710),
				new Transaction(mario,2012,700),
				new Transaction(alan,2012,950)
				);
		 
		 //Find all transactions in 2011 and sort by value(small to high)
		 List<Transaction> transactions1 = transactionList.stream().
				filter(t -> t.getYear()==2011)
				.sorted(Comparator.comparing(t->t.getValue())) //Transaction::getValue
				.collect(Collectors.toList());
		System.out.println(transactions1);
		System.out.println("======================");
		
		//what are all the unique cities where the traders work
		List<String> cities = transactionList.stream()
				.map(t->t.getTrader().getCity())
				.distinct()
				.collect(Collectors.toList());
		
		Set<String> cities1 = transactionList.stream()
				.map(t->t.getTrader().getCity())
				.collect(Collectors.toSet());
		System.out.println(cities);
		
		System.out.println("==========================");
		
		//Find all traders from cambridge and sort them by name
		List<String> tradernames = transactionList.stream()
				.filter(t->t.getTrader().getCity().equals("Cambridge"))
				.map(t->t.getTrader().getName())
				.sorted()
				.distinct()
				.collect(Collectors.toList());				
		 System.out.println(tradernames);
		 
		 System.out.println("============================");
		 
		 //string of all trader names sorted alphabetically
		 String allTraderNames = transactionList.stream()
				 				 .map(t->t.getTrader().getName())
				 				 .distinct()
				 				 .sorted()
				 				 .reduce("",(n1,n2)->n1+n2);
		 
		 String allTraderNames1 = transactionList.stream()
 				 .map(t->t.getTrader().getName())
 				 .distinct()
 				 .sorted()
 				 .collect(Collectors.joining());
		 
		 System.out.println(allTraderNames);
		 System.out.println(allTraderNames1);
		 
		 //any traders based in milan
		 boolean milanTraders = transactionList.stream()
				 					  .anyMatch(t->t.getTrader().getCity().equals("Milan"));
				 			
		 System.out.println(milanTraders);
		 
		 
		 //all transaction values from traders living in "Cambridge"
		 List<Integer> allTransactions = transactionList.stream().
				 						 filter(t->t.getTrader().getCity().equals("Cambridge")).
				 						 map(t->t.getValue())
				 						 .collect(Collectors.toList());
		 System.out.println(allTransactions);
		 
		 //highest value of all the transactions
		 Optional<Integer> highestTrasactionVal = transactionList.stream().map(t->t.getValue()).
				 					reduce(Integer::max);
		 System.out.println(highestTrasactionVal);
		 
		 System.out.println("=====================");
		 //Finds the transaction with smallest val
		 Optional<Transaction> smallestTransaction = transactionList.stream().min(
				 Comparator.comparing(t->t.getValue()));
		 System.out.println(smallestTransaction);
		 
		 //using flatMap
		 List<String> words = Arrays.asList("Hello","world");
		 List<String> distinctwords = words.stream().map(w->w.split(""))
		 .flatMap(Arrays::stream)
		 .distinct()
		 .collect(Collectors.toList());
		 
		 System.out.println(distinctwords);
		 
	}

}
