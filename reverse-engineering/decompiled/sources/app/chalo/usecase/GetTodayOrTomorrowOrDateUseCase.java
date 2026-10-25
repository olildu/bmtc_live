package app.chalo.usecase;

import androidx.compose.material3.internal.CalendarModelKt;
import app.chalo.contract.BasicInfoContract;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.timeutil.TimeUtilsContract;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.datetime.DayOfWeek;
import kotlinx.datetime.Instant;
import kotlinx.datetime.TimeZone;
import kotlinx.datetime.TimeZoneKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/GetTodayOrTomorrowOrDateUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetTodayOrTomorrowOrDateUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckIsTimestampForTodayUseCase f10197a;
    public final FormatTimeInMillisToGivenFormatUseCase b;
    public final TimeUtilsContract c;
    public final BasicInfoContract d;
    public final GetTimeInMillisAfterXTimeUseCase e;
    public final StringProvider f;

    public GetTodayOrTomorrowOrDateUseCase(CheckIsTimestampForTodayUseCase checkIsTimestampForTodayUseCase, FormatTimeInMillisToGivenFormatUseCase formatTimeInMillisToGivenFormatUseCase, TimeUtilsContract timeUtilsContract, BasicInfoContract basicInfoContract, GetTimeInMillisAfterXTimeUseCase getTimeInMillisAfterXTimeUseCase, StringProvider stringProvider) {
        this.f10197a = checkIsTimestampForTodayUseCase;
        this.b = formatTimeInMillisToGivenFormatUseCase;
        this.c = timeUtilsContract;
        this.d = basicInfoContract;
        this.e = getTimeInMillisAfterXTimeUseCase;
        this.f = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:34:0x0107  */
    /* JADX WARN: Code duplicated, block: B:36:0x010b  */
    /* JADX WARN: Code duplicated, block: B:39:0x011d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0126  */
    /* JADX WARN: Code duplicated, block: B:45:0x0136  */
    /* JADX WARN: Code duplicated, block: B:47:0x013a  */
    /* JADX WARN: Code duplicated, block: B:49:0x013e  */
    /* JADX WARN: Code duplicated, block: B:51:0x014a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(long j, ContinuationImpl continuationImpl) throws Exception {
        GetTodayOrTomorrowOrDateUseCase$invoke$1 getTodayOrTomorrowOrDateUseCase$invoke$1;
        long j2;
        String strB;
        long j3;
        String str;
        long j4;
        long j5;
        long j6;
        String str2;
        String strD;
        if (continuationImpl instanceof GetTodayOrTomorrowOrDateUseCase$invoke$1) {
            getTodayOrTomorrowOrDateUseCase$invoke$1 = (GetTodayOrTomorrowOrDateUseCase$invoke$1) continuationImpl;
            int i = getTodayOrTomorrowOrDateUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getTodayOrTomorrowOrDateUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getTodayOrTomorrowOrDateUseCase$invoke$1 = new GetTodayOrTomorrowOrDateUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getTodayOrTomorrowOrDateUseCase$invoke$1 = new GetTodayOrTomorrowOrDateUseCase$invoke$1(this, continuationImpl);
        }
        Object objC = getTodayOrTomorrowOrDateUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getTodayOrTomorrowOrDateUseCase$invoke$1.label;
        StringProvider stringProvider = this.f;
        CheckIsTimestampForTodayUseCase checkIsTimestampForTodayUseCase = this.f10197a;
        TimeUtilsContract timeUtilsContract = this.c;
        if (i2 == 0) {
            j2 = CalendarModelKt.MillisecondsIn24Hours;
            ResultKt.b(objC);
            strB = timeUtilsContract.b();
            getTodayOrTomorrowOrDateUseCase$invoke$1.L$0 = strB;
            j3 = j;
            getTodayOrTomorrowOrDateUseCase$invoke$1.J$0 = j3;
            getTodayOrTomorrowOrDateUseCase$invoke$1.label = 1;
            objC = this.d.c(getTodayOrTomorrowOrDateUseCase$invoke$1);
            if (objC != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    str2 = (String) getTodayOrTomorrowOrDateUseCase$invoke$1.L$0;
                    ResultKt.b(objC);
                    strD = (String) objC;
                    return vo1.n(str2, ", ", strD);
                }
                if (i2 == 4) {
                    long j7 = getTodayOrTomorrowOrDateUseCase$invoke$1.J$1;
                    j6 = getTodayOrTomorrowOrDateUseCase$invoke$1.J$0;
                    String str3 = (String) getTodayOrTomorrowOrDateUseCase$invoke$1.L$0;
                    ResultKt.b(objC);
                    j4 = j7;
                    str = str3;
                    if (((Boolean) objC).booleanValue()) {
                        getTodayOrTomorrowOrDateUseCase$invoke$1.L$0 = str;
                        getTodayOrTomorrowOrDateUseCase$invoke$1.label = 5;
                        objC = stringProvider.b(StringEnum.TOMORROW, new Object[0], getTodayOrTomorrowOrDateUseCase$invoke$1);
                        if (objC != coroutineSingletons) {
                            str2 = str;
                        }
                        return coroutineSingletons;
                    }
                    if (j6 < j4) {
                        strD = FormatTimeInMillisToGivenFormatUseCase.a(this.b, j6, ChaloCustomDateFormat.DAY_NAME_FORMAT, 12);
                    } else {
                        strD = timeUtilsContract.D(j6);
                    }
                    str2 = str;
                    return vo1.n(str2, ", ", strD);
                }
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) getTodayOrTomorrowOrDateUseCase$invoke$1.L$0;
                ResultKt.b(objC);
                strD = (String) objC;
                return vo1.n(str2, ", ", strD);
            }
            j4 = getTodayOrTomorrowOrDateUseCase$invoke$1.J$1;
            j2 = CalendarModelKt.MillisecondsIn24Hours;
            long j8 = getTodayOrTomorrowOrDateUseCase$invoke$1.J$0;
            String str4 = (String) getTodayOrTomorrowOrDateUseCase$invoke$1.L$0;
            ResultKt.b(objC);
            j5 = j8;
            str = str4;
            if (((Boolean) objC).booleanValue()) {
                getTodayOrTomorrowOrDateUseCase$invoke$1.L$0 = str;
                getTodayOrTomorrowOrDateUseCase$invoke$1.label = 3;
                objC = stringProvider.b(StringEnum.TODAY, new Object[0], getTodayOrTomorrowOrDateUseCase$invoke$1);
                if (objC != coroutineSingletons) {
                    str2 = str;
                    strD = (String) objC;
                    return vo1.n(str2, ", ", strD);
                }
            } else {
                getTodayOrTomorrowOrDateUseCase$invoke$1.L$0 = str;
                getTodayOrTomorrowOrDateUseCase$invoke$1.J$0 = j5;
                getTodayOrTomorrowOrDateUseCase$invoke$1.J$1 = j4;
                getTodayOrTomorrowOrDateUseCase$invoke$1.label = 4;
                objC = checkIsTimestampForTodayUseCase.a(j5 - j2, getTodayOrTomorrowOrDateUseCase$invoke$1);
                if (objC != coroutineSingletons) {
                    j6 = j5;
                    if (((Boolean) objC).booleanValue()) {
                        getTodayOrTomorrowOrDateUseCase$invoke$1.L$0 = str;
                        getTodayOrTomorrowOrDateUseCase$invoke$1.label = 5;
                        objC = stringProvider.b(StringEnum.TOMORROW, new Object[0], getTodayOrTomorrowOrDateUseCase$invoke$1);
                        if (objC != coroutineSingletons) {
                            str2 = str;
                            strD = (String) objC;
                        }
                    } else {
                        if (j6 < j4) {
                            strD = FormatTimeInMillisToGivenFormatUseCase.a(this.b, j6, ChaloCustomDateFormat.DAY_NAME_FORMAT, 12);
                        } else {
                            strD = timeUtilsContract.D(j6);
                        }
                        str2 = str;
                    }
                    return vo1.n(str2, ", ", strD);
                }
            }
            return coroutineSingletons;
        }
        j2 = CalendarModelKt.MillisecondsIn24Hours;
        j3 = getTodayOrTomorrowOrDateUseCase$invoke$1.J$0;
        strB = (String) getTodayOrTomorrowOrDateUseCase$invoke$1.L$0;
        ResultKt.b(objC);
        long jLongValue = ((Number) objC).longValue();
        String strE = timeUtilsContract.e(j3);
        Instant.INSTANCE.getClass();
        Instant instantA = Instant.Companion.a(jLongValue);
        TimeZone.INSTANCE.getClass();
        long jA = this.e.a(jLongValue, ((long) (DayOfWeek.SATURDAY.ordinal() - TimeZoneKt.c(instantA, TimeZone.Companion.a(strB)).e().ordinal())) * j2, MillisAfterTimeFormatType.END_OF_DAY);
        getTodayOrTomorrowOrDateUseCase$invoke$1.L$0 = strE;
        getTodayOrTomorrowOrDateUseCase$invoke$1.J$0 = j3;
        getTodayOrTomorrowOrDateUseCase$invoke$1.J$1 = jA;
        getTodayOrTomorrowOrDateUseCase$invoke$1.label = 2;
        Object objA = checkIsTimestampForTodayUseCase.a(j3, getTodayOrTomorrowOrDateUseCase$invoke$1);
        if (objA != coroutineSingletons) {
            long j9 = j3;
            str = strE;
            objC = objA;
            j4 = jA;
            j5 = j9;
            if (((Boolean) objC).booleanValue()) {
                getTodayOrTomorrowOrDateUseCase$invoke$1.L$0 = str;
                getTodayOrTomorrowOrDateUseCase$invoke$1.label = 3;
                objC = stringProvider.b(StringEnum.TODAY, new Object[0], getTodayOrTomorrowOrDateUseCase$invoke$1);
                if (objC != coroutineSingletons) {
                    str2 = str;
                    strD = (String) objC;
                    return vo1.n(str2, ", ", strD);
                }
            } else {
                getTodayOrTomorrowOrDateUseCase$invoke$1.L$0 = str;
                getTodayOrTomorrowOrDateUseCase$invoke$1.J$0 = j5;
                getTodayOrTomorrowOrDateUseCase$invoke$1.J$1 = j4;
                getTodayOrTomorrowOrDateUseCase$invoke$1.label = 4;
                objC = checkIsTimestampForTodayUseCase.a(j5 - j2, getTodayOrTomorrowOrDateUseCase$invoke$1);
                if (objC != coroutineSingletons) {
                    j6 = j5;
                    if (((Boolean) objC).booleanValue()) {
                        getTodayOrTomorrowOrDateUseCase$invoke$1.L$0 = str;
                        getTodayOrTomorrowOrDateUseCase$invoke$1.label = 5;
                        objC = stringProvider.b(StringEnum.TOMORROW, new Object[0], getTodayOrTomorrowOrDateUseCase$invoke$1);
                        if (objC != coroutineSingletons) {
                            str2 = str;
                            strD = (String) objC;
                        }
                    } else {
                        if (j6 < j4) {
                            strD = FormatTimeInMillisToGivenFormatUseCase.a(this.b, j6, ChaloCustomDateFormat.DAY_NAME_FORMAT, 12);
                        } else {
                            strD = timeUtilsContract.D(j6);
                        }
                        str2 = str;
                    }
                    return vo1.n(str2, ", ", strD);
                }
            }
        }
        return coroutineSingletons;
    }
}
