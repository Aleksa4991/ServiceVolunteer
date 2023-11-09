package ru.project.servicevolunteer.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import ru.project.servicevolunteer.entity.VolunteerActions;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class VolunteerActionsRepositoryImpl implements VolunteerActionsRepository {
    @Override
    public List<VolunteerActions> findAll() {
        return null;
    }

    @Override
    public List<VolunteerActions> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<VolunteerActions> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<VolunteerActions> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(VolunteerActions entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends VolunteerActions> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends VolunteerActions> S save(S entity) {
        return null;
    }

    @Override
    public <S extends VolunteerActions> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<VolunteerActions> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends VolunteerActions> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends VolunteerActions> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<VolunteerActions> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public VolunteerActions getOne(Long aLong) {
        return null;
    }

    @Override
    public VolunteerActions getById(Long aLong) {
        return null;
    }

    @Override
    public VolunteerActions getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends VolunteerActions> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends VolunteerActions> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends VolunteerActions> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends VolunteerActions> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends VolunteerActions> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends VolunteerActions> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends VolunteerActions, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
