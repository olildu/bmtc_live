package app.chalo.providers.toast;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class KotlinToastManagerKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8871a;

        static {
            int[] iArr = new int[ToastLength.values().length];
            try {
                iArr[ToastLength.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToastLength.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8871a = iArr;
        }
    }

    public static final void a(KotlinToastManager kotlinToastManager, String message, ToastLength length) {
        Intrinsics.i(kotlinToastManager, "<this>");
        Intrinsics.i(message, "message");
        Intrinsics.i(length, "length");
        kotlinToastManager.a(new KotlinToastData(message, length));
    }
}
