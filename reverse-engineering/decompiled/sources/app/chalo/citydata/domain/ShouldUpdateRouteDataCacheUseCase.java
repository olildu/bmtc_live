package app.chalo.citydata.domain;

import app.chalo.citydata.data.model.app.CityDataConfigForCity;
import app.chalo.citydata.repository.local.store.CityDataLocalStore;
import app.chalo.contract.BasicInfoContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/domain/ShouldUpdateRouteDataCacheUseCase;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShouldUpdateRouteDataCacheUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityDataLocalStore f1768a;
    public final BasicInfoContract b;
    public final GetCityDataRemoteConfigUseCase c;

    public ShouldUpdateRouteDataCacheUseCase(CityDataLocalStore cityDataLocalStore, BasicInfoContract basicInfoContract, GetCityDataRemoteConfigUseCase getCityDataRemoteConfigUseCase) {
        this.f1768a = cityDataLocalStore;
        this.b = basicInfoContract;
        this.c = getCityDataRemoteConfigUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        ShouldUpdateRouteDataCacheUseCase$invoke$1 shouldUpdateRouteDataCacheUseCase$invoke$1;
        long j;
        long jLongValue;
        long j2;
        long j3;
        if (continuationImpl instanceof ShouldUpdateRouteDataCacheUseCase$invoke$1) {
            shouldUpdateRouteDataCacheUseCase$invoke$1 = (ShouldUpdateRouteDataCacheUseCase$invoke$1) continuationImpl;
            int i = shouldUpdateRouteDataCacheUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                shouldUpdateRouteDataCacheUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                shouldUpdateRouteDataCacheUseCase$invoke$1 = new ShouldUpdateRouteDataCacheUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            shouldUpdateRouteDataCacheUseCase$invoke$1 = new ShouldUpdateRouteDataCacheUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = shouldUpdateRouteDataCacheUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = shouldUpdateRouteDataCacheUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            shouldUpdateRouteDataCacheUseCase$invoke$1.label = 1;
            objA = this.c.a(shouldUpdateRouteDataCacheUseCase$invoke$1);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objA);
        } else {
            if (i2 == 2) {
                j = shouldUpdateRouteDataCacheUseCase$invoke$1.J$0;
                ResultKt.b(objA);
                jLongValue = ((Number) objA).longValue();
                shouldUpdateRouteDataCacheUseCase$invoke$1.J$0 = j;
                shouldUpdateRouteDataCacheUseCase$invoke$1.J$1 = jLongValue;
                shouldUpdateRouteDataCacheUseCase$invoke$1.label = 3;
                objA = this.b.c(shouldUpdateRouteDataCacheUseCase$invoke$1);
                if (objA != coroutineSingletons) {
                    j2 = j;
                    j3 = jLongValue;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = shouldUpdateRouteDataCacheUseCase$invoke$1.J$1;
            j2 = shouldUpdateRouteDataCacheUseCase$invoke$1.J$0;
            ResultKt.b(objA);
        }
        return Boolean.valueOf(((Number) objA).longValue() - j3 >= j2);
        j = ((CityDataConfigForCity) objA).c;
        shouldUpdateRouteDataCacheUseCase$invoke$1.J$0 = j;
        shouldUpdateRouteDataCacheUseCase$invoke$1.label = 2;
        objA = this.f1768a.a(shouldUpdateRouteDataCacheUseCase$invoke$1);
        if (objA != coroutineSingletons) {
            jLongValue = ((Number) objA).longValue();
            shouldUpdateRouteDataCacheUseCase$invoke$1.J$0 = j;
            shouldUpdateRouteDataCacheUseCase$invoke$1.J$1 = jLongValue;
            shouldUpdateRouteDataCacheUseCase$invoke$1.label = 3;
            objA = this.b.c(shouldUpdateRouteDataCacheUseCase$invoke$1);
            if (objA != coroutineSingletons) {
                j2 = j;
                j3 = jLongValue;
                return Boolean.valueOf(((Number) objA).longValue() - j3 >= j2);
            }
        }
        return coroutineSingletons;
    }
}
