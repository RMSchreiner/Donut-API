package API.Donuts.Donuts.Model;

import java.util.List;

public class Donut {

	private int count;
	private List <Results> results;
	
	public Donut() {
		
	}

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Results> getResults() {
		return results;
	}
	public void setResults(List<Results> results) {
		this.results = results;
	}
	@Override
	public String toString() {
		return "Donut [count=" + count + ", results=" + results + "]";
	}
}
