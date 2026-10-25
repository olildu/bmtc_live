package app.chalo.location;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/location/DataStoreLastKnownLocationStorage;", "Lapp/chalo/location/LastKnownLocationStorage;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataStoreLastKnownLocationStorage implements LastKnownLocationStorage {
    public static final Preferences.Key c = PreferencesKeys.longKey("ts");
    public static final Preferences.Key d = PreferencesKeys.doubleKey("lat");
    public static final Preferences.Key e = PreferencesKeys.doubleKey("lon");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataStore f5132a;
    public final CoroutineContext b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/DataStoreLastKnownLocationStorage$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public DataStoreLastKnownLocationStorage(DataStore dataStore, CoroutineContext ioContext) {
        Intrinsics.i(ioContext, "ioContext");
        this.f5132a = dataStore;
        this.b = ioContext;
    }

    @Override // app.chalo.location.LastKnownLocationStorage
    public final Object a(Continuation continuation) throws Throwable {
        Object objG = BuildersKt.g(this.b, new DataStoreLastKnownLocationStorage$clear$2(this, null), continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    @Override // app.chalo.location.LastKnownLocationStorage
    public final Object b(StoredLocation storedLocation, Continuation continuation) throws Throwable {
        Object objG = BuildersKt.g(this.b, new DataStoreLastKnownLocationStorage$write$2(this, storedLocation, null), continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    @Override // app.chalo.location.LastKnownLocationStorage
    public final Object c(SuspendLambda suspendLambda) {
        return BuildersKt.g(this.b, new DataStoreLastKnownLocationStorage$read$2(this, null), suspendLambda);
    }
}
