# İsim uzayları (Namespaces)

Programlama dillerinde bir takım hazır kütüphaneler mevcuttur. 
Bu kütüphanelerin bazıları standart olmasının yanı sıra bazıları da programcılar tarafından oluşturulmuştur. 
Genel olarak Nesne Tabanlı (Object Oriented) programlama dillerinde (Visual Basic, Java, C++,...gibi) hazır kütüphanelerden faydalanılır.
Fakat C# dilinde standart bir  kütüphane bulunmamaktadır.
.Net bütün bu sınıfları ve türleri iyi bir şekilde organize edebilmek için  isim uzayı (namespace) kavramını sıklıkla kullanır.
İsim uzayları (namespaces) şu şekilde tanımlanır:

namespace Test
{
    class Sinif
    {
        //kod
    }
    
}
İsim uzayları (Namespaces) C# dilinde  using  anahtar sözcüğü ile kullanılır, fakat isim uzayları (namespaces)  diğer dillerde  farklı şekillerde derleyiciye
bildirilseler de bütün Nesne Tabanlı (Object Oriented) programlama dillerinde yapılan iş aynıdır. Şu şekilde isim uzayları (namespaces) programa eklenir:

using Test;

İçiçe (nested) isim uzayları (namespaces) programa eklenirken de "using" anahtar sözcüğü kullanılır. Tek fark içteki bir isim uzayı (namespace) kullanılmak 
istendiğinde "using" anahtar sözcğüyle birlikte isim uzayının (namespace) tam yolu yazılmalıdır. Şu şekilde örneklendirilebilir:

using Test.Test2;
