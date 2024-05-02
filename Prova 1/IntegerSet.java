public class IntegerSet {
    private boolean[] itens;

    public IntegerSet() {
        itens = new boolean[101];
    }

    public IntegerSet(int[] array) {
        this();
        for (int num : array) {
            insertElement(num);
        }
    }

    public void insertElement(int num) {
        if (num >= 0 && num <= 100) {
            itens[num] = true;
        }
    }

    public void deleteElement(int num) {
        if (num >= 0 && num <= 100) {
            itens[num] = false;
        }
    }

    public IntegerSet union(IntegerSet otherSet) {
        IntegerSet resultSet = new IntegerSet();
        for (int i = 0; i <= 100; i++) {
            resultSet.itens[i] = this.itens[i] || otherSet.itens[i];
        }
        return resultSet;
    }

    public IntegerSet intersection(IntegerSet otherSet) {
        IntegerSet resultSet = new IntegerSet();
        for (int i = 0; i <= 100; i++) {
            resultSet.itens[i] = this.itens[i] && otherSet.itens[i];
        }
        return resultSet;
    }

    public String toSetString() {
         StringBuilder sb = new StringBuilder("{ ");
         for (int i = 0; i <= 100; i++) {
            sb.append(itens[i] ? "true" : "false").append(" ");
         }
         sb.append("}");
         return sb.toString();
    }
}

