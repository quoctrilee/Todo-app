package com.example.todonotediary.domain.usecase.diary

import javax.inject.Inject

data class DiaryUseCases @Inject constructor(
    val getDiaries: GetDiariesUseCase,
    val getDiaryById: GetDiaryByIdUseCase,
    val addDiary: AddDiaryUseCase,
    val updateDiary: UpdateDiaryUseCase,
    val deleteDiary: DeleteDiaryUseCase,
    val syncDiaries: SyncDiariesUseCase,
    val getDiariesByDateUseCase: GetDiariesByDateUseCase,
    val getDiariesByTitleAndContentUseCase: GetDiariesByTitleAndContentUseCase
)
