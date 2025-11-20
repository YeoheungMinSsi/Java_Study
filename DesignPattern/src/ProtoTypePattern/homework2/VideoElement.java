package ProtoTypePattern.homework2;

public class VideoElement implements DesignElementPrototype{
    private int id;
    private Position position;
    private double size;
    private String style;
    private String content;
    private String type;

    // 생성자
    public VideoElement(int id, Position position, double size, String style
    , String content, String type){
        this.id = id;
        this.position = position;
        this.size = size;
        this.style = style;
        this.content = content;
        this.type = type;
    }

    @Override
    public DesignElementPrototype clone(){
        Position clonePosition = this.position.clonePosition();
        VideoElement cloneElement = new VideoElement(
                this.id,
                clonePosition,
                this.size,
                this.style,
                this.content,
                this.type
        );
        return cloneElement;
    }

    public void info(){
        String result = String.format("ID: %d, 타입: %s, 위치: %s, 크기: %.1f, 모양: %s, 내용: %s",
                id, type, position, size, style, content
        );
        System.out.println(result);
    }

    //  ------------- getter -------------------
    public int getId(){
        return id;
    }
    public Position getPosition(){
        return position;
    }
    public double getSize(){
        return size;
    }
    public String getStyle(){
        return style;
    }
    public String getContent(){
        return content;
    }
    public String getType(){
        return type;
    }

    //  ------------- setter -------------------
    public void setId(int id){
        this.id = id;
    }
    public void setPosition(Position position){
        this.position = position;
    }
    public void setSize(double size){
        this.size = size;
    }
    public void setStyle(String style){
        this.style = style;
    }
    public void setContent(String content){
        this.content = content;
    }
    public void setType(String type){
        this.type = type;
    }
}
