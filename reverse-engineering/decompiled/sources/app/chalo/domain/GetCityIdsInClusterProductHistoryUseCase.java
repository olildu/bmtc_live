package app.chalo.domain;

import app.chalo.data.ClusterConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/GetCityIdsInClusterProductHistoryUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetCityIdsInClusterProductHistoryUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetClusterConfigForCityUseCase f2492a;

    public GetCityIdsInClusterProductHistoryUseCase(GetClusterConfigForCityUseCase getClusterConfigForCityUseCase) {
        this.f2492a = getClusterConfigForCityUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        GetCityIdsInClusterProductHistoryUseCase$invoke$1 getCityIdsInClusterProductHistoryUseCase$invoke$1;
        if (continuationImpl instanceof GetCityIdsInClusterProductHistoryUseCase$invoke$1) {
            getCityIdsInClusterProductHistoryUseCase$invoke$1 = (GetCityIdsInClusterProductHistoryUseCase$invoke$1) continuationImpl;
            int i = getCityIdsInClusterProductHistoryUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getCityIdsInClusterProductHistoryUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getCityIdsInClusterProductHistoryUseCase$invoke$1 = new GetCityIdsInClusterProductHistoryUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getCityIdsInClusterProductHistoryUseCase$invoke$1 = new GetCityIdsInClusterProductHistoryUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = getCityIdsInClusterProductHistoryUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getCityIdsInClusterProductHistoryUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            getCityIdsInClusterProductHistoryUseCase$invoke$1.label = 1;
            objA = this.f2492a.a(str, getCityIdsInClusterProductHistoryUseCase$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return ((ClusterConfig) objA).b;
    }
}
