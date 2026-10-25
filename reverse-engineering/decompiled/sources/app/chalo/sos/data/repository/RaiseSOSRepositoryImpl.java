package app.chalo.sos.data.repository;

import app.chalo.sos.data.model.RaiseSOSInvalidDataException;
import app.chalo.sos.data.model.RaiseSOSRemoteApiResponseModel;
import app.chalo.sos.data.model.RaiseSOSRemoteAppResponseModel;
import app.chalo.sos.data.remote.RaiseSOSRemoteDataSource;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/data/repository/RaiseSOSRepositoryImpl;", "Lapp/chalo/sos/data/repository/RaiseSOSRepository;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RaiseSOSRepositoryImpl implements RaiseSOSRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RaiseSOSRemoteDataSource f9428a;

    public RaiseSOSRepositoryImpl(RaiseSOSRemoteDataSource raiseSOSRemoteDataSource) {
        this.f9428a = raiseSOSRemoteDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.sos.data.repository.RaiseSOSRepository
    public final Object a(LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl) throws RaiseSOSInvalidDataException {
        RaiseSOSRepositoryImpl$raiseSOS$1 raiseSOSRepositoryImpl$raiseSOS$1;
        if (continuationImpl instanceof RaiseSOSRepositoryImpl$raiseSOS$1) {
            raiseSOSRepositoryImpl$raiseSOS$1 = (RaiseSOSRepositoryImpl$raiseSOS$1) continuationImpl;
            int i = raiseSOSRepositoryImpl$raiseSOS$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                raiseSOSRepositoryImpl$raiseSOS$1.label = i - Integer.MIN_VALUE;
            } else {
                raiseSOSRepositoryImpl$raiseSOS$1 = new RaiseSOSRepositoryImpl$raiseSOS$1(this, continuationImpl);
            }
        } else {
            raiseSOSRepositoryImpl$raiseSOS$1 = new RaiseSOSRepositoryImpl$raiseSOS$1(this, continuationImpl);
        }
        Object objA = raiseSOSRepositoryImpl$raiseSOS$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = raiseSOSRepositoryImpl$raiseSOS$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            raiseSOSRepositoryImpl$raiseSOS$1.label = 1;
            objA = this.f9428a.a(linkedHashMap, raiseSOSRepositoryImpl$raiseSOS$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        RaiseSOSRemoteApiResponseModel raiseSOSRemoteApiResponseModel = (RaiseSOSRemoteApiResponseModel) objA;
        if (raiseSOSRemoteApiResponseModel != null) {
            return new RaiseSOSRemoteAppResponseModel(raiseSOSRemoteApiResponseModel.f9424a);
        }
        throw new RaiseSOSInvalidDataException();
    }
}
