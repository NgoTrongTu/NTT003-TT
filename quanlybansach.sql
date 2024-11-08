CREATE DATABASE quanlybansach;
GO

USE quanlybansach;
GO

CREATE TABLE TaiKhoan
(
    UserName NVARCHAR(50) PRIMARY KEY,
    Pass NVARCHAR(50),
    Email NVARCHAR(50)
);

INSERT INTO TaiKhoan (UserName, Pass, Email) VALUES
(N'user1', N'pass1', N'user1@gmail.com'),
(N'user2', N'pass2', N'user2@gmail.com'),
(N'user3', N'pass3', N'user3@gmail.com'),
(N'user4', N'pass4', N'user4@gmail.com'),
(N'user5', N'pass5', N'user5@gmail.com'),
(N'user6', N'pass6', N'user6@gmail.com'),
(N'user7', N'pass7', N'user7@gmail.com'),
(N'user8', N'pass8', N'user8@gmail.com'),
(N'user9', N'pass9', N'user9@gmail.com'),
(N'user10', N'pass10', N'user10@gmail.com');

CREATE TABLE NhanVien
(
    MaNV NVARCHAR(10) PRIMARY KEY,
    TenNV NVARCHAR(50) NOT NULL,
    GioiTinh NVARCHAR(5) NOT NULL CHECK (GioiTinh IN (N'Boy', N'Girl')),
    DiaChi NVARCHAR(100) NOT NULL,
    SDTNV NVARCHAR(12) NOT NULL,
    NgaySinh DATE NOT NULL
);

INSERT INTO NhanVien (MaNV, TenNV, GioiTinh, DiaChi, SDTNV, NgaySinh)
VALUES 
    (N'NV001', N'Nguyễn Văn Nam', N'Boy', N'123 Đường Lê Thánh Tông quận 12 tp.HCM', '0987654321', '1990-01-01'),
    (N'NV002', N'Nguyễn Thị Thi', N'Girl', N'46 Đường Trần Thái Tông quận 1 tp.HCM', '0123456789', '1995-05-05'),
    (N'NV003', N'Trần Văn Minh', N'Boy', N'71 Đường Trần Văn Danh Tân Bình tp.HCM', '0987651234', '1985-12-15'),
    (N'NV004', N'Trần Thị Anh', N'Girl', N'1A Nguyễn Hiến Lê Phường 13 Tân Bình tp.HCM', '0123456789', '1992-03-20'),
    (N'NV005', N'Lê Văn Luyện', N'Boy', N'91/61 Đường Cộng Hòa Phường 13 Tân Bình tp.HCM', '0987654321', '1988-07-10'),
    (N'NV006', N'Trần Thị Tài Linh', N'Girl', N'92 Tân Quý Tân Phú tp.HCM', '0123456789', '1993-09-30'),
    (N'NV007', N'Dương Tài Nhân', N'Boy', N'331 Đường Ngọc Lam Long Biên tp.HN', '0987651234', '1996-11-25'),
    (N'NV008', N'Đinh Tiến Lực', N'Girl', N'Phường An Bình, Thành phố Biên Hòa, Đồng Nai', '0123456789', '1987-04-05'),
    (N'NV009', N'Nông Thị Kiều', N'Boy', N'Xã Phương Thạnh, Huyện Càng Long, Trà Vinh', '0987654321', '1994-08-18'),
    (N'NV010', N'Bùi Thị Thêu', N'Girl', N'Xã Nà Ngựu, Huyện Sông Mã, Sơn La', '0123456789', '1991-02-14');

CREATE TABLE KhachHang
(
    MaKH NVARCHAR(10) PRIMARY KEY,
    TenKH NVARCHAR(50) NOT NULL,
    GioiTinh NVARCHAR(5) NOT NULL CHECK (GioiTinh IN (N'Boy', N'Girl')),
    DiaChi NVARCHAR(100) NOT NULL,
    SDTKH NVARCHAR(12) NOT NULL,
    Email NVARCHAR(50) NOT NULL
);

INSERT INTO KhachHang (MaKH, TenKH, GioiTinh, DiaChi, SDTKH, Email)
VALUES 
    (N'KH001', N'Hoàng Thị Phượng Linh', N'Girl', N'Xã Nghi Sơn, Huyện Tĩnh Gia, Thanh Hóa', '0987654321', 'phuonglinh@gmail.com'),
    (N'KH002', N'Đặng Thị Ngọc Linh', N'Girl', N'Xã Quang Minh, Huyện Chơn Thành, Bình Phước', '0123456789', 'ngoclinh@gmail.com'),
    (N'KH003', N'Phạm Văn Trung', N'Boy', N'Xã Xuân Sơn, Huyện Vạn Ninh, Khánh Hòa', '0987651234', 'vantrung@gmail.com'),
    (N'KH004', N'Trần Thị Dung', N'Girl', N'Phường 7, Thành phố Bạc Liêu, Bạc Liêu', '0123456789', 'trandung@gmail.com'),
    (N'KH005', N'Đinh Tuấn Phong', N'Boy', N'Xã Lương Mông, Huyện Ba Chẽ, Quảng Ninh', '0987654321', 'tuanphong@gmail.com'),
    (N'KH006', N'Trần Thị Trang Ngân', N'Girl', N'Xã An Bình, Huyện Phú Giáo, Bình DươngS', '0123456789', 'trangngan@gmail.com'),
    (N'KH007', N'Phạm Văn Nam', N'Boy', N'Xã Phước Vinh, Huyện Ninh Phước, Ninh Thuận', '0987651234', 'vannam@gmail.com'),
    (N'KH008', N'Phạm Thị Nhung', N'Girl', N'Xã Tạ An Khương Nam, Huyện Đầm Dơi, Cà Mau', '0123456789', 'phamnhung@gmail.com'),
    (N'KH009', N'Hoàng Văn Quân', N'Boy', N'Xã Hòa Tân, Huyện Châu Thành, Đồng Tháp', '0987654321', 'vanquan@gmail.com'),
    (N'KH010', N'Trịnh Khánh Chi', N'Girl', N'Xã Bình Thành, Thị xã Hương Trà, Thừa Thiên Huế', '0123456789', 'khanhchi@gmail.com');

CREATE TABLE Kho
(
    MaKho NVARCHAR(10) PRIMARY KEY,
    TenKho NVARCHAR(50) NOT NULL,
    DiaChiKho NVARCHAR(100) NOT NULL
);

INSERT INTO Kho (MaKho, TenKho, DiaChiKho)
VALUES 
    (N'K001', N'Kho Quận 1', N'93 Đ. Nguyễn Thái Bình, Phường Nguyễn Thái Bình, Quận 1'),
    (N'K002', N'Kho Bình Tân', N'Cụm Kho 5.1, Khu Công Nghiệp Tân Bình Bình Hưng Hoà Bình Tân'),
    (N'K003', N'Kho Tân Phú', N'Khu công nghiệp Tân Bình Kho số 7 Đường CN13 Tây Thạnh Tân Phú'),
    (N'K004', N'Kho Tân Phú', N'26 Đường B3, Tây Thạnh, Tân Phú'),
    (N'K005', N'Kho Thủ Đức', N'186 Tô Ngọc Vân, P, TP.Thủ Đức'),
    (N'K006', N'Kho Gò Vấp', N'341 Nguyễn Văn Công, P. 3, Q. Gò Vấp, TP. HCM'),
    (N'K007', N'Kho Bình Thạnh', N'35/14 Đường D5, Phường 25, Bình Thạnh'),
    (N'K008', N'Kho Củ CHi', N'619 TL8, Phước Vĩnh An, Củ Chi'),
    (N'K009', N'Kho Quận 7', N'512A Huỳnh Tấn Phát, P. Bình Thuận, Q. 7, TP. HCM'),
    (N'K010', N'Kho Quận 10', N'C30 Đ. Thành Thái, Phường 14, Quận 10');

CREATE TABLE Sach
(
    MaSach NVARCHAR(10) PRIMARY KEY,
    TenSach NVARCHAR(50) NOT NULL,
    TheLoai NVARCHAR(50) NOT NULL,
    TacGia NVARCHAR(50) NOT NULL,
    Gia INT NOT NULL CHECK (Gia >= 0),
    NhaXB NVARCHAR(100) NOT NULL,
    MaKho NVARCHAR(10) NOT NULL,
    FOREIGN KEY (MaKho) REFERENCES Kho(MaKho)
);

INSERT INTO Sach (MaSach, TenSach, TheLoai, TacGia, Gia, NhaXB, MaKho)
VALUES 
    (N'S001', N'Những tấm lòng cao cả', N'Thiếu Nhi', N'Edmondo De Amicis', 100000, N'Kim Đồng', N'K001'),
    (N'S002', N'Thất tình không mưa', N'Tâm lý', N'Lâu Vũ Tình', 200000, N'Trẻ', N'K002'),
    (N'S003', N'Tết ở làng địa ngục', N'Kinh dị', N'Thảo Trang', 150000, N'Phương Nam', N'K003'),
    (N'S004', N'Những món ăn nhẹ', N'Dạy nấu ăn', N'Triệu Thị Chơi', 250000, N'hụ nữ', N'K004'),
    (N'S005', N'151 món ăn đãi khách đặc sắc', N'Dạy nấu ăn', N'Ngọc Anh', 300000, N'Tổng hợp TP.HCM', N'K005'),
    (N'S006', N'Khám phá bầu trời đêm', N'Thiếu Nhi', N'Howard Schneider', 350000, N'Kim Đồng', N'K006'),
    (N'S007', N'Thả thính là phải dính', N'Kỹ năng', N'Windy', 400000, N'Thanh Niên', N'K007'),
    (N'S008', N'Giới hạn của bạn chỉ là xuất phát điểm của tôi', N'Tâm Lý', N'Mèo Maverick', 450000, N'Thế Giới', N'K008'),
    (N'S009', N'Tuổi trẻ đáng giá bao nhiêu?', N'Tâm lý', N'Rosie Nguyễn', 500000, N'Nhã Nam', N'K009'),
    (N'S010', N'Tiếng chuông chiều', N'Truyện ngắn', N'Ngũ Hành Sơn', 550000, N'Thanh Niên', N'K010');

CREATE TABLE HoaDon
(
    MaHoaDon NVARCHAR(10) PRIMARY KEY,
    MaKH NVARCHAR(10) NOT NULL,
    MaNV NVARCHAR(10) NOT NULL,
    TongTien INT,
    TrangThaiTT NVARCHAR(50),
    --FOREIGN KEY (MaKH) REFERENCES KhachHang(MaKH),
    --FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV)
);

INSERT INTO HoaDon (MaHoaDon, MaKH, MaNV, TongTien, TrangThaiTT)
VALUES 
    (N'HD001', N'KH001', N'NV001', NULL, N'Chưa thanh toán'),
    (N'HD002', N'KH002', N'NV002', NULL, N'Đã thanh toán'),
    (N'HD003', N'KH003', N'NV003', NULL, N'Chưa thanh toán'),
    (N'HD004', N'KH004', N'NV004', NULL, N'Đã thanh toán'),
    (N'HD005', N'KH005', N'NV005', NULL, N'Chưa thanh toán'),
    (N'HD006', N'KH006', N'NV006', NULL, N'Đã thanh toán'),
    (N'HD007', N'KH007', N'NV007', NULL, N'Chưa thanh toán'),
    (N'HD008', N'KH008', N'NV008', NULL, N'Đã thanh toán'),
    (N'HD009', N'KH009', N'NV009', NULL, N'Chưa thanh toán'),
    (N'HD010', N'KH010', N'NV010', NULL, N'Đã thanh toán');

CREATE TABLE ChiTietHoaDon
(
    MaHoaDon NVARCHAR(10),
    MaSach NVARCHAR(10),
    SoLuong INT NOT NULL CHECK (SoLuong > 0),
    Gia INT,
    --PRIMARY KEY (MaHoaDon, MaSach),
    --FOREIGN KEY (MaHoaDon) REFERENCES HoaDon(MaHoaDon),
    --FOREIGN KEY (MaSach) REFERENCES Sach(MaSach)
);
UPDATE ChiTietHoaDon
SET Gia = Sach.Gia
FROM ChiTietHoaDon
INNER JOIN Sach ON ChiTietHoaDon.MaSach = Sach.MaSach;
INSERT INTO ChiTietHoaDon (MaHoaDon, MaSach, SoLuong, Gia)
VALUES 
    (N'HD001', N'S001', 2, NULL),
    (N'HD001', N'S002', 1, NULL),
    (N'HD002', N'S003', 1, NULL),
    (N'HD002', N'S004', 3, NULL),
    (N'HD003', N'S005', 1, NULL),
    (N'HD004', N'S006', 2, NULL),
    (N'HD004', N'S007', 1, NULL),
    (N'HD005', N'S008', 1, NULL),
    (N'HD006', N'S009', 2, NULL),
    (N'HD007', N'S010', 1, NULL),
    (N'HD008', N'S001', 4, NULL),
    (N'HD009', N'S002', 2, NULL),
    (N'HD010', N'S003', 3, NULL);

-- Calculate and update TongTien in HoaDon
UPDATE HoaDon
SET TongTien = (SELECT SUM(SoLuong * Gia) FROM ChiTietHoaDon WHERE HoaDon.MaHoaDon = ChiTietHoaDon.MaHoaDon);

CREATE TABLE DonHang
(
    MaDonHang NVARCHAR(10) PRIMARY KEY,
    MaKH NVARCHAR(10) NOT NULL,
    MaNV NVARCHAR(10) NOT NULL,
    TongTien INT,
    TinhTrangDH NVARCHAR(50),
    --FOREIGN KEY (MaKH) REFERENCES KhachHang(MaKH),
    --FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV)
);

INSERT INTO DonHang (MaDonHang, MaKH, MaNV, TongTien, TinhTrangDH)
VALUES 
    (N'DH001', N'KH001', N'NV001', NULL, N'Đang giao'),
    (N'DH002', N'KH002', N'NV002', NULL, N'Đã nhận'),
    (N'DH003', N'KH003', N'NV003', NULL, N'Đã hủy'),
    (N'DH004', N'KH004', N'NV004', NULL, N'Đang giao'),
    (N'DH005', N'KH005', N'NV005', NULL, N'Đã nhận'),
    (N'DH006', N'KH006', N'NV006', NULL, N'Đang giao'),
    (N'DH007', N'KH007', N'NV007', NULL, N'Đã nhận'),
    (N'DH008', N'KH008', N'NV008', NULL, N'Đã hủy'),
    (N'DH009', N'KH009', N'NV009', NULL, N'Đang giao'),
    (N'DH010', N'KH010', N'NV010', NULL, N'Đã nhận');

CREATE TABLE ChiTietDonHang
(
    MaDonHang NVARCHAR(10),
    MaSach NVARCHAR(10),
    SoLuong INT NOT NULL CHECK (SoLuong > 0),
    Gia INT,
    --PRIMARY KEY (MaDonHang, MaSach),
    --FOREIGN KEY (MaDonHang) REFERENCES DonHang(MaDonHang),
    --FOREIGN KEY (MaSach) REFERENCES Sach(MaSach)
);
UPDATE ChiTietDonHang
SET Gia = Sach.Gia
FROM ChiTietDonHang
INNER JOIN Sach ON ChiTietDonHang.MaSach = Sach.MaSach;


INSERT INTO ChiTietDonHang (MaDonHang, MaSach, SoLuong, Gia)
VALUES 
    (N'DH001', N'S001', 2, NULL),
    (N'DH001', N'S002', 1, NULL),
    (N'DH002', N'S003', 1, NULL),
    (N'DH002', N'S004', 3, NULL),
    (N'DH003', N'S005', 1, NULL),
    (N'DH004', N'S006', 2, NULL),
    (N'DH004', N'S007', 1, NULL),
    (N'DH005', N'S008', 1, NULL),
    (N'DH006', N'S009', 2, NULL),
    (N'DH007', N'S010', 1, NULL),
    (N'DH008', N'S001', 4, NULL),
    (N'DH009', N'S002', 2, NULL),
    (N'DH010', N'S003', 3, NULL);

UPDATE ChiTietHoaDon
SET Gia = Sach.Gia
FROM ChiTietHoaDon
INNER JOIN Sach ON ChiTietHoaDon.MaSach = Sach.MaSach;

-- Cập nhật cột Gia trong bảng ChiTietDonHang
UPDATE ChiTietDonHang
SET Gia = Sach.Gia
FROM ChiTietDonHang
INNER JOIN Sach ON ChiTietDonHang.MaSach = Sach.MaSach;

-- Cập nhật TongTien trong bảng HoaDon
UPDATE HoaDon
SET TongTien = (SELECT SUM(SoLuong * Gia) FROM ChiTietHoaDon WHERE HoaDon.MaHoaDon = ChiTietHoaDon.MaHoaDon);

UPDATE DonHang
SET TongTien = (SELECT SUM(SoLuong * Gia) FROM ChiTietDonHang WHERE DonHang.MaDonHang = ChiTietDonHang.MaDonHang);

SELECT * FROM ChiTietHoaDon;
SELECT * FROM HoaDon;
SELECT * FROM DonHang;
SELECT * FROM ChiTietDonHang;

CREATE TRIGGER UpdateGiaChiTietHoaDon
ON Sach
AFTER UPDATE
AS
BEGIN
    UPDATE ChiTietHoaDon
    SET Gia = inserted.Gia
    FROM ChiTietHoaDon
    INNER JOIN inserted ON ChiTietHoaDon.MaSach = inserted.MaSach
    INNER JOIN deleted ON ChiTietHoaDon.MaSach = deleted.MaSach;
END;
CREATE TRIGGER UpdateTongTienHoaDon
ON ChiTietHoaDon
AFTER INSERT, UPDATE, DELETE
AS
BEGIN
    UPDATE HoaDon
    SET TongTien = (SELECT SUM(SoLuong * Gia) FROM ChiTietHoaDon WHERE HoaDon.MaHoaDon = ChiTietHoaDon.MaHoaDon)
    WHERE MaHoaDon IN (SELECT MaHoaDon FROM inserted)
       OR MaHoaDon IN (SELECT MaHoaDon FROM deleted);
END;