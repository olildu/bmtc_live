package app.chalo.recent.database.entities;

import app.chalo.recent.model.app.RecentsSpecialStatus;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"framework-city-data_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RecentCityItineraryEntitiesKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8934a;

        static {
            int[] iArr = new int[RecentsSpecialEntityStatus.values().length];
            try {
                iArr[RecentsSpecialEntityStatus.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecentsSpecialEntityStatus.FAVOURITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8934a = iArr;
        }
    }

    public static final RecentsSpecialStatus a(RecentsSpecialEntityStatus recentsSpecialEntityStatus) {
        Intrinsics.i(recentsSpecialEntityStatus, "<this>");
        int i = WhenMappings.f8934a[recentsSpecialEntityStatus.ordinal()];
        if (i == 1) {
            return RecentsSpecialStatus.NONE;
        }
        if (i == 2) {
            return RecentsSpecialStatus.FAVOURITE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
