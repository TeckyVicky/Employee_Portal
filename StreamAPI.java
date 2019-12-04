import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		List<String> list1 = new ArrayList<>();
		list.add("c++");
		list.add("java");
		list.add("java");
		list.add("react");
		list.add("angular");
		list.add("angular");
		//sorted()
		//limit()
		//distinct()
		//filter()
		//map()
		//count()
		
		list1 = list.stream().sorted().limit(4).distinct().filter(s->s.length()>4).collect(Collectors.toList());
		list1.forEach(s->System.out.println(s + " " + 1));
	}

}
