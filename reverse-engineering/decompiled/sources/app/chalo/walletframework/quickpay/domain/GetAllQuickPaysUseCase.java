package app.chalo.walletframework.quickpay.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.models.UserBookingsStatusType;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.quickpay.data.repository.QuickPayRepository;
import app.chalo.walletframework.wallet.data.model.WalletStatus;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.domain.GetWalletStatusWithoutSyncUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/quickpay/domain/GetAllQuickPaysUseCase;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetAllQuickPaysUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QuickPayRepository f10938a;
    public final GetWalletStatusWithoutSyncUseCase b;
    public final BasicInfoContract c;
    public final CoroutineContextProvider d;
    public final WalletRepository e;
    public final UserProfileDetailsProvider f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10939a;

        static {
            int[] iArr = new int[UserBookingsStatusType.values().length];
            try {
                iArr[UserBookingsStatusType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserBookingsStatusType.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserBookingsStatusType.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10939a = iArr;
        }
    }

    public GetAllQuickPaysUseCase(QuickPayRepository quickPayRepository, GetWalletStatusWithoutSyncUseCase getWalletStatusWithoutSyncUseCase, BasicInfoContract basicInfoContract, CoroutineContextProvider coroutineContextProvider, WalletRepository walletRepository, UserProfileDetailsProvider userProfileDetailsProvider) {
        this.f10938a = quickPayRepository;
        this.b = getWalletStatusWithoutSyncUseCase;
        this.c = basicInfoContract;
        this.d = coroutineContextProvider;
        this.e = walletRepository;
        this.f = userProfileDetailsProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(GetAllQuickPaysUseCase getAllQuickPaysUseCase, WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        GetAllQuickPaysUseCase$isWalletActive$1 getAllQuickPaysUseCase$isWalletActive$1;
        getAllQuickPaysUseCase.getClass();
        if (continuationImpl instanceof GetAllQuickPaysUseCase$isWalletActive$1) {
            getAllQuickPaysUseCase$isWalletActive$1 = (GetAllQuickPaysUseCase$isWalletActive$1) continuationImpl;
            int i = getAllQuickPaysUseCase$isWalletActive$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAllQuickPaysUseCase$isWalletActive$1.label = i - Integer.MIN_VALUE;
            } else {
                getAllQuickPaysUseCase$isWalletActive$1 = new GetAllQuickPaysUseCase$isWalletActive$1(getAllQuickPaysUseCase, continuationImpl);
            }
        } else {
            getAllQuickPaysUseCase$isWalletActive$1 = new GetAllQuickPaysUseCase$isWalletActive$1(getAllQuickPaysUseCase, continuationImpl);
        }
        Object objA = getAllQuickPaysUseCase$isWalletActive$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getAllQuickPaysUseCase$isWalletActive$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            GetWalletStatusWithoutSyncUseCase getWalletStatusWithoutSyncUseCase = getAllQuickPaysUseCase.b;
            getAllQuickPaysUseCase$isWalletActive$1.label = 1;
            objA = getWalletStatusWithoutSyncUseCase.a(walletTypeIdentifier, getAllQuickPaysUseCase$isWalletActive$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        return Boolean.valueOf((chaloUseCaseResult instanceof ChaloUseCaseResult.Success) && ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a == WalletStatus.ACTIVE);
    }
}
