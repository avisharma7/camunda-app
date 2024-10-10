# Camunda BPMN Project

This repository demonstrates the use of **Camunda BPMN** process modeling and execution with a focus on service tasks, gateways, subprocesses, and connectors for external REST API integration.

## Table of Contents

1. [Introduction](#introduction)
2. [Service Task Implementation](#service-task-implementation)
    - [Java Class](#java-class)
    - [Delegate Expression](#delegate-expression)
    - [Expression](#expression)
    - [REST (Connector)](#rest-connector)
3. [Execution in Camunda](#execution-in-camunda)
    - [Input and Output Parameters](#input-and-output-parameters)
4. [Gateways](#gateways)
    - [Exclusive Gateway](#exclusive-gateway)
    - [Parallel Gateway](#parallel-gateway)
    - [Inclusive Gateway](#inclusive-gateway)
5. [Sub-Processes](#sub-processes)
    - [Call Activity](#call-activity)
    - [Embedded Sub-Process](#embedded-sub-process)
6. [Usage](#usage)
7. [License](#license)

---

## Introduction

This project contains a BPMN process modeled using Camunda. The project demonstrates various concepts such as:
- Service task implementations using Java and REST connectors
- Gateway controls for execution flow
- Subprocesses (Call Activity and Embedded Sub-Process) for process reusability

## Service Task Implementation

Service tasks are automated tasks used to execute business logic in the process. Camunda supports several ways to implement service tasks:

### Java Class
You can define your business logic in a Java class and link it to a service task in the BPMN model. The class is executed when the task is reached in the process flow.

### Delegate Expression
Delegate expressions allow linking a service task to a Spring or CDI-managed bean. It provides a more flexible way to execute logic managed by dependency injection frameworks.

### Expression
Expression language (EL) is a simple way to write logic within the process model. It allows quick operations using process variables.

### REST (Connector)
REST connectors allow calling external APIs from within the Camunda process. This is useful when the business logic resides outside your application and can be accessed via an API.

**Note**: Sometimes, the HTTP connector may not work due to configuration or security settings, requiring alternative approaches.

## Execution in Camunda

### Input and Output Parameters
- **Input Parameters**: Local variables used only within the service task.
- **Output Parameters**: Global variables that persist across the entire process flow.

These parameters allow you to control variable scoping within tasks.

## Gateways

Gateways control the flow of execution in BPMN processes.

### Exclusive Gateway
An exclusive gateway evaluates conditions and selects only one outgoing sequence flow. If more than one condition is true, the sequence flow that is defined first in the XML file or model will be taken.

- If no condition evaluates to `true` and no default sequence flow is defined, it will result in a runtime error.

### Parallel Gateway
Parallel gateways allow splitting the process into multiple concurrent paths. There are two types:
1. **Diverging Parallel Gateway**: Used to execute all outgoing flows simultaneously without conditions.
2. **Converging Parallel Gateway**: Synchronizes parallel flows back into a single execution path.

### Inclusive Gateway
Inclusive gateways combine the behaviors of exclusive and parallel gateways:
- They evaluate conditions on the outgoing flows (like exclusive gateways).
- Multiple paths can be executed in parallel if more than one condition is `true`.

## Sub-Processes

Sub-processes allow reusing logic and grouping tasks for better process management.

### Call Activity
A call activity references an external process definition, allowing reusability across multiple process definitions. It is ideal for tasks that are common across several workflows.

### Embedded Sub-Process
An embedded sub-process is defined within the parent process and can contain tasks, gateways, and other process elements. It is used to logically group tasks within the same BPMN process.

## Usage

1. Clone this repository:
   ```bash
   git clone https://github.com/avisharma7/camunda-app.git
