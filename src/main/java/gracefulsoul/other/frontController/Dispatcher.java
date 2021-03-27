package gracefulsoul.other.frontController;

public class Dispatcher {

	private StudentView studentView;
	private HomeView homeView;

	public Dispatcher() {
		this.studentView = new StudentView();
		this.homeView = new HomeView();
	}

	public void dispatch(Request request) {
		if (Request.STUDENT.equals(request)) {
			this.studentView.show();
		} else {
			homeView.show();
		}
	}

}
