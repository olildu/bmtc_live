package app.chalo.instantticket.ui.instantticketscreen;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.premiumbus.helper.InstantTicketConfigHelper;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.WebViewArgs;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.wallet.domain.CreateQuickPayOrderUsecase;
import app.chalo.wallet.domain.ValidateQuickPayUseCase;
import app.chalo.walletframework.wallet.data.model.WalletStatus;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.domain.FetchWalletBalanceUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletAndAllTransactionsWithoutSyncUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletStatusUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletStatusWithoutSyncUseCase;
import app.chalo.walletframework.wallet.domain.PostDeviceIdForWalletMigrationUseCase;
import app.chalo.walletframework.wallet.domain.RefreshQuickPayPrerequisitesUseCase;
import app.chalo.walletframework.wallet.domain.RefreshWalletStatusUseCase;
import app.chalo.walletframework.wallet.domain.SatisfiesQuickPayPrerequisitesUseCase;
import app.chalo.walletframework.wallet.domain.resolver.ResolvedPrimaryWalletResult;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.decompose.value.MutableValue;
import defpackage.e40;
import defpackage.gb0;
import defpackage.hb0;
import defpackage.qi;
import defpackage.va;
import defpackage.y80;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketWalletAccessComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketWalletAccessIntent;", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketWalletAccessState;", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketWalletAccessSideEffect;", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class InstantTicketWalletAccessComponent extends ChaloBaseStateMviComponent<InstantTicketWalletAccessIntent, InstantTicketWalletAccessState, InstantTicketWalletAccessState, InstantTicketWalletAccessSideEffect> {
    public final ChaloNavigationManager A;
    public final KotlinToastManager B;
    public final InstantTicketConfigHelper C;
    public final WalletResolver D;
    public final MutableValue E;
    public final Flow F;
    public final GetWalletStatusUseCase k;
    public final RefreshWalletStatusUseCase l;
    public final GetWalletStatusWithoutSyncUseCase m;
    public final AnalyticsContract n;
    public final PostDeviceIdForWalletMigrationUseCase o;
    public final CurrencyFeature p;
    public final ValidateQuickPayUseCase q;
    public final CreateQuickPayOrderUsecase r;
    public final FetchWalletBalanceUseCase s;
    public final SatisfiesQuickPayPrerequisitesUseCase t;
    public final RefreshQuickPayPrerequisitesUseCase u;
    public final StringProvider v;
    public final ChaloConfigFeature w;
    public final UserProfileDetailsProvider x;
    public final GetWalletAndAllTransactionsWithoutSyncUseCase y;
    public final GetWalletSetupConfigurationUseCase z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketWalletAccessComponent$Companion;", "", "", "SOURCE", "Ljava/lang/String;", "QUERY_PARAM_USER_NAME", "QUERY_PARAM_MOBILE_NO", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3953a;

        static {
            int[] iArr = new int[WalletStatus.values().length];
            try {
                iArr[WalletStatus.USER_NOT_LOGGED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletStatus.DOES_NOT_EXIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletStatus.KYC_INITIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletStatus.FULL_KYC_NEEDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletStatus.ACTIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WalletStatus.BLOCKED_FOR_BACKEND_RECLAIM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WalletStatus.BLOCKED_FOR_APP_RECLAIM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[WalletStatus.BLOCKED_USER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[WalletStatus.WALLET_TIMED_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[WalletStatus.CHALO_TIME_UNAVAILABLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[WalletStatus.WALLET_FETCH_PENDING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f3953a = iArr;
        }
    }

    public InstantTicketWalletAccessComponent(ComponentContext componentContext, GetWalletStatusUseCase getWalletStatusUseCase, RefreshWalletStatusUseCase refreshWalletStatusUseCase, GetWalletStatusWithoutSyncUseCase getWalletStatusWithoutSyncUseCase, AnalyticsContract analyticsContract, PostDeviceIdForWalletMigrationUseCase postDeviceIdForWalletMigrationUseCase, CurrencyFeature currencyFeature, ValidateQuickPayUseCase validateQuickPayUseCase, CreateQuickPayOrderUsecase createQuickPayOrderUsecase, FetchWalletBalanceUseCase fetchWalletBalanceUseCase, SatisfiesQuickPayPrerequisitesUseCase satisfiesQuickPayPrerequisitesUseCase, RefreshQuickPayPrerequisitesUseCase refreshQuickPayPrerequisitesUseCase, StringProvider stringProvider, ChaloConfigFeature chaloConfigFeature, UserProfileDetailsProvider userProfileDetailsProvider, GetWalletAndAllTransactionsWithoutSyncUseCase getWalletAndAllTransactionsWithoutSyncUseCase, GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase, ChaloNavigationManager chaloNavigationManager, KotlinToastManager kotlinToastManager, InstantTicketConfigHelper instantTicketConfigHelper, WalletResolver walletResolver) {
        super(componentContext);
        this.k = getWalletStatusUseCase;
        this.l = refreshWalletStatusUseCase;
        this.m = getWalletStatusWithoutSyncUseCase;
        this.n = analyticsContract;
        this.o = postDeviceIdForWalletMigrationUseCase;
        this.p = currencyFeature;
        this.q = validateQuickPayUseCase;
        this.r = createQuickPayOrderUsecase;
        this.s = fetchWalletBalanceUseCase;
        this.t = satisfiesQuickPayPrerequisitesUseCase;
        this.u = refreshQuickPayPrerequisitesUseCase;
        this.v = stringProvider;
        this.w = chaloConfigFeature;
        this.x = userProfileDetailsProvider;
        this.y = getWalletAndAllTransactionsWithoutSyncUseCase;
        this.z = getWalletSetupConfigurationUseCase;
        this.A = chaloNavigationManager;
        this.B = kotlinToastManager;
        this.C = instantTicketConfigHelper;
        this.D = walletResolver;
        this.E = t0();
        this.F = s0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object F0(InstantTicketWalletAccessComponent instantTicketWalletAccessComponent, ContinuationImpl continuationImpl) {
        InstantTicketWalletAccessComponent$getReclaimWebLinkUri$1 instantTicketWalletAccessComponent$getReclaimWebLinkUri$1;
        StringBuilder sb;
        StringBuilder sb2;
        UserProfileDetailsProvider userProfileDetailsProvider = instantTicketWalletAccessComponent.x;
        if (continuationImpl instanceof InstantTicketWalletAccessComponent$getReclaimWebLinkUri$1) {
            instantTicketWalletAccessComponent$getReclaimWebLinkUri$1 = (InstantTicketWalletAccessComponent$getReclaimWebLinkUri$1) continuationImpl;
            int i = instantTicketWalletAccessComponent$getReclaimWebLinkUri$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketWalletAccessComponent$getReclaimWebLinkUri$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketWalletAccessComponent$getReclaimWebLinkUri$1 = new InstantTicketWalletAccessComponent$getReclaimWebLinkUri$1(instantTicketWalletAccessComponent, continuationImpl);
            }
        } else {
            instantTicketWalletAccessComponent$getReclaimWebLinkUri$1 = new InstantTicketWalletAccessComponent$getReclaimWebLinkUri$1(instantTicketWalletAccessComponent, continuationImpl);
        }
        Object obj = instantTicketWalletAccessComponent$getReclaimWebLinkUri$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketWalletAccessComponent$getReclaimWebLinkUri$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            StringBuilder sb3 = new StringBuilder();
            ChaloConfigFeature chaloConfigFeature = instantTicketWalletAccessComponent.w;
            instantTicketWalletAccessComponent$getReclaimWebLinkUri$1.L$0 = sb3;
            instantTicketWalletAccessComponent$getReclaimWebLinkUri$1.L$1 = sb3;
            instantTicketWalletAccessComponent$getReclaimWebLinkUri$1.label = 1;
            Object objA = chaloConfigFeature.a("reclaimPassesRequestUrl", instantTicketWalletAccessComponent$getReclaimWebLinkUri$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            sb = sb3;
            obj = objA;
            sb2 = sb;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sb2 = (StringBuilder) instantTicketWalletAccessComponent$getReclaimWebLinkUri$1.L$1;
            sb = (StringBuilder) instantTicketWalletAccessComponent$getReclaimWebLinkUri$1.L$0;
            ResultKt.b(obj);
        }
        String str = (String) obj;
        int length = str.length() - 1;
        int i3 = 0;
        boolean z = false;
        while (i3 <= length) {
            boolean z2 = Intrinsics.k(str.charAt(!z ? i3 : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i3++;
            } else {
                z = true;
            }
        }
        sb2.append(str.subSequence(i3, length + 1).toString());
        StringBuilder sb4 = new StringBuilder();
        UserProfileAppModel userProfileAppModelF = userProfileDetailsProvider.f();
        if (userProfileAppModelF != null) {
            sb4.append(userProfileAppModelF.f10305a);
            sb4.append(" ");
            sb4.append(userProfileAppModelF.b);
        }
        String string = sb4.toString();
        Intrinsics.h(string, "toString(...)");
        sb.append("?entry.1987039175=".concat(string));
        sb.append("?entry.58353678=" + userProfileDetailsProvider.m());
        String string2 = sb.toString();
        Intrinsics.h(string2, "toString(...)");
        return string2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object G0(InstantTicketWalletAccessComponent instantTicketWalletAccessComponent, ContinuationImpl continuationImpl) {
        InstantTicketWalletAccessComponent$handleFullKYCKnowMore$1 instantTicketWalletAccessComponent$handleFullKYCKnowMore$1;
        ChaloNavigationManager chaloNavigationManager;
        String str;
        ChaloNavigationManager chaloNavigationManager2;
        instantTicketWalletAccessComponent.getClass();
        if (continuationImpl instanceof InstantTicketWalletAccessComponent$handleFullKYCKnowMore$1) {
            instantTicketWalletAccessComponent$handleFullKYCKnowMore$1 = (InstantTicketWalletAccessComponent$handleFullKYCKnowMore$1) continuationImpl;
            int i = instantTicketWalletAccessComponent$handleFullKYCKnowMore$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketWalletAccessComponent$handleFullKYCKnowMore$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketWalletAccessComponent$handleFullKYCKnowMore$1 = new InstantTicketWalletAccessComponent$handleFullKYCKnowMore$1(instantTicketWalletAccessComponent, continuationImpl);
            }
        } else {
            instantTicketWalletAccessComponent$handleFullKYCKnowMore$1 = new InstantTicketWalletAccessComponent$handleFullKYCKnowMore$1(instantTicketWalletAccessComponent, continuationImpl);
        }
        Object obj = instantTicketWalletAccessComponent$handleFullKYCKnowMore$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketWalletAccessComponent$handleFullKYCKnowMore$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                chaloNavigationManager = (ChaloNavigationManager) instantTicketWalletAccessComponent$handleFullKYCKnowMore$1.L$0;
                ResultKt.b(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) instantTicketWalletAccessComponent$handleFullKYCKnowMore$1.L$1;
                chaloNavigationManager2 = (ChaloNavigationManager) instantTicketWalletAccessComponent$handleFullKYCKnowMore$1.L$0;
                ResultKt.b(obj);
            }
            chaloNavigationManager2.b(new ChaloNavigationRequest.Navigate(new WebViewArgs(str, (String) obj, false, false), null, null, 6));
            return Unit.f17538a;
        }
        ResultKt.b(obj);
        AnalyticsContract.DefaultImpls.a(instantTicketWalletAccessComponent.n, "full kyc know more clicked", "new pay for ticket bottom sheet", null, null, false, 28);
        instantTicketWalletAccessComponent.r0(InstantTicketWalletAccessSideEffect.CloseBottomSheet.f3957a);
        ChaloNavigationManager chaloNavigationManager3 = instantTicketWalletAccessComponent.A;
        instantTicketWalletAccessComponent$handleFullKYCKnowMore$1.L$0 = chaloNavigationManager3;
        instantTicketWalletAccessComponent$handleFullKYCKnowMore$1.label = 1;
        Object objA = instantTicketWalletAccessComponent.w.a("fullKycSolutionCentersURL", instantTicketWalletAccessComponent$handleFullKYCKnowMore$1);
        if (objA != coroutineSingletons) {
            chaloNavigationManager = chaloNavigationManager3;
            obj = objA;
        }
        return coroutineSingletons;
        String str2 = (String) obj;
        instantTicketWalletAccessComponent$handleFullKYCKnowMore$1.L$0 = chaloNavigationManager;
        instantTicketWalletAccessComponent$handleFullKYCKnowMore$1.L$1 = str2;
        instantTicketWalletAccessComponent$handleFullKYCKnowMore$1.label = 2;
        Object objB = instantTicketWalletAccessComponent.v.b(StringEnum.WALLET, new Object[0], instantTicketWalletAccessComponent$handleFullKYCKnowMore$1);
        if (objB != coroutineSingletons) {
            obj = objB;
            str = str2;
            chaloNavigationManager2 = chaloNavigationManager;
            chaloNavigationManager2.b(new ChaloNavigationRequest.Navigate(new WebViewArgs(str, (String) obj, false, false), null, null, 6));
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0127  */
    /* JADX WARN: Code duplicated, block: B:47:0x0139  */
    /* JADX WARN: Code duplicated, block: B:49:0x013f  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public static final Object H0(InstantTicketWalletAccessComponent instantTicketWalletAccessComponent, WalletStatus walletStatus, String str, WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        InstantTicketWalletAccessComponent$processWalletStatus$1 instantTicketWalletAccessComponent$processWalletStatus$1;
        String str2;
        long j;
        Object objK0;
        WalletTypeIdentifier walletTypeIdentifier2;
        WalletSubTextProperties walletSubTextProperties;
        Object objJ0;
        long j2;
        InstantTicketWalletAccessComponent instantTicketWalletAccessComponent2 = instantTicketWalletAccessComponent;
        WalletStatus walletStatus2 = walletStatus;
        WalletTypeIdentifier walletTypeIdentifier3 = walletTypeIdentifier;
        ContextScope contextScope = instantTicketWalletAccessComponent2.j;
        if (continuationImpl instanceof InstantTicketWalletAccessComponent$processWalletStatus$1) {
            instantTicketWalletAccessComponent$processWalletStatus$1 = (InstantTicketWalletAccessComponent$processWalletStatus$1) continuationImpl;
            int i = instantTicketWalletAccessComponent$processWalletStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketWalletAccessComponent$processWalletStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketWalletAccessComponent$processWalletStatus$1 = new InstantTicketWalletAccessComponent$processWalletStatus$1(instantTicketWalletAccessComponent2, continuationImpl);
            }
        } else {
            instantTicketWalletAccessComponent$processWalletStatus$1 = new InstantTicketWalletAccessComponent$processWalletStatus$1(instantTicketWalletAccessComponent2, continuationImpl);
        }
        InstantTicketWalletAccessComponent$processWalletStatus$1 instantTicketWalletAccessComponent$processWalletStatus$2 = instantTicketWalletAccessComponent$processWalletStatus$1;
        Object objB = instantTicketWalletAccessComponent$processWalletStatus$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketWalletAccessComponent$processWalletStatus$2.label;
        Unit unit = Unit.f17538a;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objB);
            instantTicketWalletAccessComponent2.E0(new e40(walletStatus2, 29));
            if (walletStatus2 == WalletStatus.USER_NOT_LOGGED_IN) {
                instantTicketWalletAccessComponent2.E0(new gb0(instantTicketWalletAccessComponent2, 0));
                instantTicketWalletAccessComponent2.M0(false);
                return unit;
            }
            if (walletStatus2 == WalletStatus.KYC_INITIATED && ((InstantTicketWalletAccessState) instantTicketWalletAccessComponent2.E.a()).c) {
                instantTicketWalletAccessComponent2.r0(InstantTicketWalletAccessSideEffect.CloseBottomSheet.f3957a);
                instantTicketWalletAccessComponent2.E0(new y80(28));
                BuildersKt.d(contextScope, null, null, new InstantTicketWalletAccessComponent$refreshWalletStatus$1(instantTicketWalletAccessComponent2, null), 3);
                return unit;
            }
            FetchWalletBalanceUseCase fetchWalletBalanceUseCase = instantTicketWalletAccessComponent2.s;
            instantTicketWalletAccessComponent$processWalletStatus$2.L$0 = walletStatus2;
            str2 = str;
            instantTicketWalletAccessComponent$processWalletStatus$2.L$1 = str2;
            instantTicketWalletAccessComponent$processWalletStatus$2.L$2 = walletTypeIdentifier3;
            instantTicketWalletAccessComponent$processWalletStatus$2.label = 1;
            objB = fetchWalletBalanceUseCase.b(walletTypeIdentifier3, instantTicketWalletAccessComponent$processWalletStatus$2);
            if (objB != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            WalletTypeIdentifier walletTypeIdentifier4 = (WalletTypeIdentifier) instantTicketWalletAccessComponent$processWalletStatus$2.L$2;
            String str3 = (String) instantTicketWalletAccessComponent$processWalletStatus$2.L$1;
            WalletStatus walletStatus3 = (WalletStatus) instantTicketWalletAccessComponent$processWalletStatus$2.L$0;
            ResultKt.b(objB);
            walletTypeIdentifier3 = walletTypeIdentifier4;
            walletStatus2 = walletStatus3;
            str2 = str3;
        } else {
            if (i2 == 2) {
                long j3 = instantTicketWalletAccessComponent$processWalletStatus$2.J$0;
                WalletTypeIdentifier walletTypeIdentifier5 = (WalletTypeIdentifier) instantTicketWalletAccessComponent$processWalletStatus$2.L$2;
                String str4 = (String) instantTicketWalletAccessComponent$processWalletStatus$2.L$1;
                WalletStatus walletStatus4 = (WalletStatus) instantTicketWalletAccessComponent$processWalletStatus$2.L$0;
                ResultKt.b(objB);
                objK0 = objB;
                j = j3;
                walletStatus2 = walletStatus4;
                walletTypeIdentifier2 = walletTypeIdentifier5;
                str2 = str4;
                walletSubTextProperties = (WalletSubTextProperties) objK0;
                instantTicketWalletAccessComponent$processWalletStatus$2.L$0 = walletStatus2;
                instantTicketWalletAccessComponent$processWalletStatus$2.L$1 = walletTypeIdentifier2;
                instantTicketWalletAccessComponent$processWalletStatus$2.L$2 = walletSubTextProperties;
                instantTicketWalletAccessComponent$processWalletStatus$2.J$0 = j;
                instantTicketWalletAccessComponent$processWalletStatus$2.label = 3;
                instantTicketWalletAccessComponent2 = instantTicketWalletAccessComponent;
                objJ0 = instantTicketWalletAccessComponent2.J0(walletStatus2, j, str2, instantTicketWalletAccessComponent$processWalletStatus$2);
                if (objJ0 != coroutineSingletons) {
                    j2 = j;
                    objB = objJ0;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j4 = instantTicketWalletAccessComponent$processWalletStatus$2.J$0;
            WalletSubTextProperties walletSubTextProperties2 = (WalletSubTextProperties) instantTicketWalletAccessComponent$processWalletStatus$2.L$2;
            walletTypeIdentifier2 = (WalletTypeIdentifier) instantTicketWalletAccessComponent$processWalletStatus$2.L$1;
            WalletStatus walletStatus5 = (WalletStatus) instantTicketWalletAccessComponent$processWalletStatus$2.L$0;
            ResultKt.b(objB);
            walletSubTextProperties = walletSubTextProperties2;
            j2 = j4;
            walletStatus2 = walletStatus5;
        }
        long j5 = j2;
        String str5 = (String) objB;
        switch (WhenMappings.f3953a[walletStatus2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                z = false;
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        instantTicketWalletAccessComponent2.E0(new qi(walletSubTextProperties, str5, z, 2));
        instantTicketWalletAccessComponent2.M0(false);
        BuildersKt.d(contextScope, null, null, new InstantTicketWalletAccessComponent$raiseInstantTicketBottomSheetOpened$1(walletStatus2, instantTicketWalletAccessComponent, walletTypeIdentifier2, j5, null), 3);
        instantTicketWalletAccessComponent.r0(InstantTicketWalletAccessSideEffect.HideKeyboard.f3958a);
        instantTicketWalletAccessComponent.r0(InstantTicketWalletAccessSideEffect.OpenBottomSheet.f3959a);
        return unit;
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objB;
        long jIntValue = chaloUseCaseResult instanceof ChaloUseCaseResult.Success ? ((Number) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).intValue() : 0L;
        instantTicketWalletAccessComponent$processWalletStatus$2.L$0 = walletStatus2;
        instantTicketWalletAccessComponent$processWalletStatus$2.L$1 = str2;
        instantTicketWalletAccessComponent$processWalletStatus$2.L$2 = walletTypeIdentifier3;
        instantTicketWalletAccessComponent$processWalletStatus$2.J$0 = jIntValue;
        instantTicketWalletAccessComponent$processWalletStatus$2.label = 2;
        WalletTypeIdentifier walletTypeIdentifier6 = walletTypeIdentifier3;
        j = jIntValue;
        objK0 = instantTicketWalletAccessComponent2.K0(walletStatus2, j, str2, walletTypeIdentifier6, instantTicketWalletAccessComponent$processWalletStatus$2);
        instantTicketWalletAccessComponent$processWalletStatus$2 = instantTicketWalletAccessComponent$processWalletStatus$2;
        if (objK0 != coroutineSingletons) {
            walletTypeIdentifier2 = walletTypeIdentifier6;
            walletSubTextProperties = (WalletSubTextProperties) objK0;
            instantTicketWalletAccessComponent$processWalletStatus$2.L$0 = walletStatus2;
            instantTicketWalletAccessComponent$processWalletStatus$2.L$1 = walletTypeIdentifier2;
            instantTicketWalletAccessComponent$processWalletStatus$2.L$2 = walletSubTextProperties;
            instantTicketWalletAccessComponent$processWalletStatus$2.J$0 = j;
            instantTicketWalletAccessComponent$processWalletStatus$2.label = 3;
            instantTicketWalletAccessComponent2 = instantTicketWalletAccessComponent;
            objJ0 = instantTicketWalletAccessComponent2.J0(walletStatus2, j, str2, instantTicketWalletAccessComponent$processWalletStatus$2);
            if (objJ0 != coroutineSingletons) {
                j2 = j;
                objB = objJ0;
                long j6 = j2;
                String str6 = (String) objB;
                switch (WhenMappings.f3953a[walletStatus2.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        z = false;
                        break;
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                instantTicketWalletAccessComponent2.E0(new qi(walletSubTextProperties, str6, z, 2));
                instantTicketWalletAccessComponent2.M0(false);
                BuildersKt.d(contextScope, null, null, new InstantTicketWalletAccessComponent$raiseInstantTicketBottomSheetOpened$1(walletStatus2, instantTicketWalletAccessComponent, walletTypeIdentifier2, j6, null), 3);
                instantTicketWalletAccessComponent.r0(InstantTicketWalletAccessSideEffect.HideKeyboard.f3958a);
                instantTicketWalletAccessComponent.r0(InstantTicketWalletAccessSideEffect.OpenBottomSheet.f3959a);
                return unit;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object I0(InstantTicketWalletAccessComponent instantTicketWalletAccessComponent, ContinuationImpl continuationImpl) {
        InstantTicketWalletAccessComponent$resolveWalletTypeIdentifier$1 instantTicketWalletAccessComponent$resolveWalletTypeIdentifier$1;
        instantTicketWalletAccessComponent.getClass();
        if (continuationImpl instanceof InstantTicketWalletAccessComponent$resolveWalletTypeIdentifier$1) {
            instantTicketWalletAccessComponent$resolveWalletTypeIdentifier$1 = (InstantTicketWalletAccessComponent$resolveWalletTypeIdentifier$1) continuationImpl;
            int i = instantTicketWalletAccessComponent$resolveWalletTypeIdentifier$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketWalletAccessComponent$resolveWalletTypeIdentifier$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketWalletAccessComponent$resolveWalletTypeIdentifier$1 = new InstantTicketWalletAccessComponent$resolveWalletTypeIdentifier$1(instantTicketWalletAccessComponent, continuationImpl);
            }
        } else {
            instantTicketWalletAccessComponent$resolveWalletTypeIdentifier$1 = new InstantTicketWalletAccessComponent$resolveWalletTypeIdentifier$1(instantTicketWalletAccessComponent, continuationImpl);
        }
        Object objA = instantTicketWalletAccessComponent$resolveWalletTypeIdentifier$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketWalletAccessComponent$resolveWalletTypeIdentifier$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            WalletTypeIdentifier walletTypeIdentifier = ((InstantTicketWalletAccessState) instantTicketWalletAccessComponent.E.a()).f3960a;
            if (walletTypeIdentifier != null) {
                return walletTypeIdentifier;
            }
            WalletResolver walletResolver = instantTicketWalletAccessComponent.D;
            instantTicketWalletAccessComponent$resolveWalletTypeIdentifier$1.label = 1;
            objA = walletResolver.a(instantTicketWalletAccessComponent$resolveWalletTypeIdentifier$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        ResolvedPrimaryWalletResult resolvedPrimaryWalletResult = (ResolvedPrimaryWalletResult) objA;
        if (resolvedPrimaryWalletResult instanceof ResolvedPrimaryWalletResult.ResolvedWallet) {
            ResolvedPrimaryWalletResult.ResolvedWallet resolvedWallet = (ResolvedPrimaryWalletResult.ResolvedWallet) resolvedPrimaryWalletResult;
            instantTicketWalletAccessComponent.E0(new hb0(resolvedWallet, 0));
            return resolvedWallet.f11098a;
        }
        if (Intrinsics.d(resolvedPrimaryWalletResult, ResolvedPrimaryWalletResult.NotLoggedIn.f11097a)) {
            instantTicketWalletAccessComponent.E0(new y80(26));
            return null;
        }
        if (Intrinsics.d(resolvedPrimaryWalletResult, ResolvedPrimaryWalletResult.NoWalletConfigEnabled.f11096a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (r12 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        if (r12 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
    
        if (r12 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
    
        if (r12 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J0(app.chalo.walletframework.wallet.data.model.WalletStatus r8, long r9, java.lang.String r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessComponent$getWalletCTAString$1
            if (r0 == 0) goto L13
            r0 = r12
            app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessComponent$getWalletCTAString$1 r0 = (app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessComponent$getWalletCTAString$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessComponent$getWalletCTAString$1 r0 = new app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessComponent$getWalletCTAString$1
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L44
            if (r2 == r6) goto L40
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.ResultKt.b(r12)
            goto L93
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            kotlin.ResultKt.b(r12)
            goto L68
        L3c:
            kotlin.ResultKt.b(r12)
            goto L83
        L40:
            kotlin.ResultKt.b(r12)
            goto La3
        L44:
            kotlin.ResultKt.b(r12)
            int[] r12 = app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessComponent.WhenMappings.f3953a
            int r8 = r8.ordinal()
            r8 = r12[r8]
            r12 = 0
            app.chalo.providers.stringprovider.StringProvider r2 = r7.v
            switch(r8) {
                case 1: goto La6;
                case 2: goto L96;
                case 3: goto L96;
                case 4: goto L86;
                case 5: goto L6b;
                case 6: goto L5b;
                case 7: goto La6;
                case 8: goto La6;
                case 9: goto La6;
                case 10: goto La6;
                case 11: goto La6;
                default: goto L55;
            }
        L55:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L5b:
            app.chalo.providers.stringprovider.StringEnum r8 = app.chalo.providers.stringprovider.StringEnum.RECLAIM_CAPS
            java.lang.Object[] r9 = new java.lang.Object[r12]
            r0.label = r4
            java.lang.Object r12 = r2.b(r8, r9, r0)
            if (r12 != r1) goto L68
            goto La2
        L68:
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L6b:
            app.chalo.features.wallet.CurrencyFeature r8 = r7.p
            long r3 = r8.b(r11)
            int r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r8 < 0) goto L76
            goto La6
        L76:
            app.chalo.providers.stringprovider.StringEnum r8 = app.chalo.providers.stringprovider.StringEnum.RECHARGE_CAPS
            java.lang.Object[] r9 = new java.lang.Object[r12]
            r0.label = r5
            java.lang.Object r12 = r2.b(r8, r9, r0)
            if (r12 != r1) goto L83
            goto La2
        L83:
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L86:
            app.chalo.providers.stringprovider.StringEnum r8 = app.chalo.providers.stringprovider.StringEnum.CONTACT_CAPS
            java.lang.Object[] r9 = new java.lang.Object[r12]
            r0.label = r3
            java.lang.Object r12 = r2.b(r8, r9, r0)
            if (r12 != r1) goto L93
            goto La2
        L93:
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L96:
            app.chalo.providers.stringprovider.StringEnum r8 = app.chalo.providers.stringprovider.StringEnum.ACTIVATE_CAPS
            java.lang.Object[] r9 = new java.lang.Object[r12]
            r0.label = r6
            java.lang.Object r12 = r2.b(r8, r9, r0)
            if (r12 != r1) goto La3
        La2:
            return r1
        La3:
            java.lang.String r12 = (java.lang.String) r12
            return r12
        La6:
            java.lang.String r8 = ""
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessComponent.J0(app.chalo.walletframework.wallet.data.model.WalletStatus, long, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:54:0x010a  */
    /* JADX WARN: Code duplicated, block: B:57:0x010f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0122 A[PHI: r9 r11 r14
      0x0122: PHI (r9v29 long) = (r9v26 long), (r9v38 long) binds: [B:59:0x011e, B:17:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0122: PHI (r11v8 java.lang.String) = (r11v4 java.lang.String), (r11v14 java.lang.String) binds: [B:59:0x011e, B:17:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0122: PHI (r14v15 java.lang.Object) = (r14v14 java.lang.Object), (r14v1 java.lang.Object) binds: [B:59:0x011e, B:17:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x012a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0134  */
    /* JADX WARN: Code duplicated, block: B:68:0x014f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0157  */
    /* JADX WARN: Code duplicated, block: B:75:0x015c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0176  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x017e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0183  */
    /* JADX WARN: Code duplicated, block: B:88:0x0196  */
    /* JADX WARN: Code duplicated, block: B:92:0x019e  */
    public final Object K0(WalletStatus walletStatus, long j, String str, WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        InstantTicketWalletAccessComponent$getWalletSubText$1 instantTicketWalletAccessComponent$getWalletSubText$1;
        int i;
        int i2;
        int i3;
        int i4;
        long j2;
        WalletTypeIdentifier walletTypeIdentifier2;
        String str2;
        int i5;
        CurrencyFeature currencyFeature;
        int i6;
        int i7;
        if (continuationImpl instanceof InstantTicketWalletAccessComponent$getWalletSubText$1) {
            instantTicketWalletAccessComponent$getWalletSubText$1 = (InstantTicketWalletAccessComponent$getWalletSubText$1) continuationImpl;
            int i8 = instantTicketWalletAccessComponent$getWalletSubText$1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                instantTicketWalletAccessComponent$getWalletSubText$1.label = i8 - Integer.MIN_VALUE;
            } else {
                instantTicketWalletAccessComponent$getWalletSubText$1 = new InstantTicketWalletAccessComponent$getWalletSubText$1(this, continuationImpl);
            }
        } else {
            instantTicketWalletAccessComponent$getWalletSubText$1 = new InstantTicketWalletAccessComponent$getWalletSubText$1(this, continuationImpl);
        }
        Object objB = instantTicketWalletAccessComponent$getWalletSubText$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = instantTicketWalletAccessComponent$getWalletSubText$1.label;
        SatisfiesQuickPayPrerequisitesUseCase satisfiesQuickPayPrerequisitesUseCase = this.t;
        StringProvider stringProvider = this.v;
        switch (i9) {
            case 0:
                ResultKt.b(objB);
                switch (WhenMappings.f3953a[walletStatus.ordinal()]) {
                    case 1:
                        return new WalletSubTextProperties(false, "");
                    case 2:
                    case 3:
                        instantTicketWalletAccessComponent$getWalletSubText$1.I$0 = 0;
                        instantTicketWalletAccessComponent$getWalletSubText$1.label = 1;
                        objB = stringProvider.b(StringEnum.WALLET_NOT_ACTIVE, new Object[0], instantTicketWalletAccessComponent$getWalletSubText$1);
                        if (objB != coroutineSingletons) {
                            i = 0;
                            return new WalletSubTextProperties(i != 0, (String) objB);
                        }
                        return coroutineSingletons;
                    case 4:
                        instantTicketWalletAccessComponent$getWalletSubText$1.I$0 = 1;
                        instantTicketWalletAccessComponent$getWalletSubText$1.label = 2;
                        objB = stringProvider.b(StringEnum.NEED_FULL_KYC, new Object[0], instantTicketWalletAccessComponent$getWalletSubText$1);
                        if (objB != coroutineSingletons) {
                            i2 = 1;
                            return new WalletSubTextProperties(i2 != 0, (String) objB);
                        }
                        return coroutineSingletons;
                    case 5:
                        instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = str;
                        instantTicketWalletAccessComponent$getWalletSubText$1.L$1 = walletTypeIdentifier;
                        instantTicketWalletAccessComponent$getWalletSubText$1.J$0 = j;
                        instantTicketWalletAccessComponent$getWalletSubText$1.label = 3;
                        objB = satisfiesQuickPayPrerequisitesUseCase.a(walletTypeIdentifier, instantTicketWalletAccessComponent$getWalletSubText$1);
                        if (objB != coroutineSingletons) {
                            if (((Boolean) objB).booleanValue()) {
                                j2 = j;
                                str2 = str;
                                instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = str2;
                                instantTicketWalletAccessComponent$getWalletSubText$1.L$1 = null;
                                instantTicketWalletAccessComponent$getWalletSubText$1.J$0 = j2;
                                instantTicketWalletAccessComponent$getWalletSubText$1.label = 5;
                                objB = satisfiesQuickPayPrerequisitesUseCase.a(walletTypeIdentifier, instantTicketWalletAccessComponent$getWalletSubText$1);
                                if (objB != coroutineSingletons) {
                                    if (((Boolean) objB).booleanValue()) {
                                        currencyFeature = this.p;
                                        if (j2 >= currencyFeature.b(str2)) {
                                            StringEnum stringEnum = StringEnum.BALANCE_AMOUNT;
                                            Object[] objArr = {currencyFeature.a(j2, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)};
                                            instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = null;
                                            instantTicketWalletAccessComponent$getWalletSubText$1.I$0 = 0;
                                            instantTicketWalletAccessComponent$getWalletSubText$1.label = 6;
                                            objB = stringProvider.b(stringEnum, objArr, instantTicketWalletAccessComponent$getWalletSubText$1);
                                            if (objB != coroutineSingletons) {
                                                i7 = 0;
                                                return new WalletSubTextProperties(i7 != 0, (String) objB);
                                            }
                                        } else {
                                            StringEnum stringEnum2 = StringEnum.INSUFFICIENT_BALANCE_AMOUNT;
                                            Object[] objArr2 = {currencyFeature.a(j2, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)};
                                            instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = null;
                                            instantTicketWalletAccessComponent$getWalletSubText$1.I$0 = 1;
                                            instantTicketWalletAccessComponent$getWalletSubText$1.label = 7;
                                            objB = stringProvider.b(stringEnum2, objArr2, instantTicketWalletAccessComponent$getWalletSubText$1);
                                            if (objB != coroutineSingletons) {
                                                i6 = 1;
                                                return new WalletSubTextProperties(i6 != 0, (String) objB);
                                            }
                                        }
                                    } else {
                                        instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = null;
                                        instantTicketWalletAccessComponent$getWalletSubText$1.I$0 = 1;
                                        instantTicketWalletAccessComponent$getWalletSubText$1.label = 8;
                                        objB = stringProvider.b(StringEnum.PLEASE_TURN_ON_INTERNET, new Object[0], instantTicketWalletAccessComponent$getWalletSubText$1);
                                        if (objB != coroutineSingletons) {
                                            i5 = 1;
                                            return new WalletSubTextProperties(i5 != 0, (String) objB);
                                        }
                                    }
                                }
                            } else {
                                instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = str;
                                instantTicketWalletAccessComponent$getWalletSubText$1.L$1 = walletTypeIdentifier;
                                instantTicketWalletAccessComponent$getWalletSubText$1.J$0 = j;
                                instantTicketWalletAccessComponent$getWalletSubText$1.label = 4;
                                if (this.u.a(walletTypeIdentifier, instantTicketWalletAccessComponent$getWalletSubText$1) != coroutineSingletons) {
                                    j2 = j;
                                    walletTypeIdentifier2 = walletTypeIdentifier;
                                    walletTypeIdentifier = walletTypeIdentifier2;
                                    str2 = str;
                                    instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = str2;
                                    instantTicketWalletAccessComponent$getWalletSubText$1.L$1 = null;
                                    instantTicketWalletAccessComponent$getWalletSubText$1.J$0 = j2;
                                    instantTicketWalletAccessComponent$getWalletSubText$1.label = 5;
                                    objB = satisfiesQuickPayPrerequisitesUseCase.a(walletTypeIdentifier, instantTicketWalletAccessComponent$getWalletSubText$1);
                                    if (objB != coroutineSingletons) {
                                        if (((Boolean) objB).booleanValue()) {
                                            currencyFeature = this.p;
                                            if (j2 >= currencyFeature.b(str2)) {
                                                StringEnum stringEnum3 = StringEnum.BALANCE_AMOUNT;
                                                Object[] objArr3 = {currencyFeature.a(j2, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)};
                                                instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = null;
                                                instantTicketWalletAccessComponent$getWalletSubText$1.I$0 = 0;
                                                instantTicketWalletAccessComponent$getWalletSubText$1.label = 6;
                                                objB = stringProvider.b(stringEnum3, objArr3, instantTicketWalletAccessComponent$getWalletSubText$1);
                                                if (objB != coroutineSingletons) {
                                                    i7 = 0;
                                                    return new WalletSubTextProperties(i7 != 0, (String) objB);
                                                }
                                            } else {
                                                StringEnum stringEnum4 = StringEnum.INSUFFICIENT_BALANCE_AMOUNT;
                                                Object[] objArr4 = {currencyFeature.a(j2, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)};
                                                instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = null;
                                                instantTicketWalletAccessComponent$getWalletSubText$1.I$0 = 1;
                                                instantTicketWalletAccessComponent$getWalletSubText$1.label = 7;
                                                objB = stringProvider.b(stringEnum4, objArr4, instantTicketWalletAccessComponent$getWalletSubText$1);
                                                if (objB != coroutineSingletons) {
                                                    i6 = 1;
                                                    return new WalletSubTextProperties(i6 != 0, (String) objB);
                                                }
                                            }
                                        } else {
                                            instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = null;
                                            instantTicketWalletAccessComponent$getWalletSubText$1.I$0 = 1;
                                            instantTicketWalletAccessComponent$getWalletSubText$1.label = 8;
                                            objB = stringProvider.b(StringEnum.PLEASE_TURN_ON_INTERNET, new Object[0], instantTicketWalletAccessComponent$getWalletSubText$1);
                                            if (objB != coroutineSingletons) {
                                                i5 = 1;
                                                return new WalletSubTextProperties(i5 != 0, (String) objB);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 6:
                    case 7:
                    case 8:
                        instantTicketWalletAccessComponent$getWalletSubText$1.I$0 = 1;
                        instantTicketWalletAccessComponent$getWalletSubText$1.label = 9;
                        objB = stringProvider.b(StringEnum.WALLET_BLOCKED, new Object[0], instantTicketWalletAccessComponent$getWalletSubText$1);
                        if (objB != coroutineSingletons) {
                            i3 = 1;
                            return new WalletSubTextProperties(i3 != 0, (String) objB);
                        }
                        return coroutineSingletons;
                    case 9:
                    case 10:
                    case 11:
                        instantTicketWalletAccessComponent$getWalletSubText$1.I$0 = 1;
                        instantTicketWalletAccessComponent$getWalletSubText$1.label = 10;
                        objB = stringProvider.b(StringEnum.PLEASE_TURN_ON_INTERNET, new Object[0], instantTicketWalletAccessComponent$getWalletSubText$1);
                        if (objB != coroutineSingletons) {
                            i4 = 1;
                            return new WalletSubTextProperties(i4 != 0, (String) objB);
                        }
                        return coroutineSingletons;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 1:
                i = instantTicketWalletAccessComponent$getWalletSubText$1.I$0;
                ResultKt.b(objB);
                return new WalletSubTextProperties(i != 0, (String) objB);
            case 2:
                i2 = instantTicketWalletAccessComponent$getWalletSubText$1.I$0;
                ResultKt.b(objB);
                return new WalletSubTextProperties(i2 != 0, (String) objB);
            case 3:
                j = instantTicketWalletAccessComponent$getWalletSubText$1.J$0;
                walletTypeIdentifier = (WalletTypeIdentifier) instantTicketWalletAccessComponent$getWalletSubText$1.L$1;
                str = (String) instantTicketWalletAccessComponent$getWalletSubText$1.L$0;
                ResultKt.b(objB);
                if (((Boolean) objB).booleanValue()) {
                    instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = str;
                    instantTicketWalletAccessComponent$getWalletSubText$1.L$1 = walletTypeIdentifier;
                    instantTicketWalletAccessComponent$getWalletSubText$1.J$0 = j;
                    instantTicketWalletAccessComponent$getWalletSubText$1.label = 4;
                    if (this.u.a(walletTypeIdentifier, instantTicketWalletAccessComponent$getWalletSubText$1) != coroutineSingletons) {
                        j2 = j;
                        walletTypeIdentifier2 = walletTypeIdentifier;
                        walletTypeIdentifier = walletTypeIdentifier2;
                        str2 = str;
                        instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = str2;
                        instantTicketWalletAccessComponent$getWalletSubText$1.L$1 = null;
                        instantTicketWalletAccessComponent$getWalletSubText$1.J$0 = j2;
                        instantTicketWalletAccessComponent$getWalletSubText$1.label = 5;
                        objB = satisfiesQuickPayPrerequisitesUseCase.a(walletTypeIdentifier, instantTicketWalletAccessComponent$getWalletSubText$1);
                        if (objB != coroutineSingletons) {
                            if (((Boolean) objB).booleanValue()) {
                                currencyFeature = this.p;
                                if (j2 >= currencyFeature.b(str2)) {
                                    StringEnum stringEnum5 = StringEnum.BALANCE_AMOUNT;
                                    Object[] objArr5 = {currencyFeature.a(j2, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)};
                                    instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = null;
                                    instantTicketWalletAccessComponent$getWalletSubText$1.I$0 = 0;
                                    instantTicketWalletAccessComponent$getWalletSubText$1.label = 6;
                                    objB = stringProvider.b(stringEnum5, objArr5, instantTicketWalletAccessComponent$getWalletSubText$1);
                                    if (objB != coroutineSingletons) {
                                        i7 = 0;
                                        return new WalletSubTextProperties(i7 != 0, (String) objB);
                                    }
                                } else {
                                    StringEnum stringEnum6 = StringEnum.INSUFFICIENT_BALANCE_AMOUNT;
                                    Object[] objArr6 = {currencyFeature.a(j2, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)};
                                    instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = null;
                                    instantTicketWalletAccessComponent$getWalletSubText$1.I$0 = 1;
                                    instantTicketWalletAccessComponent$getWalletSubText$1.label = 7;
                                    objB = stringProvider.b(stringEnum6, objArr6, instantTicketWalletAccessComponent$getWalletSubText$1);
                                    if (objB != coroutineSingletons) {
                                        i6 = 1;
                                        return new WalletSubTextProperties(i6 != 0, (String) objB);
                                    }
                                }
                            } else {
                                instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = null;
                                instantTicketWalletAccessComponent$getWalletSubText$1.I$0 = 1;
                                instantTicketWalletAccessComponent$getWalletSubText$1.label = 8;
                                objB = stringProvider.b(StringEnum.PLEASE_TURN_ON_INTERNET, new Object[0], instantTicketWalletAccessComponent$getWalletSubText$1);
                                if (objB != coroutineSingletons) {
                                    i5 = 1;
                                    return new WalletSubTextProperties(i5 != 0, (String) objB);
                                }
                            }
                        }
                    }
                } else {
                    j2 = j;
                    str2 = str;
                    instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = str2;
                    instantTicketWalletAccessComponent$getWalletSubText$1.L$1 = null;
                    instantTicketWalletAccessComponent$getWalletSubText$1.J$0 = j2;
                    instantTicketWalletAccessComponent$getWalletSubText$1.label = 5;
                    objB = satisfiesQuickPayPrerequisitesUseCase.a(walletTypeIdentifier, instantTicketWalletAccessComponent$getWalletSubText$1);
                    if (objB != coroutineSingletons) {
                        if (((Boolean) objB).booleanValue()) {
                            currencyFeature = this.p;
                            if (j2 >= currencyFeature.b(str2)) {
                                StringEnum stringEnum7 = StringEnum.BALANCE_AMOUNT;
                                Object[] objArr7 = {currencyFeature.a(j2, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)};
                                instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = null;
                                instantTicketWalletAccessComponent$getWalletSubText$1.I$0 = 0;
                                instantTicketWalletAccessComponent$getWalletSubText$1.label = 6;
                                objB = stringProvider.b(stringEnum7, objArr7, instantTicketWalletAccessComponent$getWalletSubText$1);
                                if (objB != coroutineSingletons) {
                                    i7 = 0;
                                    return new WalletSubTextProperties(i7 != 0, (String) objB);
                                }
                            } else {
                                StringEnum stringEnum8 = StringEnum.INSUFFICIENT_BALANCE_AMOUNT;
                                Object[] objArr8 = {currencyFeature.a(j2, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)};
                                instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = null;
                                instantTicketWalletAccessComponent$getWalletSubText$1.I$0 = 1;
                                instantTicketWalletAccessComponent$getWalletSubText$1.label = 7;
                                objB = stringProvider.b(stringEnum8, objArr8, instantTicketWalletAccessComponent$getWalletSubText$1);
                                if (objB != coroutineSingletons) {
                                    i6 = 1;
                                    return new WalletSubTextProperties(i6 != 0, (String) objB);
                                }
                            }
                        } else {
                            instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = null;
                            instantTicketWalletAccessComponent$getWalletSubText$1.I$0 = 1;
                            instantTicketWalletAccessComponent$getWalletSubText$1.label = 8;
                            objB = stringProvider.b(StringEnum.PLEASE_TURN_ON_INTERNET, new Object[0], instantTicketWalletAccessComponent$getWalletSubText$1);
                            if (objB != coroutineSingletons) {
                                i5 = 1;
                                return new WalletSubTextProperties(i5 != 0, (String) objB);
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                j2 = instantTicketWalletAccessComponent$getWalletSubText$1.J$0;
                walletTypeIdentifier2 = (WalletTypeIdentifier) instantTicketWalletAccessComponent$getWalletSubText$1.L$1;
                str = (String) instantTicketWalletAccessComponent$getWalletSubText$1.L$0;
                ResultKt.b(objB);
                walletTypeIdentifier = walletTypeIdentifier2;
                str2 = str;
                instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = str2;
                instantTicketWalletAccessComponent$getWalletSubText$1.L$1 = null;
                instantTicketWalletAccessComponent$getWalletSubText$1.J$0 = j2;
                instantTicketWalletAccessComponent$getWalletSubText$1.label = 5;
                objB = satisfiesQuickPayPrerequisitesUseCase.a(walletTypeIdentifier, instantTicketWalletAccessComponent$getWalletSubText$1);
                if (objB != coroutineSingletons) {
                    if (((Boolean) objB).booleanValue()) {
                        currencyFeature = this.p;
                        if (j2 >= currencyFeature.b(str2)) {
                            StringEnum stringEnum9 = StringEnum.BALANCE_AMOUNT;
                            Object[] objArr9 = {currencyFeature.a(j2, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)};
                            instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = null;
                            instantTicketWalletAccessComponent$getWalletSubText$1.I$0 = 0;
                            instantTicketWalletAccessComponent$getWalletSubText$1.label = 6;
                            objB = stringProvider.b(stringEnum9, objArr9, instantTicketWalletAccessComponent$getWalletSubText$1);
                            if (objB != coroutineSingletons) {
                                i7 = 0;
                                return new WalletSubTextProperties(i7 != 0, (String) objB);
                            }
                        } else {
                            StringEnum stringEnum10 = StringEnum.INSUFFICIENT_BALANCE_AMOUNT;
                            Object[] objArr10 = {currencyFeature.a(j2, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)};
                            instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = null;
                            instantTicketWalletAccessComponent$getWalletSubText$1.I$0 = 1;
                            instantTicketWalletAccessComponent$getWalletSubText$1.label = 7;
                            objB = stringProvider.b(stringEnum10, objArr10, instantTicketWalletAccessComponent$getWalletSubText$1);
                            if (objB != coroutineSingletons) {
                                i6 = 1;
                                return new WalletSubTextProperties(i6 != 0, (String) objB);
                            }
                        }
                    } else {
                        instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = null;
                        instantTicketWalletAccessComponent$getWalletSubText$1.I$0 = 1;
                        instantTicketWalletAccessComponent$getWalletSubText$1.label = 8;
                        objB = stringProvider.b(StringEnum.PLEASE_TURN_ON_INTERNET, new Object[0], instantTicketWalletAccessComponent$getWalletSubText$1);
                        if (objB != coroutineSingletons) {
                            i5 = 1;
                            return new WalletSubTextProperties(i5 != 0, (String) objB);
                        }
                    }
                }
                return coroutineSingletons;
            case 5:
                j2 = instantTicketWalletAccessComponent$getWalletSubText$1.J$0;
                str2 = (String) instantTicketWalletAccessComponent$getWalletSubText$1.L$0;
                ResultKt.b(objB);
                if (((Boolean) objB).booleanValue()) {
                    currencyFeature = this.p;
                    if (j2 >= currencyFeature.b(str2)) {
                        StringEnum stringEnum11 = StringEnum.BALANCE_AMOUNT;
                        Object[] objArr11 = {currencyFeature.a(j2, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)};
                        instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = null;
                        instantTicketWalletAccessComponent$getWalletSubText$1.I$0 = 0;
                        instantTicketWalletAccessComponent$getWalletSubText$1.label = 6;
                        objB = stringProvider.b(stringEnum11, objArr11, instantTicketWalletAccessComponent$getWalletSubText$1);
                        if (objB != coroutineSingletons) {
                            i7 = 0;
                            return new WalletSubTextProperties(i7 != 0, (String) objB);
                        }
                    } else {
                        StringEnum stringEnum12 = StringEnum.INSUFFICIENT_BALANCE_AMOUNT;
                        Object[] objArr12 = {currencyFeature.a(j2, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)};
                        instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = null;
                        instantTicketWalletAccessComponent$getWalletSubText$1.I$0 = 1;
                        instantTicketWalletAccessComponent$getWalletSubText$1.label = 7;
                        objB = stringProvider.b(stringEnum12, objArr12, instantTicketWalletAccessComponent$getWalletSubText$1);
                        if (objB != coroutineSingletons) {
                            i6 = 1;
                            return new WalletSubTextProperties(i6 != 0, (String) objB);
                        }
                    }
                } else {
                    instantTicketWalletAccessComponent$getWalletSubText$1.L$0 = null;
                    instantTicketWalletAccessComponent$getWalletSubText$1.I$0 = 1;
                    instantTicketWalletAccessComponent$getWalletSubText$1.label = 8;
                    objB = stringProvider.b(StringEnum.PLEASE_TURN_ON_INTERNET, new Object[0], instantTicketWalletAccessComponent$getWalletSubText$1);
                    if (objB != coroutineSingletons) {
                        i5 = 1;
                        return new WalletSubTextProperties(i5 != 0, (String) objB);
                    }
                }
                return coroutineSingletons;
            case 6:
                i7 = instantTicketWalletAccessComponent$getWalletSubText$1.I$0;
                ResultKt.b(objB);
                return new WalletSubTextProperties(i7 != 0, (String) objB);
            case 7:
                i6 = instantTicketWalletAccessComponent$getWalletSubText$1.I$0;
                ResultKt.b(objB);
                return new WalletSubTextProperties(i6 != 0, (String) objB);
            case 8:
                i5 = instantTicketWalletAccessComponent$getWalletSubText$1.I$0;
                ResultKt.b(objB);
                return new WalletSubTextProperties(i5 != 0, (String) objB);
            case 9:
                i3 = instantTicketWalletAccessComponent$getWalletSubText$1.I$0;
                ResultKt.b(objB);
                return new WalletSubTextProperties(i3 != 0, (String) objB);
            case 10:
                i4 = instantTicketWalletAccessComponent$getWalletSubText$1.I$0;
                ResultKt.b(objB);
                return new WalletSubTextProperties(i4 != 0, (String) objB);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void L0(InstantTicketWalletAccessIntent intent) {
        Intrinsics.i(intent, "intent");
        boolean z = intent instanceof InstantTicketWalletAccessIntent.PayUsingWalletClicked;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new InstantTicketWalletAccessComponent$handlePayUsingWalletClicked$1(this, (InstantTicketWalletAccessIntent.PayUsingWalletClicked) intent, null), 3);
            return;
        }
        if (intent instanceof InstantTicketWalletAccessIntent.ProceedBtnClicked) {
            BuildersKt.d(contextScope, null, null, new InstantTicketWalletAccessComponent$handleProceedBtnClicked$1(this, null, null), 3);
            return;
        }
        if (!intent.equals(InstantTicketWalletAccessIntent.ViewStartedIntent.f3956a)) {
            throw new NoWhenBranchMatchedException();
        }
        InstantTicketWalletAccessState instantTicketWalletAccessState = (InstantTicketWalletAccessState) this.E.a();
        boolean z2 = instantTicketWalletAccessState.b;
        boolean z3 = instantTicketWalletAccessState.i;
        if (z2 || instantTicketWalletAccessState.c || z3) {
            if (z3) {
                E0(new y80(25));
            }
            BuildersKt.d(contextScope, null, null, new InstantTicketWalletAccessComponent$handleProceedBtnClicked$1(this, instantTicketWalletAccessState.h, null), 3);
        }
    }

    public final void M0(boolean z) {
        E0(new va(z, 5));
        if (z) {
            r0(InstantTicketWalletAccessSideEffect.HideKeyboard.f3958a);
            r0(InstantTicketWalletAccessSideEffect.OpenBottomSheet.f3959a);
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (InstantTicketWalletAccessState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new InstantTicketWalletAccessState();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new InstantTicketWalletAccessState();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void y0() {
        L0(InstantTicketWalletAccessIntent.ViewStartedIntent.f3956a);
    }
}
