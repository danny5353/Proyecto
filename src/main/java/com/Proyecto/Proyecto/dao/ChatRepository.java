package com.Proyecto.Proyecto.dao;



import com.Proyecto.Proyecto.domain.Chat;
import com.Proyecto.Proyecto.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ChatRepository extends JpaRepository<Chat,Integer> {

    // JPQL SELECT ch FROM CpChat ch WHERE ch.cpUserUserId.userId = 1 ORDER BY ch.chatId DESC <<LIMIT 1>>
    @Query(value = "SELECT * FROM cp_chat where  cp_user_user_id = ?1 ORDER BY chat_id DESC LIMIT 1", nativeQuery = true)
    public Chat findLastChatByUserId(Integer userId);
}
