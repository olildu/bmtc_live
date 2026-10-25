package app.chalo.productpurchase.passpurchase.ui.enteruserdetails;

import app.chalo.contract.BasicInfoContract;
import defpackage.s8;
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
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel$handleFieldUpdatedIntent$1", f = "SuperPassEnterUserDetailsViewModel.kt", l = {167}, m = "invokeSuspend", v = 1)
final class SuperPassEnterUserDetailsViewModel$handleFieldUpdatedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SuperPassEnterUserDetailsIntent.FieldUpdatedIntent $intent;
    int label;
    final /* synthetic */ SuperPassEnterUserDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassEnterUserDetailsViewModel$handleFieldUpdatedIntent$1(SuperPassEnterUserDetailsIntent.FieldUpdatedIntent fieldUpdatedIntent, SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel, Continuation continuation) {
        super(2, continuation);
        this.$intent = fieldUpdatedIntent;
        this.this$0 = superPassEnterUserDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperPassEnterUserDetailsViewModel$handleFieldUpdatedIntent$1(this.$intent, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperPassEnterUserDetailsViewModel$handleFieldUpdatedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Long l = this.$intent.d;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                BasicInfoContract basicInfoContract = this.this$0.n;
                this.label = 1;
                obj = basicInfoContract.c(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            long j = jLongValue;
            SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel = this.this$0;
            superPassEnterUserDetailsViewModel.p(new s8(this.$intent, j, superPassEnterUserDetailsViewModel, 8));
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        jLongValue = ((Number) obj).longValue();
        long j2 = jLongValue;
        SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel2 = this.this$0;
        superPassEnterUserDetailsViewModel2.p(new s8(this.$intent, j2, superPassEnterUserDetailsViewModel2, 8));
        return Unit.f17538a;
    }
}
