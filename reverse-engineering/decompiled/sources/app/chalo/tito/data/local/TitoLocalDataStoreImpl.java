package app.chalo.tito.data.local;

import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.datastore.LocalDataStore;
import app.chalo.datastore.LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/tito/data/local/TitoLocalDataStoreImpl;", "Lapp/chalo/tito/data/local/TitoLocalDataStore;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TitoLocalDataStoreImpl implements TitoLocalDataStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDataStore f9637a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/tito/data/local/TitoLocalDataStoreImpl$Companion;", "", "", "TITO_DATA_STORE", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public TitoLocalDataStoreImpl(LocalDataStore localDataStore) {
        this.f9637a = localDataStore;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.tito.data.local.TitoLocalDataStore
    public final Object a(String str, ContinuationImpl continuationImpl) {
        TitoLocalDataStoreImpl$isFirstTimeUser$1 titoLocalDataStoreImpl$isFirstTimeUser$1;
        if (continuationImpl instanceof TitoLocalDataStoreImpl$isFirstTimeUser$1) {
            titoLocalDataStoreImpl$isFirstTimeUser$1 = (TitoLocalDataStoreImpl$isFirstTimeUser$1) continuationImpl;
            int i = titoLocalDataStoreImpl$isFirstTimeUser$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                titoLocalDataStoreImpl$isFirstTimeUser$1.label = i - Integer.MIN_VALUE;
            } else {
                titoLocalDataStoreImpl$isFirstTimeUser$1 = new TitoLocalDataStoreImpl$isFirstTimeUser$1(this, continuationImpl);
            }
        } else {
            titoLocalDataStoreImpl$isFirstTimeUser$1 = new TitoLocalDataStoreImpl$isFirstTimeUser$1(this, continuationImpl);
        }
        Object objV = titoLocalDataStoreImpl$isFirstTimeUser$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = titoLocalDataStoreImpl$isFirstTimeUser$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 localDataStore$getFlowFromLocalDataStore$$inlined$map$1E = this.f9637a.e(PreferencesKeys.booleanKey(str + "_titoFirstTimeUser"));
            titoLocalDataStoreImpl$isFirstTimeUser$1.label = 1;
            objV = FlowKt.v(localDataStore$getFlowFromLocalDataStore$$inlined$map$1E, titoLocalDataStoreImpl$isFirstTimeUser$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        Boolean bool = (Boolean) objV;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
    }

    @Override // app.chalo.tito.data.local.TitoLocalDataStore
    public final Object b(String str, Continuation continuation) {
        Object objG = this.f9637a.g(PreferencesKeys.booleanKey(str.concat("_titoFirstTimeUser")), Boolean.FALSE, continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }
}
