package app.chalo.productpurchase.passselection.ui;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.WebViewArgs;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passselection.ui.PassSelectionComponent$handleFAQClickedIntent$1", f = "PassSelectionComponent.kt", l = {324}, m = "invokeSuspend", v = 1)
final class PassSelectionComponent$handleFAQClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PassSelectionIntent.FAQClickedIntent $intent;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PassSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassSelectionComponent$handleFAQClickedIntent$1(PassSelectionComponent passSelectionComponent, PassSelectionIntent.FAQClickedIntent fAQClickedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = passSelectionComponent;
        this.$intent = fAQClickedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassSelectionComponent$handleFAQClickedIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PassSelectionComponent$handleFAQClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        ChaloNavigationManager chaloNavigationManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            AnalyticsContractImplKt.b(this.this$0.p, "plan screen faq clicked", Source.PASS_SELECTION_ACTIVITY, MapsKt.d(), false, 24);
            String str2 = this.$intent.f8536a;
            PassSelectionComponent passSelectionComponent = this.this$0;
            ChaloNavigationManager chaloNavigationManager2 = passSelectionComponent.k;
            this.L$0 = chaloNavigationManager2;
            this.L$1 = str2;
            this.label = 1;
            Object objB = passSelectionComponent.n.b(StringEnum.FAQS, new Object[0], this);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = str2;
            obj = objB;
            chaloNavigationManager = chaloNavigationManager2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$1;
            chaloNavigationManager = (ChaloNavigationManager) this.L$0;
            ResultKt.b(obj);
        }
        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new WebViewArgs(str, (String) obj, false, false), null, null, 6));
        return Unit.f17538a;
    }
}
