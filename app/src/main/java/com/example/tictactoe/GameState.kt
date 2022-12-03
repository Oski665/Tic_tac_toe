package com.example.tictactoe

data class GameState(
    val playerCircleCount: Int = 0,
    val playerCrossCount: Int = 0,
    val drawCount: Int = 0,
    val hintText: String = "Player 'O' turn",
    val currentTurn: BoardCellValue = BoardCellValue.CIRCLE,
    val victoryType: VictoryType = VictoryType.NONE,
    val hasWon: Boolean = false
)

enum class BoardCellValue{
    CIRCLE,
    CROSS,
    NONE
}

enum class VictoryType{
    HORIZONTALLINEONE,
    HORIZONTALLINETWO,
    HORIZONTALLINETHREE,
    VERTICALLINEONE,
    VERTICALLINETWO,
    VERTICALLINETHREE,
    CROSSLINEONE,
    CROSSLINETWO,
    NONE
}
