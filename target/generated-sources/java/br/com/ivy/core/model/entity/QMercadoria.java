package br.com.ivy.core.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;
import br.com.ivy.app.model.entity.Mercadoria;

import com.mysema.query.types.path.*;
import com.mysema.query.types.PathMetadata;

import javax.annotation.Generated;

import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QMercadoria is a Querydsl query type for Mercadoria
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMercadoria extends EntityPathBase<Mercadoria> {

    private static final long serialVersionUID = -1189009013L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMercadoria mercadoria = new QMercadoria("mercadoria");

    public final BooleanPath ativo = createBoolean("ativo");

    public final StringPath descricao = createString("descricao");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nome = createString("nome");

    public final NumberPath<Double> preco = createNumber("preco", Double.class);

    public final NumberPath<Integer> quantidade = createNumber("quantidade", Integer.class);

    public final QVendedor vendedor;

    public QMercadoria(String variable) {
        this(Mercadoria.class, forVariable(variable), INITS);
    }

    public QMercadoria(Path<? extends Mercadoria> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMercadoria(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMercadoria(PathMetadata<?> metadata, PathInits inits) {
        this(Mercadoria.class, metadata, inits);
    }

    public QMercadoria(Class<? extends Mercadoria> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.vendedor = inits.isInitialized("vendedor") ? new QVendedor(forProperty("vendedor")) : null;
    }

}

