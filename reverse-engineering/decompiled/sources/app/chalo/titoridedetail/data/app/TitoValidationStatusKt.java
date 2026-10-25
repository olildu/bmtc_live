package app.chalo.titoridedetail.data.app;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TitoValidationStatusKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9682a;

        static {
            int[] iArr = new int[TitoValidationStatus.values().length];
            try {
                iArr[TitoValidationStatus.TAP_IN_DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TitoValidationStatus.VERIFIED_TAP_OUT_DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TitoValidationStatus.MISSED_TAP_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9682a = iArr;
        }
    }

    public static final boolean a(TitoValidationStatus titoValidationStatus) {
        Intrinsics.i(titoValidationStatus, "<this>");
        int i = WhenMappings.f9682a[titoValidationStatus.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2 || i == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
