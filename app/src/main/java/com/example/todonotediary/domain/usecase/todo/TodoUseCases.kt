package com.example.todonotediary.domain.usecase.todo

import javax.inject.Inject

data class TodoUseCases @Inject constructor(
    val getTodos: GetTodosUseCase,
    val getTodoById: GetTodoByIdUseCase,
    val getTodoUpcoming: GetTodoUpcomingUseCase,
    val getTodoPast: GetTodoPastUseCase,
    val addTodo: AddTodoUseCase,
    val updateTodo: UpdateTodoUseCase,
    val deleteTodo: DeleteTodoUseCase,
    val toggleTodoCompletion: ToggleTodoCompletionUseCase,
)