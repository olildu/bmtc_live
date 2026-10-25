package app.chalo.quickpay.validation.manager;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.analytics.contract.AnalyticsContract;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.quickpay.validation.manager.QuickPayTicketAnalyticsManagerValidation", f = "QuickPayTicketAnalyticsManagerValidation.kt", l = {TypedValues.AttributesType.TYPE_EASING}, m = "raiseInvalidTITOTapinDataReceivedInPollingOnEvent", v = 1)
final class QuickPayTicketAnalyticsManagerValidation$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ QuickPayTicketAnalyticsManagerValidation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickPayTicketAnalyticsManagerValidation$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1(QuickPayTicketAnalyticsManagerValidation quickPayTicketAnalyticsManagerValidation, Continuation continuation) {
        super(continuation);
        this.this$0 = quickPayTicketAnalyticsManagerValidation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        QuickPayTicketAnalyticsManagerValidation$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1 quickPayTicketAnalyticsManagerValidation$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str;
        String str2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        QuickPayTicketAnalyticsManagerValidation quickPayTicketAnalyticsManagerValidation = this.this$0;
        quickPayTicketAnalyticsManagerValidation.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            quickPayTicketAnalyticsManagerValidation$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1 = this;
        } else {
            quickPayTicketAnalyticsManagerValidation$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1 = new QuickPayTicketAnalyticsManagerValidation$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1(quickPayTicketAnalyticsManagerValidation, this);
        }
        Object obj2 = quickPayTicketAnalyticsManagerValidation$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayTicketAnalyticsManagerValidation$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("reason", null));
            quickPayTicketAnalyticsManagerValidation$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$0 = linkedHashMapK;
            quickPayTicketAnalyticsManagerValidation$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$1 = quickPayTicketAnalyticsManagerValidation;
            quickPayTicketAnalyticsManagerValidation$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$2 = "invalid tito tap in data received in polling";
            quickPayTicketAnalyticsManagerValidation$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$3 = null;
            quickPayTicketAnalyticsManagerValidation$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.label = 1;
            if (quickPayTicketAnalyticsManagerValidation.J(linkedHashMapK, null, quickPayTicketAnalyticsManagerValidation$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            analyticsContract = quickPayTicketAnalyticsManagerValidation;
            map = linkedHashMapK;
            str = "invalid tito tap in data received in polling";
            str2 = null;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) quickPayTicketAnalyticsManagerValidation$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$3;
            String str4 = (String) quickPayTicketAnalyticsManagerValidation$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) quickPayTicketAnalyticsManagerValidation$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$1;
            Map map2 = (Map) quickPayTicketAnalyticsManagerValidation$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$0;
            ResultKt.b(obj2);
            str2 = str3;
            map = map2;
            str = str4;
            analyticsContract = analyticsContract2;
        }
        AnalyticsContract.DefaultImpls.a(analyticsContract, str, str2, map, null, false, 24);
        return Unit.f17538a;
    }
}
