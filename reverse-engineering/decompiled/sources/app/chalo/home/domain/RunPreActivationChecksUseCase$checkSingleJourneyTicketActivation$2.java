package app.chalo.home.domain;

import app.chalo.models.mticketing.MTicket;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lapp/chalo/utils/ChaloUseCaseResult;", "Lapp/chalo/home/domain/ActivationCheckSuccessRemarks;", "Lapp/chalo/home/domain/ProductActivationFailureReason;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.domain.RunPreActivationChecksUseCase$checkSingleJourneyTicketActivation$2", f = "RunPreActivationChecksUseCase.kt", l = {64, EACTags.APPLICATION_IMAGE, EACTags.DEPRECATED}, m = "invokeSuspend", v = 1)
final class RunPreActivationChecksUseCase$checkSingleJourneyTicketActivation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChaloUseCaseResult<ActivationCheckSuccessRemarks, ProductActivationFailureReason>>, Object> {
    final /* synthetic */ MTicket $mTicket;
    int label;
    final /* synthetic */ RunPreActivationChecksUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunPreActivationChecksUseCase$checkSingleJourneyTicketActivation$2(RunPreActivationChecksUseCase runPreActivationChecksUseCase, MTicket mTicket, Continuation continuation) {
        super(2, continuation);
        this.this$0 = runPreActivationChecksUseCase;
        this.$mTicket = mTicket;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RunPreActivationChecksUseCase$checkSingleJourneyTicketActivation$2(this.this$0, this.$mTicket, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RunPreActivationChecksUseCase$checkSingleJourneyTicketActivation$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        if (r7 == r0) goto L31;
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
            app.chalo.home.domain.ProductActivationFailureReason$SingleJourneyTktProductConfigurationNotFound r2 = app.chalo.home.domain.ProductActivationFailureReason.SingleJourneyTktProductConfigurationNotFound.f3075a
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L21
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            kotlin.ResultKt.b(r7)
            goto L7d
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            kotlin.ResultKt.b(r7)
            goto L58
        L21:
            kotlin.ResultKt.b(r7)
            goto L37
        L25:
            kotlin.ResultKt.b(r7)
            app.chalo.home.domain.RunPreActivationChecksUseCase r7 = r6.this$0
            app.chalo.models.mticketing.MTicketUtilsHelper r7 = r7.c
            app.chalo.models.mticketing.MTicket r1 = r6.$mTicket
            r6.label = r5
            java.lang.Object r7 = r7.k(r1, r6)
            if (r7 != r0) goto L37
            goto L7c
        L37:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L47
            app.chalo.utils.ChaloUseCaseResult$Success r7 = new app.chalo.utils.ChaloUseCaseResult$Success
            app.chalo.home.domain.ActivationCheckSuccessRemarks r0 = app.chalo.home.domain.ActivationCheckSuccessRemarks.PRODUCT_ACTIVATION_ALREADY_DONE
            r7.<init>(r0)
            return r7
        L47:
            app.chalo.home.domain.RunPreActivationChecksUseCase r7 = r6.this$0
            app.chalo.home.data.repository.TicketRepository r7 = r7.e
            app.chalo.models.mticketing.MTicket r1 = r6.$mTicket
            java.lang.String r1 = r1.f5615a
            r6.label = r4
            java.lang.Object r7 = r7.h(r1, r6)
            if (r7 != r0) goto L58
            goto L7c
        L58:
            if (r7 != 0) goto L62
            app.chalo.utils.ChaloUseCaseResult$Failure r7 = new app.chalo.utils.ChaloUseCaseResult$Failure
            app.chalo.home.domain.ProductActivationFailureReason$SingleJourneyTktNotFoundInRepository r0 = app.chalo.home.domain.ProductActivationFailureReason.SingleJourneyTktNotFoundInRepository.f3074a
            r7.<init>(r0)
            return r7
        L62:
            app.chalo.models.mticketing.MTicket r7 = r6.$mTicket
            app.chalo.models.mticketing.MTicketConfiguration r7 = r7.r
            if (r7 != 0) goto L6e
            app.chalo.utils.ChaloUseCaseResult$Failure r7 = new app.chalo.utils.ChaloUseCaseResult$Failure
            r7.<init>(r2)
            return r7
        L6e:
            app.chalo.home.domain.RunPreActivationChecksUseCase r1 = r6.this$0
            app.chalo.usecase.GetProductConfigFromProductIdUseCase r1 = r1.f
            java.lang.String r7 = r7.f5619a
            r6.label = r3
            java.lang.Object r7 = r1.a(r7, r6)
            if (r7 != r0) goto L7d
        L7c:
            return r0
        L7d:
            if (r7 != 0) goto L85
            app.chalo.utils.ChaloUseCaseResult$Failure r7 = new app.chalo.utils.ChaloUseCaseResult$Failure
            r7.<init>(r2)
            return r7
        L85:
            app.chalo.utils.ChaloUseCaseResult$Success r7 = new app.chalo.utils.ChaloUseCaseResult$Success
            app.chalo.home.domain.ActivationCheckSuccessRemarks r0 = app.chalo.home.domain.ActivationCheckSuccessRemarks.PRODUCT_ACTIVATION_POSSIBLE
            r7.<init>(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.domain.RunPreActivationChecksUseCase$checkSingleJourneyTicketActivation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
