package app.chalo.premiumbus.ui.passpurchaselanding;

import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.scenes.args.PremiumBusProductSelectionConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.datetime.Clock;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent$handleOriginDestinationPointSelectedIntent$3", f = "PbPassPurchaseLandingScreenComponent.kt", l = {1272}, m = "invokeSuspend", v = 1)
final class PbPassPurchaseLandingScreenComponent$handleOriginDestinationPointSelectedIntent$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PbPassPurchaseLandingScreenIntent.OriginDestinationPointSelectedIntent $intent;
    final /* synthetic */ PBStopPlaceSelectedAppModel $selectedFrom;
    final /* synthetic */ PBStopPlaceSelectedAppModel $selectedTo;
    Object L$0;
    int label;
    final /* synthetic */ PbPassPurchaseLandingScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PbPassPurchaseLandingScreenComponent$handleOriginDestinationPointSelectedIntent$3(PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2, PbPassPurchaseLandingScreenComponent pbPassPurchaseLandingScreenComponent, PbPassPurchaseLandingScreenIntent.OriginDestinationPointSelectedIntent originDestinationPointSelectedIntent, Continuation continuation) {
        super(2, continuation);
        this.$selectedFrom = pBStopPlaceSelectedAppModel;
        this.$selectedTo = pBStopPlaceSelectedAppModel2;
        this.this$0 = pbPassPurchaseLandingScreenComponent;
        this.$intent = originDestinationPointSelectedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PbPassPurchaseLandingScreenComponent$handleOriginDestinationPointSelectedIntent$3(this.$selectedFrom, this.$selectedTo, this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PbPassPurchaseLandingScreenComponent$handleOriginDestinationPointSelectedIntent$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KotlinToastManager kotlinToastManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            if (this.$selectedFrom != null && this.$selectedTo != null) {
                this.this$0.r.E(this.$intent.f7661a);
                PremiumBusProductPurchaseFlowType.FreshPurchase freshPurchase = new PremiumBusProductPurchaseFlowType.FreshPurchase(this.$selectedFrom, this.$selectedTo, Clock.System.f17926a.a().b());
                ChaloNavigationManager chaloNavigationManager = this.this$0.v;
                Json json = ChaloJson.b;
                json.getClass();
                ChaloNavigationManagerKt.e(chaloNavigationManager, new PremiumBusArgs.PremiumProductSelectionArgs(json.a(PremiumBusProductPurchaseFlowType.INSTANCE.serializer(), freshPurchase), (String) null, new PremiumBusProductSelectionConfig(true, 4), this.this$0.k.f, 2), null, 6);
                return unit;
            }
            PbPassPurchaseLandingScreenComponent pbPassPurchaseLandingScreenComponent = this.this$0;
            KotlinToastManager kotlinToastManager2 = pbPassPurchaseLandingScreenComponent.u;
            this.L$0 = kotlinToastManager2;
            this.label = 1;
            obj = pbPassPurchaseLandingScreenComponent.l.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            kotlinToastManager = kotlinToastManager2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
        }
        KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
        return unit;
    }
}
