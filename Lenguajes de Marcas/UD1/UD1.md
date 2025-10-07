# XSD

## Inicio XSD

```
<?xml version="1.0" encoding="UTF-8"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">
```

## Restricciones más comunes

Las **restricciones** en XSD se usan para limitar los valores permitidos en los elementos o atributos.  
**Se aplican dentro de un tipo simple (`<xs:simpleType>`)**.

### - enumeration
Define un **conjunto cerrado de valores permitidos**. El valor del elemento o atributo debe ser uno de los definidos.

```xml
<xs:simpleType name="GeneroType">
  <xs:restriction base="xs:string">
    <xs:enumeration value="Masculino"/>
    <xs:enumeration value="Femenino"/>
    <xs:enumeration value="Otro"/>
  </xs:restriction>
</xs:simpleType>
```

### - length / minLength / maxLength
Restringen la **longitud de una cadena**.

```xml
<xs:simpleType name="CodigoPostalType">
  <xs:restriction base="xs:string">
    <xs:length value="5"/>
  </xs:restriction>
</xs:simpleType>

<xs:simpleType name="NombreType">
  <xs:restriction base="xs:string">
    <xs:minLength value="2"/>
    <xs:maxLength value="50"/>
  </xs:restriction>
</xs:simpleType>
```

### - pattern
Restringe con una **expresión regular**.

```xml
<xs:simpleType name="TelefonoType">
  <xs:restriction base="xs:string">
    <xs:pattern value="\d{3}-\d{3}-\d{4}"/>
  </xs:restriction>
</xs:simpleType>
```

En este caso, un número válido sería 324-123-9897.

### - minInclusive / maxInclusive
Especifican el rango de valores permitidos, **incluyendo los valores límite**.

```xml
<xs:simpleType name="edadPermitida">
  <xs:restriction base="xs:integer">
    <xs:minInclusive value="18"/>
    <xs:maxInclusive value="65"/>
  </xs:restriction>
</xs:simpleType>
```

### - minExclusive / maxExclusive
Especifican el rango de valores permitidos, **excluyendo los valores límite**.

```xml
<xs:simpleType name="rangoAbierto">
  <xs:restriction base="xs:integer">
    <xs:minExclusive value="0"/>
    <xs:maxExclusive value="10"/>
  </xs:restriction>
</xs:simpleType>
```

### - totaldigits / fractiondigits
Controlan la **cantidad de dígitos** totales y decimales.

```xml
<xs:simpleType name="PrecioType">
  <xs:restriction base="xs:decimal">
    <xs:totalDigits value="6"/>
    <xs:fractionDigits value="2"/>
  </xs:restriction>
</xs:simpleType>
```

Ejemplo válido: 1234.56 (6 dígitos totales, 2 decimales)

### - whitespace
Controla **cómo se tratan los espacios en blanco**:

- **preserve**: mantiene los espacios

- **replace**: reemplaza tabulaciones y saltos por espacio

- **collapse**: elimina espacios duplicados

```xml
<xs:simpleType name="TextoLimpioType">
  <xs:restriction base="xs:string">
    <xs:whiteSpace value="collapse"/>
  </xs:restriction>
</xs:simpleType>
```


### - combinación de restricciones
**Se pueden combinar varias restricciones**:

```xml
<xs:simpleType name="UsuarioType">
  <xs:restriction base="xs:string">
    <xs:minLength value="5"/>
    <xs:maxLength value="12"/>
    <xs:pattern value="[A-Za-z0-9_]+"/>
  </xs:restriction>
</xs:simpleType>
```