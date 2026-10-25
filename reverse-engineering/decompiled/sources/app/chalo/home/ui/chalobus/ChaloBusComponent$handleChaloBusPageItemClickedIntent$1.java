package app.chalo.home.ui.chalobus;

import app.chalo.constants.Source;
import app.chalo.homescreen.data.model.app.BottomNavTabType;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.PassLandingFlowType;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.scenes.args.ProductSelectionArgs;
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
@DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusComponent$handleChaloBusPageItemClickedIntent$1", f = "ChaloBusComponent.kt", l = {739}, m = "invokeSuspend", v = 1)
final class ChaloBusComponent$handleChaloBusPageItemClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChaloBusViewIntent.ChaloBusPageItemClickedIntent $intent;
    int label;
    final /* synthetic */ ChaloBusComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3240a;

        static {
            int[] iArr = new int[ChaloBusPageFeature.values().length];
            try {
                iArr[ChaloBusPageFeature.PRODUCT_PURCHASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChaloBusPageFeature.TICKETS_PASSES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChaloBusPageFeature.CUSTOMER_SUPPORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChaloBusPageFeature.PASS_PURCHASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChaloBusPageFeature.PLOTLINE_WIDGET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ChaloBusPageFeature.NEARBY_ROUTES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ChaloBusPageFeature.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f3240a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusComponent$handleChaloBusPageItemClickedIntent$1(ChaloBusViewIntent.ChaloBusPageItemClickedIntent chaloBusPageItemClickedIntent, ChaloBusComponent chaloBusComponent, Continuation continuation) {
        super(2, continuation);
        this.$intent = chaloBusPageItemClickedIntent;
        this.this$0 = chaloBusComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloBusComponent$handleChaloBusPageItemClickedIntent$1(this.$intent, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBusComponent$handleChaloBusPageItemClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            switch (WhenMappings.f3240a[this.$intent.f3261a.ordinal()]) {
                case 1:
                    this.this$0.t.b(new ChaloNavigationRequest.Navigate(new ProductSelectionArgs(null, this.$intent.b, null, Source.CHALO_BUS_SCREEN_TAB, false, null, 217), null, null, 6));
                    break;
                case 2:
                    this.this$0.u.c(BottomNavTabType.MY_TICKETS, false);
                    break;
                case 3:
                    ChaloBusComponent chaloBusComponent = this.this$0;
                    this.label = 1;
                    if (ChaloBusComponent.L0(chaloBusComponent, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    break;
                case 4:
                    ChaloBusComponent chaloBusComponent2 = this.this$0;
                    chaloBusComponent2.t.b(new ChaloNavigationRequest.Navigate(new PremiumBusArgs.PremiumBusPassLandingScreenArgs(PassLandingFlowType.WithoutConfigId.INSTANCE, Source.CHALO_BUS_SCREEN_TAB, chaloBusComponent2.q.u(), 4), null, null, 6));
                    break;
                case 5:
                case 6:
                case 7:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
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
