package com.petermax.blog.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "comments")
public class Comment {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Long postId;

  private Long authorId;

  @Column(columnDefinition = "TEXT")
  private String content;

  private LocalDateTime createdAt = LocalDateTime.now();
}
