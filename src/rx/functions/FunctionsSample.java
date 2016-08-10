package rx.functions;

public class FunctionsSample {

	/**
	 * Func1 - Func9  表示参数T的个数， T是参数 R是返回
	 */
	public static void main(String[] args) {

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
		
		FuncN<Integer> funcn = Functions.fromFunc(func1);
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
		System.out.println(funcn.call("1", "1", "1", "1", "1", "1", "1", "1", "1"));
		
		// 相当于一个对外的类，实际调用的还是Func1 - Func9
		new FuncN<Integer>() {

			@Override
			public Integer call(Object... args) {
				return null;
			}
		};

	}
}
