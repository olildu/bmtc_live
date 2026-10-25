package app.chalo.wallet.ui.mainbalance;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import app.chalo.walletframework.wallet.data.model.appmodel.ChaloPayResponseAppModel;
import app.chalo.walletframework.wallet.domain.model.WalletAndAllTransactions;
import app.chalo.walletframework.wallet.domain.model.WalletAndAllTransactionsFailure;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n"}, d2 = {"<anonymous>", "", "result", "Lapp/chalo/utils/ChaloUseCaseResult;", "Lapp/chalo/walletframework/wallet/domain/model/WalletAndAllTransactions;", "Lapp/chalo/walletframework/wallet/domain/model/WalletAndAllTransactionsFailure;", "chaloPayTransactionList", "", "Lapp/chalo/walletframework/wallet/data/model/appmodel/ChaloPayResponseAppModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.wallet.ui.mainbalance.WalletBalanceComponent$loadWalletData$3", f = "WalletBalanceComponent.kt", l = {377, 396, TypedValues.CycleType.TYPE_WAVE_PERIOD}, m = "invokeSuspend", v = 1)
final class WalletBalanceComponent$loadWalletData$3 extends SuspendLambda implements Function3<ChaloUseCaseResult<WalletAndAllTransactions, WalletAndAllTransactionsFailure>, List<? extends ChaloPayResponseAppModel>, Continuation<? super Unit>, Object> {
    long J$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ WalletBalanceComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10858a;

        static {
            int[] iArr = new int[WalletTransactionType.values().length];
            try {
                iArr[WalletTransactionType.QUICK_PAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletTransactionType.LOAD_MONEY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletTransactionType.CHALO_PAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10858a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBalanceComponent$loadWalletData$3(WalletBalanceComponent walletBalanceComponent, Continuation continuation) {
        super(3, continuation);
        this.this$0 = walletBalanceComponent;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        WalletBalanceComponent$loadWalletData$3 walletBalanceComponent$loadWalletData$3 = new WalletBalanceComponent$loadWalletData$3(this.this$0, (Continuation) obj3);
        walletBalanceComponent$loadWalletData$3.L$0 = (ChaloUseCaseResult) obj;
        walletBalanceComponent$loadWalletData$3.L$1 = (List) obj2;
        return walletBalanceComponent$loadWalletData$3.invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x011c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0159  */
    /* JADX WARN: Path cross not found for [B:4:0x000b, B:12:0x005c], limit reached: 60 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0159 -> B:46:0x0160). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.wallet.ui.mainbalance.WalletBalanceComponent$loadWalletData$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
