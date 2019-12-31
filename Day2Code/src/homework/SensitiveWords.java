package homework;

import java.util.ArrayList;

//如“性”、“色情”、“爆炸”、“恐怖”、“枪”、“军火”
public class SensitiveWords {
    ArrayList<String> stword = new ArrayList<>();

    {
        stword.add("性");
        stword.add("色情");
        stword.add("恐怖");
        stword.add("枪");
        stword.add("军火");
        stword.add("爆炸");
    }

    public ArrayList<String> getStword() {
        return stword;
    }

    public void setStword(String stword) {
        this.stword.add(stword);
    }

    public void removeStword(String stword) {
        this.stword.remove(stword);
    }

    @Override
    public String toString() {
        return stword.toString();
    }
}
