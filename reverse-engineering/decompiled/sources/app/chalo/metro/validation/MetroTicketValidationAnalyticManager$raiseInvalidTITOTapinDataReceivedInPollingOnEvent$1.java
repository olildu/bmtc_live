package app.chalo.metro.validation;

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
@DebugMetadata(c = "app.chalo.metro.validation.MetroTicketValidationAnalyticManager", f = "MetroTicketValidationAnalyticManager.kt", l = {310}, m = "raiseInvalidTITOTapinDataReceivedInPollingOnEvent", v = 1)
final class MetroTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MetroTicketValidationAnalyticManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetroTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1(MetroTicketValidationAnalyticManager metroTicketValidationAnalyticManager, Continuation continuation) {
        super(continuation);
        this.this$0 = metroTicketValidationAnalyticManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MetroTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1 metroTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        Map map2;
        String str;
        String str2;
        String str3;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        MetroTicketValidationAnalyticManager metroTicketValidationAnalyticManager = this.this$0;
        metroTicketValidationAnalyticManager.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            metroTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1 = this;
        } else {
            metroTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1 = new MetroTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1(metroTicketValidationAnalyticManager, this);
        }
        Object obj2 = metroTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.label;
        if (i2 == 0) {
            LinkedHashMap linkedHashMapO = d.o(obj2);
            metroTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$0 = null;
            metroTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$1 = linkedHashMapO;
            metroTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$2 = linkedHashMapO;
            metroTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$3 = metroTicketValidationAnalyticManager;
            metroTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$4 = "invalid tito tap in data received in polling";
            metroTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$5 = null;
            metroTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.label = 1;
            if (metroTicketValidationAnalyticManager.J(linkedHashMapO, null, metroTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            analyticsContract = metroTicketValidationAnalyticManager;
            map = linkedHashMapO;
            map2 = map;
            str = null;
            str2 = null;
            str3 = "invalid tito tap in data received in polling";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str4 = (String) metroTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$5;
            String str5 = (String) metroTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$4;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) metroTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$3;
            map = (Map) metroTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$2;
            Map map3 = (Map) metroTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$1;
            str = (String) metroTicketValidationAnalyticManager$raiseInvalidTITOTapinDataReceivedInPollingOnEvent$1.L$0;
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
