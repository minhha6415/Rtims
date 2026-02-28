package org.example;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "items")
@Data               // Thay vì @Getter @Setter @ToString riêng lẻ
@NoArgsConstructor
@AllArgsConstructor
@Builder            // Thêm @Builder để tạo object tiện hơn (tùy chọn nhưng rất hay dùng)
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Tên sản phẩm không được để trống")
    @Size(min = 2, max = 200, message = "Tên phải từ 2 đến 200 ký tự")
    @Column(nullable = false, length = 200)
    private String name;

    @Size(max = 1000, message = "Mô tả tối đa 1000 ký tự")
    private String description;

    @NotNull(message = "Số lượng không được để trống")
    @Min(value = 0, message = "Số lượng phải lớn hơn hoặc bằng 0")
    @Column(nullable = false)
    private Integer quantity;

    @NotNull(message = "Giá không được để trống")
    @PositiveOrZero(message = "Giá phải lớn hơn hoặc bằng 0")
    @Column(nullable = false)
    private Double price;

    @Size(max = 100, message = "Danh mục tối đa 100 ký tự")
    private String category;
}