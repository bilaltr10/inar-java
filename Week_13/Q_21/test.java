package Week_13.Q_21;

public class test {
    public static void main(String[] args) {
        VertexFormEquations form = new VertexFormEquations(2,3,4);
        System.out.println(form.findTheH()+ " " + form.findTheK());
        VertexFormEquations formEquations = new VertexFormEquations(1,3,1);
        System.out.println(formEquations.findTheH()+ " " + formEquations.findTheK());

    }
}
