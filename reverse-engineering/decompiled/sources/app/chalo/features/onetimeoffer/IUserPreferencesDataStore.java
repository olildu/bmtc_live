package app.chalo.features.onetimeoffer;

import app.chalo.extensions.DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/onetimeoffer/IUserPreferencesDataStore;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IUserPreferencesDataStore {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    Flow a(String str);

    DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1 b();

    Object c(String str, ContinuationImpl continuationImpl);

    DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1 d();

    Object e(String str, Continuation continuation);

    Object f(String str, ContinuationImpl continuationImpl);
}
