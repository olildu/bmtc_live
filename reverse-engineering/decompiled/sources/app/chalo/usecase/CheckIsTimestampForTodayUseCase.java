package app.chalo.usecase;

import app.chalo.contract.BasicInfoContract;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.datetime.Instant;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.TimeZone;
import kotlinx.datetime.TimeZoneKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/CheckIsTimestampForTodayUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckIsTimestampForTodayUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetChaloTimeUseCase f10157a;
    public final TimeUtilsContract b;
    public final BasicInfoContract c;

    public CheckIsTimestampForTodayUseCase(GetChaloTimeUseCase getChaloTimeUseCase, TimeUtilsContract timeUtilsContract, BasicInfoContract basicInfoContract) {
        this.f10157a = getChaloTimeUseCase;
        this.b = timeUtilsContract;
        this.c = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, ContinuationImpl continuationImpl) throws Exception {
        CheckIsTimestampForTodayUseCase$invoke$1 checkIsTimestampForTodayUseCase$invoke$1;
        long jE;
        if (continuationImpl instanceof CheckIsTimestampForTodayUseCase$invoke$1) {
            checkIsTimestampForTodayUseCase$invoke$1 = (CheckIsTimestampForTodayUseCase$invoke$1) continuationImpl;
            int i = checkIsTimestampForTodayUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkIsTimestampForTodayUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                checkIsTimestampForTodayUseCase$invoke$1 = new CheckIsTimestampForTodayUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            checkIsTimestampForTodayUseCase$invoke$1 = new CheckIsTimestampForTodayUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = checkIsTimestampForTodayUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkIsTimestampForTodayUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            checkIsTimestampForTodayUseCase$invoke$1.J$0 = j;
            checkIsTimestampForTodayUseCase$invoke$1.label = 1;
            objA = this.f10157a.a(checkIsTimestampForTodayUseCase$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = checkIsTimestampForTodayUseCase$invoke$1.J$0;
            ResultKt.b(objA);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            jE = ((Number) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).longValue();
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            jE = this.c.e();
        }
        TimeZone.Companion companion = TimeZone.INSTANCE;
        String strB = this.b.b();
        companion.getClass();
        TimeZone timeZoneA = TimeZone.Companion.a(strB);
        Instant.INSTANCE.getClass();
        LocalDateTime localDateTimeC = TimeZoneKt.c(Instant.Companion.a(j), timeZoneA);
        LocalDateTime localDateTimeC2 = TimeZoneKt.c(Instant.Companion.a(jE), timeZoneA);
        return Boolean.valueOf(localDateTimeC.o() == localDateTimeC2.o() && localDateTimeC.j() == localDateTimeC2.j() && localDateTimeC.f() == localDateTimeC2.f());
    }
}
