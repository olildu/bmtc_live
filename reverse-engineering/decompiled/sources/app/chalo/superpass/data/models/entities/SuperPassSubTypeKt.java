package app.chalo.superpass.data.models.entities;

import app.chalo.models.SuperPassSubTypes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SuperPassSubTypeKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9572a;

        static {
            int[] iArr = new int[SuperPassSubType.values().length];
            try {
                iArr[SuperPassSubType.MAGIC_SUPER_PASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuperPassSubType.RIDE_BASED_SUPER_PASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9572a = iArr;
        }
    }

    public static final SuperPassSubTypes a(SuperPassSubType superPassSubType) {
        Intrinsics.i(superPassSubType, "<this>");
        int i = WhenMappings.f9572a[superPassSubType.ordinal()];
        if (i == 1) {
            return SuperPassSubTypes.MAGIC_SUPER_PASS;
        }
        if (i == 2) {
            return SuperPassSubTypes.RIDE_BASED_SUPER_PASS;
        }
        throw new NoWhenBranchMatchedException();
    }
}
