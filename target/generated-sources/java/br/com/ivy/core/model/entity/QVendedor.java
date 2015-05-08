package br.com.ivy.core.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;
import br.com.ivy.app.model.entity.Mercadoria;
import br.com.ivy.app.model.entity.Vendedor;

import com.mysema.query.types.path.*;
import com.mysema.query.types.PathMetadata;

import javax.annotation.Generated;

import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QVendedor is a Querydsl query type for Vendedor
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QVendedor extends EntityPathBase<Vendedor> {

    private static final long serialVersionUID = -272975989L;

    public static final QVendedor vendedor = new QVendedor("vendedor");

    public final DatePath<java.util.Date> dataAdmicao = createDate("dataAdmicao", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath matricula = createString("matricula");

    public final ListPath<Mercadoria, QMercadoria> mercadorias = this.<Mercadoria, QMercadoria>createList("mercadorias", Mercadoria.class, QMercadoria.class, PathInits.DIRECT2);

    public final StringPath primeiroNome = createString("primeiroNome");

    public final StringPath ultimoNome = createString("ultimoNome");

    public QVendedor(String variable) {
        super(Vendedor.class, forVariable(variable));
    }

    public QVendedor(Path<? extends Vendedor> path) {
        super(path.getType(), path.getMetadata());
    }

    public QVendedor(PathMetadata<?> metadata) {
        super(Vendedor.class, metadata);
    }

}

