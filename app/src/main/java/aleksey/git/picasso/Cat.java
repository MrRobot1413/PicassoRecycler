package aleksey.git.picasso;

public class Cat {

    private String name;
    private String breed;
    private String imgUrl;

    public Cat(String name, String breed, String imgUrl) {
        this.name = name;
        this.breed = breed;
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
