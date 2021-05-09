public class Category {
    private String categoryName;
    private String categoryId;

    public Category(String categoryName, String categoryId) {
        this.setCategoryName(categoryName);
        this.setCategoryId(categoryId);
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
