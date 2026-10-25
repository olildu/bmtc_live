package app.chalo.ads;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NativeInlineAdSlotKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f818a;

        static {
            int[] iArr = new int[NativeInlineAdSlot.values().length];
            try {
                iArr[NativeInlineAdSlot.ROUTE_DETAILS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NativeInlineAdSlot.CHECKOUT_PAYMENT_METHODS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f818a = iArr;
        }
    }

    public static final String a(NativeInlineAdSlot nativeInlineAdSlot) {
        Intrinsics.i(nativeInlineAdSlot, "<this>");
        int i = WhenMappings.f818a[nativeInlineAdSlot.ordinal()];
        if (i == 1) {
            return "route details";
        }
        if (i == 2) {
            return "checkout payment methods";
        }
        throw new NoWhenBranchMatchedException();
    }
}
