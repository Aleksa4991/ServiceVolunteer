package ru.project.servicevolunteer.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import ru.project.servicevolunteer.models.PersonalPetCard;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class PersonalPetCardRepositoryImpl implements PersonalPetCardRepository {
    @Override
    public List<PersonalPetCard> findAll() {
        return null;
    }

    @Override
    public List<PersonalPetCard> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<PersonalPetCard> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<PersonalPetCard> findAllById(Iterable<Long> longs) {
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
    public void delete(PersonalPetCard entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends PersonalPetCard> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends PersonalPetCard> S save(S entity) {
        return null;
    }

    @Override
    public <S extends PersonalPetCard> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<PersonalPetCard> findById(Long aLong) {
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
    public <S extends PersonalPetCard> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends PersonalPetCard> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<PersonalPetCard> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public PersonalPetCard getOne(Long aLong) {
        return null;
    }

    @Override
    public PersonalPetCard getById(Long aLong) {
        return null;
    }

    @Override
    public PersonalPetCard getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends PersonalPetCard> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends PersonalPetCard> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends PersonalPetCard> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends PersonalPetCard> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends PersonalPetCard> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends PersonalPetCard> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends PersonalPetCard, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
