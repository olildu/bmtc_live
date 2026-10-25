package app.chalo.wallet.ui.transactionsummary;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.data.WalletSetupConfiguration;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.WalletUtilsExtensionsKt;
import app.chalo.wallet.domain.GetWalletTransactionSummaryUseCase;
import app.chalo.wallet.ui.transactionsummary.model.WalletTransactionStatusForIcon;
import app.chalo.wallet.ui.transactionsummary.model.WalletTransactionSummaryNavigationModel;
import app.chalo.wallet.ui.transactionsummary.model.WalletTransactionSummaryUiModel;
import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import com.adjust.sdk.Constants;
import defpackage.hx0;
import defpackage.uf0;
import defpackage.v3;
import defpackage.va;
import java.util.LinkedHashMap;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.wallet.ui.transactionsummary.WalletTransactionSummaryComponent$handleLoadTransactionDetailsAndReclaimDuration$1", f = "WalletTransactionSummaryComponent.kt", l = {97, 99, 108, 117}, m = "invokeSuspend", v = 1)
final class WalletTransactionSummaryComponent$handleLoadTransactionDetailsAndReclaimDuration$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WalletTransactionSummaryIntent.LoadTransactionDetailsAndReclaimDuration $intent;
    long J$0;
    Object L$0;
    int label;
    final /* synthetic */ WalletTransactionSummaryComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10892a;
        public static final /* synthetic */ int[] b;

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
            f10892a = iArr;
            int[] iArr2 = new int[WalletTransactionStatusForIcon.values().length];
            try {
                iArr2[WalletTransactionStatusForIcon.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[WalletTransactionStatusForIcon.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[WalletTransactionStatusForIcon.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletTransactionSummaryComponent$handleLoadTransactionDetailsAndReclaimDuration$1(WalletTransactionSummaryComponent walletTransactionSummaryComponent, WalletTransactionSummaryIntent.LoadTransactionDetailsAndReclaimDuration loadTransactionDetailsAndReclaimDuration, Continuation continuation) {
        super(2, continuation);
        this.this$0 = walletTransactionSummaryComponent;
        this.$intent = loadTransactionDetailsAndReclaimDuration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalletTransactionSummaryComponent$handleLoadTransactionDetailsAndReclaimDuration$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WalletTransactionSummaryComponent$handleLoadTransactionDetailsAndReclaimDuration$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00be A[PHI: r2 r7
      0x00be: PHI (r2v22 java.lang.Object) = (r2v18 java.lang.Object), (r2v32 java.lang.Object) binds: [B:29:0x00bb, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r7v3 long) = (r7v2 long), (r7v10 long) binds: [B:29:0x00bb, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:39:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0159  */
    /* JADX WARN: Code duplicated, block: B:43:0x0160  */
    /* JADX WARN: Code duplicated, block: B:45:0x0166  */
    /* JADX WARN: Code duplicated, block: B:46:0x016c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0194 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0196 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0198  */
    /* JADX WARN: Code duplicated, block: B:53:0x019c  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objB;
        long j;
        Object objB2;
        WalletTypeIdentifier walletTypeIdentifier;
        boolean z;
        Object objA;
        ChaloUseCaseResult chaloUseCaseResult;
        Object objF0;
        long j2;
        ChaloUseCaseResult chaloUseCaseResult2;
        Object obj2;
        int i;
        String strL;
        int i2;
        IconType iconType;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.b(obj);
            GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase = this.this$0.o;
            this.label = 1;
            objB = getWalletSetupConfigurationUseCase.b(this);
            if (objB != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            ResultKt.b(obj);
            objB = obj;
        } else {
            if (i3 == 2) {
                j = this.J$0;
                ResultKt.b(obj);
                objB2 = obj;
                walletTypeIdentifier = (WalletTypeIdentifier) objB2;
                z = false;
                if (walletTypeIdentifier != null && walletTypeIdentifier.d) {
                    z = true;
                }
                this.this$0.E0(new va(z, 22));
                if (this.$intent.f10893a.length() != 0) {
                    GetWalletTransactionSummaryUseCase getWalletTransactionSummaryUseCase = this.this$0.l;
                    WalletTransactionSummaryIntent.LoadTransactionDetailsAndReclaimDuration loadTransactionDetailsAndReclaimDuration = this.$intent;
                    String str = loadTransactionDetailsAndReclaimDuration.f10893a;
                    WalletTransactionSummaryNavigationModel walletTransactionSummaryNavigationModel = loadTransactionDetailsAndReclaimDuration.b;
                    String str2 = walletTransactionSummaryNavigationModel.f10896a;
                    String str3 = walletTransactionSummaryNavigationModel.b;
                    WalletTransactionType walletTransactionType = walletTransactionSummaryNavigationModel.c;
                    this.J$0 = j;
                    this.label = 3;
                    objA = getWalletTransactionSummaryUseCase.a(str2, str3, walletTransactionType, this);
                    if (objA != coroutineSingletons) {
                        chaloUseCaseResult = (ChaloUseCaseResult) objA;
                        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                            WalletTransactionSummaryComponent walletTransactionSummaryComponent = this.this$0;
                            WalletTransactionType walletTransactionType2 = this.$intent.b.c;
                            WalletTransactionSummaryUiModel walletTransactionSummaryUiModel = (WalletTransactionSummaryUiModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                            this.L$0 = chaloUseCaseResult;
                            this.J$0 = j;
                            this.label = 4;
                            objF0 = WalletTransactionSummaryComponent.F0(walletTransactionSummaryComponent, walletTransactionType2, walletTransactionSummaryUiModel, this);
                            if (objF0 != coroutineSingletons) {
                                j2 = j;
                                chaloUseCaseResult2 = chaloUseCaseResult;
                            }
                        } else {
                            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.this$0.E0(new v3(j, 9));
                            KotlinToastManagerKt.a(this.this$0.s, (String) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a, ToastLength.LONG);
                        }
                    }
                    return coroutineSingletons;
                }
                this.this$0.E0(new v3(j, 8));
                KotlinToastManagerKt.a(this.this$0.s, "Invalid user", ToastLength.LONG);
                return Unit.f17538a;
            }
            if (i3 == 3) {
                j = this.J$0;
                ResultKt.b(obj);
                objA = obj;
                chaloUseCaseResult = (ChaloUseCaseResult) objA;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    WalletTransactionSummaryComponent walletTransactionSummaryComponent2 = this.this$0;
                    WalletTransactionType walletTransactionType3 = this.$intent.b.c;
                    WalletTransactionSummaryUiModel walletTransactionSummaryUiModel2 = (WalletTransactionSummaryUiModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                    this.L$0 = chaloUseCaseResult;
                    this.J$0 = j;
                    this.label = 4;
                    objF0 = WalletTransactionSummaryComponent.F0(walletTransactionSummaryComponent2, walletTransactionType3, walletTransactionSummaryUiModel2, this);
                    if (objF0 != coroutineSingletons) {
                        j2 = j;
                        chaloUseCaseResult2 = chaloUseCaseResult;
                    }
                    return coroutineSingletons;
                }
                if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.E0(new v3(j, 9));
                KotlinToastManagerKt.a(this.this$0.s, (String) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a, ToastLength.LONG);
                return Unit.f17538a;
            }
            if (i3 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = this.J$0;
            ChaloUseCaseResult chaloUseCaseResult3 = (ChaloUseCaseResult) this.L$0;
            ResultKt.b(obj);
            j2 = j3;
            chaloUseCaseResult2 = chaloUseCaseResult3;
            objF0 = obj;
        }
        boolean zBooleanValue = ((Boolean) objF0).booleanValue();
        WalletTransactionSummaryComponent walletTransactionSummaryComponent3 = this.this$0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ChaloUseCaseResult.Success success = (ChaloUseCaseResult.Success) chaloUseCaseResult2;
        Object obj3 = success.f10419a;
        obj2 = success.f10419a;
        WalletTransactionSummaryUiModel walletTransactionSummaryUiModel3 = (WalletTransactionSummaryUiModel) obj3;
        walletTransactionSummaryComponent3.getClass();
        linkedHashMap.put("wallet transaction summary amount", walletTransactionSummaryUiModel3.f10898a);
        linkedHashMap.put("wallet transaction summary time", walletTransactionSummaryUiModel3.b);
        linkedHashMap.put("wallet transaction summary orderId", walletTransactionSummaryUiModel3.c);
        linkedHashMap.put("wallet transaction summary transaction status", walletTransactionSummaryUiModel3.h);
        linkedHashMap.put("wallet transaction summary transaction type", walletTransactionSummaryUiModel3.i.name());
        linkedHashMap.put("wallet transaction summary mode of payment", walletTransactionSummaryUiModel3.e);
        AnalyticsContract.DefaultImpls.a(walletTransactionSummaryComponent3.m, "wallet transaction summary ui model data fetched", Source.WALLET_TRANSACTION_SUMMARY.getSourceName(), linkedHashMap, null, false, 24);
        i = WhenMappings.f10892a[this.$intent.b.c.ordinal()];
        if (i != 1) {
            strL = uf0.l(((Number) WalletUtilsExtensionsKt.b(((WalletTransactionSummaryUiModel) obj2).c).e()).longValue(), "cp_");
        } else if (i != 2) {
            strL = ((WalletTransactionSummaryUiModel) obj2).c;
        } else {
            if (i == 3) {
                throw new NoWhenBranchMatchedException();
            }
            strL = ((WalletTransactionSummaryUiModel) obj2).d;
        }
        String str4 = strL;
        i2 = WhenMappings.b[((WalletTransactionSummaryUiModel) obj2).j.ordinal()];
        if (i2 != 1) {
            iconType = IconType.WALLET_TRANSACTION_FAILED;
        } else if (i2 != 2) {
            iconType = IconType.WALLET_TRANSACTION_SUCCESS;
        } else {
            if (i2 == 3) {
                throw new NoWhenBranchMatchedException();
            }
            iconType = IconType.WALLET_TRANSACTION_PENDING;
        }
        this.this$0.E0(new hx0(chaloUseCaseResult2, str4, zBooleanValue, iconType, j2, 2));
        return Unit.f17538a;
        j = ((WalletSetupConfiguration) objB).b / ((long) Constants.ONE_HOUR);
        WalletResolver walletResolver = this.this$0.t;
        this.J$0 = j;
        this.label = 2;
        objB2 = walletResolver.b(this);
        if (objB2 != coroutineSingletons) {
            walletTypeIdentifier = (WalletTypeIdentifier) objB2;
            z = false;
            if (walletTypeIdentifier != null) {
                z = true;
            }
            this.this$0.E0(new va(z, 22));
            if (this.$intent.f10893a.length() != 0) {
                this.this$0.E0(new v3(j, 8));
                KotlinToastManagerKt.a(this.this$0.s, "Invalid user", ToastLength.LONG);
            } else {
                GetWalletTransactionSummaryUseCase getWalletTransactionSummaryUseCase2 = this.this$0.l;
                WalletTransactionSummaryIntent.LoadTransactionDetailsAndReclaimDuration loadTransactionDetailsAndReclaimDuration2 = this.$intent;
                String str5 = loadTransactionDetailsAndReclaimDuration2.f10893a;
                WalletTransactionSummaryNavigationModel walletTransactionSummaryNavigationModel2 = loadTransactionDetailsAndReclaimDuration2.b;
                String str6 = walletTransactionSummaryNavigationModel2.f10896a;
                String str7 = walletTransactionSummaryNavigationModel2.b;
                WalletTransactionType walletTransactionType4 = walletTransactionSummaryNavigationModel2.c;
                this.J$0 = j;
                this.label = 3;
                objA = getWalletTransactionSummaryUseCase2.a(str6, str7, walletTransactionType4, this);
                if (objA != coroutineSingletons) {
                    chaloUseCaseResult = (ChaloUseCaseResult) objA;
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                        WalletTransactionSummaryComponent walletTransactionSummaryComponent4 = this.this$0;
                        WalletTransactionType walletTransactionType5 = this.$intent.b.c;
                        WalletTransactionSummaryUiModel walletTransactionSummaryUiModel4 = (WalletTransactionSummaryUiModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                        this.L$0 = chaloUseCaseResult;
                        this.J$0 = j;
                        this.label = 4;
                        objF0 = WalletTransactionSummaryComponent.F0(walletTransactionSummaryComponent4, walletTransactionType5, walletTransactionSummaryUiModel4, this);
                        if (objF0 != coroutineSingletons) {
                            j2 = j;
                            chaloUseCaseResult2 = chaloUseCaseResult;
                            boolean zBooleanValue2 = ((Boolean) objF0).booleanValue();
                            WalletTransactionSummaryComponent walletTransactionSummaryComponent5 = this.this$0;
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            ChaloUseCaseResult.Success success2 = (ChaloUseCaseResult.Success) chaloUseCaseResult2;
                            Object obj4 = success2.f10419a;
                            obj2 = success2.f10419a;
                            WalletTransactionSummaryUiModel walletTransactionSummaryUiModel5 = (WalletTransactionSummaryUiModel) obj4;
                            walletTransactionSummaryComponent5.getClass();
                            linkedHashMap2.put("wallet transaction summary amount", walletTransactionSummaryUiModel5.f10898a);
                            linkedHashMap2.put("wallet transaction summary time", walletTransactionSummaryUiModel5.b);
                            linkedHashMap2.put("wallet transaction summary orderId", walletTransactionSummaryUiModel5.c);
                            linkedHashMap2.put("wallet transaction summary transaction status", walletTransactionSummaryUiModel5.h);
                            linkedHashMap2.put("wallet transaction summary transaction type", walletTransactionSummaryUiModel5.i.name());
                            linkedHashMap2.put("wallet transaction summary mode of payment", walletTransactionSummaryUiModel5.e);
                            AnalyticsContract.DefaultImpls.a(walletTransactionSummaryComponent5.m, "wallet transaction summary ui model data fetched", Source.WALLET_TRANSACTION_SUMMARY.getSourceName(), linkedHashMap2, null, false, 24);
                            i = WhenMappings.f10892a[this.$intent.b.c.ordinal()];
                            if (i != 1) {
                                strL = uf0.l(((Number) WalletUtilsExtensionsKt.b(((WalletTransactionSummaryUiModel) obj2).c).e()).longValue(), "cp_");
                            } else if (i != 2) {
                                strL = ((WalletTransactionSummaryUiModel) obj2).c;
                            } else {
                                if (i == 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                strL = ((WalletTransactionSummaryUiModel) obj2).d;
                            }
                            String str8 = strL;
                            i2 = WhenMappings.b[((WalletTransactionSummaryUiModel) obj2).j.ordinal()];
                            if (i2 != 1) {
                                iconType = IconType.WALLET_TRANSACTION_FAILED;
                            } else if (i2 != 2) {
                                iconType = IconType.WALLET_TRANSACTION_SUCCESS;
                            } else {
                                if (i2 == 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iconType = IconType.WALLET_TRANSACTION_PENDING;
                            }
                            this.this$0.E0(new hx0(chaloUseCaseResult2, str8, zBooleanValue2, iconType, j2, 2));
                        }
                    } else {
                        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.this$0.E0(new v3(j, 9));
                        KotlinToastManagerKt.a(this.this$0.s, (String) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a, ToastLength.LONG);
                    }
                }
            }
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }
}
