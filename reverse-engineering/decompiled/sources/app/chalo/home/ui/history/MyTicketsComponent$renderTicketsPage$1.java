package app.chalo.home.ui.history;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.history.MyTicketsComponent$renderTicketsPage$1", f = "MyTicketsComponent.kt", l = {TypedValues.PositionType.TYPE_PERCENT_WIDTH, 514}, m = "invokeSuspend", v = 1)
final class MyTicketsComponent$renderTicketsPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MyTicketsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTicketsComponent$renderTicketsPage$1(MyTicketsComponent myTicketsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = myTicketsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyTicketsComponent$renderTicketsPage$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyTicketsComponent$renderTicketsPage$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r6.collect(r1, r5) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r6)
            goto L65
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.ResultKt.b(r6)
            goto L33
        L1c:
            kotlin.ResultKt.b(r6)
            app.chalo.home.ui.history.MyTicketsComponent r6 = r5.this$0
            app.chalo.home.domain.GetAllRequestedBookedProductsUseCase r6 = r6.l
            r1 = 0
            java.util.Set r1 = app.chalo.home.ui.history.MyTicketsComponent.g1(r1)
            r5.label = r3
            r3 = 0
            r4 = 6
            java.lang.Object r6 = app.chalo.home.domain.GetAllRequestedBookedProductsUseCase.l(r6, r1, r3, r5, r4)
            if (r6 != r0) goto L33
            goto L64
        L33:
            app.chalo.utils.ChaloUseCaseResult r6 = (app.chalo.utils.ChaloUseCaseResult) r6
            boolean r1 = r6 instanceof app.chalo.utils.ChaloUseCaseResult.Failure
            if (r1 == 0) goto L41
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.f17557a
            kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 r1 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2
            r1.<init>(r6)
            goto L4c
        L41:
            boolean r1 = r6 instanceof app.chalo.utils.ChaloUseCaseResult.Success
            if (r1 == 0) goto L68
            app.chalo.utils.ChaloUseCaseResult$Success r6 = (app.chalo.utils.ChaloUseCaseResult.Success) r6
            java.lang.Object r6 = r6.f10419a
            r1 = r6
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
        L4c:
            app.chalo.home.ui.history.MyTicketsComponent$renderTicketsPage$1$invokeSuspend$$inlined$map$1 r6 = new app.chalo.home.ui.history.MyTicketsComponent$renderTicketsPage$1$invokeSuspend$$inlined$map$1
            r6.<init>()
            kotlinx.coroutines.flow.Flow r6 = kotlinx.coroutines.flow.FlowKt.m(r6)
            app.chalo.home.ui.history.MyTicketsComponent$renderTicketsPage$1$2 r1 = new app.chalo.home.ui.history.MyTicketsComponent$renderTicketsPage$1$2
            app.chalo.home.ui.history.MyTicketsComponent r3 = r5.this$0
            r1.<init>()
            r5.label = r2
            java.lang.Object r6 = r6.collect(r1, r5)
            if (r6 != r0) goto L65
        L64:
            return r0
        L65:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        L68:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.history.MyTicketsComponent$renderTicketsPage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
