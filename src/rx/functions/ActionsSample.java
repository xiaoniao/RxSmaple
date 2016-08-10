package rx.functions;

import rx.functions.Actions.EmptyAction;

// Func 是有参数有返回值 Action 是有参数没有返回值的 ( 当然也可以有0个参数 )
public class ActionsSample {

	public static void main(String[] args) {

		EmptyAction<String, String, String, String, String, String, String, String, String> emptyAction = Actions.empty();
		emptyAction.call();

		// toFunc Void
		
		Func0<Void> func0 = Actions.toFunc(new Action0() {

			@Override
			public void call() {

			}
		});

		Func1<String, Void> func1 = Actions.toFunc(new Action1<String>() {

			@Override
			public void call(String t) {

			}
		});
		
		Func2<String, String, Void> func2 = Actions.toFunc(new Action2<String, String>() {

			@Override
			public void call(String t1, String t2) {
				
			}
		});
		
		Func3<String, String, String, Void> func3 = Actions.toFunc(new Action3<String, String, String>() {

			@Override
			public void call(String t1, String t2, String t3) {
				
			}
		});
		
		Func4<String, String, String, String, Void> func4 = Actions.toFunc(new Action4<String, String, String, String>() {

			@Override
			public void call(String t1, String t2, String t3, String t4) {
				
			}
		});
		
		Func5<String, String, String, String, String, Void> func5 = Actions.toFunc(new Action5<String, String, String, String, String>() {

			@Override
			public void call(String t1, String t2, String t3, String t4, String t5) {
				
			}
		});
		
		Func6<String, String, String, String, String, String, Void> func6 = Actions.toFunc(new Action6<String, String, String, String, String, String>() {

			@Override
			public void call(String t1, String t2, String t3, String t4, String t5, String t6) {
				
			}
		});
		
		Func7<String, String, String, String, String, String, String, Void> func7 = Actions.toFunc(new Action7<String, String, String, String, String, String, String>() {

			@Override
			public void call(String t1, String t2, String t3, String t4, String t5, String t6, String t7) {
				
			}
		});
		
		Func8<String, String, String, String, String, String, String, String, Void> func8 = Actions.toFunc(new Action8<String, String, String, String, String, String, String, String>() {

			@Override
			public void call(String t1, String t2, String t3, String t4, String t5, String t6, String t7, String t8) {
				
			}
		});
		
		Func9<String, String, String, String, String, String, String, String, String, Void> func9 = Actions.toFunc(new Action9<String, String, String, String, String, String, String, String, String>() {

			@Override
			public void call(String t1, String t2, String t3, String t4, String t5, String t6, String t7, String t8, String t9) {
				
			}
		});
		
		FuncN<Void> funcN = Actions.toFunc(new ActionN() {
			
			@Override
			public void call(Object... args) {
				
			}
		});
		
		
		// toFunc Result
		Func0<Integer> Rfunc0 = Actions.toFunc(new Action0() {

			@Override
			public void call() {

			}
		}, 1);

		Func1<String, Integer> Rfunc1 = Actions.toFunc(new Action1<String>() {

			@Override
			public void call(String t) {

			}
		}, 1);
		
		Func2<String, String, Integer> Rfunc2 = Actions.toFunc(new Action2<String, String>() {

			@Override
			public void call(String t1, String t2) {
				
			}
		}, 1);
		
		Func3<String, String, String, Integer> Rfunc3 = Actions.toFunc(new Action3<String, String, String>() {

			@Override
			public void call(String t1, String t2, String t3) {
				
			}
		}, 1);
		
		Func4<String, String, String, String, Integer> Rfunc4 = Actions.toFunc(new Action4<String, String, String, String>() {

			@Override
			public void call(String t1, String t2, String t3, String t4) {
				
			}
		}, 1);
		
		Func5<String, String, String, String, String, Integer> Rfunc5 = Actions.toFunc(new Action5<String, String, String, String, String>() {

			@Override
			public void call(String t1, String t2, String t3, String t4, String t5) {
				
			}
		}, 1);
		
		Func6<String, String, String, String, String, String, Integer> Rfunc6 = Actions.toFunc(new Action6<String, String, String, String, String, String>() {

			@Override
			public void call(String t1, String t2, String t3, String t4, String t5, String t6) {
				
			}
		}, 1);
		
		Func7<String, String, String, String, String, String, String, Integer> Rfunc7 = Actions.toFunc(new Action7<String, String, String, String, String, String, String>() {

			@Override
			public void call(String t1, String t2, String t3, String t4, String t5, String t6, String t7) {
				
			}
		}, 1);
		
		Func8<String, String, String, String, String, String, String, String, Integer> Rfunc8 = Actions.toFunc(new Action8<String, String, String, String, String, String, String, String>() {

			@Override
			public void call(String t1, String t2, String t3, String t4, String t5, String t6, String t7, String t8) {
				
			}
		}, 1);
		
		Func9<String, String, String, String, String, String, String, String, String, Integer> Rfunc9 = Actions.toFunc(new Action9<String, String, String, String, String, String, String, String, String>() {

			@Override
			public void call(String t1, String t2, String t3, String t4, String t5, String t6, String t7, String t8, String t9) {
				
			}
		}, 1);
		
		FuncN<Integer> RfuncN = Actions.toFunc(new ActionN() {
			
			@Override
			public void call(Object... args) {
				
			}
		}, 1);
		
		Action1<String> action1 = Actions.toAction1(new Action0() {
			
			@Override
			public void call() {
				
			}
		});
	}
}
