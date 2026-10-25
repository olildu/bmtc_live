package app.chalo.core.database.dao;

import app.cash.sqldelight.coroutines.FlowQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrNull$$inlined$map$1;
import app.chalo.core.Tito_validation_tableQueries;
import app.chalo.core.database.mappers.TITOValidationEntityMapper;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.tito.data.model.entity.TITOValidationEntity;
import app.chalo.tito.data.repository.dao.TITOValidationDao;
import app.chalo.titoridedetail.data.app.TitoValidationStatus;
import app.chalo.vault.db.ChaloCoreDatabaseKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/TITOValidationDaoImpl;", "Lapp/chalo/tito/data/repository/dao/TITOValidationDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TITOValidationDaoImpl implements TITOValidationDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Tito_validation_tableQueries f2083a;
    public final CoroutineContextProvider b;

    public TITOValidationDaoImpl(Tito_validation_tableQueries titoValidationTableQueries, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(titoValidationTableQueries, "titoValidationTableQueries");
        this.f2083a = titoValidationTableQueries;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.tito.data.repository.dao.TITOValidationDao
    public final Object a(String str, TitoValidationStatus titoValidationStatus, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new TITOValidationDaoImpl$updateTitoValidationStatus$2(this, titoValidationStatus, str, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.tito.data.repository.dao.TITOValidationDao
    public final FlowQuery$mapToOneOrNull$$inlined$map$1 b(String str) {
        return FlowQuery.b(FlowQuery.c(this.f2083a.Y(str, new TITOValidationDaoImpl$getTitoEntryForTapId$2(23, TITOValidationEntityMapper.f2111a, TITOValidationEntityMapper.class, "mapper", "mapper(Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lapp/chalo/titoridedetail/data/app/TitoValidationStatus;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/titoridedetail/data/app/TITOProductType;Lapp/chalo/titoridedetail/data/app/TITOProductSubType;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lapp/chalo/tito/data/model/entity/TITOValidationEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.tito.data.repository.dao.TITOValidationDao
    public final FlowQuery$mapToList$$inlined$map$1 c(String str) {
        return FlowQuery.a(FlowQuery.c(this.f2083a.X(str, new TITOValidationDaoImpl$getTitoEntriesForBookingId$2(23, TITOValidationEntityMapper.f2111a, TITOValidationEntityMapper.class, "mapper", "mapper(Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lapp/chalo/titoridedetail/data/app/TitoValidationStatus;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/titoridedetail/data/app/TITOProductType;Lapp/chalo/titoridedetail/data/app/TITOProductSubType;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lapp/chalo/tito/data/model/entity/TITOValidationEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.tito.data.repository.dao.TITOValidationDao
    public final Object d(TITOValidationEntity tITOValidationEntity, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new TITOValidationDaoImpl$insertTitoEntity$2(this, tITOValidationEntity, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.tito.data.repository.dao.TITOValidationDao
    public final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 e() {
        return new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(FlowQuery.b(FlowQuery.c(this.f2083a.Z()), this.b.b()));
    }

    @Override // app.chalo.tito.data.repository.dao.TITOValidationDao
    public final FlowQuery$mapToList$$inlined$map$1 f(String str) {
        return FlowQuery.a(FlowQuery.c(this.f2083a.W(str, new TITOValidationDaoImpl$getAllTitoEntries$2(23, TITOValidationEntityMapper.f2111a, TITOValidationEntityMapper.class, "mapper", "mapper(Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lapp/chalo/titoridedetail/data/app/TitoValidationStatus;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/titoridedetail/data/app/TITOProductType;Lapp/chalo/titoridedetail/data/app/TITOProductSubType;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lapp/chalo/tito/data/model/entity/TITOValidationEntity;", 0))), this.b.b());
    }
}
