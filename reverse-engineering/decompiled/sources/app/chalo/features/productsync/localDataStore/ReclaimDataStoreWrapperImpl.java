package app.chalo.features.productsync.localDataStore;

import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.datastore.LocalDataStore;
import app.chalo.datastore.LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/features/productsync/localDataStore/ReclaimDataStoreWrapperImpl;", "Lapp/chalo/features/productsync/localDataStore/ReclaimDataStoreWrapper;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReclaimDataStoreWrapperImpl implements ReclaimDataStoreWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDataStore f2740a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/features/productsync/localDataStore/ReclaimDataStoreWrapperImpl$Companion;", "", "", "PRODUCT_RECLAIM_DATA_STORE_KEY", "Ljava/lang/String;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ReclaimDataStoreWrapperImpl(LocalDataStore localDataStore) {
        this.f2740a = localDataStore;
    }

    @Override // app.chalo.features.productsync.localDataStore.ReclaimDataStoreWrapper
    public final Object a(boolean z, String str, String str2, Continuation continuation) {
        Object objG = this.f2740a.g(PreferencesKeys.booleanKey("are_products_purchased_on_multiple_devices_" + str + "_" + str2), Boolean.valueOf(z), continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    @Override // app.chalo.features.productsync.localDataStore.ReclaimDataStoreWrapper
    public final LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 b(String cityName, String str) {
        Intrinsics.i(cityName, "cityName");
        return this.f2740a.e(PreferencesKeys.booleanKey("are_products_purchased_on_multiple_devices_" + cityName + "_" + str));
    }
}
