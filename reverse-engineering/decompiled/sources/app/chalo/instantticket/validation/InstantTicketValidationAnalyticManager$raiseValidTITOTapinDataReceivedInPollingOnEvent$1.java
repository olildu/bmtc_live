package app.chalo.instantticket.validation;

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
@DebugMetadata(c = "app.chalo.instantticket.validation.InstantTicketValidationAnalyticManager", f = "InstantTicketValidationAnalyticManager.kt", l = {282}, m = "raiseValidTITOTapinDataReceivedInPollingOnEvent", v = 1)
final class InstantTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1 extends ContinuationImpl {
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
    public InstantTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1(InstantTicketValidationAnalyticManager instantTicketValidationAnalyticManager, Continuation continuation) {
        super(continuation);
        this.this$0 = instantTicketValidationAnalyticManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InstantTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1 instantTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        InstantTicketValidationAnalyticManager instantTicketValidationAnalyticManager = this.this$0;
        instantTicketValidationAnalyticManager.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            instantTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1 = this;
        } else {
            instantTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1 = new InstantTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1(instantTicketValidationAnalyticManager, this);
        }
        Object obj2 = instantTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            MapsKt.d();
            instantTicketValidationAnalyticManager.b.j();
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str = (String) instantTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$5;
        String str2 = (String) instantTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$4;
        AnalyticsContract analyticsContract = (AnalyticsContract) instantTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$3;
        Map map = (Map) instantTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$2;
        Map map2 = (Map) instantTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$1;
        Map map3 = (Map) instantTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$0;
        ResultKt.b(obj2);
        map.putAll(map3);
        AnalyticsContract.DefaultImpls.a(analyticsContract, str2, str, map2, null, false, 24);
        return Unit.f17538a;
    }
}
