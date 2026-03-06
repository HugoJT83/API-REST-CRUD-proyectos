TODO

# SCHEMA del proyecto

---

### Tablas principales

```sql
CREATE TABLE usuarios (
  id BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  email VARCHAR(255) NOT NULL,
  name VARCHAR(200) NOT NULL,
  bio TEXT,
  settings JSON,
  role ENUM('admin', 'member', 'viewer') DEFAULT 'member',
  created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
  deleted_at DATETIME DEFAULT NULL,
  UNIQUE INDEX idx_users_email (email)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE tareas (
  id BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  author_id BIGINT UNSIGNED NOT NULL,
  title VARCHAR(300) NOT NULL,
  slug VARCHAR(300) NOT NULL,
  body LONGTEXT NOT NULL,
  status ENUM('draft', 'published', 'archived') DEFAULT 'draft',
  published_at DATETIME DEFAULT NULL,
  created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  UNIQUE INDEX idx_posts_slug (slug),
  INDEX idx_posts_author_status (author_id, status),
  FULLTEXT INDEX idx_posts_search (title, body),
  FOREIGN KEY (author_id) REFERENCES users(id) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
```

---
