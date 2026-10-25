package app.chalo.uistate.dialog;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.DayOfWeek;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MultiSelectDatePickerUIStateKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10010a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[DateAvailabilityStatus.values().length];
            try {
                iArr[DateAvailabilityStatus.FEW_SEATS_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DateAvailabilityStatus.NEARBY_SLOTS_AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DateAvailabilityStatus.SOLD_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DateAvailabilityStatus.AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DateAvailabilityStatus.NOT_AVAILABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DateAvailabilityStatus.NO_SLOTS_AVAILABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DateAvailabilityStatus.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f10010a = iArr;
            int[] iArr2 = new int[DayOfWeek.values().length];
            try {
                iArr2[DayOfWeek.SUNDAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[DayOfWeek.MONDAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[DayOfWeek.TUESDAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[DayOfWeek.WEDNESDAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[DayOfWeek.THURSDAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[DayOfWeek.FRIDAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[DayOfWeek.SATURDAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            b = iArr2;
        }
    }

    public static final int a(MultiSelectionCalendarDataState multiSelectionCalendarDataState) {
        List list = multiSelectionCalendarDataState.f10011a;
        int i = 0;
        if ((list instanceof Collection) && list.isEmpty()) {
            return 0;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((DateDataState) it.next()).b && (i = i + 1) < 0) {
                CollectionsKt.y0();
                throw null;
            }
        }
        return i;
    }

    public static final int b(DayOfWeek dayOfWeek) {
        Intrinsics.i(dayOfWeek, "<this>");
        switch (WhenMappings.b[dayOfWeek.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
