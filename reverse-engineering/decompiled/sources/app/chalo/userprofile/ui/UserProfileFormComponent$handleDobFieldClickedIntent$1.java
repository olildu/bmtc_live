package app.chalo.userprofile.ui;

import androidx.compose.material3.SelectableDates;
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
@DebugMetadata(c = "app.chalo.userprofile.ui.UserProfileFormComponent$handleDobFieldClickedIntent$1", f = "UserProfileFormComponent.kt", l = {282, 283}, m = "invokeSuspend", v = 1)
final class UserProfileFormComponent$handleDobFieldClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UserProfileFormDataState $state;
    long J$0;
    int label;
    final /* synthetic */ UserProfileFormComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileFormComponent$handleDobFieldClickedIntent$1(UserProfileFormComponent userProfileFormComponent, UserProfileFormDataState userProfileFormDataState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = userProfileFormComponent;
        this.$state = userProfileFormDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserProfileFormComponent$handleDobFieldClickedIntent$1(this.this$0, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UserProfileFormComponent$handleDobFieldClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            BasicInfoContract basicInfoContract = this.this$0.y;
            this.label = 1;
            obj = basicInfoContract.c(this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = this.J$0;
            ResultKt.b(obj);
            j = j2;
        }
        this.this$0.E0(new s8(this.$state, j, (SelectableDates) obj, 9));
        return Unit.f17538a;
        long jLongValue = ((Number) obj).longValue();
        UserProfileFormComponent userProfileFormComponent = this.this$0;
        this.J$0 = jLongValue;
        this.label = 2;
        obj = UserProfileFormComponent.F0(userProfileFormComponent, this);
        if (obj != coroutineSingletons) {
            j = jLongValue;
            this.this$0.E0(new s8(this.$state, j, (SelectableDates) obj, 9));
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }
}
