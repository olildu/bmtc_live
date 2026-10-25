package app.chalo.home.ui.chalobus;

import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
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
@DebugMetadata(c = "app.chalo.home.ui.chalobus.PremiumBusTutorialComponent$handleTutorialClicked$1", f = "PremiumBusTutorialComponent.kt", l = {70}, m = "invokeSuspend", v = 1)
final class PremiumBusTutorialComponent$handleTutorialClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusTutorialViewIntent.TutorialClicked $intent;
    Object L$0;
    int label;
    final /* synthetic */ PremiumBusTutorialComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusTutorialComponent$handleTutorialClicked$1(PremiumBusTutorialComponent premiumBusTutorialComponent, PremiumBusTutorialViewIntent.TutorialClicked tutorialClicked, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusTutorialComponent;
        this.$intent = tutorialClicked;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusTutorialComponent$handleTutorialClicked$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusTutorialComponent$handleTutorialClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KotlinToastManager kotlinToastManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            if (!this.this$0.l.a(this.$intent.f3296a.f3290a, null)) {
                PremiumBusTutorialComponent premiumBusTutorialComponent = this.this$0;
                KotlinToastManager kotlinToastManager2 = premiumBusTutorialComponent.m;
                this.L$0 = kotlinToastManager2;
                this.label = 1;
                obj = premiumBusTutorialComponent.n.b(StringEnum.SOME_ERROR_OCCURRED_WHILE_OPENING_THE_VIDEO, new Object[0], this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                kotlinToastManager = kotlinToastManager2;
            }
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlinToastManager = (KotlinToastManager) this.L$0;
        ResultKt.b(obj);
        KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
        return Unit.f17538a;
    }
}
