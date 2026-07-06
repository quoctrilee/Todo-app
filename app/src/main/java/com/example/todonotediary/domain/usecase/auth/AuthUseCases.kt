package com.example.todonotediary.domain.usecase.auth

import javax.inject.Inject

data class AuthUseCases @Inject constructor(
    val getCurrentUser: GetCurrentUserUseCase,
    val signInWithGoogle: SignInWithGoogleUseCase,
    val loginWithEmail: LoginWithEmailUseCase,
    val signOut: SignOutUseCase,
    val saveUserToFirebaseUseCase: SaveUserToFirebaseUseCase,
    val getUserDataUseCase: GetUserDataUseCase,
    val updateUserAvatarUseCase: UpdateUserAvatarUseCase
)