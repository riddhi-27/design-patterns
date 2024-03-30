public class NetworkConnection implements Cloneable {
    private String ip;
    private String importantData;

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setImportantData(String importantData) throws InterruptedException {
        this.importantData = importantData;
        Thread.sleep(2000);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getIp() {
        return ip;
    }

    public String getImportantData() {
        return importantData;
    }

    @Override
    public String toString() {
        return this.ip + " : " + this.importantData;
    }

}