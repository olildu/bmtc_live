package app.chalo.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/utils/KBigDecimal;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KBigDecimal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f10430a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10431a;

        static {
            int[] iArr = new int[ChaloRoundingMode.values().length];
            try {
                iArr[ChaloRoundingMode.HALF_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChaloRoundingMode.HALF_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChaloRoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChaloRoundingMode.FLOOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChaloRoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ChaloRoundingMode.DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ChaloRoundingMode.UNNECESSARY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f10431a = iArr;
        }
    }

    public KBigDecimal(String value) {
        Intrinsics.i(value, "value");
        this.f10430a = new BigDecimal(value);
    }

    public static RoundingMode a(ChaloRoundingMode chaloRoundingMode) {
        switch (WhenMappings.f10431a[chaloRoundingMode.ordinal()]) {
            case 1:
                return RoundingMode.HALF_UP;
            case 2:
                return RoundingMode.HALF_DOWN;
            case 3:
                return RoundingMode.CEILING;
            case 4:
                return RoundingMode.FLOOR;
            case 5:
                return RoundingMode.UP;
            case 6:
                return RoundingMode.DOWN;
            case 7:
                return RoundingMode.UNNECESSARY;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static KBigDecimal b(KBigDecimal kBigDecimal, KBigDecimal kBigDecimal2, ChaloRoundingMode roundingMode) {
        Intrinsics.i(roundingMode, "roundingMode");
        String string = kBigDecimal.f10430a.divide(new BigDecimal(kBigDecimal2.toString()), a(roundingMode)).toString();
        Intrinsics.h(string, "toString(...)");
        return new KBigDecimal(string);
    }

    public final KBigDecimal c(int i, ChaloRoundingMode roundingMode) {
        Intrinsics.i(roundingMode, "roundingMode");
        String string = this.f10430a.setScale(i, a(roundingMode)).toString();
        Intrinsics.h(string, "toString(...)");
        return new KBigDecimal(string);
    }

    public final String toString() {
        String string = this.f10430a.toString();
        Intrinsics.h(string, "toString(...)");
        return string;
    }
}
