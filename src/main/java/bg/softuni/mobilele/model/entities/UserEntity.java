package bg.softuni.mobilele.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {
  @Column(unique = true, nullable = false)
  private String username;
  private String firstName;
  private String lastName;
  private boolean isActive;
  private String imageUrl;

  public String getUsername() {
    return username;
  }

  public UserEntity setUsername(String username) {
    this.username = username;
    return this;
  }

  public String getFirstName() {
    return firstName;
  }

  public UserEntity setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  public UserEntity setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public boolean isActive() {
    return isActive;
  }

  public UserEntity setActive(boolean active) {
    isActive = active;
    return this;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public UserEntity setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }



  @Override
  public String toString() {
    return "UserEntity{" +
        "username='" + username + '\'' +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", isActive=" + isActive +
        ", imageUrl='" + imageUrl + '\'' +

        ", id=" + id +
        ", created=" + created +
        ", updated=" + updated +
        '}';
  }
}
