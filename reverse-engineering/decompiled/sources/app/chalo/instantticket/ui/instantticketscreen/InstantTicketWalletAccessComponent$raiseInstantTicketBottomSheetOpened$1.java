package app.chalo.instantticket.ui.instantticketscreen;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.WalletStatus;
import app.chalo.walletframework.wallet.data.model.WalletStatusKt;
import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletTransactionAppModel;
import app.chalo.walletframework.wallet.domain.GetWalletAndAllTransactionsWithoutSyncUseCase;
import app.chalo.walletframework.wallet.domain.model.WalletAndAllTransactions;
import java.util.Iterator;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessComponent$raiseInstantTicketBottomSheetOpened$1", f = "InstantTicketWalletAccessComponent.kt", l = {598, 598}, m = "invokeSuspend", v = 1)
final class InstantTicketWalletAccessComponent$raiseInstantTicketBottomSheetOpened$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $walletBalance;
    final /* synthetic */ WalletStatus $walletStatus;
    final /* synthetic */ WalletTypeIdentifier $walletTypeIdentifier;
    int I$0;
    int label;
    final /* synthetic */ InstantTicketWalletAccessComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantTicketWalletAccessComponent$raiseInstantTicketBottomSheetOpened$1(WalletStatus walletStatus, InstantTicketWalletAccessComponent instantTicketWalletAccessComponent, WalletTypeIdentifier walletTypeIdentifier, long j, Continuation continuation) {
        super(2, continuation);
        this.$walletStatus = walletStatus;
        this.this$0 = instantTicketWalletAccessComponent;
        this.$walletTypeIdentifier = walletTypeIdentifier;
        this.$walletBalance = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstantTicketWalletAccessComponent$raiseInstantTicketBottomSheetOpened$1(this.$walletStatus, this.this$0, this.$walletTypeIdentifier, this.$walletBalance, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstantTicketWalletAccessComponent$raiseInstantTicketBottomSheetOpened$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        ChaloUseCaseResult chaloUseCaseResult;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Iterator it;
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.b(obj);
            int i4 = !WalletStatusKt.a(this.$walletStatus) ? 1 : 0;
            GetWalletAndAllTransactionsWithoutSyncUseCase getWalletAndAllTransactionsWithoutSyncUseCase = this.this$0.y;
            WalletTypeIdentifier walletTypeIdentifier = this.$walletTypeIdentifier;
            this.I$0 = i4;
            this.label = 1;
            Object objA = getWalletAndAllTransactionsWithoutSyncUseCase.a(walletTypeIdentifier, this);
            if (objA != coroutineSingletons) {
                i = i4;
                obj = objA;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            i = this.I$0;
            ResultKt.b(obj);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.I$0;
            ResultKt.b(obj);
        }
        chaloUseCaseResult = (ChaloUseCaseResult) obj;
        z = chaloUseCaseResult instanceof ChaloUseCaseResult.Success;
        if (z || ((WalletAndAllTransactions) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).b.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z) {
            it = ((WalletAndAllTransactions) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).b.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((WalletTransactionAppModel) next).b != WalletTransactionType.QUICK_PAY);
            if (next != null) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        AnalyticsContract analyticsContract = this.this$0.n;
        if (i2 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        AnalyticsContract.DefaultImpls.a(analyticsContract, "instant ticket bottmsheet opened", "new pay for ticket bottom sheet", MapsKt.i(new Pair("is chalo wallet activated", Boolean.valueOf(z4)), new Pair("is recharge done once", Boolean.valueOf(z2)), new Pair("balance amount", new Long(this.$walletBalance)), new Pair("is quick pay bought once", Boolean.valueOf(z3))), null, false, 24);
        return Unit.f17538a;
        this.I$0 = i;
        this.label = 2;
        obj = FlowKt.t((Flow) obj, this);
        if (obj != coroutineSingletons) {
            i2 = i;
            chaloUseCaseResult = (ChaloUseCaseResult) obj;
            z = chaloUseCaseResult instanceof ChaloUseCaseResult.Success;
            if (z) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (z) {
                it = ((WalletAndAllTransactions) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).b.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((WalletTransactionAppModel) next).b != WalletTransactionType.QUICK_PAY);
                if (next != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            AnalyticsContract analyticsContract2 = this.this$0.n;
            if (i2 != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            AnalyticsContract.DefaultImpls.a(analyticsContract2, "instant ticket bottmsheet opened", "new pay for ticket bottom sheet", MapsKt.i(new Pair("is chalo wallet activated", Boolean.valueOf(z4)), new Pair("is recharge done once", Boolean.valueOf(z2)), new Pair("balance amount", new Long(this.$walletBalance)), new Pair("is quick pay bought once", Boolean.valueOf(z3))), null, false, 24);
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }
}
