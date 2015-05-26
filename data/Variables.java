package gnomeagility.data;

import java.lang.reflect.Method;

import org.rev317.min.Loader;
import org.rev317.min.api.methods.Game;
import org.rev317.min.api.methods.SceneObjects;

public class Variables {
	public static boolean isLoggedIn() {
		return Game.isLoggedIn();
	}

	public static boolean isAtCourse() {
		return SceneObjects.getNearest(2285, 2313, 2314).length > 0;
	}

	public static void dcClient() {
		try {
			Method dropClient = Loader.getClient().getClass()
					.getDeclaredMethod("V");
			dropClient.setAccessible(true);
			dropClient.invoke(Loader.getClient());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
