package app.chalo.ncmc.ui.entercarddetails;

import app.chalo.providers.stringprovider.StringEnum;
import defpackage.n10;
import defpackage.p10;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsComponent$processCardInput$3", f = "EnterCardDetailsComponent.kt", l = {314}, m = "invokeSuspend", v = 1)
final class EnterCardDetailsComponent$processCardInput$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $enteredAmount;
    Object L$0;
    int label;
    final /* synthetic */ EnterCardDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterCardDetailsComponent$processCardInput$3(EnterCardDetailsComponent enterCardDetailsComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = enterCardDetailsComponent;
        this.$enteredAmount = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EnterCardDetailsComponent$processCardInput$3(this.this$0, this.$enteredAmount, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EnterCardDetailsComponent$processCardInput$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            String str2 = ((EnterCardDetailsViewState) this.this$0.f.getValue()).c;
            this.L$0 = str2;
            this.label = 1;
            Object objB = this.this$0.n.b(StringEnum.CARD_NUMBER_DOES_NOT_MATCH, new Object[0], this);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = str2;
            obj = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            ResultKt.b(obj);
        }
        String str3 = (String) obj;
        if (this.$enteredAmount.length() == 16 && !Intrinsics.d(this.$enteredAmount, str)) {
            this.this$0.E0(new n10(str3, 2));
        } else if (this.$enteredAmount.length() == 16) {
            this.this$0.E0(new p10(3));
        } else {
            this.this$0.E0(new p10(4));
        }
        return Unit.f17538a;
    }
}
