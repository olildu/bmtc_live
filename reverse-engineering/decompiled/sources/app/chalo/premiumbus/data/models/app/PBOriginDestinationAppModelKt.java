package app.chalo.premiumbus.data.models.app;

import androidx.media3.exoplayer.RendererCapabilities;
import app.chalo.premiumbus.ui.stopselection.FromAndToStopCardData;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PBOriginDestinationAppModelKt {
    public static final FromAndToStopCardData a(PBOriginDestinationAppModel pBOriginDestinationAppModel, TimeUtilsContract timeUtilsContract) {
        Long lValueOf;
        Long lValueOf2;
        Intrinsics.i(pBOriginDestinationAppModel, "<this>");
        Long l = pBOriginDestinationAppModel.j;
        Intrinsics.i(timeUtilsContract, "timeUtilsContract");
        String str = pBOriginDestinationAppModel.d;
        String str2 = pBOriginDestinationAppModel.i;
        Long l2 = pBOriginDestinationAppModel.e;
        if (l2 != null) {
            long jCeil = (long) Math.ceil(l2.longValue() / ((double) 60));
            lValueOf = Long.valueOf(jCeil == 0 ? 60L : jCeil * ((long) 60));
        } else {
            lValueOf = null;
        }
        String strW = l2 != null ? timeUtilsContract.w(l2.longValue() * ((long) 1000)) : null;
        PBModeToReachStopType pBModeToReachStopType = pBOriginDestinationAppModel.g;
        if (l != null) {
            long jCeil2 = (long) Math.ceil(l.longValue() / ((double) 60));
            lValueOf2 = Long.valueOf(jCeil2 == 0 ? 60L : jCeil2 * ((long) 60));
        } else {
            lValueOf2 = null;
        }
        return new FromAndToStopCardData(pBOriginDestinationAppModel.b, str, str2, lValueOf, strW, pBModeToReachStopType, lValueOf2, l != null ? timeUtilsContract.w(l.longValue() * ((long) 1000)) : null, pBOriginDestinationAppModel.l, RendererCapabilities.AUDIO_OFFLOAD_SUPPORT_MASK);
    }
}
