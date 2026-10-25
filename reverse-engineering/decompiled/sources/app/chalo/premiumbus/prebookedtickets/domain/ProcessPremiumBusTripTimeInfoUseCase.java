package app.chalo.premiumbus.prebookedtickets.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.data.PremiumBusNativeCityWiseConfigAppModel;
import app.chalo.premiumbus.prebookedtickets.data.model.appmodel.PremiumBusBookingTripTimeInfoAppModel;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusTripScheduleTag;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.usecase.GetPremiumBusCurrentCityConfigUseCase;
import app.chalo.usecase.GetTodayOrTomorrowOrDateUseCase;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/domain/ProcessPremiumBusTripTimeInfoUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessPremiumBusTripTimeInfoUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetPremiumBusCurrentCityConfigUseCase f7320a;
    public final GetTodayOrTomorrowOrDateUseCase b;
    public final BasicInfoContract c;
    public final StringProvider d;
    public final StringProvider e;
    public final TimeUtilsContract f;
    public PremiumBusNativeCityWiseConfigAppModel g;

    public ProcessPremiumBusTripTimeInfoUseCase(GetPremiumBusCurrentCityConfigUseCase getPremiumBusCurrentCityConfigUseCase, GetTodayOrTomorrowOrDateUseCase getTodayOrTomorrowOrDateUseCase, BasicInfoContract basicInfoContract, StringProvider stringProvider, StringProvider stringProvider2, TimeUtilsContract timeUtilsContract) {
        this.f7320a = getPremiumBusCurrentCityConfigUseCase;
        this.b = getTodayOrTomorrowOrDateUseCase;
        this.c = basicInfoContract;
        this.d = stringProvider;
        this.e = stringProvider2;
        this.f = timeUtilsContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        ProcessPremiumBusTripTimeInfoUseCase$busArrivedEarlyThresholdInSec$1 processPremiumBusTripTimeInfoUseCase$busArrivedEarlyThresholdInSec$1;
        if (continuationImpl instanceof ProcessPremiumBusTripTimeInfoUseCase$busArrivedEarlyThresholdInSec$1) {
            processPremiumBusTripTimeInfoUseCase$busArrivedEarlyThresholdInSec$1 = (ProcessPremiumBusTripTimeInfoUseCase$busArrivedEarlyThresholdInSec$1) continuationImpl;
            int i = processPremiumBusTripTimeInfoUseCase$busArrivedEarlyThresholdInSec$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                processPremiumBusTripTimeInfoUseCase$busArrivedEarlyThresholdInSec$1.label = i - Integer.MIN_VALUE;
            } else {
                processPremiumBusTripTimeInfoUseCase$busArrivedEarlyThresholdInSec$1 = new ProcessPremiumBusTripTimeInfoUseCase$busArrivedEarlyThresholdInSec$1(this, continuationImpl);
            }
        } else {
            processPremiumBusTripTimeInfoUseCase$busArrivedEarlyThresholdInSec$1 = new ProcessPremiumBusTripTimeInfoUseCase$busArrivedEarlyThresholdInSec$1(this, continuationImpl);
        }
        Object objG = processPremiumBusTripTimeInfoUseCase$busArrivedEarlyThresholdInSec$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = processPremiumBusTripTimeInfoUseCase$busArrivedEarlyThresholdInSec$1.label;
        if (i2 == 0) {
            ResultKt.b(objG);
            processPremiumBusTripTimeInfoUseCase$busArrivedEarlyThresholdInSec$1.label = 1;
            objG = g(processPremiumBusTripTimeInfoUseCase$busArrivedEarlyThresholdInSec$1);
            if (objG == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objG);
        }
        return new Long(((PremiumBusNativeCityWiseConfigAppModel) objG).e.e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ContinuationImpl continuationImpl) {
        ProcessPremiumBusTripTimeInfoUseCase$delayedEtaThresholdInMins$1 processPremiumBusTripTimeInfoUseCase$delayedEtaThresholdInMins$1;
        if (continuationImpl instanceof ProcessPremiumBusTripTimeInfoUseCase$delayedEtaThresholdInMins$1) {
            processPremiumBusTripTimeInfoUseCase$delayedEtaThresholdInMins$1 = (ProcessPremiumBusTripTimeInfoUseCase$delayedEtaThresholdInMins$1) continuationImpl;
            int i = processPremiumBusTripTimeInfoUseCase$delayedEtaThresholdInMins$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                processPremiumBusTripTimeInfoUseCase$delayedEtaThresholdInMins$1.label = i - Integer.MIN_VALUE;
            } else {
                processPremiumBusTripTimeInfoUseCase$delayedEtaThresholdInMins$1 = new ProcessPremiumBusTripTimeInfoUseCase$delayedEtaThresholdInMins$1(this, continuationImpl);
            }
        } else {
            processPremiumBusTripTimeInfoUseCase$delayedEtaThresholdInMins$1 = new ProcessPremiumBusTripTimeInfoUseCase$delayedEtaThresholdInMins$1(this, continuationImpl);
        }
        Object objG = processPremiumBusTripTimeInfoUseCase$delayedEtaThresholdInMins$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = processPremiumBusTripTimeInfoUseCase$delayedEtaThresholdInMins$1.label;
        if (i2 == 0) {
            ResultKt.b(objG);
            processPremiumBusTripTimeInfoUseCase$delayedEtaThresholdInMins$1.label = 1;
            objG = g(processPremiumBusTripTimeInfoUseCase$delayedEtaThresholdInMins$1);
            if (objG == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objG);
        }
        return new Long(((PremiumBusNativeCityWiseConfigAppModel) objG).e.f);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Code duplicated, block: B:32:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        if (r13 == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r11, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof app.chalo.premiumbus.prebookedtickets.domain.ProcessPremiumBusTripTimeInfoUseCase$getEtaLastUpdatedStatus$1
            if (r0 == 0) goto L13
            r0 = r13
            app.chalo.premiumbus.prebookedtickets.domain.ProcessPremiumBusTripTimeInfoUseCase$getEtaLastUpdatedStatus$1 r0 = (app.chalo.premiumbus.prebookedtickets.domain.ProcessPremiumBusTripTimeInfoUseCase$getEtaLastUpdatedStatus$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.premiumbus.prebookedtickets.domain.ProcessPremiumBusTripTimeInfoUseCase$getEtaLastUpdatedStatus$1 r0 = new app.chalo.premiumbus.prebookedtickets.domain.ProcessPremiumBusTripTimeInfoUseCase$getEtaLastUpdatedStatus$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r13)
            goto L8b
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            long r11 = r0.J$1
            long r6 = r0.J$0
            kotlin.ResultKt.b(r13)
            goto L6b
        L3d:
            long r11 = r0.J$0
            kotlin.ResultKt.b(r13)
            goto L53
        L43:
            kotlin.ResultKt.b(r13)
            r0.J$0 = r11
            r0.label = r5
            app.chalo.contract.BasicInfoContract r13 = r10.c
            java.lang.Object r13 = r13.c(r0)
            if (r13 != r1) goto L53
            goto L8a
        L53:
            java.lang.Number r13 = (java.lang.Number) r13
            long r6 = r13.longValue()
            long r11 = app.chalo.livetracking.frameworklivetracking.domain.GetLiveBusDelayedStateUseCaseKt.a(r6, r11)
            r0.J$0 = r11
            r0.J$1 = r11
            r0.label = r4
            java.lang.Object r13 = r10.b(r0)
            if (r13 != r1) goto L6a
            goto L8a
        L6a:
            r6 = r11
        L6b:
            java.lang.Number r13 = (java.lang.Number) r13
            long r8 = r13.longValue()
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 < 0) goto L8e
            app.chalo.providers.stringprovider.StringEnum r11 = app.chalo.providers.stringprovider.StringEnum.LAST_UPDATED
            java.lang.String r12 = java.lang.String.valueOf(r6)
            java.lang.Object[] r13 = new java.lang.Object[r5]
            r2 = 0
            r13[r2] = r12
            r0.label = r3
            app.chalo.providers.stringprovider.StringProvider r12 = r10.d
            java.lang.Object r13 = r12.b(r11, r13, r0)
            if (r13 != r1) goto L8b
        L8a:
            return r1
        L8b:
            java.lang.String r13 = (java.lang.String) r13
            return r13
        L8e:
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.domain.ProcessPremiumBusTripTimeInfoUseCase.c(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Enum d(long j, long j2, ContinuationImpl continuationImpl) {
        ProcessPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1 processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1;
        long j3;
        long j4;
        long j5;
        long j6;
        long jLongValue;
        long j7;
        long j8;
        long jLongValue2;
        long j9 = j;
        if (continuationImpl instanceof ProcessPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1) {
            processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1 = (ProcessPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1) continuationImpl;
            int i = processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.label = i - Integer.MIN_VALUE;
            } else {
                processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1 = new ProcessPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1(this, continuationImpl);
            }
        } else {
            processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1 = new ProcessPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1(this, continuationImpl);
        }
        Object objJ = processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.label;
        if (i2 == 0) {
            ResultKt.b(objJ);
            processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$0 = j9;
            j3 = j2;
            processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$1 = j3;
            processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$2 = j9;
            processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.label = 1;
            objJ = j(processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1);
            if (objJ != coroutineSingletons) {
                j4 = j9;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            j9 = processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$2;
            j3 = processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$1;
            j4 = processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$0;
            ResultKt.b(objJ);
        } else {
            if (i2 == 2) {
                j6 = processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$3;
                long j10 = processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$2;
                j3 = processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$1;
                j4 = processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$0;
                ResultKt.b(objJ);
                j5 = j10;
                jLongValue = (((Number) objJ).longValue() * ((long) 1000)) + j6;
                processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$0 = j3;
                processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$1 = j5;
                processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$2 = jLongValue;
                processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$3 = j4;
                processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.label = 3;
                objJ = a(processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1);
                if (objJ != coroutineSingletons) {
                    j7 = jLongValue;
                    j8 = j4;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j8 = processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$3;
            j7 = processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$2;
            j5 = processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$1;
            j3 = processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$0;
            ResultKt.b(objJ);
        }
        jLongValue2 = j8 - (((Number) objJ).longValue() * ((long) 1000));
        if (j3 <= jLongValue2) {
            return PremiumBusTripScheduleTag.ARRIVING_EARLY;
        }
        if (jLongValue2 <= j3 || j3 > j7) {
            return (j7 <= j3 || j3 > j5) ? PremiumBusTripScheduleTag.DELAYED : PremiumBusTripScheduleTag.RUNNING_BEHIND;
        }
        return PremiumBusTripScheduleTag.ON_TIME;
        long jLongValue3 = j9 + (((Number) objJ).longValue() * ((long) 1000));
        processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$0 = j4;
        processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$1 = j3;
        processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$2 = jLongValue3;
        processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$3 = j4;
        processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.label = 2;
        objJ = f(processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1);
        if (objJ != coroutineSingletons) {
            j5 = jLongValue3;
            j6 = j4;
            jLongValue = (((Number) objJ).longValue() * ((long) 1000)) + j6;
            processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$0 = j3;
            processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$1 = j5;
            processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$2 = jLongValue;
            processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.J$3 = j4;
            processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1.label = 3;
            objJ = a(processPremiumBusTripTimeInfoUseCase$getTripScheduleTag$1);
            if (objJ != coroutineSingletons) {
                j7 = jLongValue;
                j8 = j4;
                jLongValue2 = j8 - (((Number) objJ).longValue() * ((long) 1000));
                if (j3 <= jLongValue2) {
                    return PremiumBusTripScheduleTag.ARRIVING_EARLY;
                }
                if (jLongValue2 <= j3) {
                }
                if (j7 <= j3) {
                }
            }
        }
        return coroutineSingletons;
    }

    public final Object e(PremiumBusBookingTripTimeInfoAppModel premiumBusBookingTripTimeInfoAppModel, PremiumBusTripScheduleTag premiumBusTripScheduleTag, ContinuationImpl continuationImpl) {
        if (premiumBusBookingTripTimeInfoAppModel instanceof PremiumBusBookingTripTimeInfoAppModel.ExpectedTime) {
            PremiumBusBookingTripTimeInfoAppModel.ExpectedTime expectedTime = (PremiumBusBookingTripTimeInfoAppModel.ExpectedTime) premiumBusBookingTripTimeInfoAppModel;
            if (premiumBusTripScheduleTag == null) {
                premiumBusTripScheduleTag = PremiumBusTripScheduleTag.DELAYED;
            }
            return h(expectedTime, premiumBusTripScheduleTag, continuationImpl);
        }
        if (premiumBusBookingTripTimeInfoAppModel instanceof PremiumBusBookingTripTimeInfoAppModel.LiveEta) {
            PremiumBusBookingTripTimeInfoAppModel.LiveEta liveEta = (PremiumBusBookingTripTimeInfoAppModel.LiveEta) premiumBusBookingTripTimeInfoAppModel;
            if (premiumBusTripScheduleTag == null) {
                premiumBusTripScheduleTag = PremiumBusTripScheduleTag.DELAYED;
            }
            return i(liveEta, premiumBusTripScheduleTag, continuationImpl);
        }
        if (Intrinsics.d(premiumBusBookingTripTimeInfoAppModel, PremiumBusBookingTripTimeInfoAppModel.NotFetched.f7290a)) {
            return PremiumBusBookingTripTimeInfoState.NotFetched.b;
        }
        if (Intrinsics.d(premiumBusBookingTripTimeInfoAppModel, PremiumBusBookingTripTimeInfoAppModel.LiveEtaNotAvailable.f7289a)) {
            return PremiumBusBookingTripTimeInfoState.LiveEtaNotAvailable.b;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(ContinuationImpl continuationImpl) {
        ProcessPremiumBusTripTimeInfoUseCase$onTimeBufferThresholdInSec$1 processPremiumBusTripTimeInfoUseCase$onTimeBufferThresholdInSec$1;
        if (continuationImpl instanceof ProcessPremiumBusTripTimeInfoUseCase$onTimeBufferThresholdInSec$1) {
            processPremiumBusTripTimeInfoUseCase$onTimeBufferThresholdInSec$1 = (ProcessPremiumBusTripTimeInfoUseCase$onTimeBufferThresholdInSec$1) continuationImpl;
            int i = processPremiumBusTripTimeInfoUseCase$onTimeBufferThresholdInSec$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                processPremiumBusTripTimeInfoUseCase$onTimeBufferThresholdInSec$1.label = i - Integer.MIN_VALUE;
            } else {
                processPremiumBusTripTimeInfoUseCase$onTimeBufferThresholdInSec$1 = new ProcessPremiumBusTripTimeInfoUseCase$onTimeBufferThresholdInSec$1(this, continuationImpl);
            }
        } else {
            processPremiumBusTripTimeInfoUseCase$onTimeBufferThresholdInSec$1 = new ProcessPremiumBusTripTimeInfoUseCase$onTimeBufferThresholdInSec$1(this, continuationImpl);
        }
        Object objG = processPremiumBusTripTimeInfoUseCase$onTimeBufferThresholdInSec$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = processPremiumBusTripTimeInfoUseCase$onTimeBufferThresholdInSec$1.label;
        if (i2 == 0) {
            ResultKt.b(objG);
            processPremiumBusTripTimeInfoUseCase$onTimeBufferThresholdInSec$1.label = 1;
            objG = g(processPremiumBusTripTimeInfoUseCase$onTimeBufferThresholdInSec$1);
            if (objG == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objG);
        }
        return new Long(((PremiumBusNativeCityWiseConfigAppModel) objG).e.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(ContinuationImpl continuationImpl) {
        ProcessPremiumBusTripTimeInfoUseCase$premiumBusConfig$1 processPremiumBusTripTimeInfoUseCase$premiumBusConfig$1;
        if (continuationImpl instanceof ProcessPremiumBusTripTimeInfoUseCase$premiumBusConfig$1) {
            processPremiumBusTripTimeInfoUseCase$premiumBusConfig$1 = (ProcessPremiumBusTripTimeInfoUseCase$premiumBusConfig$1) continuationImpl;
            int i = processPremiumBusTripTimeInfoUseCase$premiumBusConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                processPremiumBusTripTimeInfoUseCase$premiumBusConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                processPremiumBusTripTimeInfoUseCase$premiumBusConfig$1 = new ProcessPremiumBusTripTimeInfoUseCase$premiumBusConfig$1(this, continuationImpl);
            }
        } else {
            processPremiumBusTripTimeInfoUseCase$premiumBusConfig$1 = new ProcessPremiumBusTripTimeInfoUseCase$premiumBusConfig$1(this, continuationImpl);
        }
        Object objA = processPremiumBusTripTimeInfoUseCase$premiumBusConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = processPremiumBusTripTimeInfoUseCase$premiumBusConfig$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            PremiumBusNativeCityWiseConfigAppModel premiumBusNativeCityWiseConfigAppModel = this.g;
            if (premiumBusNativeCityWiseConfigAppModel != null) {
                return premiumBusNativeCityWiseConfigAppModel;
            }
            processPremiumBusTripTimeInfoUseCase$premiumBusConfig$1.label = 1;
            objA = this.f7320a.a(processPremiumBusTripTimeInfoUseCase$premiumBusConfig$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        PremiumBusNativeCityWiseConfigAppModel premiumBusNativeCityWiseConfigAppModel2 = (PremiumBusNativeCityWiseConfigAppModel) objA;
        this.g = premiumBusNativeCityWiseConfigAppModel2;
        return premiumBusNativeCityWiseConfigAppModel2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object h(PremiumBusBookingTripTimeInfoAppModel.ExpectedTime expectedTime, PremiumBusTripScheduleTag premiumBusTripScheduleTag, ContinuationImpl continuationImpl) throws Exception {
        ProcessPremiumBusTripTimeInfoUseCase$processExpectedTime$1 processPremiumBusTripTimeInfoUseCase$processExpectedTime$1;
        PremiumBusBookingTripTimeInfoAppModel.ExpectedTime expectedTime2;
        String str;
        if (continuationImpl instanceof ProcessPremiumBusTripTimeInfoUseCase$processExpectedTime$1) {
            processPremiumBusTripTimeInfoUseCase$processExpectedTime$1 = (ProcessPremiumBusTripTimeInfoUseCase$processExpectedTime$1) continuationImpl;
            int i = processPremiumBusTripTimeInfoUseCase$processExpectedTime$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                processPremiumBusTripTimeInfoUseCase$processExpectedTime$1.label = i - Integer.MIN_VALUE;
            } else {
                processPremiumBusTripTimeInfoUseCase$processExpectedTime$1 = new ProcessPremiumBusTripTimeInfoUseCase$processExpectedTime$1(this, continuationImpl);
            }
        } else {
            processPremiumBusTripTimeInfoUseCase$processExpectedTime$1 = new ProcessPremiumBusTripTimeInfoUseCase$processExpectedTime$1(this, continuationImpl);
        }
        ProcessPremiumBusTripTimeInfoUseCase$processExpectedTime$1 processPremiumBusTripTimeInfoUseCase$processExpectedTime$2 = processPremiumBusTripTimeInfoUseCase$processExpectedTime$1;
        Object objA = processPremiumBusTripTimeInfoUseCase$processExpectedTime$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = processPremiumBusTripTimeInfoUseCase$processExpectedTime$2.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            long j = expectedTime.f7287a;
            processPremiumBusTripTimeInfoUseCase$processExpectedTime$2.L$0 = expectedTime;
            processPremiumBusTripTimeInfoUseCase$processExpectedTime$2.L$1 = premiumBusTripScheduleTag;
            processPremiumBusTripTimeInfoUseCase$processExpectedTime$2.label = 1;
            objA = this.b.a(j, processPremiumBusTripTimeInfoUseCase$processExpectedTime$2);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            expectedTime = (PremiumBusBookingTripTimeInfoAppModel.ExpectedTime) processPremiumBusTripTimeInfoUseCase$processExpectedTime$2.L$0;
            ResultKt.b(objA);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) processPremiumBusTripTimeInfoUseCase$processExpectedTime$2.L$1;
            expectedTime2 = (PremiumBusBookingTripTimeInfoAppModel.ExpectedTime) processPremiumBusTripTimeInfoUseCase$processExpectedTime$2.L$0;
            ResultKt.b(objA);
        }
        return new PremiumBusBookingTripTimeInfoState.ExpectedTime(str, (PremiumBusTripScheduleTag) objA, expectedTime2.c);
        String str2 = (String) objA;
        long j2 = expectedTime.b;
        long j3 = expectedTime.f7287a;
        processPremiumBusTripTimeInfoUseCase$processExpectedTime$2.L$0 = expectedTime;
        processPremiumBusTripTimeInfoUseCase$processExpectedTime$2.L$1 = str2;
        processPremiumBusTripTimeInfoUseCase$processExpectedTime$2.label = 2;
        objA = d(j2, j3, processPremiumBusTripTimeInfoUseCase$processExpectedTime$2);
        if (objA != coroutineSingletons) {
            expectedTime2 = expectedTime;
            str = str2;
            return new PremiumBusBookingTripTimeInfoState.ExpectedTime(str, (PremiumBusTripScheduleTag) objA, expectedTime2.c);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object i(PremiumBusBookingTripTimeInfoAppModel.LiveEta liveEta, PremiumBusTripScheduleTag premiumBusTripScheduleTag, ContinuationImpl continuationImpl) {
        ProcessPremiumBusTripTimeInfoUseCase$processLiveEta$1 processPremiumBusTripTimeInfoUseCase$processLiveEta$1;
        PremiumBusBookingTripTimeInfoAppModel.LiveEta liveEta2;
        String str;
        PremiumBusTripScheduleTag premiumBusTripScheduleTag2;
        Object objC;
        PremiumBusTripScheduleTag premiumBusTripScheduleTag3;
        if (continuationImpl instanceof ProcessPremiumBusTripTimeInfoUseCase$processLiveEta$1) {
            processPremiumBusTripTimeInfoUseCase$processLiveEta$1 = (ProcessPremiumBusTripTimeInfoUseCase$processLiveEta$1) continuationImpl;
            int i = processPremiumBusTripTimeInfoUseCase$processLiveEta$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                processPremiumBusTripTimeInfoUseCase$processLiveEta$1.label = i - Integer.MIN_VALUE;
            } else {
                processPremiumBusTripTimeInfoUseCase$processLiveEta$1 = new ProcessPremiumBusTripTimeInfoUseCase$processLiveEta$1(this, continuationImpl);
            }
        } else {
            processPremiumBusTripTimeInfoUseCase$processLiveEta$1 = new ProcessPremiumBusTripTimeInfoUseCase$processLiveEta$1(this, continuationImpl);
        }
        ProcessPremiumBusTripTimeInfoUseCase$processLiveEta$1 processPremiumBusTripTimeInfoUseCase$processLiveEta$2 = processPremiumBusTripTimeInfoUseCase$processLiveEta$1;
        Object objB = processPremiumBusTripTimeInfoUseCase$processLiveEta$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = processPremiumBusTripTimeInfoUseCase$processLiveEta$2.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (liveEta.b) {
                return PremiumBusBookingTripTimeInfoState.BusPassedPickupStop.b;
            }
            StringEnum stringEnum = StringEnum.TRIP_PLAN_CHALO_PREMIUM_BUS_CARD_ETA;
            Object[] objArr = {this.f.w(liveEta.f7288a * ((long) 1000))};
            processPremiumBusTripTimeInfoUseCase$processLiveEta$2.L$0 = liveEta;
            processPremiumBusTripTimeInfoUseCase$processLiveEta$2.L$1 = premiumBusTripScheduleTag;
            processPremiumBusTripTimeInfoUseCase$processLiveEta$2.label = 1;
            objB = this.d.b(stringEnum, objArr, processPremiumBusTripTimeInfoUseCase$processLiveEta$2);
            if (objB != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            liveEta = (PremiumBusBookingTripTimeInfoAppModel.LiveEta) processPremiumBusTripTimeInfoUseCase$processLiveEta$2.L$0;
            ResultKt.b(objB);
        } else {
            if (i2 == 2) {
                str = (String) processPremiumBusTripTimeInfoUseCase$processLiveEta$2.L$1;
                PremiumBusBookingTripTimeInfoAppModel.LiveEta liveEta3 = (PremiumBusBookingTripTimeInfoAppModel.LiveEta) processPremiumBusTripTimeInfoUseCase$processLiveEta$2.L$0;
                ResultKt.b(objB);
                liveEta2 = liveEta3;
                premiumBusTripScheduleTag2 = (PremiumBusTripScheduleTag) objB;
                long j = liveEta2.c;
                processPremiumBusTripTimeInfoUseCase$processLiveEta$2.L$0 = premiumBusTripScheduleTag2;
                processPremiumBusTripTimeInfoUseCase$processLiveEta$2.L$1 = str;
                processPremiumBusTripTimeInfoUseCase$processLiveEta$2.label = 3;
                objC = c(j, processPremiumBusTripTimeInfoUseCase$processLiveEta$2);
                if (objC != obj) {
                    premiumBusTripScheduleTag3 = premiumBusTripScheduleTag2;
                    objB = objC;
                }
                return obj;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) processPremiumBusTripTimeInfoUseCase$processLiveEta$2.L$1;
            premiumBusTripScheduleTag3 = (PremiumBusTripScheduleTag) processPremiumBusTripTimeInfoUseCase$processLiveEta$2.L$0;
            ResultKt.b(objB);
        }
        return new PremiumBusBookingTripTimeInfoState.LiveEta(str, (String) objB, premiumBusTripScheduleTag3);
        String str2 = (String) objB;
        long j2 = liveEta.c + (liveEta.f7288a * ((long) 1000));
        Long l = liveEta.d;
        if (l != null) {
            long jLongValue = l.longValue();
            processPremiumBusTripTimeInfoUseCase$processLiveEta$2.L$0 = liveEta;
            processPremiumBusTripTimeInfoUseCase$processLiveEta$2.L$1 = str2;
            processPremiumBusTripTimeInfoUseCase$processLiveEta$2.label = 2;
            Object objD = d(jLongValue, j2, processPremiumBusTripTimeInfoUseCase$processLiveEta$2);
            if (objD != obj) {
                liveEta2 = liveEta;
                str = str2;
                objB = objD;
                premiumBusTripScheduleTag2 = (PremiumBusTripScheduleTag) objB;
                long j3 = liveEta2.c;
                processPremiumBusTripTimeInfoUseCase$processLiveEta$2.L$0 = premiumBusTripScheduleTag2;
                processPremiumBusTripTimeInfoUseCase$processLiveEta$2.L$1 = str;
                processPremiumBusTripTimeInfoUseCase$processLiveEta$2.label = 3;
                objC = c(j3, processPremiumBusTripTimeInfoUseCase$processLiveEta$2);
                if (objC != obj) {
                    premiumBusTripScheduleTag3 = premiumBusTripScheduleTag2;
                    objB = objC;
                    return new PremiumBusBookingTripTimeInfoState.LiveEta(str, (String) objB, premiumBusTripScheduleTag3);
                }
            }
        } else {
            liveEta2 = liveEta;
            str = str2;
            premiumBusTripScheduleTag2 = null;
            long j4 = liveEta2.c;
            processPremiumBusTripTimeInfoUseCase$processLiveEta$2.L$0 = premiumBusTripScheduleTag2;
            processPremiumBusTripTimeInfoUseCase$processLiveEta$2.L$1 = str;
            processPremiumBusTripTimeInfoUseCase$processLiveEta$2.label = 3;
            objC = c(j4, processPremiumBusTripTimeInfoUseCase$processLiveEta$2);
            if (objC != obj) {
                premiumBusTripScheduleTag3 = premiumBusTripScheduleTag2;
                objB = objC;
                return new PremiumBusBookingTripTimeInfoState.LiveEta(str, (String) objB, premiumBusTripScheduleTag3);
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(ContinuationImpl continuationImpl) {
        ProcessPremiumBusTripTimeInfoUseCase$runningLateStatusThresholdInSec$1 processPremiumBusTripTimeInfoUseCase$runningLateStatusThresholdInSec$1;
        if (continuationImpl instanceof ProcessPremiumBusTripTimeInfoUseCase$runningLateStatusThresholdInSec$1) {
            processPremiumBusTripTimeInfoUseCase$runningLateStatusThresholdInSec$1 = (ProcessPremiumBusTripTimeInfoUseCase$runningLateStatusThresholdInSec$1) continuationImpl;
            int i = processPremiumBusTripTimeInfoUseCase$runningLateStatusThresholdInSec$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                processPremiumBusTripTimeInfoUseCase$runningLateStatusThresholdInSec$1.label = i - Integer.MIN_VALUE;
            } else {
                processPremiumBusTripTimeInfoUseCase$runningLateStatusThresholdInSec$1 = new ProcessPremiumBusTripTimeInfoUseCase$runningLateStatusThresholdInSec$1(this, continuationImpl);
            }
        } else {
            processPremiumBusTripTimeInfoUseCase$runningLateStatusThresholdInSec$1 = new ProcessPremiumBusTripTimeInfoUseCase$runningLateStatusThresholdInSec$1(this, continuationImpl);
        }
        Object objG = processPremiumBusTripTimeInfoUseCase$runningLateStatusThresholdInSec$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = processPremiumBusTripTimeInfoUseCase$runningLateStatusThresholdInSec$1.label;
        if (i2 == 0) {
            ResultKt.b(objG);
            processPremiumBusTripTimeInfoUseCase$runningLateStatusThresholdInSec$1.label = 1;
            objG = g(processPremiumBusTripTimeInfoUseCase$runningLateStatusThresholdInSec$1);
            if (objG == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objG);
        }
        return new Long(((PremiumBusNativeCityWiseConfigAppModel) objG).e.c);
    }
}
