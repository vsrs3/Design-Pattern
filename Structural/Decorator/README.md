# Decorator Pattern (Mẫu thiết kế Trang trí)

## Mô tả
Decorator Pattern là một structural design pattern cho phép thêm các behavior mới vào object bằng cách đặt chúng bên trong các wrapper object chứa các behavior này.

## Mục đích
- Thêm responsibility mới cho object một cách động mà không thay đổi cấu trúc của chúng
- Cung cấp một alternative linh hoạt cho subclassing để extend functionality
- Cho phép tổ hợp các behavior khác nhau

## Khi nào sử dụng
- Khi bạn muốn thêm responsibility cho object mà không cần subclassing
- Khi extension bằng subclassing là không thực tế
- Khi bạn muốn có thể thêm hoặc loại bỏ responsibility động

## Cấu trúc
- **Component**: Interface chung cho object có thể được decorated
- **ConcreteComponent**: Implementation cơ bản của Component
- **Decorator**: Base class cho tất cả decorators, implement Component interface
- **ConcreteDecorator**: Thêm behavior cụ thể vào component

## Ví dụ thực tế
Hãy thêm code implementation cho pattern này tại đây.