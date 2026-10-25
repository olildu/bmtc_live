package app.chalo.tito.data.local;

import app.chalo.tito.data.model.entity.TITOValidationEntity;
import app.chalo.tito.data.repository.dao.TITOValidationDao;
import app.chalo.titoridedetail.data.app.TitoValidationStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/tito/data/local/TITOValidationDataSourceImpl;", "Lapp/chalo/tito/data/local/TITOValidationDataSource;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TITOValidationDataSourceImpl implements TITOValidationDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TITOValidationDao f9636a;
    public final TitoLocalDataStore b;

    public TITOValidationDataSourceImpl(TITOValidationDao tITOValidationDao, TitoLocalDataStore titoLocalDataStore) {
        this.f9636a = tITOValidationDao;
        this.b = titoLocalDataStore;
    }

    @Override // app.chalo.tito.data.local.TITOValidationDataSource
    public final Object a(String str, TitoValidationStatus titoValidationStatus, ContinuationImpl continuationImpl) {
        Object objA = this.f9636a.a(str, titoValidationStatus, continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.tito.data.local.TITOValidationDataSource
    public final Object b(String str, Continuation continuation) {
        Object objB = this.b.b(str, continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    @Override // app.chalo.tito.data.local.TITOValidationDataSource
    public final Object c(String str, ContinuationImpl continuationImpl) {
        return this.f9636a.b(str);
    }

    @Override // app.chalo.tito.data.local.TITOValidationDataSource
    public final Object d(TITOValidationEntity tITOValidationEntity, ContinuationImpl continuationImpl) {
        Object objD = this.f9636a.d(tITOValidationEntity, continuationImpl);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : Unit.f17538a;
    }

    @Override // app.chalo.tito.data.local.TITOValidationDataSource
    public final Object e(String str, Continuation continuation) {
        return this.b.a(str, (ContinuationImpl) continuation);
    }

    @Override // app.chalo.tito.data.local.TITOValidationDataSource
    public final Object f(String str, Continuation continuation) {
        return this.f9636a.c(str);
    }

    @Override // app.chalo.tito.data.local.TITOValidationDataSource
    public final Object g(String str, Continuation continuation) {
        return this.f9636a.f(str);
    }

    @Override // app.chalo.tito.data.local.TITOValidationDataSource
    public final Object h(Continuation continuation) {
        return this.f9636a.e();
    }
}
