package app.chalo.livetracking.routedetails.data.model.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RouteDetailsIntentModelKt {
    public static final boolean a(RouteDetailsIntentModel routeDetailsIntentModel) {
        String str;
        String str2;
        Intrinsics.i(routeDetailsIntentModel, "<this>");
        return (!routeDetailsIntentModel.g || (str = routeDetailsIntentModel.b) == null || str.length() == 0 || (str2 = routeDetailsIntentModel.c) == null || str2.length() == 0) ? false : true;
    }

    public static final boolean b(RouteDetailsIntentModel routeDetailsIntentModel, long j) {
        TrackingAdditionalFeatures trackingAdditionalFeatures;
        Long l;
        if (routeDetailsIntentModel == null || (l = (trackingAdditionalFeatures = routeDetailsIntentModel.h).d) == null) {
            return false;
        }
        if (l.longValue() <= 0) {
            return false;
        }
        Long l2 = trackingAdditionalFeatures.d;
        return (l2 != null ? l2.longValue() : 0L) > j;
    }
}
