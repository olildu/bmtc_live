package app.chalo.wallet.ui.mainbalance;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.wallet.domain.GetBannerForWalletScreenUseCase;
import app.chalo.wallet.ui.base.WalletDestination;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.domain.model.PromotionCardItem;
import defpackage.l11;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.wallet.ui.mainbalance.WalletBalanceComponent$handleViewCreated$2", f = "WalletBalanceComponent.kt", l = {311}, m = "invokeSuspend", v = 1)
final class WalletBalanceComponent$handleViewCreated$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WalletTypeIdentifier $walletTypeIdentifier;
    int label;
    final /* synthetic */ WalletBalanceComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBalanceComponent$handleViewCreated$2(WalletBalanceComponent walletBalanceComponent, WalletTypeIdentifier walletTypeIdentifier, Continuation continuation) {
        super(2, continuation);
        this.this$0 = walletBalanceComponent;
        this.$walletTypeIdentifier = walletTypeIdentifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalletBalanceComponent$handleViewCreated$2(this.this$0, this.$walletTypeIdentifier, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WalletBalanceComponent$handleViewCreated$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            GetBannerForWalletScreenUseCase getBannerForWalletScreenUseCase = this.this$0.t;
            WalletDestination walletDestination = WalletDestination.WalletBalance;
            WalletTypeIdentifier walletTypeIdentifier = this.$walletTypeIdentifier;
            this.label = 1;
            obj = getBannerForWalletScreenUseCase.b(walletDestination, walletTypeIdentifier, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        List<PromotionCardItem> list = (List) obj;
        this.this$0.E0(new l11(list, 19));
        if (list.size() > 1) {
            WalletBalanceComponent walletBalanceComponent = this.this$0;
            Job job = walletBalanceComponent.B;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            walletBalanceComponent.B = BuildersKt.d(walletBalanceComponent.j, null, null, new WalletBalanceComponent$startBannerTickerTimer$1(walletBalanceComponent, null), 3);
        }
        if (!list.isEmpty()) {
            WalletBalanceComponent walletBalanceComponent2 = this.this$0;
            walletBalanceComponent2.getClass();
            for (PromotionCardItem promotionCardItem : list) {
                LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("wallet banner url", promotionCardItem.f11086a));
                String str = promotionCardItem.b;
                if (str != null) {
                    linkedHashMapK.put("wallet banner deeplink", str);
                }
                AnalyticsContract.DefaultImpls.a(walletBalanceComponent2.s, "wallet banner rendered", "WalletBalance", linkedHashMapK, null, false, 24);
            }
        }
        return Unit.f17538a;
    }
}
