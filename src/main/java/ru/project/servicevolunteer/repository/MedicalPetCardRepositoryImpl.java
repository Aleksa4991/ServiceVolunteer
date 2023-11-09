package ru.project.servicevolunteer.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import ru.project.servicevolunteer.models.MedicalPetCard;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class MedicalPetCardRepositoryImpl implements MedicalPetCardRepository {
    @Override
    public List<MedicalPetCard> findAll() {
        return null;
    }

    @Override
    public List<MedicalPetCard> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<MedicalPetCard> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<MedicalPetCard> findAllById(Iterable<Long> longs) {
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
    public void delete(MedicalPetCard entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends MedicalPetCard> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends MedicalPetCard> S save(S entity) {
        return null;
    }

    @Override
    public <S extends MedicalPetCard> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<MedicalPetCard> findById(Long aLong) {
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
    public <S extends MedicalPetCard> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends MedicalPetCard> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<MedicalPetCard> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public MedicalPetCard getOne(Long aLong) {
        return null;
    }

    @Override
    public MedicalPetCard getById(Long aLong) {
        return null;
    }

    @Override
    public MedicalPetCard getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends MedicalPetCard> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends MedicalPetCard> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends MedicalPetCard> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends MedicalPetCard> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends MedicalPetCard> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends MedicalPetCard> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends MedicalPetCard, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
