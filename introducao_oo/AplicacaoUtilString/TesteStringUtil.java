package introducao_oo.AplicacaoUtilString;


public class TesteStringUtil {
    public static void main(String[] args){
        StringUtil stringUtil = new StringUtil();
        System.out.println(stringUtil.pegaLetra("programação", 4));
        System.out.println(stringUtil.pegaIndice("java", 'a'));
    }
}
