package app.chalo.ondc.validation;

import app.chalo.analytics.contract.AnalyticsContract;
import java.util.Map;
import kotlin.Metadata;
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
@DebugMetadata(c = "app.chalo.ondc.validation.OndcTicketValidationAnalyticManager", f = "OndcTicketValidationAnalyticManager.kt", l = {310}, m = "raiseValidTITOTapinDataReceivedInPollingOnEvent", v = 1)
final class OndcTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1 extends ContinuationImpl {
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
    public OndcTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1(OndcTicketValidationAnalyticManager ondcTicketValidationAnalyticManager, Continuation continuation) {
        super(continuation);
        this.this$0 = ondcTicketValidationAnalyticManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OndcTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1 ondcTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        OndcTicketValidationAnalyticManager ondcTicketValidationAnalyticManager = this.this$0;
        ondcTicketValidationAnalyticManager.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            ondcTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1 = this;
        } else {
            ondcTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1 = new OndcTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1(ondcTicketValidationAnalyticManager, this);
        }
        Object obj2 = ondcTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            MapsKt.d();
            ondcTicketValidationAnalyticManager.b.j();
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str = (String) ondcTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$5;
        String str2 = (String) ondcTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$4;
        AnalyticsContract analyticsContract = (AnalyticsContract) ondcTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$3;
        Map map = (Map) ondcTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$2;
        Map map2 = (Map) ondcTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$1;
        Map map3 = (Map) ondcTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$0;
        ResultKt.b(obj2);
        map.putAll(map3);
        AnalyticsContract.DefaultImpls.a(analyticsContract, str2, str, map2, null, false, 24);
        return Unit.f17538a;
    }
}
