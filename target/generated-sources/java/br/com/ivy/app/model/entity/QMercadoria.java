package br.com.ivy.app.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QMercadoria is a Querydsl query type for Mercadoria
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMercadoria extends EntityPathBase<Mercadoria> {

    private static final long serialVersionUID = -882881133L;

    public static final QMercadoria mercadoria = new QMercadoria("mercadoria");

    public final BooleanPath ativo = createBoolean("ativo");

    public final StringPath descricao = createString("descricao");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath nome = createString("nome");

    public final NumberPath<Double> preco = createNumber("preco", Double.class);

    public final NumberPath<Integer> quantidade = createNumber("quantidade", Integer.class);

    public QMercadoria(String variable) {
        super(Mercadoria.class, forVariable(variable));
    }

    public QMercadoria(Path<? extends Mercadoria> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMercadoria(PathMetadata<?> metadata) {
        super(Mercadoria.class, metadata);
    }

}

