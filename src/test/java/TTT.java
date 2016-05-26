import org.apache.commons.lang.StringUtils;

/**
 * Created by jack4 on 2016/5/23.
 */
public class TTT {
    public static void main(String[] args) {
    String str = "hphm as license,gcsj as passDate";
        String s = formatFields(str);
        System.out.println(s);

    }


    private static  String formatFields(String aliasFields) {
        String[] fields = aliasFields.split(",");
        for (int i = 0; i < fields.length; i++) {
            fields[i] = "t." + fields[i];
        }
        String fieldsSql = StringUtils.join(fields, ",");
        return fieldsSql;
    }
}
