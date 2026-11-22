# Лаборатори №9 - Код хамралт

**Оюутны нэр:** С.Туяацэцэг
**Оюутны код:** B210910804

## Ашигласан орчин

**Java:**

```text
$ java -version
openjdk version "25.0.5.0.2" 2026-10-22 LTS
OpenJDK Runtime Environment Microsoft-15804669 (build 25.0.5.0.2+1-LTS)
OpenJDK 64-Bit Server VM Microsoft-15804669 (build 25.0.5.0.2+1-LTS, mixed mode, sharing)
```

**Maven:**

```text
$ mvn -version
Apache Maven 3.10.0 (c43a36b8d67be7e0805a411bc0898af1a51f5472)
Maven home: /usr/local/sdkman/candidates/maven/current
Java version: 25.0.5.0.2, vendor: Microsoft, runtime: /usr/local/sdkman/candidates/java/25.0.5.0+2-ms
Default locale: en, platform encoding: UTF-8, time zone: Etc/UTC
OS name: "linux", version: "6.8.0-1070-azure", arch: "amd64", family: "unix"
```

## A. Happy path тест

letterGrade(), gpa(), scholarship() функцүүдийн
хэвийн ажиллагааг шалгах 5 тест бичив.

| Тест | Оролт | Expected |
|---|---|---|
| testGradeA | 95 | A |
| testGradeB | 85 | B |
| testGpa | [95,85] | 3.5 |
| testFullScholarship | 3.9,16,false | 100 |
| testPartialScholarship | 3.5,12,false | 70 |

### A хэсгийн үр дүн

| Хэмжүүр | Missed | Covered | Нийт | Хамралт |
|---|---|---|---|---|
| Line | 10 | 15 | 25 | 60% |
| Branch | 21 | 20 | 41 | 48.8% |

5 тест бүгд амжилттай ажилласан.
Одоогоор зөвхөн хэвийн оролтуудыг шалгасан тул
алдаатай оролт болон нөхцөлийн зарим салаа
хамрагдаагүй байна.

Үр дүн:
- results/mvn-verify-A.txt
- results/jacoco-A.csv