package app.chalo.multimodalticket.ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.multimodalticket.ui.GroupTicketLegSelectionComponent$handleOnProceedBtnClickedIntent$1", f = "GroupTicketLegSelectionComponent.kt", l = {128, 133}, m = "invokeSuspend", v = 1)
final class GroupTicketLegSelectionComponent$handleOnProceedBtnClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ GroupTicketLegSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupTicketLegSelectionComponent$handleOnProceedBtnClickedIntent$1(GroupTicketLegSelectionComponent groupTicketLegSelectionComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = groupTicketLegSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GroupTicketLegSelectionComponent$handleOnProceedBtnClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GroupTicketLegSelectionComponent$handleOnProceedBtnClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r6.M0(r1, app.chalo.providers.toast.ToastLength.SHORT, r5) == r0) goto L21;
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
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r6)
            goto L53
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.ResultKt.b(r6)     // Catch: java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L44
            goto L38
        L1c:
            r6 = move-exception
            goto L61
        L1e:
            kotlin.ResultKt.b(r6)
            app.chalo.multimodalticket.ui.GroupTicketLegSelectionComponent r6 = r5.this$0
            z20 r1 = new z20
            r4 = 29
            r1.<init>(r4)
            r6.E0(r1)
            app.chalo.multimodalticket.ui.GroupTicketLegSelectionComponent r6 = r5.this$0     // Catch: java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L44
            r5.label = r3     // Catch: java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L44
            java.lang.Object r6 = app.chalo.multimodalticket.ui.GroupTicketLegSelectionComponent.G0(r6, r5)     // Catch: java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L44
            if (r6 != r0) goto L38
            goto L52
        L38:
            app.chalo.multimodalticket.ui.GroupTicketLegSelectionComponent r6 = r5.this$0     // Catch: java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L44
            u60 r1 = new u60     // Catch: java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L44
            r3 = 0
            r1.<init>(r3)     // Catch: java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L44
            r6.E0(r1)     // Catch: java.util.concurrent.CancellationException -> L1c java.lang.Exception -> L44
            goto L5e
        L44:
            app.chalo.multimodalticket.ui.GroupTicketLegSelectionComponent r6 = r5.this$0
            app.chalo.providers.stringprovider.StringEnum r1 = app.chalo.providers.stringprovider.StringEnum.SOMETHING_WENT_WRONG
            r5.label = r2
            app.chalo.providers.toast.ToastLength r2 = app.chalo.providers.toast.ToastLength.SHORT
            java.lang.Object r6 = r6.M0(r1, r2, r5)
            if (r6 != r0) goto L53
        L52:
            return r0
        L53:
            app.chalo.multimodalticket.ui.GroupTicketLegSelectionComponent r6 = r5.this$0
            u60 r0 = new u60
            r1 = 1
            r0.<init>(r1)
            r6.E0(r0)
        L5e:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        L61:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.multimodalticket.ui.GroupTicketLegSelectionComponent$handleOnProceedBtnClickedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
