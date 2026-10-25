package app.chalo.productactivation.ui;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.location.ChaloLocationManager;
import app.chalo.location.LocationUpdateResult;
import app.chalo.models.LocationAppModel;
import app.chalo.productactivation.data.ActivationProductData;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.superpass.utils.MixpanelUtil;
import com.adjust.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
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
@DebugMetadata(c = "app.chalo.productactivation.ui.ProductActivationComponent$raiseViewReceiptClicked$1", f = "ProductActivationComponent.kt", l = {1044, 1052}, m = "invokeSuspend", v = 1)
final class ProductActivationComponent$raiseViewReceiptClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ActivationProductData $activationProductData;
    Object L$0;
    int label;
    final /* synthetic */ ProductActivationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductActivationComponent$raiseViewReceiptClicked$1(ActivationProductData activationProductData, ProductActivationComponent productActivationComponent, Continuation continuation) {
        super(2, continuation);
        this.$activationProductData = activationProductData;
        this.this$0 = productActivationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductActivationComponent$raiseViewReceiptClicked$1(this.$activationProductData, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductActivationComponent$raiseViewReceiptClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map map;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.b(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Map map2 = (Map) this.L$0;
                ResultKt.b(obj);
                map = map2;
            }
            AnalyticsContract.DefaultImpls.a(this.this$0.o, "view trip receipt button clicked", "Activate Super pass Screen", map, null, false, 24);
            return Unit.f17538a;
        }
        ResultKt.b(obj);
        ActivationProductData activationProductData = this.$activationProductData;
        if (activationProductData instanceof ActivationProductData.PassActivation) {
            ChaloLocationManager chaloLocationManager = this.this$0.z;
            this.label = 1;
            obj = chaloLocationManager.c(this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (!(activationProductData instanceof ActivationProductData.InstantTicketActivation) && !(activationProductData instanceof ActivationProductData.QuickPayActivation) && !(activationProductData instanceof ActivationProductData.MobileTicketActivation) && !(activationProductData instanceof ActivationProductData.MetroTicketActivation) && !(activationProductData instanceof ActivationProductData.ONDCMetroTicketActivation) && !(activationProductData instanceof ActivationProductData.ONDCTicketActivation) && !(activationProductData instanceof ActivationProductData.MultiModalGroupTicketActivation) && !(activationProductData instanceof ActivationProductData.PremiumTicketActivation)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f17538a;
        LocationAppModel locationAppModelA = ((LocationUpdateResult) obj).a();
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("passId", ((ActivationProductData.PassActivation) this.$activationProductData).f7999a.f9560a.f9566a));
        ActivationProductData activationProductData2 = this.$activationProductData;
        if (locationAppModelA != null) {
            linkedHashMapK.put("lat", new Double(locationAppModelA.f5586a));
            linkedHashMapK.put(Constants.LONG, new Double(locationAppModelA.b));
        }
        MixpanelUtil mixpanelUtil = MixpanelUtil.f9617a;
        SuperPass superPass = ((ActivationProductData.PassActivation) activationProductData2).f7999a;
        this.L$0 = linkedHashMapK;
        this.label = 2;
        if (mixpanelUtil.c(linkedHashMapK, superPass, this) != coroutineSingletons) {
            map = linkedHashMapK;
            AnalyticsContract.DefaultImpls.a(this.this$0.o, "view trip receipt button clicked", "Activate Super pass Screen", map, null, false, 24);
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }
}
