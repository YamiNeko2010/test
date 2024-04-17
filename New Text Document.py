def main():
    # Nhập vào một số từ người dùng
    number = int(input("Nhập vào một số nguyên dương: "))

    # Kiểm tra xem số đó là số nguyên tố hay không
    is_prime = True
    if number <= 1:
        is_prime = False
    else:
        for i in range(2, int(number**0.5) + 1):
            if number % i == 0:
                is_prime = False
                break

    # In kết quả
    if is_prime:
        print(number, "là số nguyên tố.")
    else:
        print(number, "không là số nguyên tố.")

if __name__ == "__main__":
    main()
