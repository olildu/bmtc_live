package defpackage;

import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerFormatter;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DateRangePickerKt;
import androidx.compose.material3.SelectableDates;
import androidx.compose.material3.SelectedRangeInfo;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.Composer;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cw implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15409a = 0;
    public final /* synthetic */ Long b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ DatePickerFormatter f;
    public final /* synthetic */ SelectableDates g;
    public final /* synthetic */ DatePickerColors h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ cw(CalendarMonth calendarMonth, Function1 function1, long j, Long l, Long l2, SelectedRangeInfo selectedRangeInfo, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Locale locale, int i) {
        this.j = calendarMonth;
        this.e = function1;
        this.d = j;
        this.b = l;
        this.c = l2;
        this.k = selectedRangeInfo;
        this.f = datePickerFormatter;
        this.g = selectableDates;
        this.h = datePickerColors;
        this.l = locale;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15409a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return DatePickerKt.Month$lambda$59((CalendarMonth) this.j, this.e, this.d, this.b, this.c, (SelectedRangeInfo) this.k, this.f, this.g, this.h, (Locale) this.l, this.i, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return DateRangePickerKt.DateRangePickerContent$lambda$12(this.b, this.c, this.d, (Function2) this.j, this.e, (CalendarModel) this.k, (IntRange) this.l, this.f, this.g, this.h, this.i, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ cw(Long l, Long l2, long j, Function2 function2, Function1 function1, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i) {
        this.b = l;
        this.c = l2;
        this.d = j;
        this.j = function2;
        this.e = function1;
        this.k = calendarModel;
        this.l = intRange;
        this.f = datePickerFormatter;
        this.g = selectableDates;
        this.h = datePickerColors;
        this.i = i;
    }
}
