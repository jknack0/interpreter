package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

public class HaltCode extends ByteCode {
    public void init(ArrayList<String> args) {

    }
    public void execute(VirtualMachine vm) {
        vm.stopProgram();
    }

    public String toString() {
        return "HALT";
    }
}
