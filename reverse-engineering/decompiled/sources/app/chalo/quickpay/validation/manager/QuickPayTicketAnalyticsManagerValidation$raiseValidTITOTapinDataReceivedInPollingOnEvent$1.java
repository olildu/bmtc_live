package app.chalo.quickpay.validation.manager;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.BasicInfoContract;
import app.chalo.notification.models.TITOTapInNotificationEvent;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import java.util.LinkedHashMap;
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
@DebugMetadata(c = "app.chalo.quickpay.validation.manager.QuickPayTicketAnalyticsManagerValidation", f = "QuickPayTicketAnalyticsManagerValidation.kt", l = {300, 301}, m = "raiseValidTITOTapinDataReceivedInPollingOnEvent", v = 1)
final class QuickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ QuickPayTicketAnalyticsManagerValidation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1(QuickPayTicketAnalyticsManagerValidation quickPayTicketAnalyticsManagerValidation, Continuation continuation) {
        super(continuation);
        this.this$0 = quickPayTicketAnalyticsManagerValidation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        QuickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1 quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1;
        Map map;
        TITOTapInNotificationEvent tITOTapInNotificationEvent;
        ProductValidationData productValidationData;
        String str;
        AnalyticsContract analyticsContract;
        String str2;
        Map map2;
        String str3;
        String str4;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        QuickPayTicketAnalyticsManagerValidation quickPayTicketAnalyticsManagerValidation = this.this$0;
        quickPayTicketAnalyticsManagerValidation.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1 = this;
        } else {
            quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1 = new QuickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1(quickPayTicketAnalyticsManagerValidation, this);
        }
        Object objC = quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            Map mapD = MapsKt.d();
            BasicInfoContract basicInfoContract = quickPayTicketAnalyticsManagerValidation.b;
            quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$0 = null;
            quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$1 = quickPayTicketAnalyticsManagerValidation;
            quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$2 = "valid tito tap in data received in polling";
            quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$3 = null;
            quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$4 = null;
            quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$5 = mapD;
            quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.label = 1;
            objC = basicInfoContract.c(quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1);
            if (objC != coroutineSingletons) {
                map = mapD;
                tITOTapInNotificationEvent = null;
                productValidationData = null;
                str = "valid tito tap in data received in polling";
                analyticsContract = quickPayTicketAnalyticsManagerValidation;
                str2 = null;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            Map map3 = (Map) quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$5;
            TITOTapInNotificationEvent tITOTapInNotificationEvent2 = (TITOTapInNotificationEvent) quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$4;
            str2 = (String) quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$3;
            str = (String) quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$1;
            productValidationData = (ProductValidationData) quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$0;
            ResultKt.b(objC);
            map = map3;
            analyticsContract = analyticsContract2;
            tITOTapInNotificationEvent = tITOTapInNotificationEvent2;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str5 = (String) quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$3;
            String str6 = (String) quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$2;
            analyticsContract = (AnalyticsContract) quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$1;
            Map map4 = (Map) quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$0;
            ResultKt.b(objC);
            str3 = str5;
            map2 = map4;
            str4 = str6;
        }
        AnalyticsContract.DefaultImpls.a(analyticsContract, str4, str3, map2, null, false, 24);
        return Unit.f17538a;
        LinkedHashMap linkedHashMapU = MapsKt.u(tITOTapInNotificationEvent.b(map, ((Number) objC).longValue()));
        quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$0 = linkedHashMapU;
        quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$1 = analyticsContract;
        quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$2 = str;
        quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$3 = str2;
        quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$4 = null;
        quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.L$5 = null;
        quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1.label = 2;
        if (quickPayTicketAnalyticsManagerValidation.J(linkedHashMapU, productValidationData, quickPayTicketAnalyticsManagerValidation$raiseValidTITOTapinDataReceivedInPollingOnEvent$1) != coroutineSingletons) {
            map2 = linkedHashMapU;
            str3 = str2;
            str4 = str;
            AnalyticsContract.DefaultImpls.a(analyticsContract, str4, str3, map2, null, false, 24);
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }
}
