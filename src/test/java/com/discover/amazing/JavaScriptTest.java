package com.discover.amazing;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScriptTest {
    
    public enum Operator{
        EQ("="), LT("<"), GT(">");
        
        private final String value;
        
        private Operator(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
    }

    public static void main(String[] args) throws ScriptException {
        
        System.out.println(dynamicCompare("3", "4", Operator.GT.getValue()));
		
		try {
            execScriptFun("2000");
        }
        catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
    public static String dynamicCompare(String leftVal, String rightVal, String oper) throws ScriptException {
        String str = leftVal + oper + rightVal;
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("js");
        //scriptEngine.put("a", 4);
        return scriptEngine.eval(str).toString();
    }
	
	public static void execScriptFun(String money) throws NoSuchMethodException, ScriptException {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("js");
        
        String script = "function printSalary(money) { return 'My salary is:' + money }";
        scriptEngine.eval(script);
        Invocable invocable = (Invocable) scriptEngine;
        System.out.println(invocable.invokeFunction("printSalary", money));
        
    }

}
