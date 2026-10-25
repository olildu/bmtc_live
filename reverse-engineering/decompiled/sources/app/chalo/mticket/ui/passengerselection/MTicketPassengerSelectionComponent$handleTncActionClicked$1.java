package app.chalo.mticket.ui.passengerselection;

import androidx.datastore.preferences.core.Preferences;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import app.chalo.datastore.LocalDataStore;
import defpackage.ag0;
import kotlin.Metadata;
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
@DebugMetadata(c = "app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionComponent$handleTncActionClicked$1", f = "MTicketPassengerSelectionComponent.kt", l = {278}, m = "invokeSuspend", v = 1)
final class MTicketPassengerSelectionComponent$handleTncActionClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MTicketPassengerSelectionIntent.TncActionClicked $intent;
    int label;
    final /* synthetic */ MTicketPassengerSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTicketPassengerSelectionComponent$handleTncActionClicked$1(MTicketPassengerSelectionComponent mTicketPassengerSelectionComponent, MTicketPassengerSelectionIntent.TncActionClicked tncActionClicked, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mTicketPassengerSelectionComponent;
        this.$intent = tncActionClicked;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MTicketPassengerSelectionComponent$handleTncActionClicked$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MTicketPassengerSelectionComponent$handleTncActionClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            MTicketPassengerSelectionComponent mTicketPassengerSelectionComponent = this.this$0;
            ag0 ag0Var = new ag0(28);
            Preferences.Key key = MTicketPassengerSelectionComponent.D;
            mTicketPassengerSelectionComponent.E0(ag0Var);
            if (this.$intent.f5752a) {
                LocalDataStore localDataStore = this.this$0.r;
                Preferences.Key key2 = MTicketPassengerSelectionComponent.D;
                Boolean bool = Boolean.TRUE;
                this.label = 1;
                if (localDataStore.g(key2, bool, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                AnalyticsContractImplKt.b(this.this$0.m, "terms cancel", Source.MTICKET_SELECTION_ACTIVITY, null, false, 28);
            }
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        this.this$0.N0(MTicketPassengerSelectionIntent.PayClickedIntent.f5748a);
        return Unit.f17538a;
    }
}
