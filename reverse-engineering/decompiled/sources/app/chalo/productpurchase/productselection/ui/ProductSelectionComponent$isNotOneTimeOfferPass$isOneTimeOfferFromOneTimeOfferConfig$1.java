package app.chalo.productpurchase.productselection.ui;

import app.chalo.features.onetimeoffer.GetOneTimeOfferConfigUseCase;
import app.chalo.features.onetimeoffer.models.OneTimeOfferConfigAppModel;
import app.chalo.features.onetimeoffer.models.OneTimeOfferConfigAppModelKt;
import app.chalo.superpass.data.models.entities.SuperPass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.productselection.ui.ProductSelectionComponent$isNotOneTimeOfferPass$isOneTimeOfferFromOneTimeOfferConfig$1", f = "ProductSelectionComponent.kt", l = {1040}, m = "invokeSuspend", v = 1)
final class ProductSelectionComponent$isNotOneTimeOfferPass$isOneTimeOfferFromOneTimeOfferConfig$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    final /* synthetic */ SuperPass $superPass;
    Object L$0;
    int label;
    final /* synthetic */ ProductSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductSelectionComponent$isNotOneTimeOfferPass$isOneTimeOfferFromOneTimeOfferConfig$1(ProductSelectionComponent productSelectionComponent, SuperPass superPass, Continuation continuation) {
        super(1, continuation);
        this.$superPass = superPass;
        this.this$0 = productSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ProductSelectionComponent$isNotOneTimeOfferPass$isOneTimeOfferFromOneTimeOfferConfig$1(this.this$0, this.$superPass, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ProductSelectionComponent$isNotOneTimeOfferPass$isOneTimeOfferFromOneTimeOfferConfig$1) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            String str2 = this.$superPass.d.f9569a;
            GetOneTimeOfferConfigUseCase getOneTimeOfferConfigUseCase = this.this$0.p;
            this.L$0 = str2;
            this.label = 1;
            Object objA = getOneTimeOfferConfigUseCase.a(this);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = str2;
            obj = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            ResultKt.b(obj);
        }
        return Boolean.valueOf(OneTimeOfferConfigAppModelKt.a((OneTimeOfferConfigAppModel) obj, str));
    }
}
