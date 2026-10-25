package app.chalo.premiumbus.bulkbookingridedetails.ui;

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
@DebugMetadata(c = "app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent$handlePassDateChangeConfirmationDialog$2", f = "PbBulkBookingRideDetailsComponent.kt", l = {279, 296}, m = "invokeSuspend", v = 1)
final class PbBulkBookingRideDetailsComponent$handlePassDateChangeConfirmationDialog$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PbBulkBookingRideDetailsViewIntent.PassDateChangeConfirmationDialog $intent;
    final /* synthetic */ String $passId;
    Object L$0;
    int label;
    final /* synthetic */ PbBulkBookingRideDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PbBulkBookingRideDetailsComponent$handlePassDateChangeConfirmationDialog$2(PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent, String str, PbBulkBookingRideDetailsViewIntent.PassDateChangeConfirmationDialog passDateChangeConfirmationDialog, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pbBulkBookingRideDetailsComponent;
        this.$passId = str;
        this.$intent = passDateChangeConfirmationDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PbBulkBookingRideDetailsComponent$handlePassDateChangeConfirmationDialog$2(this.this$0, this.$passId, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PbBulkBookingRideDetailsComponent$handlePassDateChangeConfirmationDialog$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        if (r0 == r6) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            r16 = this;
            r5 = r16
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r5.label
            r7 = 1
            r8 = 2
            if (r0 == 0) goto L27
            if (r0 == r7) goto L21
            if (r0 != r8) goto L19
            java.lang.Object r0 = r5.L$0
            app.chalo.providers.toast.KotlinToastManager r0 = (app.chalo.providers.toast.KotlinToastManager) r0
            kotlin.ResultKt.b(r17)
            r2 = r0
            r0 = r17
            goto L75
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L21:
            kotlin.ResultKt.b(r17)
            r0 = r17
            goto L3e
        L27:
            kotlin.ResultKt.b(r17)
            app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent r0 = r5.this$0
            app.chalo.premiumbus.bulkbookingridedetails.domain.UpdatePassStartDateChangesUseCase r0 = r0.C
            java.lang.String r1 = r5.$passId
            app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsViewIntent$PassDateChangeConfirmationDialog r2 = r5.$intent
            long r2 = r2.f6929a
            r5.label = r7
            r4 = 1
            java.lang.Object r0 = r0.a(r1, r2, r4, r5)
            if (r0 != r6) goto L3e
            goto L74
        L3e:
            app.chalo.utils.ChaloUseCaseResult r0 = (app.chalo.utils.ChaloUseCaseResult) r0
            boolean r1 = r0 instanceof app.chalo.utils.ChaloUseCaseResult.Failure
            if (r1 == 0) goto L7b
            app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent r1 = r5.this$0
            v00 r2 = new v00
            app.chalo.utils.ChaloUseCaseResult$Failure r0 = (app.chalo.utils.ChaloUseCaseResult.Failure) r0
            r2.<init>(r0, r8)
            r1.E0(r2)
            app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent r1 = r5.this$0
            app.chalo.providers.toast.KotlinToastManager r2 = r1.x
            app.chalo.providers.stringprovider.StringProvider r1 = r1.r
            app.chalo.providers.stringprovider.StringEnum r3 = app.chalo.providers.stringprovider.StringEnum.SOMETHING_WENT_WRONG_WITH_ERROR_CODE
            java.lang.Object r0 = r0.f10418a
            app.chalo.premiumbus.bulkbookingridedetails.domain.UpdatePassStartDateError r0 = (app.chalo.premiumbus.bulkbookingridedetails.domain.UpdatePassStartDateError) r0
            int r0 = r0.getF6902a()
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r0)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r7 = 0
            r0[r7] = r4
            r5.L$0 = r2
            r5.label = r8
            java.lang.Object r0 = r1.b(r3, r0, r5)
            if (r0 != r6) goto L75
        L74:
            return r6
        L75:
            java.lang.String r0 = (java.lang.String) r0
            app.chalo.providers.toast.KotlinToastManagerKt.b(r2, r0)
            goto Lbc
        L7b:
            boolean r1 = r0 instanceof app.chalo.utils.ChaloUseCaseResult.Success
            if (r1 == 0) goto Lbf
            app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent r1 = r5.this$0
            mq0 r2 = new mq0
            r3 = 19
            r2.<init>(r3)
            r1.E0(r2)
            app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent r10 = r5.this$0
            java.lang.String r11 = r5.$passId
            app.chalo.utils.ChaloUseCaseResult$Success r0 = (app.chalo.utils.ChaloUseCaseResult.Success) r0
            java.lang.Object r0 = r0.f10419a
            app.chalo.superpass.data.models.entities.SuperPass r0 = (app.chalo.superpass.data.models.entities.SuperPass) r0
            app.chalo.superpass.data.models.entities.SuperPassProperties r0 = r0.f9560a
            app.chalo.superpass.data.models.entities.SuperPassSubType r0 = r0.c
            app.chalo.models.SuperPassSubTypes r12 = app.chalo.superpass.data.models.entities.SuperPassSubTypeKt.a(r0)
            app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent r0 = r5.this$0
            kotlinx.coroutines.flow.StateFlow r0 = r0.f
            java.lang.Object r0 = r0.getValue()
            app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsViewState r0 = (app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsViewState) r0
            boolean r14 = r0.s
            kotlinx.coroutines.internal.ContextScope r0 = r10.j
            app.chalo.providers.CoroutineContextProvider r1 = r10.t
            kotlinx.coroutines.scheduling.DefaultScheduler r1 = r1.getDefault()
            app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent$startPassInfoAndBookingFetchOperations$1 r9 = new app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent$startPassInfoAndBookingFetchOperations$1
            r15 = 0
            r13 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r2 = 0
            kotlinx.coroutines.BuildersKt.d(r0, r1, r2, r9, r8)
        Lbc:
            kotlin.Unit r0 = kotlin.Unit.f17538a
            return r0
        Lbf:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent$handlePassDateChangeConfirmationDialog$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
