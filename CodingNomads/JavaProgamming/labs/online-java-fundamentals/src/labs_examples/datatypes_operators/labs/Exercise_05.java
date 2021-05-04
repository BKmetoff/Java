package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = false;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below
        if (a && b){
            System.out.println("a and b are true short-circuit");
        }

        if (a || b){
            System.out.println("a or b is true short-circuit");
        }

        if (a ^ b){
            System.out.println("a XOR b");
        }

        if (!a){
            System.out.println("a is not true");
        }
    }

}

