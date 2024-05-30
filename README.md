
# Kiểm thử với JUnit
JUnit là một framework kiểm thử tự động cho ngôn ngữ lập trình Java, được sử dụng rộng rãi trong cộng đồng phát triển phần mềm. JUnit cung cấp một cách tiện lợi và hiệu quả để viết và chạy các bài kiểm thử, giúp tăng cường chất lượng của mã nguồn và giảm thiểu lỗi trong quá trình phát triển.

# Giới thiệu về bài toán
Bài toán tam giác là một bài toán cơ bản trong học kiểm thử phần mềm, đặc biệt trong việc kiểm tra tính đúng đắn của một chương trình xác định loại tam giác dựa trên độ dài của ba cạnh. Mục tiêu của bài toán này không chỉ là kiểm tra xem chương trình có thể xác định đúng loại tam giác hay không mà còn là kiểm tra tính đầy đủ và đúng đắn của các phương thức xử lý trong chương trình.

# Kết quả kiểm thử:
## Phương thức “testIsTriangle”:
### Mục tiêu: Kiểm tra xem một bộ ba cạnh có tạo thành một tam giác hợp lệ không.
### Chi tiết kiểm thử:
 - Đầu vào: Sử dụng các giá trị (2, 3, 4) cho các cạnh tam giác.
 - Kết quả mong đợi: "Triangle" (tam giác hợp lệ).
### Kết quả: Kết quả kiểm thử là "Pass", đúng như kỳ vọng.


## Phương thức “testIsNotTriangle”:
### Mục tiêu: Kiểm tra xem một bộ ba cạnh có tạo thành tam giác không.
### Chi tiết kiểm thử:
- Đầu vào 1: Sử dụng các giá trị (-3, 3, 4) cho các cạnh tam giác.
- Kết quả mong đợi 1: "Not Triangle" (không phải tam giác).
- Đầu vào 2: Sử dụng các giá trị (3, 1, 99) cho các cạnh tam giác.
- Kết quả mong đợi 2: "Not Triangle" (không phải tam giác).
### Kết quả: Cả hai phương thức kiểm thử đều cho kết quả "Pass" với kết quả trả về như mong đợi, cho thấy rằng phương thức “checkTriangleType” đúng trong việc xác định tam giác không hợp lệ.

## Phương thức “testIsEquilateral”:
### Mục tiêu: Kiểm tra xem có đúng cách xác định tam giác đều không.
### Chi tiết kiểm thử:
- Đầu vào: Sử dụng các giá trị (3, 3, 3) cho các cạnh tam giác.
- Kết quả mong đợi: "Equilateral" (tam giác đều).
### Kết quả: Kết quả kiểm thử là "Pass", đúng như kỳ vọng.
 
## Phương thức “testIsIsosceles”:
### Mục tiêu: Kiểm tra xem có đúng cách xác định tam giác cân không.
### Chi tiết kiểm thử:
- Đầu vào: Sử dụng các giá trị (3, 3, 4) cho các cạnh tam giác.
- Kết quả mong đợi: "Isosceles" (tam giác cân).
### Kết quả: Kết quả kiểm thử là "Pass", đúng như kỳ vọng.

## Phương thức “testIsRightTriangle”:
### Mục tiêu: Kiểm tra xem có đúng cách xác định tam giác vuông không.
### Chi tiết kiểm thử:
- Đầu vào: Sử dụng các giá trị (3, 4, 5) cho các cạnh tam giác.
- Kết quả mong đợi: "Right Triangle" (tam giác vuông).
### Kết quả: Kết quả kiểm thử là "Pass", đúng như kỳ vọng.
## Phương thức “testIsRightTriangleWithEqualSides”:
### Mục tiêu: Kiểm tra xem có đúng cách xác định tam giác vuông cân không.
### Chi tiết kiểm thử:
- Đầu vào: Sử dụng các giá trị (3, 3, 3 * Math.sqrt(2)) cho các cạnh tam giác.
- Kết quả mong đợi: "Right Triangle" (tam giác vuông).
### Kết quả: Kết quả kiểm thử là "Pass", đúng như kỳ vọng

## Phương thức testIsNotTriangleWithNegativeSide:
### Mục tiêu: Kiểm tra xem có xử lý đúng khi một hoặc nhiều cạnh tam giác có độ dài là số âm không.
### Chi tiết kiểm thử:
- Đầu vào 1: Sử dụng các giá trị (-3, 4, 5) cho các cạnh tam giác.
- Kết quả mong đợi 1: "Not Triangle" (không phải tam giác).
- Đầu vào 2: Sử dụng các giá trị (3, -4, 5) cho các cạnh tam giác.
- Kết quả mong đợi 2: "Not Triangle" (không phải tam giác).
- Đầu vào 3: Sử dụng các giá trị (3, 4, -5) cho các cạnh tam giác.
- Kết quả mong đợi 3: "Not Triangle" (không phải tam giác).
### Kết quả: Các phương thức kiểm thử đều cho kết quả "Pass", với kết quả trả về như mong đợi, chứng tỏ tính đúng đắn của việc xác định các trường hợp không phải tam giác khi một hoặc nhiều cạnh có độ dài là số âm.
## Phương thức testIsNotTriangleWithVeryLargeSide:
### Mục tiêu: Kiểm tra xem có xử lý đúng khi một hoặc nhiều cạnh tam giác có độ dài rất lớn không.
### Chi tiết kiểm thử:
- Đầu vào: Sử dụng các giá trị (Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE) cho các cạnh tam giác.
- Kết quả mong đợi: "Not Triangle" (không phải tam giác).
### Kết quả: Phương thức kiểm thử cho kết quả "Pass", với kết quả trả về như mong đợi, minh chứng cho khả năng xử lý của chương trình khi gặp phải các trường hợp cạnh có độ dài rất lớn

## Kiểm tra độ bao phủ:
![kiểm tra độ bao phủ bài toán tam giác](https://github.com/Kiren855/Triangle-Testing/blob/main/Screenshot%202024-05-31%20015924.png)

# Kết luận
- Chương trình đã được kiểm thử một cách toàn diện và đạt độ bao phủ kiểm thử 100%. Việc bổ sung các trường hợp kiểm thử mới đã giúp chúng tôi xác định và khắc phục các lỗi tiềm ẩn. Với độ bao phủ cao, chúng tôi tin rằng chương trình là ổn định và đáng tin cậy cho việc xác định loại tam giác.
