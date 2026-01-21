# Rtims
# Real-Time Inventory Management System

**Quản lý kho hàng thời gian thực** – Dự án thực tế áp dụng Java Spring Boot để xây dựng hệ thống quản lý sản phẩm trong kho (CRUD, tìm kiếm, validation, giao diện web).


## Công nghệ sử dụng (Tech Stack)

- **Backend**: Java 17, Spring Boot 3.5.7  
- **Framework**: Spring Web, Spring Data JPA, Spring Validation  
- **Database**: MySQL 8.0 (kết nối qua HikariCP)  
- **ORM**: Hibernate 6.6  
- **Frontend**: Thymeleaf + Bootstrap 5.3 (giao diện web responsive)  
- **Dependency Injection**: Lombok  
- **Development Tools**: Spring Boot DevTools (hot reload)  
- **Build Tool**: Maven  

## Tính năng chính

- Quản lý sản phẩm (CRUD): Thêm, xem, sửa, xóa sản phẩm  
- Tìm kiếm sản phẩm theo tên (partial match, không phân biệt hoa thường) và theo danh mục  
- Validation dữ liệu đầu vào (tên không trống, số lượng ≥ 0, giá ≥ 0)  
- Dữ liệu mẫu tự động thêm khi khởi động (nếu database rỗng)  
- Giao diện web đơn giản, responsive, sử dụng Bootstrap + Font Awesome  
- REST API đầy đủ (`/api/items`) để dễ mở rộng (mobile app, frontend React/Vue sau này)  

## Cài đặt & Chạy local

### Yêu cầu

- Java 17 (JDK 17)  
- Maven 3.6+  
- MySQL 8.0+ (cài MySQL Server + Workbench khuyến nghị)  

### Các bước cài đặt

1. **Clone repository**

```bash
git clone https://github.com/[username-cua-ban]/RTIMS.git
cd RTIMS
 ```

2. **Cấu hình database (MySQL)**
Tạo database: inventory_db
Chỉnh thông tin kết nối trong src/main/resources/application.properties:

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=[mật-khẩu-của-bạn]
 ```

 3. **Chạy ứng dụng**
Cách 1: Dùng IntelliJ → Run RtimsApplication.java
Cách 2: Dùng terminal
mvn spring-boot:run

4. **Truy cập**
Trang web quản lý kho: http://localhost:8080/items
REST API ví dụ: http://localhost:8080/api/items


