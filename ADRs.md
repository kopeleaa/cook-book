# ADR001: DTOs as Java records, code-firs API

## Status
Accepted (2026-11-08)

## Context
Solo project, no external API consumers, endpoints evolve during development. 
MapStruct is used for entity <-> DTO mapping.
Contract-first is already familiar from day-to-day work; a learning goal of this project is hand-on experience with records as DTOs.

## Decision
Use Java records for request/response DTOs. Generate the OnepAPI spec and Sagger UI from code with springdoc-openapi.

## Alternatives considered
- Contract-first with openapi-generator: rejected, no coordination need; adds generator config, JsonNullable handling, type conversions.

## Consequences
+ Less boilerplate code, immutable DTOs, simple MapStruct mappers.
- No partial-update (PATCH) semantics out of the box.

## Revisit when
- A second client (e.g. mobile) or another developer joins in.
- Partial updates become a real requirement.
