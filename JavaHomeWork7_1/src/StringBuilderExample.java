public class StringBuilderExample {
    public static void main(String[] args) {
        int a = 3;
        int b = 56;

        StringBuilder sb = new StringBuilder();

        sb.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
        sb.append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n");
        sb.append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");

        String result = sb.toString().replace("=", "равно");

        System.out.println(result);
    }
}
