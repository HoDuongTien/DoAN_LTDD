# Chiyeuminhem - Ứng dụng trò chơi giải đố trên Android
## 1.Giới thiệu đề tài
Chiyeuminhem là ứng dụng di động được phát triển trên nền tảng Android bằng ngôn ngữ lập trình Java, sử dụng Android Studio làm môi trường phát triển chính.
Ứng dụng được xây dựng nhằm tích hợp nhiều trò chơi giải đố trên cùng một nền tảng, giúp người dùng rèn luyện tư duy logic, khả năng quan sát và kỹ năng giải quyết vấn đề.
Bên cạnh các trò chơi, hệ thống còn hướng đến việc xây dựng các chức năng quản lý tài khoản, tính điểm, bảng xếp hạng, thách đấu và trò chuyện giữa những người chơi.
Dự án được thực hiện trong khuôn khổ môn học Lập trình di động.
## 2. Công nghệ sử dụng
Ngôn ngữ lập trình: Java
Môi trường phát triển: Android Studio
Nền tảng: Android
Kiến trúc phần mềm: MVVM (Model - View - ViewModel)
Thiết kế giao diện: XML, Material Design
Xác thực người dùng: Firebase Authentication
Quản lý mã nguồn: Git, GitHub
Công cụ xây dựng: Gradle
## 3. Chức năng của ứng dụng
### 3.1. Quản lý tài khoản
Đăng ký tài khoản bằng email và mật khẩu.
Đăng nhập vào hệ thống bằng tài khoản đã đăng ký.
Xác thực thông tin người dùng thông qua Firebase Authentication.
### 3.2. Hệ thống trò chơi
Sudoku: Trò chơi điền số theo quy tắc Sudoku, yêu cầu người chơi sử dụng tư duy logic để hoàn thành bảng số.
Rubik 3D: Hỗ trợ người dùng giải khối Rubik thông qua việc nhận diện sáu mặt và đưa ra hướng dẫn giải.
Puzzle: Trò chơi xếp hình, yêu cầu người chơi sắp xếp các mảnh ghép để hoàn thành hình ảnh.
Caro: Trò chơi cờ Caro cho phép người dùng thi đấu với máy.
### 3.3. Các chức năng mở rộng
Lựa chọn mức độ khó phù hợp với từng trò chơi.
Tính điểm dựa trên thời gian hoàn thành và số lỗi trong quá trình chơi.
Hiển thị bảng xếp hạng dựa trên thành tích của người chơi.
Cho phép người chơi gửi lời mời thách đấu.
Hỗ trợ trò chuyện trực tuyến giữa những người chơi trong hệ thống.
Các chức năng trò chơi và chức năng mở rộng đang được phát triển theo kế hoạch của dự án.
## 4. Kiến trúc hệ thống
Ứng dụng được thiết kế theo kiến trúc MVVM (Model - View - ViewModel), kết hợp với phương pháp tổ chức mã nguồn theo các tầng nhằm tăng khả năng bảo trì, kiểm thử và mở rộng.
### 4.1. Data Layer
Chịu trách nhiệm quản lý dữ liệu, kết nối Firebase và thực hiện các thao tác liên quan đến lưu trữ, truy xuất dữ liệu.
### 4.2. Domain Layer
Chứa các mô hình nghiệp vụ, quy tắc xử lý, thuật toán giải đố và các chức năng xử lý logic của ứng dụng.
### 4.3. Presentation Layer
Chịu trách nhiệm xây dựng giao diện người dùng, tiếp nhận thao tác và hiển thị dữ liệu thông qua Activity và ViewModel.
### 4.4. Utils
Chứa các lớp tiện ích và phương thức hỗ trợ được sử dụng chung trong ứng dụng.
## 5. Hướng dẫn cài đặt
### 5.1. Yêu cầu môi trường
Để cài đặt và chạy ứng dụng, máy tính cần chuẩn bị các công cụ sau.
Android Studio dùng để mở, chỉnh sửa và chạy dự án.
Android SDK tương thích với cấu hình của dự án.
JDK tương thích với phiên bản Android Gradle Plugin.
Git dùng để tải và quản lý mã nguồn.
Android Emulator hoặc điện thoại Android để kiểm thử ứng dụng.
Kết nối Internet để tải thư viện và sử dụng dịch vụ Firebase.
### 5.2. Tải mã nguồn từ GitHub
Truy cập repository của dự án tại địa chỉ:
https://github.com/HoDuongTien/DoAN_LTDD
Có thể tải mã nguồn bằng cách chọn Code, sau đó chọn Download ZIP và giải nén vào thư mục mong muốn.
Ngoài ra, có thể sử dụng Git để tải mã nguồn bằng lệnh sau:
```bash
git clone https://github.com/HoDuongTien/DoAN_LTDD.git
```
Sau khi tải thành công, di chuyển vào thư mục dự án:
```bash
cd DoAN_LTDD
```
### 5.3. Mở dự án bằng Android Studio
Bước 1: Khởi động phần mềm Android Studio.
Bước 2: Tại màn hình chính, chọn Open.
Bước 3: Tìm đến thư mục DoAN_LTDD đã tải về.
Bước 4: Chọn thư mục dự án và nhấn OK.
Bước 5: Chờ Android Studio đồng bộ Gradle và tải các thư viện cần thiết.
Bước 6: Kiểm tra Android SDK và JDK nếu hệ thống yêu cầu cấu hình bổ sung.
Sau khi đồng bộ hoàn tất, dự án đã sẵn sàng để cấu hình và chạy thử.
### 5.4. Cấu hình Firebase
Ứng dụng sử dụng Firebase Authentication để thực hiện chức năng đăng ký và đăng nhập tài khoản.
Bước 1: Truy cập Firebase Console tại địa chỉ https://console.firebase.google.com/.
Bước 2: Đăng nhập bằng tài khoản Google.
Bước 3: Tạo Firebase Project mới hoặc sử dụng Firebase Project đã được cấp quyền truy cập.
Bước 4: Thêm ứng dụng Android vào Firebase Project.
Bước 5: Nhập Application ID đúng với cấu hình trong file app/build.gradle.kts.
Bước 6: Tải file google-services.json từ Firebase Console.
Bước 7: Đặt file google-services.json vào thư mục app của dự án nếu chưa có cấu hình tương ứng.
Bước 8: Trong Firebase Console, mở Authentication và bật phương thức đăng nhập Email/Password.
Bước 9: Quay lại Android Studio và đồng bộ Gradle.
Lưu ý: Không công khai mật khẩu, khóa riêng tư hoặc thông tin xác thực quản trị Firebase trong mã nguồn.
### 5.5. Chạy ứng dụng
Bước 1: Mở dự án trong Android Studio.
Bước 2: Khởi động Android Emulator hoặc kết nối điện thoại Android với máy tính.
Bước 3: Chọn thiết bị chạy ứng dụng.
Bước 4: Chọn cấu hình chạy app.
Bước 5: Nhấn Run để tiến hành biên dịch và cài đặt ứng dụng.
Bước 6: Chờ ứng dụng khởi động trên thiết bị.
Bước 7: Kiểm tra giao diện đăng ký, đăng nhập và các chức năng đã được triển khai.
## 6. Cấu trúc thư mục dự án
Cấu trúc mã nguồn được định hướng tổ chức như sau:

```text
DoAN_LTDD/
    app/
        src/
            main/
                java/
                    com/hoduongtien/chiyeuminhem/
                        data/
                        domain/
                        presentation/
                        utils/
                res/
                    layout/
                    drawable/
                    values/
                    mipmap/
                AndroidManifest.xml
        build.gradle.kts
    gradle/
    build.gradle.kts
    settings.gradle.kts
    gradle.properties
    gradlew
    gradlew.bat
    .gitignore
    README.md
```
Cấu trúc các package có thể được bổ sung và điều chỉnh trong quá trình phát triển.
## 7. Trạng thái phát triển
Dự án hiện đang trong quá trình phát triển.
Các công việc đã được thực hiện bước đầu bao gồm thiết lập dự án Android, xây dựng giao diện đăng ký và đăng nhập, tích hợp Firebase Authentication và tổ chức mã nguồn theo định hướng MVVM.
Các chức năng trò chơi Sudoku, Rubik 3D, Puzzle, Caro, bảng xếp hạng, thách đấu và trò chuyện sẽ được tiếp tục phát triển trong các giai đoạn tiếp theo.
## 8. Định hướng phát triển
Hoàn thiện các trò chơi giải đố theo yêu cầu của đề tài.
Xây dựng hệ thống tính điểm và lưu trữ thành tích người chơi.
Phát triển bảng xếp hạng và chức năng thách đấu.
Tích hợp hệ thống trò chuyện trực tuyến.
Tối ưu giao diện và nâng cao trải nghiệm người dùng.
Kiểm thử, sửa lỗi và cải thiện hiệu năng ứng dụng.
Hoàn thiện ứng dụng để chuẩn bị phát hành trên Google Play.
## 9. Thông tin dự án
Tên ứng dụng: Chiyeuminhem
Tên đề tài: Xây dựng ứng dụng trò chơi giải đố trên Android
Môn học: Lập trình di động
Ngôn ngữ lập trình: Java
Môi trường phát triển: Android Studio
Cơ sở dữ liệu và xác thực: Firebase

Repository: https://github.com/HoDuongTien/DoAN_LTDD

Trạng thái: Đang phát triển
