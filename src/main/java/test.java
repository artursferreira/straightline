import javaslang.collection.List;

/**
 * Created by Aluno on 10/05/2017.
 */

// a = 5 + 3;
// b := (print (a, a-1), 10*a);
//print (b)
public class test {

    public static void main(String[] args) {

        Stm p = new CompoundStm(
                new AssignStm("a", new OpExp(new NumExp(5), new NumExp(3), OpExp.Op.PLUS)),
                new CompoundStm(new AssignStm("b", new EseqExp(new PrintStm(List.of(new IdExp("a"), new OpExp(new IdExp("a"), new NumExp(1), OpExp.Op.MINUS)),
                        new OpExp(new NumExp(10), new IdExp("a"), OpExp.Op.TIMES)))), new PrintStm(List.of(new IdExp("b"))))
        );
/*

        Stm p = new CompoundStm(
                new AssignStm(
                        "a",
                        new OpExp(new NumExp(5),
                                new NumExp(5), OpExp.Op.PLUS)
                ),
                new CompoundStm(
                        new AssignStm(
                                "b",
                                new EseqExp(
                                        new PrintStm(List.of(
                                                new IdExp("a"),
                                                new OpExp(
                                                        new IdExp("a"),
                                                        new NumExp(1),
                                                        OpExp.MINUS
                                                )
                                        )),
                                        new OpExp(new NumExp(10), new IdExp("a"), OpExp.Op.TIMES
                                        )
                                ),
                                new PrintStm(List.of(new IdExp("b")))
                        )
                )
        );
*/


    }

}
