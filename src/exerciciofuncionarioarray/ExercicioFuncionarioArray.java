/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciofuncionarioarray;

import javax.swing.JOptionPane;

/**
 *
 * @author glauc
 */
public class ExercicioFuncionarioArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario funcionario[] = new Funcionario[3];
        Funcionario func;
        

        for (int indice = 0; indice < funcionario.length; indice++) {
            func = new Funcionario();
            func.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Informe a matrícula: ")));
            func.setNome(JOptionPane.showInputDialog("Informe o nome: "));
            func.setCargo(JOptionPane.showInputDialog("Informe o cargo: "));
            func.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário: ")));
            funcionario[indice]= func;

            
        }

        for (int indice = 0; indice < funcionario.length; indice++) {
           func = funcionario[indice];
            JOptionPane.showMessageDialog(null,
                    "Matricula: " + func.getMatricula() + "\n"
                    + "Nome: " + func.getNome() + "\n"
                    + "Cargo: " + func.getCargo() + "\n"
                    + "Salário: " + func.getSalario());
            
        }

            
    }

}
