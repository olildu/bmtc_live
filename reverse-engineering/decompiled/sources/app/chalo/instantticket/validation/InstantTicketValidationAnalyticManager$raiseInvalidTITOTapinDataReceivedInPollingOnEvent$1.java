package app.chalo.instantticket.validation;

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
@DebugMetadata(c = "app.chalo.instantticket.validation.InstantTicketValidationAnalyticManager", f = "InstantTicketValidationAnalyticManager.kt", l = {297}, m = "raiseInvalidTITOTapinDataReceivedInPollingOnEvent", v = 1)
final class InstantTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InstantTicketValidationAnalyticManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1(InstantTicketValidationAnalyticManager instantTicketValidationAnalyticManager, Continuation continuation) {
        super(continuation);
        this.this$0 = instantTicketValidationAnalyticManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InstantTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1 instantTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        Map map2;
        String str;
        String str2;
        String str3;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        InstantTicketValidationAnalyticManager instantTicketValidationAnalyticManager = this.this$0;
        instantTicketValidationAnalyticManager.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            instantTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1 = this;
        } else {
            instantTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1 = new InstantTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1(instantTicketValidationAnalyticManager, this);
        }
        Object obj2 = instantTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.label;
        if (i2 == 0) {
            LinkedHashMap linkedHashMapO = d.o(obj2);
            instantTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$0 = null;
            instantTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$1 = linkedHashMapO;
            instantTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$2 = linkedHashMapO;
            instantTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$3 = instantTicketValidationAnalyticManager;
            instantTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$4 = "invalid tito tap in data received in polling";
            instantTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$5 = null;
            instantTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.label = 1;
            if (instantTicketValidationAnalyticManager.J(linkedHashMapO, null, instantTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            analyticsContract = instantTicketValidationAnalyticManager;
            map = linkedHashMapO;
            map2 = map;
            str = null;
            str2 = null;
            str3 = "invalid tito tap in data received in polling";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str4 = (String) instantTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$5;
            String str5 = (String) instantTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$4;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) instantTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$3;
            map = (Map) instantTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$2;
            Map map3 = (Map) instantTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$1;
            str = (String) instantTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$0;
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
