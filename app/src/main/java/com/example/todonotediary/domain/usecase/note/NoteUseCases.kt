package com.example.todonotediary.domain.usecase.note

import javax.inject.Inject

data class NoteUseCases @Inject constructor(
    val addNote: AddNoteUseCase,
    val deleteNote: DeleteNoteUseCase,
    val getNoteById: GetNoteByIdUseCase,
    val getNotesByCategory: GetNotesByCategoryUseCase,
    val getNotes: GetNotesUseCase,
    val syncNotes: SyncNotesUseCase,
    val updateNote: UpdateNoteUseCase,
    val searchNotesByTitleOrContentUseCase: SearchNotesByTitleOrContentUseCase,
    val getCategoryUseCase: GetCategoryUseCase
)