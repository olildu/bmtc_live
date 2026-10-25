package app.chalo.home.ui.chalobus;

import app.chalo.models.SuperPassSubTypes;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.PbBulkBookingRideDetailsArgs;
import app.chalo.superpass.data.models.entities.SuperPassSubTypeKt;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusComponent$handlePassHistoryItemClickedIntent$1", f = "ChaloBusComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class ChaloBusComponent$handlePassHistoryItemClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChaloBusPassHistory $pass;
    int label;
    final /* synthetic */ ChaloBusComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusComponent$handlePassHistoryItemClickedIntent$1(ChaloBusComponent chaloBusComponent, ChaloBusPassHistory chaloBusPassHistory, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloBusComponent;
        this.$pass = chaloBusPassHistory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloBusComponent$handlePassHistoryItemClickedIntent$1(this.this$0, this.$pass, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ChaloBusComponent$handlePassHistoryItemClickedIntent$1 chaloBusComponent$handlePassHistoryItemClickedIntent$1 = (ChaloBusComponent$handlePassHistoryItemClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        chaloBusComponent$handlePassHistoryItemClickedIntent$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        ChaloNavigationManager chaloNavigationManager = this.this$0.t;
        ChaloBusPassHistory chaloBusPassHistory = this.$pass;
        String str = chaloBusPassHistory.b;
        SuperPassSubTypes superPassSubTypesA = SuperPassSubTypeKt.a(chaloBusPassHistory.j);
        ChaloBusPassHistory chaloBusPassHistory2 = this.$pass;
        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new PbBulkBookingRideDetailsArgs(chaloBusPassHistory2.c, superPassSubTypesA, str, chaloBusPassHistory2.f3249a), null, null, 6));
        return Unit.f17538a;
    }
}
