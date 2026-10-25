package app.chalo.citydata.repository.local.store;

import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.datastore.LocalDataStore;
import app.chalo.datastore.LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/citydata/repository/local/store/CityDataLocalStoreImpl;", "Lapp/chalo/citydata/repository/local/store/CityDataLocalStore;", "Companion", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CityDataLocalStoreImpl implements CityDataLocalStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDataStore f1798a;
    public final CityProvider b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/repository/local/store/CityDataLocalStoreImpl$Companion;", "", "", "CITY_DATA_STORE_NAME", "Ljava/lang/String;", "LEGACY_CITY_DATA_STORE_NAME", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public CityDataLocalStoreImpl(LocalDataStore localDataStore, CityProvider cityProvider) {
        this.f1798a = localDataStore;
        this.b = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.citydata.repository.local.store.CityDataLocalStore
    public final Object a(ContinuationImpl continuationImpl) {
        CityDataLocalStoreImpl$getRouteSyncTs$1 cityDataLocalStoreImpl$getRouteSyncTs$1;
        if (continuationImpl instanceof CityDataLocalStoreImpl$getRouteSyncTs$1) {
            cityDataLocalStoreImpl$getRouteSyncTs$1 = (CityDataLocalStoreImpl$getRouteSyncTs$1) continuationImpl;
            int i = cityDataLocalStoreImpl$getRouteSyncTs$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityDataLocalStoreImpl$getRouteSyncTs$1.label = i - Integer.MIN_VALUE;
            } else {
                cityDataLocalStoreImpl$getRouteSyncTs$1 = new CityDataLocalStoreImpl$getRouteSyncTs$1(this, continuationImpl);
            }
        } else {
            cityDataLocalStoreImpl$getRouteSyncTs$1 = new CityDataLocalStoreImpl$getRouteSyncTs$1(this, continuationImpl);
        }
        Object objV = cityDataLocalStoreImpl$getRouteSyncTs$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityDataLocalStoreImpl$getRouteSyncTs$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            String strB = CityProviderKt.b(this.b);
            if (strB == null) {
                strB = "";
            }
            String lowerCase = strB.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 localDataStore$getFlowFromLocalDataStore$$inlined$map$1E = this.f1798a.e(PreferencesKeys.longKey("routeSyncTsKey_".concat(lowerCase)));
            cityDataLocalStoreImpl$getRouteSyncTs$1.label = 1;
            objV = FlowKt.v(localDataStore$getFlowFromLocalDataStore$$inlined$map$1E, cityDataLocalStoreImpl$getRouteSyncTs$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        Long l = (Long) objV;
        return new Long(l != null ? l.longValue() : -1L);
    }

    @Override // app.chalo.citydata.repository.local.store.CityDataLocalStore
    public final Object b(long j, Continuation continuation) {
        String strB = CityProviderKt.b(this.b);
        if (strB == null) {
            strB = "";
        }
        String lowerCase = strB.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        Object objG = this.f1798a.g(PreferencesKeys.longKey("routeSyncTsKey_".concat(lowerCase)), new Long(j), continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }
}
