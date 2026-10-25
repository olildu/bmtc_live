package app.chalo.mTicketing.validation;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.BasicInfoContract;
import app.chalo.notification.models.TITOTapInNotificationEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.mTicketing.validation.MTicketValidationAnalyticsManager", f = "MTicketValidationAnalyticsManager.kt", l = {347}, m = "raiseValidTITOTapinDataReceivedInPollingOnEvent", v = 1)
final class MTicketValidationAnalyticsManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MTicketValidationAnalyticsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTicketValidationAnalyticsManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1(MTicketValidationAnalyticsManager mTicketValidationAnalyticsManager, Continuation continuation) {
        super(continuation);
        this.this$0 = mTicketValidationAnalyticsManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MTicketValidationAnalyticsManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1 mTicketValidationAnalyticsManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1;
        String str;
        Map map;
        TITOTapInNotificationEvent tITOTapInNotificationEvent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        MTicketValidationAnalyticsManager mTicketValidationAnalyticsManager = this.this$0;
        mTicketValidationAnalyticsManager.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            mTicketValidationAnalyticsManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1 = this;
        } else {
            mTicketValidationAnalyticsManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1 = new MTicketValidationAnalyticsManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1(mTicketValidationAnalyticsManager, this);
        }
        Object obj2 = mTicketValidationAnalyticsManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketValidationAnalyticsManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            str = null;
            Map mapK = MTicketValidationAnalyticsManager.K(null);
            BasicInfoContract basicInfoContract = mTicketValidationAnalyticsManager.b;
            mTicketValidationAnalyticsManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$0 = null;
            mTicketValidationAnalyticsManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$1 = null;
            mTicketValidationAnalyticsManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$2 = mapK;
            mTicketValidationAnalyticsManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.label = 1;
            Object objC = basicInfoContract.c(mTicketValidationAnalyticsManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            map = mapK;
            obj2 = objC;
            tITOTapInNotificationEvent = null;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) mTicketValidationAnalyticsManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$2;
            TITOTapInNotificationEvent tITOTapInNotificationEvent2 = (TITOTapInNotificationEvent) mTicketValidationAnalyticsManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$1;
            String str2 = (String) mTicketValidationAnalyticsManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$0;
            ResultKt.b(obj2);
            str = str2;
            tITOTapInNotificationEvent = tITOTapInNotificationEvent2;
        }
        AnalyticsContract.DefaultImpls.a(mTicketValidationAnalyticsManager, "valid tito tap in data received in polling", str, tITOTapInNotificationEvent.b(map, ((Number) obj2).longValue()), null, false, 24);
        return Unit.f17538a;
    }
}
