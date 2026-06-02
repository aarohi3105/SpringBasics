package in.sp.bean;

import java.util.ArrayList;
import java.util.List;

public class Subjects {
List<String> sub = new ArrayList<>();

public List<String> getSub() {
	return sub;
}

public void setSub(List<String> sub) {
	this.sub = sub;
}
public String toString() {
	return sub.toString();
}
}
