package br.com.ivy.app.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QFuncionario is a Querydsl query type for Funcionario
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QFuncionario extends EntityPathBase<Funcionario> {

    private static final long serialVersionUID = 1003442607L;

    public static final QFuncionario funcionario = new QFuncionario("funcionario");

    public final DatePath<java.util.Date> dataAdmicao = createDate("dataAdmicao", java.util.Date.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath matricula = createString("matricula");

    public final StringPath primeiroNome = createString("primeiroNome");

    public final StringPath ultimoNome = createString("ultimoNome");

    public QFuncionario(String variable) {
        super(Funcionario.class, forVariable(variable));
    }

    public QFuncionario(Path<? extends Funcionario> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFuncionario(PathMetadata<?> metadata) {
        super(Funcionario.class, metadata);
    }

}

