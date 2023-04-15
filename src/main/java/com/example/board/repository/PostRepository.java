package com.example.board.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

/**
 * 投稿のリポジトリー.
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
	public Optional<Post> findById(String id);

	/**
	 * + * 更新日時の降順ですべての投稿を検索する + * + * @return 投稿のリスト +
	 */
	List<Post> findAllByOrderByUpdatedDateDesc();
	List<Post> findByDeletedFalseOrderByUpdatedDateDesc();
}