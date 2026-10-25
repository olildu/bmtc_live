package app.chalo.productsummary.ui.pass;

import app.chalo.home.domain.ChaloUserBookingType;
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
@DebugMetadata(c = "app.chalo.productsummary.ui.pass.PassSummaryComponent$handleProductActivation$1", f = "PassSummaryComponent.kt", l = {327, 329, 339, 350}, m = "invokeSuspend", v = 1)
final class PassSummaryComponent$handleProductActivation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChaloUserBookingType $bookingType;
    Object L$0;
    int label;
    final /* synthetic */ PassSummaryComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassSummaryComponent$handleProductActivation$1(PassSummaryComponent passSummaryComponent, ChaloUserBookingType chaloUserBookingType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = passSummaryComponent;
        this.$bookingType = chaloUserBookingType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassSummaryComponent$handleProductActivation$1(this.this$0, this.$bookingType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PassSummaryComponent$handleProductActivation$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (app.chalo.productsummary.ui.pass.PassSummaryComponent.F0(r1, r7, r2, r6) == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
    
        if (app.chalo.productsummary.ui.pass.PassSummaryComponent.G0(r1, r7, r6) == r0) goto L46;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 4
            r3 = 3
            r4 = 1
            r5 = 2
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L28
            if (r1 == r5) goto L23
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r0 = r6.L$0
            app.chalo.providers.toast.KotlinToastManager r0 = (app.chalo.providers.toast.KotlinToastManager) r0
            kotlin.ResultKt.b(r7)
            goto La1
        L1b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L23:
            kotlin.ResultKt.b(r7)
            goto Lb2
        L28:
            kotlin.ResultKt.b(r7)
            goto L3f
        L2c:
            kotlin.ResultKt.b(r7)
            app.chalo.productsummary.ui.pass.PassSummaryComponent r7 = r6.this$0
            app.chalo.home.domain.ActivateProductIfRequiredUseCase r7 = r7.n
            app.chalo.home.domain.ChaloUserBookingType r1 = r6.$bookingType
            r6.label = r4
            java.lang.Object r7 = r7.d(r1, r6)
            if (r7 != r0) goto L3f
            goto Lb1
        L3f:
            app.chalo.utils.ChaloUseCaseResult r7 = (app.chalo.utils.ChaloUseCaseResult) r7
            boolean r1 = r7 instanceof app.chalo.utils.ChaloUseCaseResult.Failure
            if (r1 == 0) goto L58
            app.chalo.productsummary.ui.pass.PassSummaryComponent r1 = r6.this$0
            app.chalo.utils.ChaloUseCaseResult$Failure r7 = (app.chalo.utils.ChaloUseCaseResult.Failure) r7
            java.lang.Object r7 = r7.f10418a
            app.chalo.home.domain.ProductActivationFailureReason r7 = (app.chalo.home.domain.ProductActivationFailureReason) r7
            app.chalo.home.domain.ChaloUserBookingType r2 = r6.$bookingType
            r6.label = r5
            java.lang.Object r7 = app.chalo.productsummary.ui.pass.PassSummaryComponent.F0(r1, r7, r2, r6)
            if (r7 != r0) goto Lb2
            goto Lb1
        L58:
            boolean r7 = r7 instanceof app.chalo.utils.ChaloUseCaseResult.Success
            if (r7 == 0) goto Lb5
            app.chalo.home.domain.ChaloUserBookingType r7 = r6.$bookingType
            boolean r1 = r7 instanceof app.chalo.home.domain.ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking
            if (r1 != 0) goto La7
            boolean r1 = r7 instanceof app.chalo.home.domain.ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking
            if (r1 == 0) goto L67
            goto La7
        L67:
            boolean r1 = r7 instanceof app.chalo.home.domain.ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking
            if (r1 != 0) goto L7e
            boolean r1 = r7 instanceof app.chalo.home.domain.ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking
            if (r1 != 0) goto L7e
            boolean r1 = r7 instanceof app.chalo.home.domain.ChaloUserBookingType.CardBooking
            if (r1 != 0) goto L7e
            boolean r7 = r7 instanceof app.chalo.home.domain.ChaloUserBookingType.TicketBooking
            if (r7 == 0) goto L78
            goto L7e
        L78:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L7e:
            app.chalo.productsummary.ui.pass.PassSummaryComponent r7 = r6.this$0
            do0 r1 = new do0
            r3 = 24
            r1.<init>(r3)
            r7.E0(r1)
            app.chalo.productsummary.ui.pass.PassSummaryComponent r7 = r6.this$0
            app.chalo.providers.toast.KotlinToastManager r1 = r7.s
            app.chalo.providers.stringprovider.StringProvider r7 = r7.m
            app.chalo.providers.stringprovider.StringEnum r3 = app.chalo.providers.stringprovider.StringEnum.SOMETHING_WENT_WRONG
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r6.L$0 = r1
            r6.label = r2
            java.lang.Object r7 = r7.b(r3, r4, r6)
            if (r7 != r0) goto La0
            goto Lb1
        La0:
            r0 = r1
        La1:
            java.lang.String r7 = (java.lang.String) r7
            app.chalo.providers.toast.KotlinToastManagerKt.b(r0, r7)
            goto Lb2
        La7:
            app.chalo.productsummary.ui.pass.PassSummaryComponent r1 = r6.this$0
            r6.label = r3
            java.lang.Object r7 = app.chalo.productsummary.ui.pass.PassSummaryComponent.G0(r1, r7, r6)
            if (r7 != r0) goto Lb2
        Lb1:
            return r0
        Lb2:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        Lb5:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productsummary.ui.pass.PassSummaryComponent$handleProductActivation$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
