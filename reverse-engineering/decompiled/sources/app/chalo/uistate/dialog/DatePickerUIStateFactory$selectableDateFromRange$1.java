package app.chalo.uistate.dialog;

import defpackage.yv;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.datetime.Instant;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.TimeZone;
import kotlinx.datetime.TimeZoneKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"app/chalo/uistate/dialog/DatePickerUIStateFactory$selectableDateFromRange$1", "Lapp/chalo/uistate/dialog/DatePickerSelectableDates;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DatePickerUIStateFactory$selectableDateFromRange$1 implements DatePickerSelectableDates {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f9981a = LazyKt.b(new yv(2));
    public final Lazy b;
    public final Lazy c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public DatePickerUIStateFactory$selectableDateFromRange$1(final long j, final long j2) {
        this.d = j;
        this.e = j2;
        final int i = 0;
        this.b = LazyKt.b(new Function0() { // from class: ew
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        Instant.INSTANCE.getClass();
                        break;
                    default:
                        Instant.INSTANCE.getClass();
                        break;
                }
                return TimeZoneKt.c(Instant.Companion.a(j), (TimeZone) this.f9981a.getValue());
            }
        });
        final int i2 = 1;
        this.c = LazyKt.b(new Function0() { // from class: ew
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        Instant.INSTANCE.getClass();
                        break;
                    default:
                        Instant.INSTANCE.getClass();
                        break;
                }
                return TimeZoneKt.c(Instant.Companion.a(j2), (TimeZone) this.f9981a.getValue());
            }
        });
    }

    @Override // app.chalo.uistate.dialog.DatePickerSelectableDates
    public final boolean isSelectableDate(long j) {
        return this.d <= j && j <= this.e;
    }

    @Override // app.chalo.uistate.dialog.DatePickerSelectableDates
    public final boolean isSelectableYear(int i) {
        return i <= ((LocalDateTime) this.c.getValue()).o() && ((LocalDateTime) this.b.getValue()).o() <= i;
    }
}
