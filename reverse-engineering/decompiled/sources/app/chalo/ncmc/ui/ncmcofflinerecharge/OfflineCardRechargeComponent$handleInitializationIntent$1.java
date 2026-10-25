package app.chalo.ncmc.ui.ncmcofflinerecharge;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.constants.Source;
import app.chalo.ncmc.data.NcmcCardRechargeConfigAppModel;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeViewState;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.ChaloNavigationManagerKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent$handleInitializationIntent$1", f = "OfflineCardRechargeComponent.kt", l = {398}, m = "invokeSuspend", v = 1)
final class OfflineCardRechargeComponent$handleInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OfflineCardRechargeIntent.InitialIntent $intent;
    Object L$0;
    int label;
    final /* synthetic */ OfflineCardRechargeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineCardRechargeComponent$handleInitializationIntent$1(OfflineCardRechargeIntent.InitialIntent initialIntent, OfflineCardRechargeComponent offlineCardRechargeComponent, Continuation continuation) {
        super(2, continuation);
        this.$intent = initialIntent;
        this.this$0 = offlineCardRechargeComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OfflineCardRechargeComponent$handleInitializationIntent$1(this.$intent, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OfflineCardRechargeComponent$handleInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KotlinToastManager kotlinToastManager;
        final String strA;
        final String strA2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            OfflineCardRechargeIntent.InitialIntent initialIntent = this.$intent;
            final NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel = initialIntent.f6387a;
            final String str = initialIntent.c;
            final String str2 = initialIntent.b;
            final Long l = initialIntent.d;
            final Long l2 = initialIntent.e;
            List listS = CollectionsKt.S(str, str2);
            if (!(listS instanceof Collection) || !listS.isEmpty()) {
                Iterator it = listS.iterator();
                while (it.hasNext()) {
                    if (StringsKt.F((String) it.next())) {
                        OfflineCardRechargeComponent offlineCardRechargeComponent = this.this$0;
                        KotlinToastManager kotlinToastManager2 = offlineCardRechargeComponent.y;
                        this.L$0 = kotlinToastManager2;
                        this.label = 1;
                        obj = offlineCardRechargeComponent.n.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        kotlinToastManager = kotlinToastManager2;
                    }
                }
            }
            if (l != null) {
                strA = this.this$0.l.a(l.longValue(), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
            } else {
                strA = null;
            }
            if (l2 != null) {
                strA2 = this.this$0.l.a(l2.longValue(), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
            } else {
                strA2 = null;
            }
            final boolean zA = this.this$0.u.a();
            OfflineCardRechargeComponent offlineCardRechargeComponent2 = this.this$0;
            final OfflineCardRechargeIntent.InitialIntent initialIntent2 = this.$intent;
            offlineCardRechargeComponent2.E0(new Function1() { // from class: mn0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return OfflineCardRechargeViewState.a((OfflineCardRechargeViewState) obj2, null, ncmcCardRechargeConfigAppModel, str2, str, l, strA, l2, strA2, initialIntent2.f, false, false, false, false, null, null, zA, false, null, 2031105);
                }
            });
            OfflineCardRechargeComponent offlineCardRechargeComponent3 = this.this$0;
            AnalyticsContractImplKt.b(offlineCardRechargeComponent3.w, "ncmc load balance view created", Source.NCMC_OFFLINE_BALANCE_RECHARGE_SCREEN, OfflineCardRechargeContractKt.a((OfflineCardRechargeViewState) offlineCardRechargeComponent3.f.getValue(), null), false, 24);
            return unit;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlinToastManager = (KotlinToastManager) this.L$0;
        ResultKt.b(obj);
        KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
        ChaloNavigationManagerKt.c(this.this$0.x);
        return unit;
    }
}
