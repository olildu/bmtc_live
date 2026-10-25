package app.chalo.usecase;

import app.chalo.utils.timeutil.TimeUtilsContract;
import defpackage.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.datetime.Instant;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.LocalDateTimeKt;
import kotlinx.datetime.TimeZone;
import kotlinx.datetime.TimeZoneKt;
import kotlinx.datetime.format.DateTimeFormat;
import kotlinx.datetime.format.DateTimeFormatBuilderKt;
import kotlinx.datetime.format.DayOfWeekNames;
import kotlinx.datetime.format.LocalDateFormatKt;
import kotlinx.datetime.format.LocalDateTimeFormat;
import kotlinx.datetime.format.LocalTimeFormatKt;
import kotlinx.datetime.format.MonthNames;
import kotlinx.datetime.format.Padding;
import kotlinx.datetime.internal.format.AppendableFormatStructure;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/FormatTimeInMillisToGivenFormatUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FormatTimeInMillisToGivenFormatUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeUtilsContract f10175a;

    public FormatTimeInMillisToGivenFormatUseCase(TimeUtilsContract timeUtilsContract) {
        this.f10175a = timeUtilsContract;
    }

    public static String a(FormatTimeInMillisToGivenFormatUseCase formatTimeInMillisToGivenFormatUseCase, long j, ChaloCustomDateFormat format, int i) throws Exception {
        LocalDateTimeFormat localDateTimeFormat;
        String strB = (i & 8) != 0 ? formatTimeInMillisToGivenFormatUseCase.f10175a.b() : "Asia/Kolkata";
        formatTimeInMillisToGivenFormatUseCase.getClass();
        Intrinsics.i(format, "format");
        TimeZone.INSTANCE.getClass();
        TimeZone timeZoneA = TimeZone.Companion.a(strB);
        Instant.INSTANCE.getClass();
        LocalDateTime localDateTimeC = TimeZoneKt.c(Instant.Companion.a(j), timeZoneA);
        switch (FormatTimeInMillisToGivenFormatUseCaseKt.WhenMappings.f10176a[format.ordinal()]) {
            case 1:
                LocalDateTime.INSTANCE.getClass();
                LocalDateTimeFormat.Builder builder = new LocalDateTimeFormat.Builder(new AppendableFormatStructure());
                builder.v(DayOfWeekNames.b);
                localDateTimeFormat = new LocalDateTimeFormat(d.c(builder));
                break;
            case 2:
                LocalDateTime.INSTANCE.getClass();
                LocalDateTimeFormat.Builder builder2 = new LocalDateTimeFormat.Builder(new AppendableFormatStructure());
                builder2.v(DayOfWeekNames.c);
                builder2.e(", ");
                builder2.w(Padding.ZERO);
                builder2.e(" ");
                builder2.j(MonthNames.c);
                localDateTimeFormat = new LocalDateTimeFormat(d.c(builder2));
                break;
            case 3:
                LocalDateTime.INSTANCE.getClass();
                LocalDateTimeFormat.Builder builder3 = new LocalDateTimeFormat.Builder(new AppendableFormatStructure());
                builder3.w(Padding.ZERO);
                builder3.e(" ");
                builder3.j(MonthNames.b);
                builder3.e(" ");
                builder3.t(Padding.ZERO);
                localDateTimeFormat = new LocalDateTimeFormat(d.c(builder3));
                break;
            case 4:
                LocalDateTime.INSTANCE.getClass();
                LocalDateTimeFormat.Builder builder4 = new LocalDateTimeFormat.Builder(new AppendableFormatStructure());
                builder4.u(Padding.ZERO);
                builder4.e(":");
                builder4.r(Padding.ZERO);
                builder4.e(" ");
                builder4.b();
                localDateTimeFormat = new LocalDateTimeFormat(d.c(builder4));
                break;
            case 5:
                LocalDateTime.INSTANCE.getClass();
                LocalDateTimeFormat.Builder builder5 = new LocalDateTimeFormat.Builder(new AppendableFormatStructure());
                DateTimeFormat dateTimeFormat = LocalDate.Formats.f17932a;
                builder5.n(LocalDateFormatKt.a());
                DateTimeFormatBuilderKt.b(builder5, ' ');
                builder5.i(LocalTimeFormatKt.a());
                localDateTimeFormat = new LocalDateTimeFormat(d.c(builder5));
                break;
            case 6:
                LocalDateTime.INSTANCE.getClass();
                LocalDateTimeFormat.Builder builder6 = new LocalDateTimeFormat.Builder(new AppendableFormatStructure());
                builder6.w(Padding.ZERO);
                builder6.e(" ");
                builder6.j(MonthNames.c);
                builder6.e(" ");
                builder6.t(Padding.ZERO);
                localDateTimeFormat = new LocalDateTimeFormat(d.c(builder6));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String strB2 = LocalDateTimeKt.b(localDateTimeC, localDateTimeFormat);
        return format == ChaloCustomDateFormat.TIME_IN_AM_PM_FORMAT ? StringsKt.R(StringsKt.R(strB2, "am", "AM"), "pm", "PM") : strB2;
    }
}
