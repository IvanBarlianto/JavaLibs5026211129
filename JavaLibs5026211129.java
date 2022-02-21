import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        String input1 = JOptionPane.showInputDialog("Nama :");
        String input2 = JOptionPane.showInputDialog("Jurusan :");
        String input3 = JOptionPane.showInputDialog("NRP :");
        String input4 = JOptionPane.showInputDialog("Hobi :");
        String input5 = JOptionPane.showInputDialog("Makanan Favorit :");
        String input6 = JOptionPane.showInputDialog("Jenis Kelamin :");
        int input7 = Integer.parseInt(JOptionPane.showInputDialog("Umur Berapa :"));
        double input8 = Double.parseDouble(JOptionPane.showInputDialog("Tinggi(feet) :"));
        int input9 = Integer.parseInt(JOptionPane.showInputDialog("Suhu Tubuh :"));
        int input10 = input9 + 273;
        JOptionPane.showMessageDialog(null,"Ini Suhu kamu dalam faranheit : " + input10);
        Double input11 = input9 + 273.15;
        JOptionPane.showMessageDialog(null,"Ini Suhu kamu dalam kelvin : " + input11);

    }
}