package app.chalo.features.freshchat;

import app.chalo.datastore.LocalDataStore;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.usecase.GetDistinctIdUseCase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/freshchat/FreshchatUserDataHandler;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FreshchatUserDataHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetDistinctIdUseCase f2718a;
    public final LocalDataStore b;
    public final CoroutineContextProvider c;

    public FreshchatUserDataHandler(GetDistinctIdUseCase getDistinctIdUseCase, LocalDataStore localDataStore, CoroutineContextProvider coroutineContextProvider) {
        this.f2718a = getDistinctIdUseCase;
        this.b = localDataStore;
        this.c = coroutineContextProvider;
    }

    public final Object a(String str, ContinuationImpl continuationImpl) {
        Object objG;
        String strA = this.f2718a.a(false);
        String strConcat = strA != null ? strA.concat("_freshchatRestoreId") : null;
        return (strConcat != null && (objG = BuildersKt.g(this.c.b(), new FreshchatUserDataHandler$storeRestoreIdWithUserId$2(this, strConcat, str, null), continuationImpl)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objG : Unit.f17538a;
    }
}
