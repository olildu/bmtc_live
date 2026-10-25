package app.chalo.instantticket.ui.instantticketscreen;

import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.data.WalletSetupConfiguration;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.instantticket.config.models.InstantTicketConfiguration;
import app.chalo.premiumbus.helper.InstantTicketConfigHelper;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.WalletStatus;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.domain.GetWalletStatusUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletStatusWithoutSyncUseCase;
import app.chalo.walletframework.wallet.domain.WalletStatusWithReclaimTime;
import defpackage.gb0;
import defpackage.gf;
import defpackage.n10;
import defpackage.va;
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
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessComponent$handleProceedBtnClicked$1", f = "InstantTicketWalletAccessComponent.kt", l = {108, 114, 120, WebSocketProtocol.PAYLOAD_SHORT, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 133, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, TsExtractor.TS_STREAM_TYPE_DTS_HD, 140, 167}, m = "invokeSuspend", v = 1)
final class InstantTicketWalletAccessComponent$handleProceedBtnClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $amountEnteredInRupee;
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ InstantTicketWalletAccessComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantTicketWalletAccessComponent$handleProceedBtnClicked$1(InstantTicketWalletAccessComponent instantTicketWalletAccessComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = instantTicketWalletAccessComponent;
        this.$amountEnteredInRupee = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InstantTicketWalletAccessComponent$handleProceedBtnClicked$1 instantTicketWalletAccessComponent$handleProceedBtnClicked$1 = new InstantTicketWalletAccessComponent$handleProceedBtnClicked$1(this.this$0, this.$amountEnteredInRupee, continuation);
        instantTicketWalletAccessComponent$handleProceedBtnClicked$1.L$0 = obj;
        return instantTicketWalletAccessComponent$handleProceedBtnClicked$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstantTicketWalletAccessComponent$handleProceedBtnClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f9 A[PHI: r2 r3 r10
      0x00f9: PHI (r2v9 boolean) = (r2v7 boolean), (r2v18 boolean) binds: [B:30:0x00f5, B:16:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r3v12 java.lang.Object) = (r3v10 java.lang.Object), (r3v18 java.lang.Object) binds: [B:30:0x00f5, B:16:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r10v14 kotlinx.coroutines.CoroutineScope) = (r10v11 kotlinx.coroutines.CoroutineScope), (r10v16 kotlinx.coroutines.CoroutineScope) binds: [B:30:0x00f5, B:16:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0101  */
    /* JADX WARN: Code duplicated, block: B:37:0x0108  */
    /* JADX WARN: Code duplicated, block: B:40:0x0116  */
    /* JADX WARN: Code duplicated, block: B:43:0x0125 A[PHI: r2
      0x0125: PHI (r2v19 java.lang.Object) = (r2v17 java.lang.Object), (r2v23 java.lang.Object) binds: [B:41:0x0121, B:15:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0129  */
    /* JADX WARN: Code duplicated, block: B:47:0x012f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0140 A[PHI: r2 r3
      0x0140: PHI (r2v24 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) = 
      (r2v20 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
      (r2v28 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
     binds: [B:48:0x013c, B:14:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0140: PHI (r3v22 java.lang.Object) = (r3v21 java.lang.Object), (r3v34 java.lang.Object) binds: [B:48:0x013c, B:14:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0146  */
    /* JADX WARN: Code duplicated, block: B:54:0x0152  */
    /* JADX WARN: Code duplicated, block: B:57:0x0163 A[PHI: r2 r3
      0x0163: PHI (r2v29 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) = 
      (r2v24 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
      (r2v32 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
     binds: [B:55:0x015f, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x0163: PHI (r3v35 java.lang.Object) = (r3v33 java.lang.Object), (r3v37 java.lang.Object) binds: [B:55:0x015f, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0176  */
    /* JADX WARN: Code duplicated, block: B:63:0x0187  */
    /* JADX WARN: Code duplicated, block: B:65:0x018b  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:76:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:81:0x01fa  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object objB;
        InstantTicketConfiguration instantTicketConfiguration;
        boolean z;
        Object objB2;
        CoroutineScope coroutineScope2;
        boolean z2;
        Object objB3;
        boolean z3;
        KotlinToastManager kotlinToastManager;
        Object objB4;
        KotlinToastManager kotlinToastManager2;
        Object objI0;
        WalletTypeIdentifier walletTypeIdentifier;
        Object objA;
        ChaloUseCaseResult chaloUseCaseResult;
        InstantTicketWalletAccessComponent instantTicketWalletAccessComponent;
        WalletStatus walletStatus;
        String str;
        WalletStatus walletStatus2;
        InstantTicketWalletAccessComponent instantTicketWalletAccessComponent2;
        String str2;
        Object objA2;
        InstantTicketWalletAccessComponent instantTicketWalletAccessComponent3;
        String str3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 6;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                ResultKt.b(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                this.this$0.E0(new n10(this.$amountEnteredInRupee, 13));
                this.this$0.M0(true);
                InstantTicketConfigHelper instantTicketConfigHelper = this.this$0.C;
                this.L$0 = coroutineScope;
                this.label = 1;
                objB = instantTicketConfigHelper.b(true, this);
                if (objB != coroutineSingletons) {
                    instantTicketConfiguration = (InstantTicketConfiguration) objB;
                    if (instantTicketConfiguration != null) {
                        z = instantTicketConfiguration.k;
                        this.this$0.E0(new va(z, i2));
                        long j = instantTicketConfiguration.j;
                        StringProvider stringProvider = this.this$0.v;
                        StringEnum stringEnum = StringEnum.INSTANT_TICKET_ACTIVATION_MESSAGE;
                        Object[] objArr = {String.valueOf((int) ((j / ((long) 1000)) / ((long) 60)))};
                        this.L$0 = coroutineScope;
                        this.Z$0 = z;
                        this.label = 2;
                        objB2 = stringProvider.b(stringEnum, objArr, this);
                        if (objB2 != coroutineSingletons) {
                            coroutineScope2 = coroutineScope;
                            z2 = z;
                            this.this$0.E0(new n10((String) objB2, 14));
                            GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase = this.this$0.z;
                            this.L$0 = coroutineScope2;
                            this.Z$0 = z2;
                            this.label = 3;
                            objB3 = getWalletSetupConfigurationUseCase.b(this);
                            if (objB3 != coroutineSingletons) {
                                WalletSetupConfiguration walletSetupConfiguration = (WalletSetupConfiguration) objB3;
                                z3 = !walletSetupConfiguration.b() && walletSetupConfiguration.a();
                                this.this$0.E0(new va(z3, 7));
                                if (z3) {
                                    InstantTicketWalletAccessComponent instantTicketWalletAccessComponent4 = this.this$0;
                                    this.L$0 = coroutineScope2;
                                    this.label = 4;
                                    objI0 = InstantTicketWalletAccessComponent.I0(instantTicketWalletAccessComponent4, this);
                                    if (objI0 != coroutineSingletons) {
                                        walletTypeIdentifier = (WalletTypeIdentifier) objI0;
                                        if (walletTypeIdentifier == null) {
                                            this.this$0.M0(false);
                                            return unit;
                                        }
                                        GetWalletStatusWithoutSyncUseCase getWalletStatusWithoutSyncUseCase = this.this$0.m;
                                        this.L$0 = walletTypeIdentifier;
                                        this.label = 5;
                                        objA = getWalletStatusWithoutSyncUseCase.a(walletTypeIdentifier, this);
                                        if (objA != coroutineSingletons) {
                                            chaloUseCaseResult = (ChaloUseCaseResult) objA;
                                            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                                                walletStatus2 = ((WalletStatusWithReclaimTime) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).f11077a;
                                                if (walletStatus2 != WalletStatus.KYC_INITIATED) {
                                                    GetWalletStatusUseCase getWalletStatusUseCase = this.this$0.k;
                                                    this.L$0 = walletTypeIdentifier;
                                                    this.label = 6;
                                                    objA2 = getWalletStatusUseCase.a(walletTypeIdentifier, this);
                                                    if (objA2 != coroutineSingletons) {
                                                        instantTicketWalletAccessComponent3 = this.this$0;
                                                        str3 = this.$amountEnteredInRupee;
                                                        this.L$0 = null;
                                                        this.label = 7;
                                                        if (InstantTicketWalletAccessComponent.H0(instantTicketWalletAccessComponent3, (WalletStatus) objA2, str3, walletTypeIdentifier, this) == coroutineSingletons) {
                                                        }
                                                    }
                                                } else {
                                                    instantTicketWalletAccessComponent2 = this.this$0;
                                                    str2 = this.$amountEnteredInRupee;
                                                    this.L$0 = null;
                                                    this.label = 8;
                                                    if (InstantTicketWalletAccessComponent.H0(instantTicketWalletAccessComponent2, walletStatus2, str2, walletTypeIdentifier, this) == coroutineSingletons) {
                                                    }
                                                }
                                            } else {
                                                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                instantTicketWalletAccessComponent = this.this$0;
                                                walletStatus = (WalletStatus) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                                                str = this.$amountEnteredInRupee;
                                                this.L$0 = null;
                                                this.label = 9;
                                                if (InstantTicketWalletAccessComponent.H0(instantTicketWalletAccessComponent, walletStatus, str, walletTypeIdentifier, this) != coroutineSingletons) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (z2) {
                                        if (((Boolean) this.this$0.x.getG().getValue()).booleanValue()) {
                                            this.this$0.M0(false);
                                            this.this$0.r0(InstantTicketWalletAccessSideEffect.HideKeyboard.f3958a);
                                            this.this$0.r0(InstantTicketWalletAccessSideEffect.OpenBottomSheet.f3959a);
                                            return unit;
                                        }
                                        InstantTicketWalletAccessComponent instantTicketWalletAccessComponent5 = this.this$0;
                                        instantTicketWalletAccessComponent5.E0(new gb0(instantTicketWalletAccessComponent5, 2));
                                        this.this$0.M0(false);
                                        return unit;
                                    }
                                    InstantTicketWalletAccessComponent instantTicketWalletAccessComponent6 = this.this$0;
                                    kotlinToastManager = instantTicketWalletAccessComponent6.B;
                                    this.L$0 = kotlinToastManager;
                                    this.label = 10;
                                    objB4 = instantTicketWalletAccessComponent6.v.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                                    if (objB4 != coroutineSingletons) {
                                        kotlinToastManager2 = kotlinToastManager;
                                        KotlinToastManagerKt.a(kotlinToastManager2, (String) objB4, ToastLength.LONG);
                                        gf.u(null, this.this$0.A);
                                        return unit;
                                    }
                                }
                            }
                        }
                    }
                    return unit;
                }
                return coroutineSingletons;
            case 1:
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.b(obj);
                objB = obj;
                instantTicketConfiguration = (InstantTicketConfiguration) objB;
                if (instantTicketConfiguration != null) {
                    z = instantTicketConfiguration.k;
                    this.this$0.E0(new va(z, i2));
                    long j2 = instantTicketConfiguration.j;
                    StringProvider stringProvider2 = this.this$0.v;
                    StringEnum stringEnum2 = StringEnum.INSTANT_TICKET_ACTIVATION_MESSAGE;
                    Object[] objArr2 = {String.valueOf((int) ((j2 / ((long) 1000)) / ((long) 60)))};
                    this.L$0 = coroutineScope;
                    this.Z$0 = z;
                    this.label = 2;
                    objB2 = stringProvider2.b(stringEnum2, objArr2, this);
                    if (objB2 != coroutineSingletons) {
                        coroutineScope2 = coroutineScope;
                        z2 = z;
                        this.this$0.E0(new n10((String) objB2, 14));
                        GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase2 = this.this$0.z;
                        this.L$0 = coroutineScope2;
                        this.Z$0 = z2;
                        this.label = 3;
                        objB3 = getWalletSetupConfigurationUseCase2.b(this);
                        if (objB3 != coroutineSingletons) {
                            WalletSetupConfiguration walletSetupConfiguration2 = (WalletSetupConfiguration) objB3;
                            if (walletSetupConfiguration2.b()) {
                            }
                            this.this$0.E0(new va(z3, 7));
                            if (z3) {
                                InstantTicketWalletAccessComponent instantTicketWalletAccessComponent7 = this.this$0;
                                this.L$0 = coroutineScope2;
                                this.label = 4;
                                objI0 = InstantTicketWalletAccessComponent.I0(instantTicketWalletAccessComponent7, this);
                                if (objI0 != coroutineSingletons) {
                                    walletTypeIdentifier = (WalletTypeIdentifier) objI0;
                                    if (walletTypeIdentifier == null) {
                                        this.this$0.M0(false);
                                        return unit;
                                    }
                                    GetWalletStatusWithoutSyncUseCase getWalletStatusWithoutSyncUseCase2 = this.this$0.m;
                                    this.L$0 = walletTypeIdentifier;
                                    this.label = 5;
                                    objA = getWalletStatusWithoutSyncUseCase2.a(walletTypeIdentifier, this);
                                    if (objA != coroutineSingletons) {
                                        chaloUseCaseResult = (ChaloUseCaseResult) objA;
                                        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                                            walletStatus2 = ((WalletStatusWithReclaimTime) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).f11077a;
                                            if (walletStatus2 != WalletStatus.KYC_INITIATED) {
                                                GetWalletStatusUseCase getWalletStatusUseCase2 = this.this$0.k;
                                                this.L$0 = walletTypeIdentifier;
                                                this.label = 6;
                                                objA2 = getWalletStatusUseCase2.a(walletTypeIdentifier, this);
                                                if (objA2 != coroutineSingletons) {
                                                    instantTicketWalletAccessComponent3 = this.this$0;
                                                    str3 = this.$amountEnteredInRupee;
                                                    this.L$0 = null;
                                                    this.label = 7;
                                                    if (InstantTicketWalletAccessComponent.H0(instantTicketWalletAccessComponent3, (WalletStatus) objA2, str3, walletTypeIdentifier, this) == coroutineSingletons) {
                                                    }
                                                }
                                            } else {
                                                instantTicketWalletAccessComponent2 = this.this$0;
                                                str2 = this.$amountEnteredInRupee;
                                                this.L$0 = null;
                                                this.label = 8;
                                                if (InstantTicketWalletAccessComponent.H0(instantTicketWalletAccessComponent2, walletStatus2, str2, walletTypeIdentifier, this) == coroutineSingletons) {
                                                }
                                            }
                                        } else {
                                            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            instantTicketWalletAccessComponent = this.this$0;
                                            walletStatus = (WalletStatus) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                                            str = this.$amountEnteredInRupee;
                                            this.L$0 = null;
                                            this.label = 9;
                                            if (InstantTicketWalletAccessComponent.H0(instantTicketWalletAccessComponent, walletStatus, str, walletTypeIdentifier, this) != coroutineSingletons) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (z2) {
                                    if (((Boolean) this.this$0.x.getG().getValue()).booleanValue()) {
                                        InstantTicketWalletAccessComponent instantTicketWalletAccessComponent8 = this.this$0;
                                        instantTicketWalletAccessComponent8.E0(new gb0(instantTicketWalletAccessComponent8, 2));
                                        this.this$0.M0(false);
                                        return unit;
                                    }
                                    this.this$0.M0(false);
                                    this.this$0.r0(InstantTicketWalletAccessSideEffect.HideKeyboard.f3958a);
                                    this.this$0.r0(InstantTicketWalletAccessSideEffect.OpenBottomSheet.f3959a);
                                    return unit;
                                }
                                InstantTicketWalletAccessComponent instantTicketWalletAccessComponent9 = this.this$0;
                                kotlinToastManager = instantTicketWalletAccessComponent9.B;
                                this.L$0 = kotlinToastManager;
                                this.label = 10;
                                objB4 = instantTicketWalletAccessComponent9.v.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                                if (objB4 != coroutineSingletons) {
                                    kotlinToastManager2 = kotlinToastManager;
                                    KotlinToastManagerKt.a(kotlinToastManager2, (String) objB4, ToastLength.LONG);
                                    gf.u(null, this.this$0.A);
                                    return unit;
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                return unit;
            case 2:
                z2 = this.Z$0;
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.b(obj);
                objB2 = obj;
                this.this$0.E0(new n10((String) objB2, 14));
                GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase3 = this.this$0.z;
                this.L$0 = coroutineScope2;
                this.Z$0 = z2;
                this.label = 3;
                objB3 = getWalletSetupConfigurationUseCase3.b(this);
                if (objB3 != coroutineSingletons) {
                    WalletSetupConfiguration walletSetupConfiguration3 = (WalletSetupConfiguration) objB3;
                    if (walletSetupConfiguration3.b()) {
                    }
                    this.this$0.E0(new va(z3, 7));
                    if (z3) {
                        InstantTicketWalletAccessComponent instantTicketWalletAccessComponent10 = this.this$0;
                        this.L$0 = coroutineScope2;
                        this.label = 4;
                        objI0 = InstantTicketWalletAccessComponent.I0(instantTicketWalletAccessComponent10, this);
                        if (objI0 != coroutineSingletons) {
                            walletTypeIdentifier = (WalletTypeIdentifier) objI0;
                            if (walletTypeIdentifier == null) {
                                this.this$0.M0(false);
                                return unit;
                            }
                            GetWalletStatusWithoutSyncUseCase getWalletStatusWithoutSyncUseCase3 = this.this$0.m;
                            this.L$0 = walletTypeIdentifier;
                            this.label = 5;
                            objA = getWalletStatusWithoutSyncUseCase3.a(walletTypeIdentifier, this);
                            if (objA != coroutineSingletons) {
                                chaloUseCaseResult = (ChaloUseCaseResult) objA;
                                if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                                    walletStatus2 = ((WalletStatusWithReclaimTime) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).f11077a;
                                    if (walletStatus2 != WalletStatus.KYC_INITIATED) {
                                        GetWalletStatusUseCase getWalletStatusUseCase3 = this.this$0.k;
                                        this.L$0 = walletTypeIdentifier;
                                        this.label = 6;
                                        objA2 = getWalletStatusUseCase3.a(walletTypeIdentifier, this);
                                        if (objA2 != coroutineSingletons) {
                                            instantTicketWalletAccessComponent3 = this.this$0;
                                            str3 = this.$amountEnteredInRupee;
                                            this.L$0 = null;
                                            this.label = 7;
                                            if (InstantTicketWalletAccessComponent.H0(instantTicketWalletAccessComponent3, (WalletStatus) objA2, str3, walletTypeIdentifier, this) == coroutineSingletons) {
                                                return unit;
                                            }
                                        }
                                    } else {
                                        instantTicketWalletAccessComponent2 = this.this$0;
                                        str2 = this.$amountEnteredInRupee;
                                        this.L$0 = null;
                                        this.label = 8;
                                        if (InstantTicketWalletAccessComponent.H0(instantTicketWalletAccessComponent2, walletStatus2, str2, walletTypeIdentifier, this) == coroutineSingletons) {
                                            return unit;
                                        }
                                    }
                                } else {
                                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    instantTicketWalletAccessComponent = this.this$0;
                                    walletStatus = (WalletStatus) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                                    str = this.$amountEnteredInRupee;
                                    this.L$0 = null;
                                    this.label = 9;
                                    if (InstantTicketWalletAccessComponent.H0(instantTicketWalletAccessComponent, walletStatus, str, walletTypeIdentifier, this) != coroutineSingletons) {
                                        return unit;
                                    }
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            if (((Boolean) this.this$0.x.getG().getValue()).booleanValue()) {
                                InstantTicketWalletAccessComponent instantTicketWalletAccessComponent11 = this.this$0;
                                instantTicketWalletAccessComponent11.E0(new gb0(instantTicketWalletAccessComponent11, 2));
                                this.this$0.M0(false);
                                return unit;
                            }
                            this.this$0.M0(false);
                            this.this$0.r0(InstantTicketWalletAccessSideEffect.HideKeyboard.f3958a);
                            this.this$0.r0(InstantTicketWalletAccessSideEffect.OpenBottomSheet.f3959a);
                            return unit;
                        }
                        InstantTicketWalletAccessComponent instantTicketWalletAccessComponent12 = this.this$0;
                        kotlinToastManager = instantTicketWalletAccessComponent12.B;
                        this.L$0 = kotlinToastManager;
                        this.label = 10;
                        objB4 = instantTicketWalletAccessComponent12.v.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                        if (objB4 != coroutineSingletons) {
                            kotlinToastManager2 = kotlinToastManager;
                            KotlinToastManagerKt.a(kotlinToastManager2, (String) objB4, ToastLength.LONG);
                            gf.u(null, this.this$0.A);
                            return unit;
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                z2 = this.Z$0;
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.b(obj);
                objB3 = obj;
                WalletSetupConfiguration walletSetupConfiguration4 = (WalletSetupConfiguration) objB3;
                if (walletSetupConfiguration4.b()) {
                }
                this.this$0.E0(new va(z3, 7));
                if (z3) {
                    InstantTicketWalletAccessComponent instantTicketWalletAccessComponent13 = this.this$0;
                    this.L$0 = coroutineScope2;
                    this.label = 4;
                    objI0 = InstantTicketWalletAccessComponent.I0(instantTicketWalletAccessComponent13, this);
                    if (objI0 != coroutineSingletons) {
                        walletTypeIdentifier = (WalletTypeIdentifier) objI0;
                        if (walletTypeIdentifier == null) {
                            this.this$0.M0(false);
                            return unit;
                        }
                        GetWalletStatusWithoutSyncUseCase getWalletStatusWithoutSyncUseCase4 = this.this$0.m;
                        this.L$0 = walletTypeIdentifier;
                        this.label = 5;
                        objA = getWalletStatusWithoutSyncUseCase4.a(walletTypeIdentifier, this);
                        if (objA != coroutineSingletons) {
                            chaloUseCaseResult = (ChaloUseCaseResult) objA;
                            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                                walletStatus2 = ((WalletStatusWithReclaimTime) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).f11077a;
                                if (walletStatus2 != WalletStatus.KYC_INITIATED) {
                                    GetWalletStatusUseCase getWalletStatusUseCase4 = this.this$0.k;
                                    this.L$0 = walletTypeIdentifier;
                                    this.label = 6;
                                    objA2 = getWalletStatusUseCase4.a(walletTypeIdentifier, this);
                                    if (objA2 != coroutineSingletons) {
                                        instantTicketWalletAccessComponent3 = this.this$0;
                                        str3 = this.$amountEnteredInRupee;
                                        this.L$0 = null;
                                        this.label = 7;
                                        if (InstantTicketWalletAccessComponent.H0(instantTicketWalletAccessComponent3, (WalletStatus) objA2, str3, walletTypeIdentifier, this) == coroutineSingletons) {
                                            return unit;
                                        }
                                    }
                                } else {
                                    instantTicketWalletAccessComponent2 = this.this$0;
                                    str2 = this.$amountEnteredInRupee;
                                    this.L$0 = null;
                                    this.label = 8;
                                    if (InstantTicketWalletAccessComponent.H0(instantTicketWalletAccessComponent2, walletStatus2, str2, walletTypeIdentifier, this) == coroutineSingletons) {
                                        return unit;
                                    }
                                }
                            } else {
                                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                instantTicketWalletAccessComponent = this.this$0;
                                walletStatus = (WalletStatus) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                                str = this.$amountEnteredInRupee;
                                this.L$0 = null;
                                this.label = 9;
                                if (InstantTicketWalletAccessComponent.H0(instantTicketWalletAccessComponent, walletStatus, str, walletTypeIdentifier, this) != coroutineSingletons) {
                                    return unit;
                                }
                            }
                        }
                    }
                } else {
                    if (z2) {
                        if (((Boolean) this.this$0.x.getG().getValue()).booleanValue()) {
                            InstantTicketWalletAccessComponent instantTicketWalletAccessComponent14 = this.this$0;
                            instantTicketWalletAccessComponent14.E0(new gb0(instantTicketWalletAccessComponent14, 2));
                            this.this$0.M0(false);
                            return unit;
                        }
                        this.this$0.M0(false);
                        this.this$0.r0(InstantTicketWalletAccessSideEffect.HideKeyboard.f3958a);
                        this.this$0.r0(InstantTicketWalletAccessSideEffect.OpenBottomSheet.f3959a);
                        return unit;
                    }
                    InstantTicketWalletAccessComponent instantTicketWalletAccessComponent15 = this.this$0;
                    kotlinToastManager = instantTicketWalletAccessComponent15.B;
                    this.L$0 = kotlinToastManager;
                    this.label = 10;
                    objB4 = instantTicketWalletAccessComponent15.v.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                    if (objB4 != coroutineSingletons) {
                        kotlinToastManager2 = kotlinToastManager;
                        KotlinToastManagerKt.a(kotlinToastManager2, (String) objB4, ToastLength.LONG);
                        gf.u(null, this.this$0.A);
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 4:
                ResultKt.b(obj);
                objI0 = obj;
                walletTypeIdentifier = (WalletTypeIdentifier) objI0;
                if (walletTypeIdentifier == null) {
                    this.this$0.M0(false);
                    return unit;
                }
                GetWalletStatusWithoutSyncUseCase getWalletStatusWithoutSyncUseCase5 = this.this$0.m;
                this.L$0 = walletTypeIdentifier;
                this.label = 5;
                objA = getWalletStatusWithoutSyncUseCase5.a(walletTypeIdentifier, this);
                if (objA != coroutineSingletons) {
                    chaloUseCaseResult = (ChaloUseCaseResult) objA;
                    if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                        walletStatus2 = ((WalletStatusWithReclaimTime) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).f11077a;
                        if (walletStatus2 != WalletStatus.KYC_INITIATED) {
                            GetWalletStatusUseCase getWalletStatusUseCase5 = this.this$0.k;
                            this.L$0 = walletTypeIdentifier;
                            this.label = 6;
                            objA2 = getWalletStatusUseCase5.a(walletTypeIdentifier, this);
                            if (objA2 != coroutineSingletons) {
                                instantTicketWalletAccessComponent3 = this.this$0;
                                str3 = this.$amountEnteredInRupee;
                                this.L$0 = null;
                                this.label = 7;
                                if (InstantTicketWalletAccessComponent.H0(instantTicketWalletAccessComponent3, (WalletStatus) objA2, str3, walletTypeIdentifier, this) == coroutineSingletons) {
                                    return unit;
                                }
                            }
                        } else {
                            instantTicketWalletAccessComponent2 = this.this$0;
                            str2 = this.$amountEnteredInRupee;
                            this.L$0 = null;
                            this.label = 8;
                            if (InstantTicketWalletAccessComponent.H0(instantTicketWalletAccessComponent2, walletStatus2, str2, walletTypeIdentifier, this) == coroutineSingletons) {
                                return unit;
                            }
                        }
                    } else {
                        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                            throw new NoWhenBranchMatchedException();
                        }
                        instantTicketWalletAccessComponent = this.this$0;
                        walletStatus = (WalletStatus) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                        str = this.$amountEnteredInRupee;
                        this.L$0 = null;
                        this.label = 9;
                        if (InstantTicketWalletAccessComponent.H0(instantTicketWalletAccessComponent, walletStatus, str, walletTypeIdentifier, this) != coroutineSingletons) {
                            return unit;
                        }
                    }
                }
                return coroutineSingletons;
            case 5:
                walletTypeIdentifier = (WalletTypeIdentifier) this.L$0;
                ResultKt.b(obj);
                objA = obj;
                chaloUseCaseResult = (ChaloUseCaseResult) objA;
                if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                        throw new NoWhenBranchMatchedException();
                    }
                    instantTicketWalletAccessComponent = this.this$0;
                    walletStatus = (WalletStatus) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                    str = this.$amountEnteredInRupee;
                    this.L$0 = null;
                    this.label = 9;
                    if (InstantTicketWalletAccessComponent.H0(instantTicketWalletAccessComponent, walletStatus, str, walletTypeIdentifier, this) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return unit;
                }
                walletStatus2 = ((WalletStatusWithReclaimTime) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).f11077a;
                if (walletStatus2 != WalletStatus.KYC_INITIATED) {
                    GetWalletStatusUseCase getWalletStatusUseCase6 = this.this$0.k;
                    this.L$0 = walletTypeIdentifier;
                    this.label = 6;
                    objA2 = getWalletStatusUseCase6.a(walletTypeIdentifier, this);
                    if (objA2 != coroutineSingletons) {
                        instantTicketWalletAccessComponent3 = this.this$0;
                        str3 = this.$amountEnteredInRupee;
                        this.L$0 = null;
                        this.label = 7;
                        if (InstantTicketWalletAccessComponent.H0(instantTicketWalletAccessComponent3, (WalletStatus) objA2, str3, walletTypeIdentifier, this) == coroutineSingletons) {
                            return unit;
                        }
                    }
                } else {
                    instantTicketWalletAccessComponent2 = this.this$0;
                    str2 = this.$amountEnteredInRupee;
                    this.L$0 = null;
                    this.label = 8;
                    if (InstantTicketWalletAccessComponent.H0(instantTicketWalletAccessComponent2, walletStatus2, str2, walletTypeIdentifier, this) == coroutineSingletons) {
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 6:
                walletTypeIdentifier = (WalletTypeIdentifier) this.L$0;
                ResultKt.b(obj);
                objA2 = obj;
                instantTicketWalletAccessComponent3 = this.this$0;
                str3 = this.$amountEnteredInRupee;
                this.L$0 = null;
                this.label = 7;
                if (InstantTicketWalletAccessComponent.H0(instantTicketWalletAccessComponent3, (WalletStatus) objA2, str3, walletTypeIdentifier, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 7:
                ResultKt.b(obj);
                return unit;
            case 8:
                ResultKt.b(obj);
                return unit;
            case 9:
                ResultKt.b(obj);
                return unit;
            case 10:
                kotlinToastManager2 = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                objB4 = obj;
                KotlinToastManagerKt.a(kotlinToastManager2, (String) objB4, ToastLength.LONG);
                gf.u(null, this.this$0.A);
                return unit;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
