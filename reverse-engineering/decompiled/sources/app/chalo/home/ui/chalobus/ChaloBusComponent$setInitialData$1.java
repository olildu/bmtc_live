package app.chalo.home.ui.chalobus;

import app.chalo.constants.Source;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.homescreen.data.model.app.ChaloBusAppModel;
import defpackage.u;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusComponent$setInitialData$1", f = "ChaloBusComponent.kt", l = {1066}, m = "invokeSuspend", v = 1)
final class ChaloBusComponent$setInitialData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChaloBusAppModel $chaloBusScreenData;
    int label;
    final /* synthetic */ ChaloBusComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusComponent$setInitialData$1(ChaloBusComponent chaloBusComponent, ChaloBusAppModel chaloBusAppModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloBusComponent;
        this.$chaloBusScreenData = chaloBusAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloBusComponent$setInitialData$1(this.this$0, this.$chaloBusScreenData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBusComponent$setInitialData$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChaloBusComponent$setInitialData$1 chaloBusComponent$setInitialData$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            HomeScreenAnalyticsHelper.DefaultImpls.a(this.this$0.r, "chalo bus page rendered", null, Source.CHALO_BUS_SCREEN_TAB, 14);
            ChaloBusComponent chaloBusComponent = this.this$0;
            this.label = 1;
            chaloBusComponent$setInitialData$1 = this;
            obj = ChaloBusComponent.S0(chaloBusComponent, null, null, false, null, null, chaloBusComponent$setInitialData$1, 31);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            chaloBusComponent$setInitialData$1 = this;
        }
        ChaloBusComponent chaloBusComponent2 = chaloBusComponent$setInitialData$1.this$0;
        chaloBusComponent2.E0(new u(10, chaloBusComponent2, chaloBusComponent$setInitialData$1.$chaloBusScreenData, (List) obj));
        return Unit.f17538a;
    }
}
