package Exercise1;

public class Camera {
    String id;
    String model;

    public Camera(String id, String model) {
        this.id = id;
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Camera))
            return false;
        Camera other = (Camera)o;
        boolean equalModels = (this.model == null && other.getModel() == null)
                ||
                (this.model != null && this.model.equals(other.getModel()));
        boolean equalIds =  (this.id == null && other.getId() == null)
                ||
                (this.id != null && this.id.equals(other.getId()));
        return equalIds && equalModels;
    }


    @Override
    public int hashCode() {

        int hashValue = 0;

        for (int i = 0; i < id.length(); i++) {
            hashValue += 31^((id.length()-1)-1)*id.charAt(i);
        }

        for (int i = 0; i < model.length(); i++) {
            hashValue += 31^((model.length()-1)-1)*model.charAt(i);
        }

        hashValue = hashValue % 324982; //tilfældigt, bare for at gøre værdien lidt random

        return hashValue;
    }
}
