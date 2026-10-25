package app.chalo.wallet.ui.alltransactions;

import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import app.chalo.walletframework.wallet.data.model.appmodel.ChaloPayResponseAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletTransactionAppModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent$handleLoadAllTransactions$1", f = "WalletAllTransactionsComponent.kt", l = {96, 107}, m = "invokeSuspend", v = 1)
final class WalletAllTransactionsComponent$handleLoadAllTransactions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WalletAllTransactionsIntent.LoadAllTransactions $intent;
    int label;
    final /* synthetic */ WalletAllTransactionsComponent this$0;

    /* JADX INFO: renamed from: app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent$handleLoadAllTransactions$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0002H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lapp/chalo/walletframework/wallet/data/model/appmodel/WalletTransactionAppModel;", "Lapp/chalo/walletframework/wallet/data/model/appmodel/ChaloPayResponseAppModel;", "transactionsList", "chaloPayTransactionList"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent$handleLoadAllTransactions$1$2", f = "WalletAllTransactionsComponent.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function3<List<? extends WalletTransactionAppModel>, List<? extends ChaloPayResponseAppModel>, Continuation<? super Pair<? extends List<? extends WalletTransactionAppModel>, ? extends List<? extends ChaloPayResponseAppModel>>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(3, (Continuation) obj3);
            anonymousClass2.L$0 = (List) obj;
            anonymousClass2.L$1 = (List) obj2;
            return anonymousClass2.invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return new Pair((List) this.L$0, (List) this.L$1);
        }
    }

    /* JADX INFO: renamed from: app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent$handleLoadAllTransactions$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass3<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WalletAllTransactionsComponent f10814a;
        public final /* synthetic */ long b;

        /* JADX INFO: renamed from: app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent$handleLoadAllTransactions$1$3$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f10815a;

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
                f10815a = iArr;
            }
        }

        public AnonymousClass3(WalletAllTransactionsComponent walletAllTransactionsComponent, long j) {
            this.f10814a = walletAllTransactionsComponent;
            this.b = j;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0084  */
        /* JADX WARN: Code duplicated, block: B:19:0x0096  */
        /* JADX WARN: Code duplicated, block: B:37:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:40:0x00f1 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:41:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f2 -> B:42:0x00f8). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(kotlin.Pair r19, kotlin.coroutines.Continuation r20) {
            /*
                Method dump skipped, instruction units count: 277
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent$handleLoadAllTransactions$1.AnonymousClass3.emit(kotlin.Pair, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAllTransactionsComponent$handleLoadAllTransactions$1(WalletAllTransactionsComponent walletAllTransactionsComponent, WalletAllTransactionsIntent.LoadAllTransactions loadAllTransactions, Continuation continuation) {
        super(2, continuation);
        this.this$0 = walletAllTransactionsComponent;
        this.$intent = loadAllTransactions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalletAllTransactionsComponent$handleLoadAllTransactions$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WalletAllTransactionsComponent$handleLoadAllTransactions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0076, code lost:
    
        if (r6.collect(r9, r8) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r9)
            goto L79
        L10:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L18:
            kotlin.ResultKt.b(r9)
            goto L2c
        L1c:
            kotlin.ResultKt.b(r9)
            app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent r9 = r8.this$0
            app.chalo.domain.GetWalletSetupConfigurationUseCase r9 = r9.q
            r8.label = r3
            java.lang.Object r9 = r9.b(r8)
            if (r9 != r0) goto L2c
            goto L78
        L2c:
            app.chalo.data.WalletSetupConfiguration r9 = (app.chalo.data.WalletSetupConfiguration) r9
            long r3 = r9.b
            r9 = 3600000(0x36ee80, float:5.044674E-39)
            long r5 = (long) r9
            long r3 = r3 / r5
            app.chalo.wallet.ui.alltransactions.WalletAllTransactionsIntent$LoadAllTransactions r9 = r8.$intent
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r9 = r9.b
            boolean r9 = r9.d
            app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent r1 = r8.this$0
            va r5 = new va
            r6 = 19
            r5.<init>(r9, r6)
            r1.E0(r5)
            app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent r9 = r8.this$0
            app.chalo.walletframework.wallet.data.repository.WalletRepository r9 = r9.l
            app.chalo.wallet.ui.alltransactions.WalletAllTransactionsIntent$LoadAllTransactions r1 = r8.$intent
            java.lang.String r5 = r1.f10818a
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r1 = r1.b
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest r9 = r9.w(r5, r1)
            app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent r1 = r8.this$0
            app.chalo.walletframework.wallet.data.repository.WalletRepository r1 = r1.l
            app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getChaloPayTransactionAppModelListAsFlow$$inlined$map$1 r1 = r1.v()
            app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent$handleLoadAllTransactions$1$2 r5 = new app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent$handleLoadAllTransactions$1$2
            r6 = 0
            r7 = 3
            r5.<init>(r7, r6)
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 r6 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1
            r6.<init>(r9, r1, r5)
            app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent$handleLoadAllTransactions$1$3 r9 = new app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent$handleLoadAllTransactions$1$3
            app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent r1 = r8.this$0
            r9.<init>(r1, r3)
            r8.label = r2
            java.lang.Object r9 = r6.collect(r9, r8)
            if (r9 != r0) goto L79
        L78:
            return r0
        L79:
            kotlin.Unit r9 = kotlin.Unit.f17538a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent$handleLoadAllTransactions$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
