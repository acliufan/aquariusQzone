package com.bean;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPerson is a Querydsl query type for Person
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPerson extends EntityPathBase<Person> {

    private static final long serialVersionUID = -543780218L;

    public static final QPerson person = new QPerson("person");

    public final StringPath address = createString("address");

    public final NumberPath<Long> created = createNumber("created", Long.class);

    public final StringPath id = createString("id");

    public final StringPath phone = createString("phone");

    public final StringPath remark = createString("remark");

    public final StringPath username = createString("username");

    public QPerson(String variable) {
        super(Person.class, forVariable(variable));
    }

    public QPerson(Path<? extends Person> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPerson(PathMetadata<?> metadata) {
        super(Person.class, metadata);
    }

}

