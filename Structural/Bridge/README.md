# Bridge Pattern (Mẫu thiết kế Cầu nối)

## Mô tả
Bridge Pattern là một structural design pattern giúp tách riêng một abstraction khỏi implementation của nó, cho phép cả hai có thể thay đổi độc lập với nhau.

## Mục đích
- Tránh việc binding vĩnh viễn giữa abstraction và implementation
- Cho phép abstraction và implementation có thể được mở rộng độc lập
- Chia sẻ implementation giữa nhiều object mà không cần client biết đến

## Khi nào sử dụng
- Khi bạn muốn tránh binding vĩnh viễn giữa abstraction và implementation
- Khi cả abstraction và implementation đều cần được mở rộng bằng subclassing
- Khi thay đổi trong implementation của abstraction không ảnh hưởng đến client

## Cấu trúc
- **Abstraction**: Định nghĩa interface của abstraction và giữ reference đến implementor
- **RefinedAbstraction**: Mở rộng interface được định nghĩa bởi Abstraction
- **Implementor**: Định nghĩa interface cho implementation classes
- **ConcreteImplementor**: Cài đặt cụ thể của Implementor interface

## Ví dụ thực tế
Hãy thêm code implementation cho pattern này tại đây.