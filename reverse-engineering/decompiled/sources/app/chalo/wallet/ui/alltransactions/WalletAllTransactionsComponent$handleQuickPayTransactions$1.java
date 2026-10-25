package app.chalo.wallet.ui.alltransactions;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent$handleQuickPayTransactions$1", f = "WalletAllTransactionsComponent.kt", l = {176, 184}, m = "invokeSuspend", v = 1)
final class WalletAllTransactionsComponent$handleQuickPayTransactions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WalletAllTransactionsIntent.QuickPayTransactions $intent;
    int label;
    final /* synthetic */ WalletAllTransactionsComponent this$0;

    /* JADX INFO: renamed from: app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent$handleQuickPayTransactions$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WalletAllTransactionsComponent f10816a;
        public final /* synthetic */ long b;

        public AnonymousClass2(WalletAllTransactionsComponent walletAllTransactionsComponent, long j) {
            this.f10816a = walletAllTransactionsComponent;
            this.b = j;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:28:0x00c3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c4 -> B:30:0x00c7). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List r14, kotlin.coroutines.Continuation r15) {
            /*
                Method dump skipped, instruction units count: 225
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent$handleQuickPayTransactions$1.AnonymousClass2.emit(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAllTransactionsComponent$handleQuickPayTransactions$1(WalletAllTransactionsComponent walletAllTransactionsComponent, WalletAllTransactionsIntent.QuickPayTransactions quickPayTransactions, Continuation continuation) {
        super(2, continuation);
        this.this$0 = walletAllTransactionsComponent;
        this.$intent = quickPayTransactions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalletAllTransactionsComponent$handleQuickPayTransactions$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WalletAllTransactionsComponent$handleQuickPayTransactions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        if (r8.collect(r1, r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r8)
            goto L65
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L18:
            kotlin.ResultKt.b(r8)
            goto L2c
        L1c:
            kotlin.ResultKt.b(r8)
            app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent r8 = r7.this$0
            app.chalo.domain.GetWalletSetupConfigurationUseCase r8 = r8.q
            r7.label = r3
            java.lang.Object r8 = r8.b(r7)
            if (r8 != r0) goto L2c
            goto L64
        L2c:
            app.chalo.data.WalletSetupConfiguration r8 = (app.chalo.data.WalletSetupConfiguration) r8
            long r3 = r8.b
            r8 = 3600000(0x36ee80, float:5.044674E-39)
            long r5 = (long) r8
            long r3 = r3 / r5
            app.chalo.wallet.ui.alltransactions.WalletAllTransactionsIntent$QuickPayTransactions r8 = r7.$intent
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r8 = r8.b
            boolean r8 = r8.d
            app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent r1 = r7.this$0
            va r5 = new va
            r6 = 20
            r5.<init>(r8, r6)
            r1.E0(r5)
            app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent r8 = r7.this$0
            app.chalo.walletframework.wallet.data.repository.WalletRepository r8 = r8.l
            app.chalo.wallet.ui.alltransactions.WalletAllTransactionsIntent$QuickPayTransactions r1 = r7.$intent
            java.lang.String r5 = r1.f10819a
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r1 = r1.b
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest r8 = r8.w(r5, r1)
            app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent$handleQuickPayTransactions$1$2 r1 = new app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent$handleQuickPayTransactions$1$2
            app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent r5 = r7.this$0
            r1.<init>(r5, r3)
            r7.label = r2
            java.lang.Object r8 = r8.collect(r1, r7)
            if (r8 != r0) goto L65
        L64:
            return r0
        L65:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent$handleQuickPayTransactions$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
