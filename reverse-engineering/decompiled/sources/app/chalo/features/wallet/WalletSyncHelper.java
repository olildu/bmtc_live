package app.chalo.features.wallet;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/wallet/WalletSyncHelper;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface WalletSyncHelper {
    Object a(ContinuationImpl continuationImpl);

    Object b(ContinuationImpl continuationImpl);

    Object c(boolean z, WalletSyncRequest.SemiClosed semiClosed, ContinuationImpl continuationImpl);

    Object d(ContinuationImpl continuationImpl);
}
