package app.chalo.metro.validation;

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
@DebugMetadata(c = "app.chalo.metro.validation.MetroTicketValidationAnalyticManager", f = "MetroTicketValidationAnalyticManager.kt", l = {295}, m = "raiseValidTITOTapinDataReceivedInPollingOnEvent", v = 1)
final class MetroTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1 extends ContinuationImpl {
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
    public MetroTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1(MetroTicketValidationAnalyticManager metroTicketValidationAnalyticManager, Continuation continuation) {
        super(continuation);
        this.this$0 = metroTicketValidationAnalyticManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MetroTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1 metroTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        MetroTicketValidationAnalyticManager metroTicketValidationAnalyticManager = this.this$0;
        metroTicketValidationAnalyticManager.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            metroTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1 = this;
        } else {
            metroTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1 = new MetroTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1(metroTicketValidationAnalyticManager, this);
        }
        Object obj2 = metroTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            MapsKt.d();
            metroTicketValidationAnalyticManager.b.j();
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str = (String) metroTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$5;
        String str2 = (String) metroTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$4;
        AnalyticsContract analyticsContract = (AnalyticsContract) metroTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$3;
        Map map = (Map) metroTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$2;
        Map map2 = (Map) metroTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$1;
        Map map3 = (Map) metroTicketValidationAnalyticManager$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$0;
        ResultKt.b(obj2);
        map.putAll(map3);
        AnalyticsContract.DefaultImpls.a(analyticsContract, str2, str, map2, null, false, 24);
        return Unit.f17538a;
    }
}
