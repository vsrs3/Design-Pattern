# Flyweight Pattern (Mẫu thiết kế Trọng lượng bay)

## Mô tả
Flyweight Pattern là một structural design pattern giúp tiết kiệm bộ nhớ bằng cách chia sẻ hiệu quả dữ liệu chung giữa nhiều object tương tự, thay vì lưu trữ tất cả dữ liệu trong mỗi object.

## Mục đích
- Sử dụng sharing để hỗ trợ hiệu quả một số lượng lớn fine-grained object
- Giảm thiểu memory usage khi cần tạo ra một số lượng lớn object tương tự
- Cải thiện performance bằng cách giảm overhead của object creation

## Khi nào sử dụng
- Khi ứng dụng tạo ra một số lượng lớn object
- Khi storage cost của object là cao
- Khi hầu hết object state có thể được extrinsic
- Khi nhiều nhóm object có thể được thay thế bởi ít object được chia sẻ

## Cấu trúc
- **Flyweight**: Interface qua đó flyweight có thể nhận và tác động lên extrinsic state
- **ConcreteFlyweight**: Implement Flyweight interface và lưu trữ intrinsic state
- **FlyweightFactory**: Tạo và quản lý flyweight object, đảm bảo sharing
- **Context**: Chứa extrinsic state và reference đến flyweight

## Ví dụ thực tế
Hãy thêm code implementation cho pattern này tại đây.