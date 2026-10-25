package app.chalo.kyc.min.ui.minkycotp;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.features.wallet.WalletSyncHelper;
import app.chalo.kyc.min.data.models.appmodels.KycWalletStatus;
import app.chalo.kyc.min.domain.CreateNoWalletStatusForKycUseCase;
import app.chalo.kyc.min.domain.RegisterUserUseCase;
import app.chalo.kyc.min.domain.SubmitKycUseCase;
import app.chalo.kyc.min.ui.SubmitKycError;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.MinKycOtpArgs;
import app.chalo.walletframework.wallet.domain.FetchWalletStatusOnlineUseCase;
import com.arkivanov.decompose.ComponentContext;
import defpackage.gd0;
import defpackage.n3;
import defpackage.qi0;
import defpackage.t60;
import defpackage.wi0;
import defpackage.yi0;
import defpackage.za0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpIntent;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpDataState;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpUIState;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpSideEffect;", "Companion", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MinKycOtpComponent extends ChaloBaseStateMviComponent<MinKycOtpIntent, MinKycOtpDataState, MinKycOtpUIState, MinKycOtpSideEffect> {
    public final StringProvider k;
    public final UserProfileDetailsProvider l;
    public final SubmitKycUseCase m;
    public final RegisterUserUseCase n;
    public final CreateNoWalletStatusForKycUseCase o;
    public final AnalyticsContract p;
    public final WalletSyncHelper q;
    public final FetchWalletStatusOnlineUseCase r;
    public final CoroutineContextProvider s;
    public final MinKycOtpUIStateFactory t;
    public final ChaloNavigationManager u;
    public MinKycOtpRestoredDataState v;
    public Job w;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpComponent$Companion;", "", "", "RESEND_OTP_OPTION_TIME_IN_MILLIS", "J", "", "DEFAULT_OTP_LENGTH", "I", "", "ATTR_ACTIVATION_FAILED_REASON", "Ljava/lang/String;", "ATTR_IS_INVALID_OTP_ENTERED", "MIN_KYC_OTP_RESTORE_KEY", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4141a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[KycErrorPositiveCtaType.values().length];
            try {
                iArr[KycErrorPositiveCtaType.EXIT_KYC_FLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KycErrorPositiveCtaType.USER_ALREADY_REGISTERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KycErrorPositiveCtaType.GENERAL_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4141a = iArr;
            int[] iArr2 = new int[KycWalletStatus.values().length];
            try {
                iArr2[KycWalletStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[KycWalletStatus.REGISTERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[KycWalletStatus.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
        }
    }

    public MinKycOtpComponent(ComponentContext componentContext, MinKycOtpArgs minKycOtpArgs, StringProvider stringProvider, UserProfileDetailsProvider userProfileDetailsProvider, SubmitKycUseCase submitKycUseCase, RegisterUserUseCase registerUserUseCase, CreateNoWalletStatusForKycUseCase createNoWalletStatusForKycUseCase, AnalyticsContract analyticsContract, WalletSyncHelper walletSyncHelper, FetchWalletStatusOnlineUseCase fetchWalletStatusOnlineUseCase, CoroutineContextProvider coroutineContextProvider, MinKycOtpUIStateFactory minKycOtpUIStateFactory, ChaloNavigationManager chaloNavigationManager) {
        super(componentContext);
        this.k = stringProvider;
        this.l = userProfileDetailsProvider;
        this.m = submitKycUseCase;
        this.n = registerUserUseCase;
        this.o = createNoWalletStatusForKycUseCase;
        this.p = analyticsContract;
        this.q = walletSyncHelper;
        this.r = fetchWalletStatusOnlineUseCase;
        this.s = coroutineContextProvider;
        this.t = minKycOtpUIStateFactory;
        this.u = chaloNavigationManager;
        componentContext.getB().d("min_kyc_otp_restore_key", MinKycOtpRestoredDataState.INSTANCE.serializer(), new gd0(this, 14));
        I0(new MinKycOtpIntent.InitializationIntent(minKycOtpArgs.b));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if (r8.J0(app.chalo.kyc.min.ui.minkycotp.KycErrorPositiveCtaType.GENERAL_ERROR, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        if (r8.J0(app.chalo.kyc.min.ui.minkycotp.KycErrorPositiveCtaType.GENERAL_ERROR, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        if (r8.H0(r0) == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F0(app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent$setupMinKycPage$1
            if (r0 == 0) goto L16
            r0 = r9
            app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent$setupMinKycPage$1 r0 = (app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent$setupMinKycPage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent$setupMinKycPage$1 r0 = new app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent$setupMinKycPage$1
            r0.<init>(r8, r9)
        L1b:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L40
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L38
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            goto L38
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            kotlin.ResultKt.b(r9)
            goto L9e
        L3c:
            kotlin.ResultKt.b(r9)
            goto L4f
        L40:
            kotlin.ResultKt.b(r9)
            app.chalo.kyc.min.domain.RegisterUserUseCase r9 = r8.n
            r0.label = r6
            r2 = 0
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto L4f
            goto L93
        L4f:
            app.chalo.utils.ChaloUseCaseResult r9 = (app.chalo.utils.ChaloUseCaseResult) r9
            boolean r2 = r9 instanceof app.chalo.utils.ChaloUseCaseResult.Failure
            if (r2 == 0) goto L60
            r0.label = r5
            app.chalo.kyc.min.ui.minkycotp.KycErrorPositiveCtaType r9 = app.chalo.kyc.min.ui.minkycotp.KycErrorPositiveCtaType.GENERAL_ERROR
            java.lang.Object r9 = r8.J0(r9, r0)
            if (r9 != r1) goto L9e
            goto L93
        L60:
            boolean r2 = r9 instanceof app.chalo.utils.ChaloUseCaseResult.Success
            if (r2 == 0) goto La6
            app.chalo.utils.ChaloUseCaseResult$Success r9 = (app.chalo.utils.ChaloUseCaseResult.Success) r9
            java.lang.Object r2 = r9.f10419a
            app.chalo.kyc.min.data.models.appmodels.MinKycRegisterAppModel r2 = (app.chalo.kyc.min.data.models.appmodels.MinKycRegisterAppModel) r2
            app.chalo.kyc.min.data.models.appmodels.KycWalletStatus r2 = r2.b
            int[] r7 = app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent.WhenMappings.b
            int r2 = r2.ordinal()
            r2 = r7[r2]
            if (r2 == r6) goto L94
            if (r2 == r5) goto L8b
            if (r2 != r4) goto L85
            r0.label = r3
            app.chalo.kyc.min.ui.minkycotp.KycErrorPositiveCtaType r9 = app.chalo.kyc.min.ui.minkycotp.KycErrorPositiveCtaType.GENERAL_ERROR
            java.lang.Object r9 = r8.J0(r9, r0)
            if (r9 != r1) goto L9e
            goto L93
        L85:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L8b:
            r0.label = r4
            java.lang.Object r9 = r8.H0(r0)
            if (r9 != r1) goto L9e
        L93:
            return r1
        L94:
            yg r0 = new yg
            r1 = 13
            r0.<init>(r9, r1)
            r8.E0(r0)
        L9e:
            app.chalo.kyc.min.ui.minkycotp.MinKycOtpSideEffect$BringFocusOnOtpField r9 = app.chalo.kyc.min.ui.minkycotp.MinKycOtpSideEffect.BringFocusOnOtpField.f4156a
            r8.r0(r9)
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        La6:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent.F0(app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016e, code lost:
    
        if (r23.K0(r1, r3) == r4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x017b, code lost:
    
        if (r23.K0(r1, r3) == r4) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G0(app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent.G0(app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object H0(ContinuationImpl continuationImpl) {
        MinKycOtpComponent$handleUserAlreadyRegistered$1 minKycOtpComponent$handleUserAlreadyRegistered$1;
        String str;
        String str2;
        Object objB;
        String str3;
        String str4;
        if (continuationImpl instanceof MinKycOtpComponent$handleUserAlreadyRegistered$1) {
            minKycOtpComponent$handleUserAlreadyRegistered$1 = (MinKycOtpComponent$handleUserAlreadyRegistered$1) continuationImpl;
            int i = minKycOtpComponent$handleUserAlreadyRegistered$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                minKycOtpComponent$handleUserAlreadyRegistered$1.label = i - Integer.MIN_VALUE;
            } else {
                minKycOtpComponent$handleUserAlreadyRegistered$1 = new MinKycOtpComponent$handleUserAlreadyRegistered$1(this, continuationImpl);
            }
        } else {
            minKycOtpComponent$handleUserAlreadyRegistered$1 = new MinKycOtpComponent$handleUserAlreadyRegistered$1(this, continuationImpl);
        }
        Object objB2 = minKycOtpComponent$handleUserAlreadyRegistered$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = minKycOtpComponent$handleUserAlreadyRegistered$1.label;
        StringProvider stringProvider = this.k;
        if (i2 == 0) {
            ResultKt.b(objB2);
            String strF = Reflection.a(MinKycOtpComponent.class).f();
            if (strF == null) {
                strF = "MinKycOtpViewModel";
            }
            String str5 = strF;
            StateFlow stateFlow = this.f;
            String str6 = ((MinKycOtpDataState) stateFlow.getValue()).k;
            if (str6 == null) {
                str6 = "";
            }
            Pair pair = new Pair("userId", str6);
            String str7 = ((MinKycOtpDataState) stateFlow.getValue()).l;
            AnalyticsContract.DefaultImpls.a(this.p, "min kyc user registered bottom sheet opened", str5, MapsKt.i(pair, new Pair("referenceNumber", str7 != null ? str7 : "")), null, false, 24);
            minKycOtpComponent$handleUserAlreadyRegistered$1.label = 1;
            objB2 = stringProvider.b(StringEnum.WALLET_ALREADY_REGISTERED, new Object[0], minKycOtpComponent$handleUserAlreadyRegistered$1);
            if (objB2 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objB2);
        } else {
            if (i2 == 2) {
                str = (String) minKycOtpComponent$handleUserAlreadyRegistered$1.L$0;
                ResultKt.b(objB2);
                str2 = (String) objB2;
                minKycOtpComponent$handleUserAlreadyRegistered$1.L$0 = str;
                minKycOtpComponent$handleUserAlreadyRegistered$1.L$1 = str2;
                minKycOtpComponent$handleUserAlreadyRegistered$1.label = 3;
                objB = stringProvider.b(StringEnum.OKAY_SMALL, new Object[0], minKycOtpComponent$handleUserAlreadyRegistered$1);
                if (objB != coroutineSingletons) {
                    str3 = str2;
                    objB2 = objB;
                    str4 = str;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (String) minKycOtpComponent$handleUserAlreadyRegistered$1.L$1;
            str4 = (String) minKycOtpComponent$handleUserAlreadyRegistered$1.L$0;
            ResultKt.b(objB2);
        }
        E0(new yi0(str4, str3, (String) objB2, 0));
        return Unit.f17538a;
        String str8 = (String) objB2;
        minKycOtpComponent$handleUserAlreadyRegistered$1.L$0 = str8;
        minKycOtpComponent$handleUserAlreadyRegistered$1.label = 2;
        Object objB3 = stringProvider.b(StringEnum.WALLET_ALREADY_REGISTERED_MESSAGE, new Object[0], minKycOtpComponent$handleUserAlreadyRegistered$1);
        if (objB3 != coroutineSingletons) {
            str = str8;
            objB2 = objB3;
            str2 = (String) objB2;
            minKycOtpComponent$handleUserAlreadyRegistered$1.L$0 = str;
            minKycOtpComponent$handleUserAlreadyRegistered$1.L$1 = str2;
            minKycOtpComponent$handleUserAlreadyRegistered$1.label = 3;
            objB = stringProvider.b(StringEnum.OKAY_SMALL, new Object[0], minKycOtpComponent$handleUserAlreadyRegistered$1);
            if (objB != coroutineSingletons) {
                str3 = str2;
                objB2 = objB;
                str4 = str;
                E0(new yi0(str4, str3, (String) objB2, 0));
                return Unit.f17538a;
            }
        }
        return coroutineSingletons;
    }

    public final void I0(MinKycOtpIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof MinKycOtpIntent.InitializationIntent;
        CoroutineContextProvider coroutineContextProvider = this.s;
        ContextScope contextScope = this.j;
        if (z) {
            MinKycOtpIntent.InitializationIntent initializationIntent = (MinKycOtpIntent.InitializationIntent) intent;
            if (this.d) {
                return;
            }
            this.d = true;
            String strF = Reflection.a(MinKycOtpComponent.class).f();
            AnalyticsContract.DefaultImpls.a(this.p, "min kyc otp fragment opened", strF == null ? "MinKycOtpViewModel" : strF, null, null, false, 28);
            BuildersKt.d(contextScope, coroutineContextProvider.b(), null, new MinKycOtpComponent$handleInitializationIntent$1(this, initializationIntent, null), 2);
            return;
        }
        if (intent instanceof MinKycOtpIntent.OnResendOtpEnableCountdownUpdate) {
            E0(new wi0((MinKycOtpIntent.OnResendOtpEnableCountdownUpdate) intent, 5));
            return;
        }
        if (intent instanceof MinKycOtpIntent.OtpEnteredIntent) {
            E0(new t60(28, (MinKycOtpIntent.OtpEnteredIntent) intent, this));
            return;
        }
        boolean z2 = intent instanceof MinKycOtpIntent.PositiveCtaClickedIntent;
        StateFlow stateFlow = this.f;
        if (!z2) {
            if (intent instanceof MinKycOtpIntent.BottomSheetDismissedIntent) {
                E0(new qi0(12));
                return;
            }
            if (!intent.equals(MinKycOtpIntent.ProceedBtnClickedIntent.f4152a)) {
                if (!intent.equals(MinKycOtpIntent.ResendSmsClickedIntent.f4153a)) {
                    throw new NoWhenBranchMatchedException();
                }
                BuildersKt.d(contextScope, coroutineContextProvider.b(), null, new MinKycOtpComponent$handleResendSmsClickedIntent$1(this, null), 2);
                return;
            }
            String strF2 = Reflection.a(MinKycOtpComponent.class).f();
            String str = strF2 == null ? "MinKycOtpViewModel" : strF2;
            String str2 = ((MinKycOtpDataState) stateFlow.getValue()).k;
            if (str2 == null) {
                str2 = "";
            }
            Pair pair = new Pair("userId", str2);
            String str3 = ((MinKycOtpDataState) stateFlow.getValue()).l;
            AnalyticsContract.DefaultImpls.a(this.p, "min kyc otp proceed button clicked", str, MapsKt.i(pair, new Pair("referenceNumber", str3 != null ? str3 : "")), null, false, 24);
            BuildersKt.d(contextScope, null, null, new MinKycOtpComponent$handleProceedBtnClickedIntent$1(this, null), 3);
            return;
        }
        MinKycOtpIntent.PositiveCtaClickedIntent positiveCtaClickedIntent = (MinKycOtpIntent.PositiveCtaClickedIntent) intent;
        String strF3 = Reflection.a(MinKycOtpComponent.class).f();
        String str4 = strF3 == null ? "MinKycOtpViewModel" : strF3;
        String str5 = ((MinKycOtpDataState) stateFlow.getValue()).k;
        if (str5 == null) {
            str5 = "";
        }
        Pair pair2 = new Pair("userId", str5);
        String str6 = ((MinKycOtpDataState) stateFlow.getValue()).l;
        AnalyticsContract.DefaultImpls.a(this.p, "min kyc error bottom sheet cta clicked", str4, MapsKt.i(pair2, new Pair("referenceNumber", str6 != null ? str6 : "")), null, false, 24);
        E0(new qi0(13));
        int i = WhenMappings.f4141a[positiveCtaClickedIntent.f4151a.ordinal()];
        if (i == 1 || i == 2) {
            E0(new qi0(14));
            BuildersKt.d(contextScope, coroutineContextProvider.b(), null, new MinKycOtpComponent$syncWalletAndExitKycFlow$1(this, null), 2);
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0106  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object J0(KycErrorPositiveCtaType kycErrorPositiveCtaType, ContinuationImpl continuationImpl) {
        MinKycOtpComponent$showGenericErrorBottomSheet$1 minKycOtpComponent$showGenericErrorBottomSheet$1;
        KycErrorPositiveCtaType kycErrorPositiveCtaType2;
        String str;
        String str2;
        Object objB;
        String str3;
        KycErrorPositiveCtaType kycErrorPositiveCtaType3;
        String str4;
        if (continuationImpl instanceof MinKycOtpComponent$showGenericErrorBottomSheet$1) {
            minKycOtpComponent$showGenericErrorBottomSheet$1 = (MinKycOtpComponent$showGenericErrorBottomSheet$1) continuationImpl;
            int i = minKycOtpComponent$showGenericErrorBottomSheet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                minKycOtpComponent$showGenericErrorBottomSheet$1.label = i - Integer.MIN_VALUE;
            } else {
                minKycOtpComponent$showGenericErrorBottomSheet$1 = new MinKycOtpComponent$showGenericErrorBottomSheet$1(this, continuationImpl);
            }
        } else {
            minKycOtpComponent$showGenericErrorBottomSheet$1 = new MinKycOtpComponent$showGenericErrorBottomSheet$1(this, continuationImpl);
        }
        Object objB2 = minKycOtpComponent$showGenericErrorBottomSheet$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = minKycOtpComponent$showGenericErrorBottomSheet$1.label;
        StringProvider stringProvider = this.k;
        if (i2 == 0) {
            ResultKt.b(objB2);
            String strF = Reflection.a(MinKycOtpComponent.class).f();
            if (strF == null) {
                strF = "MinKycOtpViewModel";
            }
            String str5 = strF;
            StateFlow stateFlow = this.f;
            String str6 = ((MinKycOtpDataState) stateFlow.getValue()).k;
            if (str6 == null) {
                str6 = "";
            }
            Pair pair = new Pair("userId", str6);
            String str7 = ((MinKycOtpDataState) stateFlow.getValue()).l;
            AnalyticsContract.DefaultImpls.a(this.p, "min kyc error bottom sheet opened", str5, MapsKt.i(pair, new Pair("referenceNumber", str7 != null ? str7 : ""), new Pair("errorBottomSheetCtaType", kycErrorPositiveCtaType.name())), null, false, 24);
            minKycOtpComponent$showGenericErrorBottomSheet$1.L$0 = kycErrorPositiveCtaType;
            minKycOtpComponent$showGenericErrorBottomSheet$1.label = 1;
            objB2 = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], minKycOtpComponent$showGenericErrorBottomSheet$1);
            if (objB2 != coroutineSingletons) {
                kycErrorPositiveCtaType2 = kycErrorPositiveCtaType;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            kycErrorPositiveCtaType2 = (KycErrorPositiveCtaType) minKycOtpComponent$showGenericErrorBottomSheet$1.L$0;
            ResultKt.b(objB2);
        } else {
            if (i2 == 2) {
                String str8 = (String) minKycOtpComponent$showGenericErrorBottomSheet$1.L$1;
                KycErrorPositiveCtaType kycErrorPositiveCtaType4 = (KycErrorPositiveCtaType) minKycOtpComponent$showGenericErrorBottomSheet$1.L$0;
                ResultKt.b(objB2);
                str = str8;
                kycErrorPositiveCtaType2 = kycErrorPositiveCtaType4;
                str2 = (String) objB2;
                minKycOtpComponent$showGenericErrorBottomSheet$1.L$0 = kycErrorPositiveCtaType2;
                minKycOtpComponent$showGenericErrorBottomSheet$1.L$1 = str;
                minKycOtpComponent$showGenericErrorBottomSheet$1.L$2 = str2;
                minKycOtpComponent$showGenericErrorBottomSheet$1.label = 3;
                objB = stringProvider.b(StringEnum.OKAY_SMALL, new Object[0], minKycOtpComponent$showGenericErrorBottomSheet$1);
                if (objB != coroutineSingletons) {
                    str3 = str;
                    kycErrorPositiveCtaType3 = kycErrorPositiveCtaType2;
                    str4 = str2;
                    objB2 = objB;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str9 = (String) minKycOtpComponent$showGenericErrorBottomSheet$1.L$2;
            String str10 = (String) minKycOtpComponent$showGenericErrorBottomSheet$1.L$1;
            KycErrorPositiveCtaType kycErrorPositiveCtaType5 = (KycErrorPositiveCtaType) minKycOtpComponent$showGenericErrorBottomSheet$1.L$0;
            ResultKt.b(objB2);
            str4 = str9;
            str3 = str10;
            kycErrorPositiveCtaType3 = kycErrorPositiveCtaType5;
        }
        E0(new n3(str3, str4, (String) objB2, kycErrorPositiveCtaType3, 12));
        return Unit.f17538a;
        String str11 = (String) objB2;
        minKycOtpComponent$showGenericErrorBottomSheet$1.L$0 = kycErrorPositiveCtaType2;
        minKycOtpComponent$showGenericErrorBottomSheet$1.L$1 = str11;
        minKycOtpComponent$showGenericErrorBottomSheet$1.label = 2;
        Object objB3 = stringProvider.b(StringEnum.PLEASE_TRY_AGAIN, new Object[0], minKycOtpComponent$showGenericErrorBottomSheet$1);
        if (objB3 != coroutineSingletons) {
            str = str11;
            objB2 = objB3;
            str2 = (String) objB2;
            minKycOtpComponent$showGenericErrorBottomSheet$1.L$0 = kycErrorPositiveCtaType2;
            minKycOtpComponent$showGenericErrorBottomSheet$1.L$1 = str;
            minKycOtpComponent$showGenericErrorBottomSheet$1.L$2 = str2;
            minKycOtpComponent$showGenericErrorBottomSheet$1.label = 3;
            objB = stringProvider.b(StringEnum.OKAY_SMALL, new Object[0], minKycOtpComponent$showGenericErrorBottomSheet$1);
            if (objB != coroutineSingletons) {
                str3 = str;
                kycErrorPositiveCtaType3 = kycErrorPositiveCtaType2;
                str4 = str2;
                objB2 = objB;
                E0(new n3(str3, str4, (String) objB2, kycErrorPositiveCtaType3, 12));
                return Unit.f17538a;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K0(SubmitKycError submitKycError, ContinuationImpl continuationImpl) {
        MinKycOtpComponent$updateBottomSheetDataForGeneralError$1 minKycOtpComponent$updateBottomSheetDataForGeneralError$1;
        SubmitKycError submitKycError2;
        String str;
        if (continuationImpl instanceof MinKycOtpComponent$updateBottomSheetDataForGeneralError$1) {
            minKycOtpComponent$updateBottomSheetDataForGeneralError$1 = (MinKycOtpComponent$updateBottomSheetDataForGeneralError$1) continuationImpl;
            int i = minKycOtpComponent$updateBottomSheetDataForGeneralError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                minKycOtpComponent$updateBottomSheetDataForGeneralError$1.label = i - Integer.MIN_VALUE;
            } else {
                minKycOtpComponent$updateBottomSheetDataForGeneralError$1 = new MinKycOtpComponent$updateBottomSheetDataForGeneralError$1(this, continuationImpl);
            }
        } else {
            minKycOtpComponent$updateBottomSheetDataForGeneralError$1 = new MinKycOtpComponent$updateBottomSheetDataForGeneralError$1(this, continuationImpl);
        }
        Object objB = minKycOtpComponent$updateBottomSheetDataForGeneralError$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = minKycOtpComponent$updateBottomSheetDataForGeneralError$1.label;
        StringProvider stringProvider = this.k;
        if (i2 == 0) {
            ResultKt.b(objB);
            minKycOtpComponent$updateBottomSheetDataForGeneralError$1.L$0 = submitKycError;
            minKycOtpComponent$updateBottomSheetDataForGeneralError$1.label = 1;
            objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], minKycOtpComponent$updateBottomSheetDataForGeneralError$1);
            if (objB != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            submitKycError = (SubmitKycError) minKycOtpComponent$updateBottomSheetDataForGeneralError$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) minKycOtpComponent$updateBottomSheetDataForGeneralError$1.L$1;
            submitKycError2 = (SubmitKycError) minKycOtpComponent$updateBottomSheetDataForGeneralError$1.L$0;
            ResultKt.b(objB);
        }
        E0(new za0(9, str, submitKycError2, (String) objB));
        return Unit.f17538a;
        String str2 = (String) objB;
        minKycOtpComponent$updateBottomSheetDataForGeneralError$1.L$0 = submitKycError;
        minKycOtpComponent$updateBottomSheetDataForGeneralError$1.L$1 = str2;
        minKycOtpComponent$updateBottomSheetDataForGeneralError$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.OKAY_SMALL, new Object[0], minKycOtpComponent$updateBottomSheetDataForGeneralError$1);
        if (objB2 != coroutineSingletons) {
            submitKycError2 = submitKycError;
            str = str2;
            objB = objB2;
            E0(new za0(9, str, submitKycError2, (String) objB));
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        MinKycOtpComponent$convertToUiState$2 minKycOtpComponent$convertToUiState$2 = new MinKycOtpComponent$convertToUiState$2(1, this, MinKycOtpComponent.class, "processIntent", "processIntent(Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpIntent;)V", 0);
        MinKycOtpComponent$convertToUiState$3 minKycOtpComponent$convertToUiState$3 = new MinKycOtpComponent$convertToUiState$3(1, this, MinKycOtpComponent.class, "emitSideEffect", "emitSideEffect(Ljava/lang/Object;)V", 0);
        return this.t.a((MinKycOtpDataState) obj, minKycOtpComponent$convertToUiState$2, minKycOtpComponent$convertToUiState$3, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        if (this.v == null) {
            this.v = (MinKycOtpRestoredDataState) this.f5983a.getB().a("min_kyc_otp_restore_key", MinKycOtpRestoredDataState.INSTANCE.serializer());
        }
        MinKycOtpRestoredDataState minKycOtpRestoredDataState = this.v;
        if (minKycOtpRestoredDataState == null) {
            return new MinKycOtpDataState(0, 16383, 0L, null, null, null, null, null, null, false, false, false);
        }
        String str = minKycOtpRestoredDataState.f4154a;
        int i = minKycOtpRestoredDataState.b;
        KycErrorBottomSheetData kycErrorBottomSheetData = minKycOtpRestoredDataState.c;
        boolean z = minKycOtpRestoredDataState.d;
        return new MinKycOtpDataState(i, 4120, minKycOtpRestoredDataState.e, kycErrorBottomSheetData, minKycOtpRestoredDataState.h, str, minKycOtpRestoredDataState.i, minKycOtpRestoredDataState.j, minKycOtpRestoredDataState.k, z, minKycOtpRestoredDataState.f, minKycOtpRestoredDataState.g);
    }
}
