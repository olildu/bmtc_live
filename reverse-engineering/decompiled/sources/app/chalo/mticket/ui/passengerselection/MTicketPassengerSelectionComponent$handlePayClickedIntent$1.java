package app.chalo.mticket.ui.passengerselection;

import androidx.datastore.preferences.core.Preferences;
import app.chalo.datastore.LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import defpackage.ud;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionComponent$handlePayClickedIntent$1", f = "MTicketPassengerSelectionComponent.kt", l = {245, 258}, m = "invokeSuspend", v = 1)
final class MTicketPassengerSelectionComponent$handlePayClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MTicketPassengerSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTicketPassengerSelectionComponent$handlePayClickedIntent$1(MTicketPassengerSelectionComponent mTicketPassengerSelectionComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mTicketPassengerSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MTicketPassengerSelectionComponent$handlePayClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MTicketPassengerSelectionComponent$handlePayClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 localDataStore$getFlowFromLocalDataStore$$inlined$map$1E = this.this$0.r.e(MTicketPassengerSelectionComponent.D);
            this.label = 1;
            obj = FlowKt.v(localDataStore$getFlowFromLocalDataStore$$inlined$map$1E, this);
            if (obj != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel = ((MTicketPassengerSelectionDataState) this.this$0.f.getValue()).f;
        List list2 = null;
        if (singleJourneyTicketAppModel != null && (list = singleJourneyTicketAppModel.C) != null && !list.isEmpty()) {
            list2 = list;
        }
        if (zBooleanValue || list2 == null) {
            MTicketPassengerSelectionComponent mTicketPassengerSelectionComponent = this.this$0;
            this.label = 2;
            return MTicketPassengerSelectionComponent.F0(mTicketPassengerSelectionComponent, this) == coroutineSingletons ? coroutineSingletons : unit;
        }
        MTicketPassengerSelectionComponent mTicketPassengerSelectionComponent2 = this.this$0;
        ud udVar = new ud(list2, 10);
        Preferences.Key key = MTicketPassengerSelectionComponent.D;
        mTicketPassengerSelectionComponent2.E0(udVar);
        return unit;
    }
}
