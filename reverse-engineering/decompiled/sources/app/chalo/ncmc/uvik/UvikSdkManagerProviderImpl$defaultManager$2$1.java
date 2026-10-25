package app.chalo.ncmc.uvik;

import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"app/chalo/ncmc/uvik/UvikSdkManagerProviderImpl$defaultManager$2$1", "Lapp/chalo/ncmc/uvik/UvikSdkManager;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UvikSdkManagerProviderImpl$defaultManager$2$1 implements UvikSdkManager {
    @Override // app.chalo.ncmc.uvik.UvikSdkManager
    public final Flow a(UvikIntentData uvikIntentData) {
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(new UvikResult.Failure.ResultUnavailable(""));
    }

    @Override // app.chalo.ncmc.uvik.UvikSdkManager
    public final boolean b() {
        return false;
    }
}
