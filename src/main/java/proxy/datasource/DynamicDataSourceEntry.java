package proxy.datasource;

/**
 * @author xxbb
 */
public class DynamicDataSourceEntry {
    /**
     * 默认数据源
     */
    public final static String DEFAULT_SOURCE=null;

    private final static ThreadLocal<String> LOCAL=new ThreadLocal<>();

    private DynamicDataSourceEntry(){}

    /**
     * 清空数据源
     */
    public static void clear(){
        LOCAL.remove();
    }

    /**
     * 获取数据源
     * @return 数据源
     */
    public static String get(){
        return LOCAL.get();
    }

    /**
     * 还原当前切换的数据源
     */
    public static void restore(){
        LOCAL.set(DEFAULT_SOURCE);
    }

    /**
     * 设置数据源
     * @param dataSource 数据源
     */
    public static void set(String dataSource){
        LOCAL.set(dataSource);
    }

    /**
     * 根据年份动态设置数据源
     * @param year
     */
    public static void set(int year){
        LOCAL.set("DB_"+year);
    }

}
