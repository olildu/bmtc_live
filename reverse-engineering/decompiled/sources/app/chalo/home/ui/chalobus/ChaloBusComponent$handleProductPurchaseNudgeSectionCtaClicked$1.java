package app.chalo.home.ui.chalobus;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusComponent$handleProductPurchaseNudgeSectionCtaClicked$1", f = "ChaloBusComponent.kt", l = {444}, m = "invokeSuspend", v = 1)
final class ChaloBusComponent$handleProductPurchaseNudgeSectionCtaClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChaloBusViewIntent.ProductPurchaseNudgeSectionCtaClicked $intent;
    int label;
    final /* synthetic */ ChaloBusComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3242a;

        static {
            int[] iArr = new int[ProductPurchaseNudgeInfoCtaType.values().length];
            try {
                iArr[ProductPurchaseNudgeInfoCtaType.VIEW_ALL_PASSES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductPurchaseNudgeInfoCtaType.EXPLORE_CHALO_BUS_PASSES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3242a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusComponent$handleProductPurchaseNudgeSectionCtaClicked$1(ChaloBusViewIntent.ProductPurchaseNudgeSectionCtaClicked productPurchaseNudgeSectionCtaClicked, ChaloBusComponent chaloBusComponent, Continuation continuation) {
        super(2, continuation);
        this.$intent = productPurchaseNudgeSectionCtaClicked;
        this.this$0 = chaloBusComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloBusComponent$handleProductPurchaseNudgeSectionCtaClicked$1(this.$intent, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBusComponent$handleProductPurchaseNudgeSectionCtaClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = WhenMappings.f3242a[this.$intent.f3276a.ordinal()];
            if (i2 == 1) {
                ChaloBusComponent chaloBusComponent = this.this$0;
                this.label = 1;
                if (ChaloBusComponent.N0(chaloBusComponent, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.Y0();
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
