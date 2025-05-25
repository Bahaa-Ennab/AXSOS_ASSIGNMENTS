public class calculator {
    int firstInput;
    int secondInput;
    int result;
    int operator;

    public int performOperation(int firstInput, String operator , int secondInput){
        if (operator == "+"){
            this.result = firstInput + secondInput;
        }
        if (operator == "-") {
            this.result = firstInput-secondInput;
        }
        if (operator == "*"){
            this.result = firstInput * secondInput;
        }
        if (operator == "/") {
            this.result = firstInput/secondInput;
        }
        return result;

    }
    public void getResults(){
        System.out.println(result);
    }
}
