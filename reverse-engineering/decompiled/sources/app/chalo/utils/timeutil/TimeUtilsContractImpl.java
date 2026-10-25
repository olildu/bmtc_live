package app.chalo.utils.timeutil;

import androidx.compose.material3.internal.CalendarModelKt;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.SystemHelper;
import com.freshchat.consumer.sdk.beans.config.DefaultRefreshIntervals;
import defpackage.cb0;
import defpackage.d;
import defpackage.t10;
import defpackage.wi1;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.datetime.Clock;
import kotlinx.datetime.DateTimeUnit;
import kotlinx.datetime.DayOfWeekKt;
import kotlinx.datetime.Instant;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.LocalDateJvmKt;
import kotlinx.datetime.LocalDateKt;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.LocalDateTimeKt;
import kotlinx.datetime.LocalTime;
import kotlinx.datetime.TimeZone;
import kotlinx.datetime.TimeZoneKt;
import kotlinx.datetime.format.DateTimeFormatBuilderKt;
import kotlinx.datetime.format.DayOfWeekNames;
import kotlinx.datetime.format.LocalDateFormat;
import kotlinx.datetime.format.LocalDateTimeFormat;
import kotlinx.datetime.format.LocalTimeFormat;
import kotlinx.datetime.format.MonthNames;
import kotlinx.datetime.format.Padding;
import kotlinx.datetime.internal.format.AppendableFormatStructure;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/utils/timeutil/TimeUtilsContractImpl;", "Lapp/chalo/utils/timeutil/TimeUtilsContract;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TimeUtilsContractImpl implements TimeUtilsContract {
    public final CityProvider b;
    public final SystemHelper c;
    public final StringProvider d;

    public TimeUtilsContractImpl(CityProvider cityProvider, SystemHelper systemHelper, StringProvider stringProvider) {
        this.b = cityProvider;
        this.c = systemHelper;
        this.d = stringProvider;
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final long A() {
        Instant instantA = Clock.System.f17926a.a();
        TimeZone.Companion companion = TimeZone.INSTANCE;
        String strB = b();
        companion.getClass();
        LocalDateTime localDateTimeC = TimeZoneKt.c(instantA, TimeZone.Companion.a(strB));
        LocalDate localDateA = localDateTimeC.a();
        LocalDateTime localDateTime = new LocalDateTime(localDateA.j(), localDateA.h(), 1);
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Intrinsics.h(zoneIdSystemDefault, "systemDefault(...)");
        return Duration.j(TimeZoneKt.a(localDateTimeC, TimeZone.Companion.a(b())).c(TimeZoneKt.a(localDateTime, TimeZone.Companion.b(zoneIdSystemDefault))), DurationUnit.SECONDS);
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final int B(String str) {
        Instant instantA = Clock.System.f17926a.a();
        if (str == null) {
            str = b();
        }
        TimeZone.INSTANCE.getClass();
        LocalTime localTimeM = TimeZoneKt.c(instantA, TimeZone.Companion.a(str)).m();
        return localTimeM.e() + ((localTimeM.b() + (localTimeM.a() * 60)) * 60);
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final int C(int i) {
        return (RangesKt.e(i, 0, 59) / 10) * 10;
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final String D(long j) {
        Instant.INSTANCE.getClass();
        Instant instantA = Instant.Companion.a(j);
        TimeZone.Companion companion = TimeZone.INSTANCE;
        String strB = b();
        companion.getClass();
        LocalDateTime localDateTimeC = TimeZoneKt.c(instantA, TimeZone.Companion.a(strB));
        LocalDateTime.INSTANCE.getClass();
        LocalDateTimeFormat.Builder builder = new LocalDateTimeFormat.Builder(new AppendableFormatStructure());
        builder.v(DayOfWeekNames.b);
        builder.e(", ");
        builder.w(Padding.ZERO);
        DateTimeFormatBuilderKt.b(builder, ' ');
        builder.j(MonthNames.c);
        return LocalDateTimeKt.b(localDateTimeC, new LocalDateTimeFormat(d.c(builder)));
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final int E() {
        Instant instantA = Clock.System.f17926a.a();
        TimeZone.Companion companion = TimeZone.INSTANCE;
        String strB = b();
        companion.getClass();
        return TimeZoneKt.c(instantA, TimeZone.Companion.a(strB)).o();
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final Pair F(long j) {
        return new Pair(Integer.valueOf((int) (j / DefaultRefreshIntervals.REMOTE_CONFIG_FETCH_INTERVAL)), Integer.valueOf((int) ((j % DefaultRefreshIntervals.REMOTE_CONFIG_FETCH_INTERVAL) / 60000)));
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final String G(String expiryString) {
        Intrinsics.i(expiryString, "expiryString");
        return StringsKt.R(expiryString, ",", " on");
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final int H(long j) {
        Instant.INSTANCE.getClass();
        Instant instantA = Instant.Companion.a(j);
        TimeZone.Companion companion = TimeZone.INSTANCE;
        String strB = b();
        companion.getClass();
        return TimeZoneKt.c(instantA, TimeZone.Companion.a(strB)).m().b();
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final int I(String str) {
        long jB = Clock.System.f17926a.a().b();
        Instant.INSTANCE.getClass();
        Instant instantA = Instant.Companion.a(jB);
        TimeZone.INSTANCE.getClass();
        return DayOfWeekKt.a(TimeZoneKt.c(instantA, TimeZone.Companion.a(str)).a().e());
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final long J(int i, String timeZoneId) {
        Intrinsics.i(timeZoneId, "timeZoneId");
        Instant.Companion companion = Instant.INSTANCE;
        long j = (((long) i) * CalendarModelKt.MillisecondsIn24Hours) + this.c.j();
        companion.getClass();
        Instant instantA = Instant.Companion.a(j);
        TimeZone.INSTANCE.getClass();
        return TimeZoneKt.a(LocalDateKt.a(TimeZoneKt.c(instantA, TimeZone.Companion.a(timeZoneId)).a(), 0, 0, 0, 8), TimeZone.Companion.a(timeZoneId)).f();
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final long K(long j, String timeZoneId) throws Exception {
        Intrinsics.i(timeZoneId, "timeZoneId");
        Instant.INSTANCE.getClass();
        Instant instantA = Instant.Companion.a(j);
        TimeZone.INSTANCE.getClass();
        TimeZone timeZoneA = TimeZone.Companion.a(timeZoneId);
        return j - TimeZoneKt.a(LocalDateKt.a(TimeZoneKt.c(instantA, timeZoneA).a(), 0, 0, 0, 8), timeZoneA).f();
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final String L(long j) {
        long j2;
        if (j <= 0) {
            j2 = 0;
        } else {
            j2 = j < 1000 ? 1L : j / 1000;
        }
        long j3 = 3600;
        long j4 = j2 / j3;
        long j5 = 60;
        long j6 = (j2 % j3) / j5;
        String strK = StringsKt.K(2, String.valueOf(j2 % j5));
        String strK2 = StringsKt.K(2, String.valueOf(j6));
        if (j4 <= 0) {
            return j6 + ":" + strK;
        }
        return j4 + ":" + strK2 + ":" + strK;
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final String M(long j) {
        long j2 = 60;
        int i = (int) (j / j2);
        boolean z = j % j2 > 0;
        if (i == 0 && z) {
            return "1 min";
        }
        if (1 <= i && i < 60 && z) {
            return cb0.h(i + 1, " min");
        }
        if (1 <= i && i < 60) {
            return cb0.h(i, " min");
        }
        int i2 = i / 60;
        int i3 = i % 60;
        if (z) {
            i3++;
        }
        if (i3 == 0) {
            return cb0.h(i2, " hr");
        }
        return i2 + " hr " + i3 + " min";
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final int N(long j) {
        Instant.INSTANCE.getClass();
        Instant instantA = Instant.Companion.a(j);
        TimeZone.Companion companion = TimeZone.INSTANCE;
        String strB = b();
        companion.getClass();
        return TimeZoneKt.c(instantA, TimeZone.Companion.a(strB)).m().a();
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final String O(long j) {
        return j < 60 ? "1 min" : w(j * ((long) 1000));
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final String P(long j) {
        Instant.INSTANCE.getClass();
        Instant instantA = Instant.Companion.a(j);
        TimeZone.Companion companion = TimeZone.INSTANCE;
        String strB = b();
        companion.getClass();
        LocalDateTime localDateTimeC = TimeZoneKt.c(instantA, TimeZone.Companion.a(strB));
        LocalDateTime.Companion companion2 = LocalDateTime.INSTANCE;
        wi1 wi1Var = new wi1(12);
        companion2.getClass();
        return LocalDateTimeKt.b(localDateTimeC, LocalDateTime.Companion.a(wi1Var));
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final String Q(long j) {
        Instant.INSTANCE.getClass();
        Instant instantA = Instant.Companion.a(j);
        TimeZone.Companion companion = TimeZone.INSTANCE;
        String strB = b();
        companion.getClass();
        LocalDate localDateA = TimeZoneKt.c(instantA, TimeZone.Companion.a(strB)).a();
        LocalDate.INSTANCE.getClass();
        LocalDateFormat.Builder builder = new LocalDateFormat.Builder(new AppendableFormatStructure());
        builder.w(Padding.ZERO);
        builder.e("/");
        builder.a(Padding.ZERO);
        builder.e("/");
        builder.t(Padding.ZERO);
        return new LocalDateFormat(d.c(builder)).a(localDateA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r14 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        if (r14 == r1) goto L40;
     */
    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r12, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.utils.timeutil.TimeUtilsContractImpl.a(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final String b() {
        String str;
        CityAppModel cityAppModel = (CityAppModel) this.b.getE().getValue();
        return (cityAppModel == null || (str = cityAppModel.l) == null) ? "Asia/Kolkata" : str;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x012e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x012f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0133  */
    /* JADX WARN: Code duplicated, block: B:64:0x0145  */
    /* JADX WARN: Code duplicated, block: B:66:0x0149  */
    /* JADX WARN: Code duplicated, block: B:69:0x015b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0185 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x0186 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final Object c(long j, ContinuationImpl continuationImpl) {
        TimeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1 timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        String str;
        String str2;
        String str3;
        long j9;
        String str4;
        Object objB;
        if (continuationImpl instanceof TimeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1) {
            timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1 = (TimeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1) continuationImpl;
            int i = timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label = i - Integer.MIN_VALUE;
            } else {
                timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1 = new TimeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1(this, continuationImpl);
            }
        } else {
            timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1 = new TimeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1(this, continuationImpl);
        }
        Object objB2 = timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label;
        StringProvider stringProvider = this.d;
        switch (i2) {
            case 0:
                j2 = 1;
                ResultKt.b(objB2);
                long j10 = j / 60000;
                if (j10 <= 0) {
                    timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label = 1;
                    Object objB3 = stringProvider.b(StringEnum.LESS_THAN_A_MINUTE, new Object[0], timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1);
                    if (objB3 != coroutineSingletons) {
                        return objB3;
                    }
                } else {
                    j3 = 0;
                    long j11 = j10 / 60;
                    j4 = j10 % 60;
                    if (j11 == 0) {
                        if (j4 == 1) {
                            timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.J$0 = j4;
                            timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label = 2;
                            objB2 = stringProvider.b(StringEnum.MINUTE, new Object[0], timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1);
                            if (objB2 != coroutineSingletons) {
                                j8 = j4;
                                str = (String) objB2;
                                return j8 + " " + str;
                            }
                        } else {
                            timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.J$0 = j4;
                            timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label = 3;
                            objB2 = stringProvider.b(StringEnum.MINUTES, new Object[0], timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1);
                            if (objB2 != coroutineSingletons) {
                                j8 = j4;
                                str = (String) objB2;
                                return j8 + " " + str;
                            }
                        }
                    } else if (j11 == 1) {
                        timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.J$0 = j4;
                        timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.J$1 = j11;
                        timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label = 4;
                        objB2 = stringProvider.b(StringEnum.HOUR, new Object[0], timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1);
                        if (objB2 != coroutineSingletons) {
                            j6 = j4;
                            j7 = j11;
                            str2 = (String) objB2;
                            str3 = j7 + " " + str2;
                            if (j6 == j3) {
                                return str3;
                            }
                            if (j6 == j2) {
                                timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.L$0 = str3;
                                timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.J$0 = j6;
                                timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label = 6;
                                objB2 = stringProvider.b(StringEnum.MINUTE, new Object[0], timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1);
                                if (objB2 != coroutineSingletons) {
                                    j9 = j6;
                                    str4 = (String) objB2;
                                    timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.L$0 = null;
                                    timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label = 8;
                                    objB = stringProvider.b(StringEnum.HOURS_AND_MINUTES, new Object[]{str3, j9 + " " + str4}, timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1);
                                    if (objB == coroutineSingletons) {
                                        return objB;
                                    }
                                }
                            } else {
                                timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.L$0 = str3;
                                timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.J$0 = j6;
                                timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label = 7;
                                objB2 = stringProvider.b(StringEnum.MINUTES, new Object[0], timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1);
                                if (objB2 != coroutineSingletons) {
                                    j9 = j6;
                                    str4 = (String) objB2;
                                    timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.L$0 = null;
                                    timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label = 8;
                                    objB = stringProvider.b(StringEnum.HOURS_AND_MINUTES, new Object[]{str3, j9 + " " + str4}, timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1);
                                    if (objB == coroutineSingletons) {
                                        return objB;
                                    }
                                }
                            }
                        }
                    } else {
                        timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.J$0 = j4;
                        timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.J$1 = j11;
                        timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label = 5;
                        objB2 = stringProvider.b(StringEnum.HOURS, new Object[0], timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1);
                        if (objB2 != coroutineSingletons) {
                            j5 = j11;
                            str2 = (String) objB2;
                            long j12 = j5;
                            j6 = j4;
                            j7 = j12;
                            str3 = j7 + " " + str2;
                            if (j6 == j3) {
                                return str3;
                            }
                            if (j6 == j2) {
                                timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.L$0 = str3;
                                timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.J$0 = j6;
                                timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label = 6;
                                objB2 = stringProvider.b(StringEnum.MINUTE, new Object[0], timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1);
                                if (objB2 != coroutineSingletons) {
                                    j9 = j6;
                                    str4 = (String) objB2;
                                    timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.L$0 = null;
                                    timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label = 8;
                                    objB = stringProvider.b(StringEnum.HOURS_AND_MINUTES, new Object[]{str3, j9 + " " + str4}, timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1);
                                    if (objB == coroutineSingletons) {
                                        return objB;
                                    }
                                }
                            } else {
                                timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.L$0 = str3;
                                timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.J$0 = j6;
                                timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label = 7;
                                objB2 = stringProvider.b(StringEnum.MINUTES, new Object[0], timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1);
                                if (objB2 != coroutineSingletons) {
                                    j9 = j6;
                                    str4 = (String) objB2;
                                    timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.L$0 = null;
                                    timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label = 8;
                                    objB = stringProvider.b(StringEnum.HOURS_AND_MINUTES, new Object[]{str3, j9 + " " + str4}, timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1);
                                    if (objB == coroutineSingletons) {
                                        return objB;
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                ResultKt.b(objB2);
                return objB2;
            case 2:
                j8 = timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.J$0;
                ResultKt.b(objB2);
                str = (String) objB2;
                return j8 + " " + str;
            case 3:
                j8 = timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.J$0;
                ResultKt.b(objB2);
                str = (String) objB2;
                return j8 + " " + str;
            case 4:
                j2 = 1;
                j7 = timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.J$1;
                j6 = timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.J$0;
                ResultKt.b(objB2);
                j3 = 0;
                str2 = (String) objB2;
                str3 = j7 + " " + str2;
                if (j6 == j3) {
                    return str3;
                }
                if (j6 == j2) {
                    timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.L$0 = str3;
                    timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.J$0 = j6;
                    timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label = 6;
                    objB2 = stringProvider.b(StringEnum.MINUTE, new Object[0], timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1);
                    if (objB2 != coroutineSingletons) {
                        j9 = j6;
                        str4 = (String) objB2;
                        timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.L$0 = null;
                        timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label = 8;
                        objB = stringProvider.b(StringEnum.HOURS_AND_MINUTES, new Object[]{str3, j9 + " " + str4}, timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1);
                        if (objB == coroutineSingletons) {
                            return objB;
                        }
                    }
                } else {
                    timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.L$0 = str3;
                    timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.J$0 = j6;
                    timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label = 7;
                    objB2 = stringProvider.b(StringEnum.MINUTES, new Object[0], timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1);
                    if (objB2 != coroutineSingletons) {
                        j9 = j6;
                        str4 = (String) objB2;
                        timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.L$0 = null;
                        timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label = 8;
                        objB = stringProvider.b(StringEnum.HOURS_AND_MINUTES, new Object[]{str3, j9 + " " + str4}, timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1);
                        if (objB == coroutineSingletons) {
                            return objB;
                        }
                    }
                }
                return coroutineSingletons;
            case 5:
                j5 = timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.J$1;
                j2 = 1;
                j4 = timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.J$0;
                ResultKt.b(objB2);
                j3 = 0;
                str2 = (String) objB2;
                long j13 = j5;
                j6 = j4;
                j7 = j13;
                str3 = j7 + " " + str2;
                if (j6 == j3) {
                    return str3;
                }
                if (j6 == j2) {
                    timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.L$0 = str3;
                    timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.J$0 = j6;
                    timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label = 6;
                    objB2 = stringProvider.b(StringEnum.MINUTE, new Object[0], timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1);
                    if (objB2 != coroutineSingletons) {
                        j9 = j6;
                        str4 = (String) objB2;
                        timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.L$0 = null;
                        timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label = 8;
                        objB = stringProvider.b(StringEnum.HOURS_AND_MINUTES, new Object[]{str3, j9 + " " + str4}, timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1);
                        if (objB == coroutineSingletons) {
                            return objB;
                        }
                    }
                } else {
                    timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.L$0 = str3;
                    timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.J$0 = j6;
                    timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label = 7;
                    objB2 = stringProvider.b(StringEnum.MINUTES, new Object[0], timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1);
                    if (objB2 != coroutineSingletons) {
                        j9 = j6;
                        str4 = (String) objB2;
                        timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.L$0 = null;
                        timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label = 8;
                        objB = stringProvider.b(StringEnum.HOURS_AND_MINUTES, new Object[]{str3, j9 + " " + str4}, timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1);
                        if (objB == coroutineSingletons) {
                            return objB;
                        }
                    }
                }
                return coroutineSingletons;
            case 6:
                j9 = timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.J$0;
                str3 = (String) timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.L$0;
                ResultKt.b(objB2);
                str4 = (String) objB2;
                timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.L$0 = null;
                timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label = 8;
                objB = stringProvider.b(StringEnum.HOURS_AND_MINUTES, new Object[]{str3, j9 + " " + str4}, timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return objB;
            case 7:
                j9 = timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.J$0;
                str3 = (String) timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.L$0;
                ResultKt.b(objB2);
                str4 = (String) objB2;
                timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.L$0 = null;
                timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1.label = 8;
                objB = stringProvider.b(StringEnum.HOURS_AND_MINUTES, new Object[]{str3, j9 + " " + str4}, timeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return objB;
            case 8:
                ResultKt.b(objB2);
                return objB2;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final String d(long j, String timeZoneId, String str) {
        Intrinsics.i(timeZoneId, "timeZoneId");
        Instant.INSTANCE.getClass();
        Instant instantA = Instant.Companion.a(j);
        TimeZone.Companion companion = TimeZone.INSTANCE;
        String strB = b();
        companion.getClass();
        LocalDateTime localDateTimeC = TimeZoneKt.c(instantA, TimeZone.Companion.a(strB));
        LocalDateTime.Companion companion2 = LocalDateTime.INSTANCE;
        wi1 wi1Var = new wi1(14);
        companion2.getClass();
        String strB2 = LocalDateTimeKt.b(localDateTimeC, LocalDateTime.Companion.a(wi1Var));
        return str != null ? StringsKt.R(strB2, ",", " ".concat(str)) : strB2;
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final String e(long j) {
        Instant.INSTANCE.getClass();
        Instant instantA = Instant.Companion.a(j);
        TimeZone.Companion companion = TimeZone.INSTANCE;
        String strB = b();
        companion.getClass();
        LocalTime localTimeM = TimeZoneKt.c(instantA, TimeZone.Companion.a(strB)).m();
        LocalTime.Companion companion2 = LocalTime.INSTANCE;
        wi1 wi1Var = new wi1(13);
        companion2.getClass();
        return LocalTimeFormat.Companion.a(wi1Var).a(localTimeM);
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final long f(int i, int i2) {
        return (((long) i2) * 60000) + (((long) i) * DefaultRefreshIntervals.REMOTE_CONFIG_FETCH_INTERVAL);
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final String g(long j) {
        Instant.INSTANCE.getClass();
        Instant instantA = Instant.Companion.a(j);
        TimeZone.Companion companion = TimeZone.INSTANCE;
        String strB = b();
        companion.getClass();
        LocalDate localDateA = TimeZoneKt.c(instantA, TimeZone.Companion.a(strB)).a();
        LocalDate.INSTANCE.getClass();
        LocalDateFormat.Builder builder = new LocalDateFormat.Builder(new AppendableFormatStructure());
        builder.w(Padding.ZERO);
        DateTimeFormatBuilderKt.b(builder, ' ');
        builder.j(MonthNames.c);
        DateTimeFormatBuilderKt.b(builder, ' ');
        builder.t(Padding.ZERO);
        return new LocalDateFormat(d.c(builder)).a(localDateA);
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final String h(long j) {
        String str;
        Instant.INSTANCE.getClass();
        Instant instantA = Instant.Companion.a(j);
        TimeZone.Companion companion = TimeZone.INSTANCE;
        String strB = b();
        companion.getClass();
        LocalDateTime localDateTimeC = TimeZoneKt.c(instantA, TimeZone.Companion.a(strB));
        if (localDateTimeC.b() == 1 || localDateTimeC.b() == 21 || localDateTimeC.b() == 31) {
            str = "st";
        } else if (localDateTimeC.b() == 2 || localDateTimeC.b() == 22) {
            str = "nd";
        } else {
            str = (localDateTimeC.b() == 3 || localDateTimeC.b() == 23) ? "rd" : "th";
        }
        LocalDateTime.INSTANCE.getClass();
        LocalDateTimeFormat.Builder builder = new LocalDateTimeFormat.Builder(new AppendableFormatStructure());
        builder.w(Padding.ZERO);
        builder.e(str.concat(" "));
        builder.j(MonthNames.c);
        return LocalDateTimeKt.b(localDateTimeC, new LocalDateTimeFormat(d.c(builder)));
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final String i(long j) {
        Instant.INSTANCE.getClass();
        Instant instantA = Instant.Companion.a(j * 1000);
        TimeZone.Companion companion = TimeZone.INSTANCE;
        String strB = b();
        companion.getClass();
        LocalTime localTimeM = TimeZoneKt.c(instantA, TimeZone.Companion.a(strB)).m();
        LocalTime.Companion companion2 = LocalTime.INSTANCE;
        wi1 wi1Var = new wi1(18);
        companion2.getClass();
        return LocalTimeFormat.Companion.a(wi1Var).a(localTimeM);
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final String j(long j) {
        Instant.INSTANCE.getClass();
        Instant instantA = Instant.Companion.a(j);
        TimeZone.Companion companion = TimeZone.INSTANCE;
        String strB = b();
        companion.getClass();
        LocalDateTime localDateTimeC = TimeZoneKt.c(instantA, TimeZone.Companion.a(strB));
        LocalDateTime.Companion companion2 = LocalDateTime.INSTANCE;
        wi1 wi1Var = new wi1(17);
        companion2.getClass();
        return LocalDateTimeKt.b(localDateTimeC, LocalDateTime.Companion.a(wi1Var));
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final long k(int i, int i2, String amOrPM) {
        Intrinsics.i(amOrPM, "amOrPM");
        if (amOrPM.equalsIgnoreCase("AM") && i == 12) {
            i = 0;
        } else if (!amOrPM.equalsIgnoreCase("AM")) {
            i = i == 12 ? 12 : i + 12;
        }
        return ((long) t10.a(i, 60, i2, 60)) * 1000;
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final String l(long j) throws Exception {
        Instant instantA = Clock.System.f17926a.a();
        TimeZone.Companion companion = TimeZone.INSTANCE;
        String strB = b();
        companion.getClass();
        TimeZone timeZoneA = TimeZone.Companion.a(strB);
        LocalDate localDateA = TimeZoneKt.c(instantA, timeZoneA).a();
        LocalTime localTimeM = TimeZoneKt.b(TimeZoneKt.a(LocalDateTimeKt.a(localDateA.j(), localDateA.h(), localDateA.c(), 0, 0, 0, 96), timeZoneA).e(DurationKt.h(j, DurationUnit.MILLISECONDS)), timeZoneA).m();
        LocalTime.Companion companion2 = LocalTime.INSTANCE;
        wi1 wi1Var = new wi1(15);
        companion2.getClass();
        return LocalTimeFormat.Companion.a(wi1Var).a(localTimeM);
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final String m(long j, String timeZoneId) {
        Intrinsics.i(timeZoneId, "timeZoneId");
        Instant.INSTANCE.getClass();
        Instant instantA = Instant.Companion.a(j);
        TimeZone.INSTANCE.getClass();
        LocalDateTime localDateTimeC = TimeZoneKt.c(instantA, TimeZone.Companion.a(timeZoneId));
        LocalDateTime.INSTANCE.getClass();
        LocalDateTimeFormat.Builder builder = new LocalDateTimeFormat.Builder(new AppendableFormatStructure());
        builder.v(DayOfWeekNames.b);
        builder.e(", ");
        builder.w(Padding.ZERO);
        DateTimeFormatBuilderKt.b(builder, ' ');
        builder.j(MonthNames.c);
        return LocalDateTimeKt.b(localDateTimeC, new LocalDateTimeFormat(d.c(builder)));
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final String n(long j) {
        long j2 = 60;
        int i = (int) ((((j / ((long) 1000)) / j2) / j2) / ((long) 24));
        return cb0.h(i, i == 1 ? " day" : " days");
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final String o(long j) {
        Instant.INSTANCE.getClass();
        Instant instantA = Instant.Companion.a(j);
        TimeZone.Companion companion = TimeZone.INSTANCE;
        String strB = b();
        companion.getClass();
        LocalDateTime localDateTimeC = TimeZoneKt.c(instantA, TimeZone.Companion.a(strB));
        LocalDateTime.INSTANCE.getClass();
        LocalDateTimeFormat.Builder builder = new LocalDateTimeFormat.Builder(new AppendableFormatStructure());
        builder.u(Padding.ZERO);
        builder.e(":");
        builder.r(Padding.ZERO);
        builder.e(":");
        builder.s(Padding.ZERO);
        return LocalDateTimeKt.b(localDateTimeC, new LocalDateTimeFormat(d.c(builder)));
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final long p(String dateString) {
        Intrinsics.i(dateString, "dateString");
        LocalDate.INSTANCE.getClass();
        LocalDateFormat.Builder builder = new LocalDateFormat.Builder(new AppendableFormatStructure());
        builder.w(Padding.ZERO);
        builder.e("/");
        builder.a(Padding.ZERO);
        builder.e("/");
        builder.t(Padding.ZERO);
        LocalDateFormat localDateFormat = new LocalDateFormat(d.c(builder));
        Instant instantA = Clock.System.f17926a.a();
        TimeZone.Companion companion = TimeZone.INSTANCE;
        String strB = b();
        companion.getClass();
        LocalDateTime localDateTimeC = TimeZoneKt.c(instantA, TimeZone.Companion.a(strB));
        return TimeZoneKt.a(LocalDateKt.a(LocalDate.Companion.b(dateString, localDateFormat), localDateTimeC.g(), localDateTimeC.h(), 0, 12), TimeZone.Companion.a(b())).f();
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final long q(long j, String timeZone) {
        Intrinsics.i(timeZone, "timeZone");
        Instant.INSTANCE.getClass();
        Instant instantA = Instant.Companion.a(j);
        TimeZone.INSTANCE.getClass();
        return TimeZoneKt.a(LocalDateKt.a(TimeZoneKt.c(instantA, TimeZone.Companion.a(timeZone)).a(), 0, 0, 0, 8), TimeZone.Companion.a(timeZone)).f();
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final int r(int i) {
        int i2 = i % 12;
        if (i2 == 0) {
            return 12;
        }
        return i2;
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final int s(long j, long j2) throws Exception {
        Instant.INSTANCE.getClass();
        Instant instantA = Instant.Companion.a(j);
        Instant instantA2 = Instant.Companion.a(j2);
        TimeZone.Companion companion = TimeZone.INSTANCE;
        String strB = b();
        companion.getClass();
        TimeZone timeZoneA = TimeZone.Companion.a(strB);
        LocalDate localDateA = TimeZoneKt.c(instantA, timeZoneA).a();
        LocalDate localDateA2 = TimeZoneKt.c(instantA2, timeZoneA).a();
        DateTimeUnit.INSTANCE.getClass();
        DateTimeUnit.DayBased unit = DateTimeUnit.f17929a;
        int i = LocalDateJvmKt.c;
        Intrinsics.i(unit, "unit");
        return (int) (localDateA.getValue().until(localDateA2.getValue(), ChronoUnit.DAYS) / ((long) unit.d));
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final String t(long j) throws Exception {
        long j2 = 3600;
        long j3 = j / j2;
        long j4 = 60;
        long j5 = (j % j2) / j4;
        long j6 = j % j4;
        TimeZone.Companion companion = TimeZone.INSTANCE;
        String strB = b();
        companion.getClass();
        TimeZone timeZoneA = TimeZone.Companion.a(strB);
        LocalDate localDateA = TimeZoneKt.c(Clock.System.f17926a.a(), timeZoneA).a();
        LocalTime localTimeM = TimeZoneKt.b(TimeZoneKt.a(LocalDateTimeKt.a(localDateA.j(), localDateA.h(), localDateA.c(), (int) j3, (int) j5, (int) j6, 64), timeZoneA), timeZoneA).m();
        LocalTime.Companion companion2 = LocalTime.INSTANCE;
        wi1 wi1Var = new wi1(19);
        companion2.getClass();
        return LocalTimeFormat.Companion.a(wi1Var).a(localTimeM);
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final String u(long j, String timeZoneId) {
        Intrinsics.i(timeZoneId, "timeZoneId");
        long jAbs = Math.abs(Clock.System.f17926a.a().b() - j) / ((long) 1000);
        long j2 = 60;
        int i = (int) (jAbs / j2);
        boolean z = jAbs % j2 > 0;
        if (i == 0 && z) {
            return "1 min";
        }
        if (1 <= i && i < 60 && z) {
            return cb0.h(i + 1, " min");
        }
        if (1 <= i && i < 60) {
            return cb0.h(i, " min");
        }
        int i2 = i / 60;
        int i3 = i % 60;
        if (z) {
            i3++;
        }
        if (i3 == 0) {
            return cb0.h(i2, " hr");
        }
        return i2 + " hr " + i3 + " min";
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final int v(int i, String amOrPM) {
        Intrinsics.i(amOrPM, "amOrPM");
        if (amOrPM.equalsIgnoreCase("AM") && i == 12) {
            return 0;
        }
        if (amOrPM.equalsIgnoreCase("AM")) {
            return i;
        }
        if (i == 12) {
            return 12;
        }
        return i + 12;
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final String w(long j) {
        long j2 = j / ((long) 1000);
        int i = (int) j2;
        int i2 = (int) (j2 / ((long) 60));
        if (i2 == 0) {
            return cb0.h(i, " sec");
        }
        if (i2 <= 60) {
            return cb0.h(MathKt.e(((j * 1.0d) / ((double) 1000)) / ((double) 60)), " min");
        }
        int i3 = i2 / 60;
        int i4 = i2 % 60;
        if (i4 == 0) {
            return cb0.h(i3, "hr ");
        }
        return i3 + "hr " + i4 + "min";
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final String x(long j) {
        Instant instantA = Clock.System.f17926a.a();
        TimeZone.INSTANCE.getClass();
        LocalDate localDateA = TimeZoneKt.c(instantA, TimeZone.Companion.a("UTC")).a();
        LocalTime localTimeM = TimeZoneKt.b(TimeZoneKt.a(new LocalDateTime(localDateA.j(), localDateA.h(), localDateA.c()), TimeZone.Companion.a("GMT")).e(DurationKt.h(j, DurationUnit.SECONDS)), TimeZone.Companion.a("GMT")).m();
        LocalTime.Companion companion = LocalTime.INSTANCE;
        wi1 wi1Var = new wi1(16);
        companion.getClass();
        return LocalTimeFormat.Companion.a(wi1Var).a(localTimeM);
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final String y(String timezoneId, Long l) {
        Intrinsics.i(timezoneId, "timezoneId");
        long jLongValue = l != null ? l.longValue() : Clock.System.f17926a.a().b();
        Instant.INSTANCE.getClass();
        Instant instantA = Instant.Companion.a(jLongValue);
        TimeZone.INSTANCE.getClass();
        String lowerCase = TimeZoneKt.c(instantA, TimeZone.Companion.a(timezoneId)).a().e().name().toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Override // app.chalo.utils.timeutil.TimeUtilsContract
    public final long z(long j) throws Exception {
        TimeZone.Companion companion = TimeZone.INSTANCE;
        String strB = b();
        companion.getClass();
        TimeZone timeZoneA = TimeZone.Companion.a(strB);
        LocalDate localDateA = TimeZoneKt.c(Clock.System.f17926a.a(), timeZoneA).a();
        return TimeZoneKt.a(LocalDateTimeKt.a(localDateA.j(), localDateA.h(), localDateA.c(), 0, 0, 0, 64), timeZoneA).f() + j;
    }
}
