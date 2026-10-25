package app.chalo.ads;

import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AdRequestExtensionsKt {
    public static final void a(AdManagerAdRequest.Builder builder, Map targeting) {
        Intrinsics.i(targeting, "targeting");
        for (Map.Entry entry : targeting.entrySet()) {
            builder.addCustomTargeting((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
