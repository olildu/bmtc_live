package app.chalo.productbooking.common.ui;

import app.chalo.instantticket.data.model.app.response.FareBreakupOperationType;
import app.chalo.uistate.base.ChaloColorToken;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FareBreakupOperationUIPropertiesKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8268a;

        static {
            int[] iArr = new int[FareBreakupOperationType.values().length];
            try {
                iArr[FareBreakupOperationType.SUBTRACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FareBreakupOperationType.ADDITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FareBreakupOperationType.NO_OP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8268a = iArr;
        }
    }

    public static final FareBreakupOperationUIProperties a(FareBreakupOperationType fareBreakupOperationType, ChaloColorToken nonSubtractionColor, boolean z) {
        Intrinsics.i(fareBreakupOperationType, "<this>");
        Intrinsics.i(nonSubtractionColor, "nonSubtractionColor");
        int i = WhenMappings.f8268a[fareBreakupOperationType.ordinal()];
        if (i == 1) {
            return new FareBreakupOperationUIProperties(ChaloColorToken.AmountAddedText.f9758a, z ? "- " : "-");
        }
        if (i == 2 || i == 3) {
            return new FareBreakupOperationUIProperties(nonSubtractionColor, "");
        }
        throw new NoWhenBranchMatchedException();
    }
}
