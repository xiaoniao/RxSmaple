package rx.functions;

//Func 是有参数有返回值 Action 是有参数没有返回值的 ( 当然也可以有0个参数 )
public class FunctionsSample {

	/**
	 * Func1 - Func9
	 */
	public static void main(String[] args) {

		Func0<Integer> func0 = new Func0<Integer>() {
			
			@Override
			public Integer call() {
				return 0;
			}
		};
		
		Func1<String, Integer> func1 = new Func1<String, Integer>() {

			@Override
			public Integer call(String t) {
				return Integer.parseInt(t);
			}
		};

		Func2<String, String, Integer> func2 = new Func2<String, String, Integer>() {

			@Override
			public Integer call(String t1, String t2) {
				return Integer.parseInt(t1) + Integer.parseInt(t2);
			}
		};

		Func3<String, String, String, Integer> func3 = new Func3<String, String, String, Integer>() {

			@Override
			public Integer call(String t1, String t2, String t3) {
				return Integer.parseInt(t1) + Integer.parseInt(t2) + +Integer.parseInt(t3);
			}
		};

		Func4<String, String, String, String, Integer> func4 = new Func4<String, String, String, String, Integer>() {

			@Override
			public Integer call(String t1, String t2, String t3, String t4) {
				return Integer.parseInt(t1) + Integer.parseInt(t2) + Integer.parseInt(t3) + Integer.parseInt(t4);
			}
		};

		Func5<String, String, String, String, String, Integer> func5 = new Func5<String, String, String, String, String, Integer>() {

			@Override
			public Integer call(String t1, String t2, String t3, String t4, String t5) {
				return Integer.parseInt(t1) + Integer.parseInt(t2) + Integer.parseInt(t3) + Integer.parseInt(t4) + Integer.parseInt(t5);
			}
		};

		Func6<String, String, String, String, String, String, Integer> func6 = new Func6<String, String, String, String, String, String, Integer>() {

			@Override
			public Integer call(String t1, String t2, String t3, String t4, String t5, String t6) {
				return Integer.parseInt(t1) + Integer.parseInt(t2) + Integer.parseInt(t3) + Integer.parseInt(t4) + Integer.parseInt(t5) + Integer.parseInt(t6);
			}
		};
		
		Func7<String, String, String, String, String, String, String, Integer> func7 = new Func7<String, String, String, String, String, String, String, Integer>() {
			
			@Override
			public Integer call(String t1, String t2, String t3, String t4, String t5, String t6, String t7) {
				return Integer.parseInt(t1) + Integer.parseInt(t2) + Integer.parseInt(t3) + Integer.parseInt(t4) + Integer.parseInt(t5) + Integer.parseInt(t6) + Integer.parseInt(t7);
			}
		};
		
		Func8<String, String, String, String, String, String, String, String, Integer> func8 = new Func8<String, String, String, String, String, String, String, String, Integer>() {
			
			@Override
			public Integer call(String t1, String t2, String t3, String t4, String t5, String t6, String t7, String t8) {
				return Integer.parseInt(t1) + Integer.parseInt(t2) + Integer.parseInt(t3) + Integer.parseInt(t4) + Integer.parseInt(t5) + Integer.parseInt(t6) + Integer.parseInt(t7) + Integer.parseInt(t8);
			}
		};
		
		Func9<String, String, String, String, String, String, String, String, String, Integer> func9 = new Func9<String, String, String, String, String, String, String, String, String, Integer>() {
			
			@Override
			public Integer call(String t1, String t2, String t3, String t4, String t5, String t6, String t7, String t8, String t9) {
				return Integer.parseInt(t1) + Integer.parseInt(t2) + Integer.parseInt(t3) + Integer.parseInt(t4) + Integer.parseInt(t5) + Integer.parseInt(t6) + Integer.parseInt(t7) + Integer.parseInt(t8) + Integer.parseInt(t9);
			}
		};
		
		FuncN<Integer> funcn = Functions.fromFunc(func0);
		System.out.println(funcn.call());
		
		funcn = Functions.fromFunc(func1);
		System.out.println(funcn.call("1"));

		funcn = Functions.fromFunc(func2);
		System.out.println(funcn.call("1", "1"));
		
		funcn = Functions.fromFunc(func3);
		System.out.println(funcn.call("1", "1", "1"));
		
		funcn = Functions.fromFunc(func4);
		System.out.println(funcn.call("1", "1", "1", "1"));
		
		funcn = Functions.fromFunc(func5);
		System.out.println(funcn.call("1", "1", "1", "1", "1"));
		
		funcn = Functions.fromFunc(func6);
		System.out.println(funcn.call("1", "1", "1", "1", "1", "1"));
		
		funcn = Functions.fromFunc(func7);
		System.out.println(funcn.call("1", "1", "1", "1", "1", "1", "1"));
		
		funcn = Functions.fromFunc(func8);
		System.out.println(funcn.call("1", "1", "1", "1", "1", "1", "1", "1"));
		
		funcn = Functions.fromFunc(func9);
		System.out.println("==" + func9.call("1", "1", "1", "1", "1", "1", "1", "1", "1")); // 和单单调用func9是一样的
		System.out.println(funcn.call("1", "1", "1", "1", "1", "1", "1", "1", "1")); // 这里也是调用的func9
		
		//
		System.out.println("---");
		int a = new FuncN<Integer>() {

			Func1<String, Integer> func1 = new Func1<String, Integer>() {
				
				@Override
				public Integer call(String t) {
					return Integer.parseInt(t);
				}
			};
			
			@Override
			public Integer call(Object... args) {
				return func1.call((String) args[0]);
			}
		}.call("1");
		
		System.out.println(a);
		
		// Functions 类是一个代理类 拥有了可变参数，然后再去调用具体的 Func1 - Func9
		
		// Action
		System.out.println("action");
		Functions.fromAction(new Action0() {
			
			@Override
			public void call() {
				System.out.println("action0");
			}
		}).call();
		
		Functions.fromAction(new Action1<String>() {

			@Override
			public void call(String t) {
				System.out.println(t);
			}
		}).call("1");
		
		Functions.fromAction(new Action2<String, String>() {

			@Override
			public void call(String t, String t2) {
				System.out.println(t + " " + t2);
			}
		}).call("1", "2");
		
		Functions.fromAction(new Action3<String, String, String>() {

			@Override
			public void call(String t, String t2, String t3) {
				System.out.println(t + " " + t2 + " " + t3);
			}
		}).call("1", "2", "3");
		
		// 真是太神奇了 面向接口编程真是太神奇了
		System.out.println("测试");
		int b = Functions.fromFunc(Actions.toFunc(new Action1<String>() {

			@Override
			public void call(String t) {
				System.out.println("call string : " + t);
			}
		}, 1)).call("1");
		System.out.println(b);
	}
}
