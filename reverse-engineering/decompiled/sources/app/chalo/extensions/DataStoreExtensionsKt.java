package app.chalo.extensions;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DataStoreExtensionsKt {
    public static final DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1 a(DataStore dataStore, Preferences.Key key, Object obj) {
        Intrinsics.i(dataStore, "<this>");
        Intrinsics.i(key, "key");
        return new DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(dataStore.getData(), new DataStoreExtensionsKt$getValueAsFlow$1(3, null)), key, obj);
    }

    public static final Object b(DataStore dataStore, Preferences.Key key, Object obj, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(dataStore, new DataStoreExtensionsKt$setValue$2(key, obj, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }
}
