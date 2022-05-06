import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImmutableExample {
	public static void main(String[] args) {
		List<Integer> initialList = new ArrayList<>();
		initialList.add(1);
		initialList.add(2);
		initialList.add(3);
		
		Immutable obj = new Immutable("chandrahas", new Date(), initialList);
		System.out.println(obj.getName());
		Date date = obj.getDate();
		date.setYear(100);
		System.out.println(obj.getDate());
		List<Integer> list = obj.getList();
		list.add(100);
		System.out.println(obj.getList());
	}
}

final class Immutable {
	final private String name;
	final private Date date;
	final private List<Integer> list;

	public Immutable(String name, Date date, List<Integer> list) {
		this.name = name;
		this.date = date;
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		return (Date) date.clone();
	}

	public List<Integer> getList() {
		return new ArrayList<>(list);
	}
}