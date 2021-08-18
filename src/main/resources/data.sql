INSERT INTO 給与.従業員
    (従業員ID)
VALUES
    (1),
    (2),
    (3),
    (4),
    (5),
    (6)
;

-- ユーザ名
INSERT INTO 給与.従業員の名前履歴
    (従業員名ID, 従業員ID, 従業員名)
values
    (1, 1, '田中 一郎'),
    (2, 2, '佐藤 二郎'),
    (3, 3, '山田 三郎'),
    (4, 4, '阿部 士郎'),
    (5, 5, '大和 五郎'),
    (6, 6, '三宅 六郎')
;
INSERT INTO 給与.従業員の名前履歴
    (従業員名ID, 従業員ID, 従業員名)
values
   (7, 1, '田中 優一郎')
;

INSERT INTO 給与.従業員の名前
    (従業員ID, 従業員名ID, 従業員名)
values
    (1, 7, '田中 優一郎'),
    (2, 2, '佐藤 二郎'),
    (3, 3, '山田 三郎'),
    (4, 4, '阿部 士郎'),
    (5, 5, '大和 五郎'),
    (6, 6, '三宅 六郎')
;

-- 電話番号
INSERT INTO 給与.従業員の電話番号履歴
    (従業員電話番号ID, 従業員ID, 電話番号)
values
    (1, 1, '03-1234-5678'),
    (2, 2, '03-1234-5678'),
    (3, 3, '03-1234-5678'),
    (4, 4, '03-1234-5678'),
    (5, 5, '03-1234-5678'),
    (6, 6, '03-1234-5678')
;
INSERT INTO 給与.従業員の電話番号履歴
    (従業員電話番号ID, 従業員ID, 電話番号)
values
    (7, 1, '03-1234-9999')
;

INSERT INTO 給与.従業員の電話番号
    (従業員ID, 従業員電話番号ID, 電話番号)
values
    (1, 7, '03-1234-9999'),
    (2, 2, '03-1234-5678'),
    (3, 3, '03-1234-5678'),
    (4, 4, '03-1234-5678'),
    (5, 5, '03-1234-5678'),
    (6, 6, '03-1234-5678')
;

-- メールアドレス
INSERT INTO 給与.従業員のメールアドレス履歴
    (従業員メールアドレスID, 従業員ID, メールアドレス)
values
    (1, 1, 'ichiro@example.com'),
    (2, 2, 'jiro@example.com'),
    (3, 3, 'saburo@example.com'),
    (4, 4, 'shiro@example.com'),
    (5, 5, 'goro@example.com'),
    (6, 6, 'rokuro@example.com')
;
INSERT INTO 給与.従業員のメールアドレス履歴
    (従業員メールアドレスID, 従業員ID, メールアドレス)
values
    (7, 1, 'yuichiro@example.com')
;

INSERT INTO 給与.従業員のメールアドレス
    (従業員ID, 従業員メールアドレスID, メールアドレス)
values
    (1, 7, 'yuichiro@example.com'),
    (2, 2, 'jiro@example.com'),
    (3, 3, 'saburo@example.com'),
    (4, 4, 'shiro@example.com'),
    (5, 5, 'goro@example.com'),
    (6, 6, 'rokuro@example.com')
;
