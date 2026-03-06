
TODO

# API ENDPOINTs del proyecto

---

**GET /api/v1/projects** - List projects. Query: `status`, `limit` (1-100), `offset`, `sort`, `order`.

**POST /api/v1/projects** - Create project. Body: `name` (required, unique in org), `description`, `color`.

**PATCH /api/v1/projects/:projectId** - Partial update. Admin+ to archive.

**DELETE /api/v1/projects/:projectId** - Soft delete project and all tasks. Admin+ only.


---
