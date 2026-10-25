package app.chalo.wallet.ui.loadbalance;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.wallet.domain.GetBannerForWalletScreenUseCase;
import app.chalo.wallet.domain.GetLoadMoneyDenominationsUseCase;
import app.chalo.wallet.ui.base.WalletDestination;
import app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStore;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.domain.FetchWalletBalanceUseCase;
import app.chalo.walletframework.wallet.domain.model.PromotionCardItem;
import defpackage.v21;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
@DebugMetadata(c = "app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountComponent$handleViewCreated$2", f = "WalletLoadBalanceEnterAmountComponent.kt", l = {163, 165, 166, 170}, m = "invokeSuspend", v = 1)
final class WalletLoadBalanceEnterAmountComponent$handleViewCreated$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WalletTypeIdentifier $walletTypeIdentifier;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ WalletLoadBalanceEnterAmountComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLoadBalanceEnterAmountComponent$handleViewCreated$2(WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent, WalletTypeIdentifier walletTypeIdentifier, Continuation continuation) {
        super(2, continuation);
        this.this$0 = walletLoadBalanceEnterAmountComponent;
        this.$walletTypeIdentifier = walletTypeIdentifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalletLoadBalanceEnterAmountComponent$handleViewCreated$2(this.this$0, this.$walletTypeIdentifier, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WalletLoadBalanceEnterAmountComponent$handleViewCreated$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4 A[LOOP:0: B:35:0x00ae->B:37:0x00b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:46:0x0104  */
    /* JADX WARN: Code duplicated, block: B:49:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x0132  */
    /* JADX WARN: Code duplicated, block: B:55:0x014a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0138 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        Object objB;
        List list2;
        ChaloUseCaseResult chaloUseCaseResult;
        Object l;
        Object objB2;
        Object obj2;
        List<PromotionCardItem> list3;
        WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent;
        ArrayList arrayList;
        Iterator it;
        WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent2;
        LinkedHashMap linkedHashMapK;
        String str;
        Job job;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            WalletDataStore walletDataStore = this.this$0.x;
            this.label = 1;
            if (walletDataStore.c(this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i == 2) {
                ResultKt.b(obj);
                list = (List) obj;
                FetchWalletBalanceUseCase fetchWalletBalanceUseCase = this.this$0.A;
                WalletTypeIdentifier walletTypeIdentifier = this.$walletTypeIdentifier;
                this.L$0 = list;
                this.label = 3;
                objB = fetchWalletBalanceUseCase.b(walletTypeIdentifier, this);
                if (objB != coroutineSingletons) {
                    list2 = list;
                    obj = objB;
                    chaloUseCaseResult = (ChaloUseCaseResult) obj;
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                        l = ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                    } else {
                        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        l = new Long(-1L);
                    }
                    GetBannerForWalletScreenUseCase getBannerForWalletScreenUseCase = this.this$0.C;
                    WalletDestination walletDestination = WalletDestination.WalletLoadMoney;
                    WalletTypeIdentifier walletTypeIdentifier2 = this.$walletTypeIdentifier;
                    this.L$0 = list2;
                    this.L$1 = l;
                    this.label = 4;
                    objB2 = getBannerForWalletScreenUseCase.b(walletDestination, walletTypeIdentifier2, this);
                    if (objB2 != coroutineSingletons) {
                        obj2 = l;
                        obj = objB2;
                    }
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                list2 = (List) this.L$0;
                ResultKt.b(obj);
                chaloUseCaseResult = (ChaloUseCaseResult) obj;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    l = ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                } else {
                    if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l = new Long(-1L);
                }
                GetBannerForWalletScreenUseCase getBannerForWalletScreenUseCase2 = this.this$0.C;
                WalletDestination walletDestination2 = WalletDestination.WalletLoadMoney;
                WalletTypeIdentifier walletTypeIdentifier3 = this.$walletTypeIdentifier;
                this.L$0 = list2;
                this.L$1 = l;
                this.label = 4;
                objB2 = getBannerForWalletScreenUseCase2.b(walletDestination2, walletTypeIdentifier3, this);
                if (objB2 != coroutineSingletons) {
                    obj2 = l;
                    obj = objB2;
                }
                return coroutineSingletons;
            }
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj3 = this.L$1;
            list2 = (List) this.L$0;
            ResultKt.b(obj);
            obj2 = obj3;
        }
        list3 = (List) obj;
        List list4 = list2;
        walletLoadBalanceEnterAmountComponent = this.this$0;
        arrayList = new ArrayList(CollectionsKt.v(list4, 10));
        it = list4.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            arrayList.add(new SuggestAmountsDenominations(iIntValue, walletLoadBalanceEnterAmountComponent.B.a(iIntValue, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)));
        }
        WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent3 = this.this$0;
        walletLoadBalanceEnterAmountComponent3.E0(new v21((Object) arrayList, obj2, (Object) walletLoadBalanceEnterAmountComponent3, list3, 10));
        if (list3.size() > 1) {
            WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent4 = this.this$0;
            job = walletLoadBalanceEnterAmountComponent4.I;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            walletLoadBalanceEnterAmountComponent4.I = BuildersKt.d(walletLoadBalanceEnterAmountComponent4.j, null, null, new WalletLoadBalanceEnterAmountComponent$startBannerTickerTimer$1(walletLoadBalanceEnterAmountComponent4, null), 3);
        }
        if (!list3.isEmpty()) {
            walletLoadBalanceEnterAmountComponent2 = this.this$0;
            walletLoadBalanceEnterAmountComponent2.getClass();
            for (PromotionCardItem promotionCardItem : list3) {
                linkedHashMapK = MapsKt.k(new Pair("wallet banner url", promotionCardItem.f11086a));
                str = promotionCardItem.b;
                if (str != null) {
                    linkedHashMapK.put("wallet banner deeplink", str);
                }
                AnalyticsContract.DefaultImpls.a(walletLoadBalanceEnterAmountComponent2.y, "wallet banner rendered", "WalletLoadMoney", linkedHashMapK, null, false, 24);
            }
        }
        return Unit.f17538a;
        GetLoadMoneyDenominationsUseCase getLoadMoneyDenominationsUseCase = this.this$0.s;
        this.label = 2;
        obj = getLoadMoneyDenominationsUseCase.b(3, 1000L, this);
        if (obj != coroutineSingletons) {
            list = (List) obj;
            FetchWalletBalanceUseCase fetchWalletBalanceUseCase2 = this.this$0.A;
            WalletTypeIdentifier walletTypeIdentifier4 = this.$walletTypeIdentifier;
            this.L$0 = list;
            this.label = 3;
            objB = fetchWalletBalanceUseCase2.b(walletTypeIdentifier4, this);
            if (objB != coroutineSingletons) {
                list2 = list;
                obj = objB;
                chaloUseCaseResult = (ChaloUseCaseResult) obj;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    l = ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                } else {
                    if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l = new Long(-1L);
                }
                GetBannerForWalletScreenUseCase getBannerForWalletScreenUseCase3 = this.this$0.C;
                WalletDestination walletDestination3 = WalletDestination.WalletLoadMoney;
                WalletTypeIdentifier walletTypeIdentifier5 = this.$walletTypeIdentifier;
                this.L$0 = list2;
                this.L$1 = l;
                this.label = 4;
                objB2 = getBannerForWalletScreenUseCase3.b(walletDestination3, walletTypeIdentifier5, this);
                if (objB2 != coroutineSingletons) {
                    obj2 = l;
                    obj = objB2;
                    list3 = (List) obj;
                    List list5 = list2;
                    walletLoadBalanceEnterAmountComponent = this.this$0;
                    arrayList = new ArrayList(CollectionsKt.v(list5, 10));
                    it = list5.iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Number) it.next()).intValue();
                        arrayList.add(new SuggestAmountsDenominations(iIntValue2, walletLoadBalanceEnterAmountComponent.B.a(iIntValue2, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)));
                    }
                    WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent5 = this.this$0;
                    walletLoadBalanceEnterAmountComponent5.E0(new v21((Object) arrayList, obj2, (Object) walletLoadBalanceEnterAmountComponent5, list3, 10));
                    if (list3.size() > 1) {
                        WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent6 = this.this$0;
                        job = walletLoadBalanceEnterAmountComponent6.I;
                        if (job != null) {
                            ((JobSupport) job).cancel(null);
                        }
                        walletLoadBalanceEnterAmountComponent6.I = BuildersKt.d(walletLoadBalanceEnterAmountComponent6.j, null, null, new WalletLoadBalanceEnterAmountComponent$startBannerTickerTimer$1(walletLoadBalanceEnterAmountComponent6, null), 3);
                    }
                    if (!list3.isEmpty()) {
                        walletLoadBalanceEnterAmountComponent2 = this.this$0;
                        walletLoadBalanceEnterAmountComponent2.getClass();
                        while (r0.hasNext()) {
                            linkedHashMapK = MapsKt.k(new Pair("wallet banner url", promotionCardItem.f11086a));
                            str = promotionCardItem.b;
                            if (str != null) {
                                linkedHashMapK.put("wallet banner deeplink", str);
                            }
                            AnalyticsContract.DefaultImpls.a(walletLoadBalanceEnterAmountComponent2.y, "wallet banner rendered", "WalletLoadMoney", linkedHashMapK, null, false, 24);
                        }
                    }
                    return Unit.f17538a;
                }
            }
        }
        return coroutineSingletons;
    }
}
