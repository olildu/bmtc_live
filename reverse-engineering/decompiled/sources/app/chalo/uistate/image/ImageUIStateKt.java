package app.chalo.uistate.image;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ImageUIStateKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10036a;

        static {
            int[] iArr = new int[UIContentScale.values().length];
            try {
                iArr[UIContentScale.Crop.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UIContentScale.Fit.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UIContentScale.FillHeight.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UIContentScale.FillWidth.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UIContentScale.Inside.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UIContentScale.FillBounds.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f10036a = iArr;
        }
    }

    public static final Modifier a(Modifier.Companion companion, UISize size) {
        Intrinsics.i(companion, "<this>");
        Intrinsics.i(size, "size");
        return SizeKt.m830sizeVpY3zN4(companion, size.b, size.f10038a);
    }

    public static final Modifier b(Modifier modifier, ImageUISize size) {
        Intrinsics.i(modifier, "<this>");
        Intrinsics.i(size, "size");
        Dp dp = size.f10034a;
        Dp dp2 = size.b;
        if (dp2 != null && dp != null) {
            return SizeKt.m830sizeVpY3zN4(modifier, dp2.m7292unboximpl(), dp.m7292unboximpl());
        }
        if (dp2 != null) {
            return SizeKt.m825requiredWidth3ABfNKs(modifier, dp2.m7292unboximpl());
        }
        return dp != null ? SizeKt.m817requiredHeight3ABfNKs(modifier, dp.m7292unboximpl()) : modifier;
    }

    public static final ContentScale c(UIContentScale uIContentScale) {
        Intrinsics.i(uIContentScale, "<this>");
        switch (WhenMappings.f10036a[uIContentScale.ordinal()]) {
            case 1:
                return ContentScale.INSTANCE.getCrop();
            case 2:
                return ContentScale.INSTANCE.getFit();
            case 3:
                return ContentScale.INSTANCE.getFillHeight();
            case 4:
                return ContentScale.INSTANCE.getFillWidth();
            case 5:
                return ContentScale.INSTANCE.getInside();
            case 6:
                return ContentScale.INSTANCE.getFillBounds();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
