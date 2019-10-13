package UI;

public class Container {
    public String containerID; //container number
    public String containerWidth;
    public String containerHeight;
    public String containerStyle;
    public boolean flag;

    @Override
    public String toString() {
        return "Containner{" +
                "containerNum='" + containerID + '\'' +
                ", containerWidth='" + containerWidth + '\'' +
                ", containerHeght='" + containerHeight + '\'' +
                ", StyleContainer='" + containerStyle + '\'' +
                ", flag=" + (flag == true ? "Normal":"Broken") +
                '}';
    }
}
