# Implementación de un protocolo de comunicación WebSocket para un sistema de chat en tiempo real

El sistema de chat en tiempo real necesita implementar un protocolo de comunicación no REST, específicamente WebSocket, para permitir la comunicación bidireccional en tiempo real entre el servidor y los clientes. El objetivo es diseñar e implementar la estructura de mensajes y el modelo de procesamiento necesario para soportar esta funcionalidad.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Protocolos no convencionales |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 3-4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición de la estructura de mensajes

**Objetivo:** Definir la estructura de los mensajes que se enviarán y recibirán a través del protocolo WebSocket.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identificar las características necesarias para los mensajes de chat (emisor, receptor, contenido, timestamp).

**Entregable:** Especificación de la estructura de los mensajes.

<details>
<summary>Pistas de conocimiento</summary>

- Los mensajes deben ser claros y concisos.
- Considera la necesidad de incluir metadatos relevantes.

</details>

### Fase 2: Modelo de procesamiento de mensajes

**Objetivo:** Diseñar el modelo de procesamiento de los mensajes en el servidor y en los clientes.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Definir cómo se manejarán los mensajes en el servidor y en los clientes.
- Considerar la gestión de conexiones y la sincronización de mensajes.

**Entregable:** Diagrama del modelo de procesamiento de mensajes.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en cómo manejarás las conexiones y la sincronización de mensajes.
- Considera los posibles estados de una conexión WebSocket.

</details>

### Fase 3: Implementación y pruebas

**Objetivo:** Implementar el protocolo WebSocket y realizar pruebas para asegurar su funcionamiento correcto.

**Tiempo estimado:** 1-2 horas

**Instrucciones:**

- Implementar la estructura de mensajes y el modelo de procesamiento definidos en las fases anteriores.
- Realizar pruebas para verificar que el sistema de chat en tiempo real funciona correctamente.

**Entregable:** Sistema de chat en tiempo real funcional con WebSocket.

<details>
<summary>Pistas de conocimiento</summary>

- Realiza pruebas con diferentes escenarios para asegurar la robustez del sistema.
- Considera posibles edge cases y cómo manejarlos.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un protocolo de comunicación WebSocket y por qué se usa en sistemas de chat en tiempo real?
- **paraQueSirve**: ¿Para qué sirve la estructura de mensajes definida en la fase 1?
- **comoSeUsa**: ¿Cómo se usa el modelo de procesamiento de mensajes definido en la fase 2?
- **erroresComunes**: ¿Cuáles son los errores comunes que pueden ocurrir al implementar un protocolo WebSocket?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de un protocolo WebSocket en un sistema de chat en tiempo real?

## Criterios de Evaluacion

- Definición de la estructura de mensajes.
- Diseño del modelo de procesamiento de mensajes.
- Implementación funcional del protocolo WebSocket.
- Realización de pruebas para verificar el funcionamiento del sistema de chat en tiempo real.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
