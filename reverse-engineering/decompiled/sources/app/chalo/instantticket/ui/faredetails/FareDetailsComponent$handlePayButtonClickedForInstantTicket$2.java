package app.chalo.instantticket.ui.faredetails;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import app.chalo.extensions.StringExtsKt;
import app.chalo.instantticket.data.model.api.response.ValidateInstantTicketFareResponseAppModel;
import app.chalo.instantticket.data.model.app.request.PassengerDetailData;
import app.chalo.instantticket.domain.ValidateInstantTicketFareUseCase;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsIntent;
import app.chalo.productbooking.common.data.error.ProductBookingDataSourceError;
import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.hq0;
import defpackage.z20;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.instantticket.ui.faredetails.FareDetailsComponent$handlePayButtonClickedForInstantTicket$2", f = "FareDetailsComponent.kt", l = {993, 1013, AnalyticsListener.EVENT_DRM_KEYS_REMOVED}, m = "invokeSuspend", v = 1)
final class FareDetailsComponent$handlePayButtonClickedForInstantTicket$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ FareDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FareDetailsComponent$handlePayButtonClickedForInstantTicket$2(FareDetailsComponent fareDetailsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fareDetailsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FareDetailsComponent$handlePayButtonClickedForInstantTicket$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FareDetailsComponent$handlePayButtonClickedForInstantTicket$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FareDetailsComponent$handlePayButtonClickedForInstantTicket$2 fareDetailsComponent$handlePayButtonClickedForInstantTicket$2;
        KotlinToastManager kotlinToastManager;
        String str;
        KotlinToastManager kotlinToastManager2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FareDetailsComponent fareDetailsComponent = this.this$0;
            ValidateInstantTicketFareUseCase validateInstantTicketFareUseCase = fareDetailsComponent.l;
            long jI0 = FareDetailsComponent.I0(fareDetailsComponent);
            Map mapU0 = FareDetailsComponent.U0(this.this$0);
            ArrayList arrayList = new ArrayList(mapU0.size());
            for (Map.Entry entry : mapU0.entrySet()) {
                arrayList.add(new PassengerDetailData(((Number) entry.getValue()).intValue(), (String) entry.getKey(), null));
            }
            FareDetailsData fareDetailsData = this.this$0.M;
            this.label = 1;
            fareDetailsComponent$handlePayButtonClickedForInstantTicket$2 = this;
            obj = validateInstantTicketFareUseCase.a(jI0, arrayList, fareDetailsData, fareDetailsComponent$handlePayButtonClickedForInstantTicket$2);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                kotlinToastManager2 = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                hq0.s(kotlinToastManager2, (String) obj);
                return Unit.f17538a;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$1;
            kotlinToastManager = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            hq0.s(kotlinToastManager, StringExtsKt.b(str, (String) obj));
            return Unit.f17538a;
        }
        ResultKt.b(obj);
        fareDetailsComponent$handlePayButtonClickedForInstantTicket$2 = this;
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            if (((ValidateInstantTicketFareResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f3879a) {
                fareDetailsComponent$handlePayButtonClickedForInstantTicket$2.this$0.E0(new z20(1));
                fareDetailsComponent$handlePayButtonClickedForInstantTicket$2.this$0.Z0(FareDetailsIntent.InitiateOnlinePaymentIntent.f3934a);
            } else {
                fareDetailsComponent$handlePayButtonClickedForInstantTicket$2.this$0.E0(new z20(2));
                FareDetailsComponent fareDetailsComponent2 = fareDetailsComponent$handlePayButtonClickedForInstantTicket$2.this$0;
                KotlinToastManager kotlinToastManager3 = fareDetailsComponent2.z;
                fareDetailsComponent$handlePayButtonClickedForInstantTicket$2.L$0 = kotlinToastManager3;
                fareDetailsComponent$handlePayButtonClickedForInstantTicket$2.label = 2;
                obj = fareDetailsComponent2.m.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                if (obj != coroutineSingletons) {
                    kotlinToastManager2 = kotlinToastManager3;
                    hq0.s(kotlinToastManager2, (String) obj);
                }
            }
            return Unit.f17538a;
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        FareDetailsComponent fareDetailsComponent3 = fareDetailsComponent$handlePayButtonClickedForInstantTicket$2.this$0;
        fareDetailsComponent3.I = false;
        ProductBookingDataSourceError productBookingDataSourceError = (ProductBookingDataSourceError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
        fareDetailsComponent3.E0(new z20(3));
        FareDetailsComponent fareDetailsComponent4 = fareDetailsComponent$handlePayButtonClickedForInstantTicket$2.this$0;
        KotlinToastManager kotlinToastManager4 = fareDetailsComponent4.z;
        String str2 = productBookingDataSourceError.f8097a;
        StringProvider stringProvider = fareDetailsComponent4.m;
        StringEnum stringEnum = StringEnum.GENERIC_ERROR_WITH_CODE;
        Object[] objArr = {new Integer(productBookingDataSourceError.a())};
        fareDetailsComponent$handlePayButtonClickedForInstantTicket$2.L$0 = kotlinToastManager4;
        fareDetailsComponent$handlePayButtonClickedForInstantTicket$2.L$1 = str2;
        fareDetailsComponent$handlePayButtonClickedForInstantTicket$2.label = 3;
        obj = stringProvider.b(stringEnum, objArr, this);
        if (obj != coroutineSingletons) {
            kotlinToastManager = kotlinToastManager4;
            str = str2;
            hq0.s(kotlinToastManager, StringExtsKt.b(str, (String) obj));
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }
}
