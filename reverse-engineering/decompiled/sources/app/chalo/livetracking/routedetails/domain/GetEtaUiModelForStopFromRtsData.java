package app.chalo.livetracking.routedetails.domain;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.contract.BasicInfoContract;
import app.chalo.livetracking.frameworklivetracking.domain.GetDelayedEtaThresholdForLiveTrackingUseCase;
import app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/livetracking/routedetails/domain/GetEtaUiModelForStopFromRtsData;", "", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetEtaUiModelForStopFromRtsData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicInfoContract f4429a;
    public final GetDelayedEtaThresholdForLiveTrackingUseCase b;
    public final RouteDetailsAnalyticsHelper c;
    public final TimeUtilsContract d;
    public final boolean e;
    public long f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/livetracking/routedetails/domain/GetEtaUiModelForStopFromRtsData$Companion;", "", "", "LIVE_ETA_DETAILS_DEBUG_EVENT_MIN_TIME_DIFF", "J", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public GetEtaUiModelForStopFromRtsData(BasicInfoContract basicInfoContract, GetDelayedEtaThresholdForLiveTrackingUseCase getDelayedEtaThresholdForLiveTrackingUseCase, ChaloBuildConfig chaloBuildConfig, RouteDetailsAnalyticsHelper routeDetailsAnalyticsHelper, TimeUtilsContract timeUtilsContract) {
        this.f4429a = basicInfoContract;
        this.b = getDelayedEtaThresholdForLiveTrackingUseCase;
        this.c = routeDetailsAnalyticsHelper;
        this.d = timeUtilsContract;
        this.e = chaloBuildConfig.n();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:34:0x0100  */
    /* JADX WARN: Code duplicated, block: B:37:0x010e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0116  */
    /* JADX WARN: Code duplicated, block: B:42:0x0120  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00cb -> B:31:0x00d5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.util.List r23, long r24, java.util.Map r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.routedetails.domain.GetEtaUiModelForStopFromRtsData.a(java.util.List, long, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:125:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c7 A[LOOP:1: B:47:0x01ad->B:53:0x01c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x02b3 -> B:79:0x02b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x02ce -> B:80:0x02c9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(boolean r29, int r30, java.util.List r31, java.util.List r32, java.util.Map r33, kotlin.coroutines.jvm.internal.ContinuationImpl r34) {
        /*
            Method dump skipped, instruction units count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.routedetails.domain.GetEtaUiModelForStopFromRtsData.b(boolean, int, java.util.List, java.util.List, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(ContinuationImpl continuationImpl) {
        GetEtaUiModelForStopFromRtsData$shouldFireLiveEtaDetailsDebugEvent$1 getEtaUiModelForStopFromRtsData$shouldFireLiveEtaDetailsDebugEvent$1;
        if (continuationImpl instanceof GetEtaUiModelForStopFromRtsData$shouldFireLiveEtaDetailsDebugEvent$1) {
            getEtaUiModelForStopFromRtsData$shouldFireLiveEtaDetailsDebugEvent$1 = (GetEtaUiModelForStopFromRtsData$shouldFireLiveEtaDetailsDebugEvent$1) continuationImpl;
            int i = getEtaUiModelForStopFromRtsData$shouldFireLiveEtaDetailsDebugEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getEtaUiModelForStopFromRtsData$shouldFireLiveEtaDetailsDebugEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                getEtaUiModelForStopFromRtsData$shouldFireLiveEtaDetailsDebugEvent$1 = new GetEtaUiModelForStopFromRtsData$shouldFireLiveEtaDetailsDebugEvent$1(this, continuationImpl);
            }
        } else {
            getEtaUiModelForStopFromRtsData$shouldFireLiveEtaDetailsDebugEvent$1 = new GetEtaUiModelForStopFromRtsData$shouldFireLiveEtaDetailsDebugEvent$1(this, continuationImpl);
        }
        Object objC = getEtaUiModelForStopFromRtsData$shouldFireLiveEtaDetailsDebugEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getEtaUiModelForStopFromRtsData$shouldFireLiveEtaDetailsDebugEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            getEtaUiModelForStopFromRtsData$shouldFireLiveEtaDetailsDebugEvent$1.label = 1;
            objC = this.f4429a.c(getEtaUiModelForStopFromRtsData$shouldFireLiveEtaDetailsDebugEvent$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        return Boolean.valueOf(((Number) objC).longValue() - this.f > 120000);
    }
}
