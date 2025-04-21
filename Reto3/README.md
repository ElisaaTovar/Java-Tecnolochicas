<h1 align="center">🏥 Simulador de Farmacia con Descuento</h1>
<p align="center">Proyecto de práctica con Programación Orientada a Objetos</p>

<p align="center">
  <img src="https://img.shields.io/badge/Estado-Finalizado-brightgreen"/>
  <img src="https://img.shields.io/badge/Java-8%2B-red"/>
  <img src="https://img.shields.io/badge/OOP-Fundamentals-blue"/>
  <img src="https://img.shields.io/github/last-commit/ElisaaTovar/Java-Tecnolochicas/main/Reto3?style=flat-square"/>
  <img src="https://visitor-badge.laobi.icu/badge?page_id=ElisaaTovar.Java-Tecnolochicas.tree.main.Reto3" />
</p>

## 🎯 Objetivo

⚒️ Desarrollar un programa que calcule el total de una compra en farmacia y aplique un descuento si supera cierta cantidad. Este reto refuerza el uso de **operadores aritméticos**, **asignación**, **entrada por consola**, e **inferencia de tipo con `var`**.

---

## 📝 Instrucciones

👥 Puedes resolver este reto de forma individual o en equipo.

1. 💊 Crea una clase llamada `SimuladorFarmacia`.

2. Solicita al usuario que introduzca los siguientes datos:
   - Nombre del medicamento (tipo `String`)
   - Precio unitario (tipo `double`)
   - Cantidad de piezas (tipo `int`)

3. Calcula el **total sin descuento** multiplicando el precio por la cantidad.

4. Supón que si el total supera los **$500.00**, la farmacia ofrece un **15% de descuento**. Aplica el descuento usando el operador ternario (`? :`) sin estructuras `if`.

5. Muestra en consola el resumen con el siguiente formato:

```plaintext
Medicamento: Amoxicilina
Cantidad: 5
Precio unitario: $120.0
Total sin descuento: $600.0
¿Aplica descuento?: true
Descuento: $90.0
Total a pagar: $510.0
```

---

### 📌 Consideraciones

- Utiliza `var` en al menos una línea de tu código.
- No uses `if`, `else` ni `switch`. Solo operadores básicos y ternarios.
- El valor del descuento solo debe calcularse si **el total supera los $500.00**.

---
