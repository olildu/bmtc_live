package app.chalo.ondc.validation;

import app.chalo.analytics.contract.AnalyticsContract;
import defpackage.d;
import java.util.LinkedHashMap;
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
@DebugMetadata(c = "app.chalo.ondc.validation.OndcTicketValidationAnalyticManager", f = "OndcTicketValidationAnalyticManager.kt", l = {325}, m = "raiseInvalidTITOTapinDataReceivedInPollingOnEvent", v = 1)
final class OndcTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OndcTicketValidationAnalyticManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OndcTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1(OndcTicketValidationAnalyticManager ondcTicketValidationAnalyticManager, Continuation continuation) {
        super(continuation);
        this.this$0 = ondcTicketValidationAnalyticManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OndcTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1 ondcTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        Map map2;
        String str;
        String str2;
        String str3;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        OndcTicketValidationAnalyticManager ondcTicketValidationAnalyticManager = this.this$0;
        ondcTicketValidationAnalyticManager.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            ondcTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1 = this;
        } else {
            ondcTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1 = new OndcTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1(ondcTicketValidationAnalyticManager, this);
        }
        Object obj2 = ondcTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.label;
        if (i2 == 0) {
            LinkedHashMap linkedHashMapO = d.o(obj2);
            ondcTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$0 = null;
            ondcTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$1 = linkedHashMapO;
            ondcTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$2 = linkedHashMapO;
            ondcTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$3 = ondcTicketValidationAnalyticManager;
            ondcTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$4 = "invalid tito tap in data received in polling";
            ondcTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$5 = null;
            ondcTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.label = 1;
            if (ondcTicketValidationAnalyticManager.J(linkedHashMapO, null, ondcTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            analyticsContract = ondcTicketValidationAnalyticManager;
            map = linkedHashMapO;
            map2 = map;
            str = null;
            str2 = null;
            str3 = "invalid tito tap in data received in polling";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str4 = (String) ondcTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$5;
            String str5 = (String) ondcTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$4;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) ondcTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$3;
            map = (Map) ondcTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$2;
            Map map3 = (Map) ondcTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$1;
            str = (String) ondcTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$0;
            ResultKt.b(obj2);
            str2 = str4;
            str3 = str5;
            analyticsContract = analyticsContract2;
            map2 = map3;
        }
        map.put("reason", str);
        AnalyticsContract.DefaultImpls.a(analyticsContract, str3, str2, map2, null, false, 24);
        return Unit.f17538a;
    }
}
